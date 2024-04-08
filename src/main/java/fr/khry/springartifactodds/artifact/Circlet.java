package fr.khry.springartifactodds.artifact;

import fr.khry.springartifactodds.stat.*;

import java.util.HashMap;

import static fr.khry.springartifactodds.utils.ArtifactHelper.getMainStat;

public class Circlet extends Artifact {
    public Circlet() {
        super();
        label = "Circlet";
        totalWeight = 1000;
        possibleMainStats = new HashMap<>();
        possibleMainStats.put(new HP(), 22.0f);
        possibleMainStats.put(new Atk(), 22.0f);
        possibleMainStats.put(new Def(), 22.0f);
        possibleMainStats.put(new CritRate(), 10.0f);
        possibleMainStats.put(new CritDmg(), 10.0f);
        possibleMainStats.put(new HealingBonus(), 10.0f);
        possibleMainStats.put(new ElementalMastery(), 4.0f);
        main = getMainStat(possibleMainStats, totalWeight);
        main.setValue(main.getMainStatRolls()[level]);
    }
}
