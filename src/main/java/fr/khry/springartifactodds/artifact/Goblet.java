package fr.khry.springartifactodds.artifact;

import fr.khry.springartifactodds.stat.*;

import java.util.HashMap;

import static fr.khry.springartifactodds.utils.ArtifactHelper.getMainStat;

public class Goblet extends Artifact {
    public Goblet() {
        super();
        label = "Goblet";
        totalWeight = 10000;
        possibleMainStats = new HashMap<>();
        possibleMainStats.put(new HP(), 19.25f);
        possibleMainStats.put(new Atk(), 19.25f);
        possibleMainStats.put(new Def(), 19.0f);
        possibleMainStats.put(new ElementalDmgBonus(), 40f);
        possibleMainStats.put(new ElementalMastery(), 2.5f);
        main = getMainStat(possibleMainStats, totalWeight);
        main.setValue(main.getMainStatRolls()[level]);
    }
}
