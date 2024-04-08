package fr.khry.springartifactodds.artifact;

import fr.khry.springartifactodds.stat.FlatHP;

import java.util.HashMap;

public class Flower extends Artifact {
    public Flower() {
        super();
        label = "Flower";
        main = new FlatHP();
        possibleMainStats = new HashMap<>();
        main.setValue(main.getMainStatRolls()[level]);
    }
}
