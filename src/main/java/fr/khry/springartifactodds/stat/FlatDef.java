package fr.khry.springartifactodds.stat;

public class FlatDef extends Stat {
    public FlatDef() {
        label = "DEF";
        mainStatRolls = new float[]{};
        subStatRolls = new float[]{16, 19, 21, 23};
        subStatWeight = 6;
    }
}
