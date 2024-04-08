package fr.khry.springartifactodds.artifact;

import fr.khry.springartifactodds.stat.Stat;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Map;

import static fr.khry.springartifactodds.utils.ArtifactHelper.*;

public abstract class Artifact {
    protected String label = "";
    protected int level;
    protected Stat main;
    protected int totalWeight;
    protected Map<Stat, Float> possibleMainStats;
    protected ArrayList<Stat> subs;

    protected Artifact() {
        level = 0;
        subs = new ArrayList<>();
        int numberSubs = randomNumberStartingSubs();
        while (numberSubs > 0) {
            addNewSub(subs);
            numberSubs--;
        }
    }

    public void raiseOneLevel() {
        toLevel(level+1);
    }

    public void toLevel(int target) {
        if (target > 20) {
            // not allowed
        }

        // raise subs
        int currentThreshold = level / 4;
        int targetThreshold = target / 4;
        int numberOfNewThresholds = targetThreshold - currentThreshold;
        while (numberOfNewThresholds > 0) {
            increaseRandomSub(subs);
            numberOfNewThresholds--;
        }

        level = target;
        main.setValue(main.getMainStatRolls()[target]);
    }

    public void toNextThreshold() {
        int nextThreshold = (int) Math.ceil((double) (level + 1) / 4) * 4;
        if (nextThreshold > 20) {
            return;
        }
        toLevel(nextThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(
                label + "+" + level + "\n" +
                "------------------------\n" +
                main + "\n" +
                "------------------------\n");
        sb.append(StringUtils.join(subs, "\n"));
        return sb.toString();
    }
}
