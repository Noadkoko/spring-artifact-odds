package fr.khry.springartifactodds.artifact;

import fr.khry.springartifactodds.stat.FlatAtk;

import java.util.HashMap;

public class Feather extends Artifact {
    public Feather() {
        super();
        label = "Feather";
        main = new FlatAtk();
        possibleMainStats = new HashMap<>();
        main.setValue(main.getMainStatRolls()[level]);
    }
}
