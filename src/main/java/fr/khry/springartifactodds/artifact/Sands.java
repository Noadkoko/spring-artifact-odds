package fr.khry.springartifactodds.artifact;

import fr.khry.springartifactodds.stat.*;

import java.util.HashMap;

import static fr.khry.springartifactodds.utils.ArtifactHelper.getMainStat;

public class Sands extends Artifact {
    public Sands() {
        super();
        label = "Sands";
        totalWeight = 10000;
        possibleMainStats = new HashMap<>();
        possibleMainStats.put(new HP(), 26.68f);
        possibleMainStats.put(new Atk(), 26.66f);
        possibleMainStats.put(new Def(), 26.66f);
        possibleMainStats.put(new EnergyRecharge(), 10f);
        possibleMainStats.put(new ElementalMastery(), 10f);
        main = getMainStat(possibleMainStats, totalWeight);
        main.setValue(main.getMainStatRolls()[level]);
    }
}
