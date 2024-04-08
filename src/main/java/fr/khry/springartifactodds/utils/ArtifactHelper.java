package fr.khry.springartifactodds.utils;

import fr.khry.springartifactodds.stat.*;
import org.apache.commons.collections4.CollectionUtils;

import java.util.*;

public final class ArtifactHelper {

    private static final Random r = new Random();

    private ArtifactHelper() {}

    public static Stat getMainStat(Map<Stat, Float> possibleMainStats, int totalWeight) {
        Stat mainStat;

        Stat[] probabilityArray = new Stat[totalWeight];
        int i = 0;
        for (Map.Entry<Stat, Float> main : possibleMainStats.entrySet()) {
            int weight = (int) (main.getValue() * totalWeight / 100);
            while (weight > 0) {
                probabilityArray[i] = main.getKey();
                weight--;
                i++;
            }
        }

        // randomly pick a main
        int mainIndex = r.nextInt(totalWeight);
        mainStat = probabilityArray[mainIndex];
        return mainStat;
    }

    public static ElementalDmgBonus.Element getRandomElement() {
        ElementalDmgBonus.Element[] elements = ElementalDmgBonus.Element.values();
        return elements[r.nextInt(elements.length)];
    }

    public static void addNewSub(List<Stat> subs) {
        subs.add(randomNewSub(subs));
    }

    public static void increaseRandomSub(List<Stat> subs) {
        if (subs.size() == 3) {
            addNewSub(subs);
        } else if (subs.size() == 4) {
            Stat subRolled = subs.get(randomSubIndex());
            randomSubTier(subRolled);
        }
    }

    public static int randomNumberStartingSubs() {
        // 80% for 3 subs
        // 20% for 4 subs
        // this applies for artifacts dropped from domains
        return r.nextFloat() < 0.8f ? 3 : 4;
    }

    // see https://www.keithschwarz.com/darts-dice-coins/ for in depth algorithm
    private static Stat randomNewSub(List<Stat> currentSubs) {
        Stat newSub;
        Collection<Stat> possibleSubStats = CollectionUtils.subtract(getAllRollableSubStats(), currentSubs);

        int totalWeight = possibleSubStats.stream().map(Stat::getSubStatWeight).reduce(0, Integer::sum);
        Stat[] probabilityArray = new Stat[totalWeight];
        int i = 0;
        for (Stat sub : possibleSubStats) {
            int weight = sub.getSubStatWeight();
            while (weight > 0) {
                probabilityArray[i] = sub;
                weight--;
                i++;
            }
        }

        // randomly pick a sub
        int newSubIndex = r.nextInt(totalWeight);
        newSub = probabilityArray[newSubIndex];
        // give it a value
        randomSubTier(newSub);
        return newSub;
    }

    private static List<Stat> getAllRollableSubStats() {
        List<Stat> result = new ArrayList<>();
        result.add(new FlatHP());
        result.add(new FlatAtk());
        result.add(new FlatDef());
        result.add(new HP());
        result.add(new Atk());
        result.add(new Def());
        result.add(new EnergyRecharge());
        result.add(new ElementalMastery());
        result.add(new CritRate());
        result.add(new CritDmg());
        return result;
    }

    private static int randomSubIndex() {
        return r.nextInt(4);
    }

    private static int randomSubTierIndex() {
        return r.nextInt(4);
    }

    private static void randomSubTier(Stat subStat) {
        float tierRolled = subStat.getSubStatRolls()[randomSubTierIndex()];
        subStat.setValue(Float.sum(subStat.getValue(), tierRolled));
    }
}
