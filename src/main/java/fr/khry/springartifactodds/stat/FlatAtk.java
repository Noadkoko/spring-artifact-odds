package fr.khry.springartifactodds.stat;

public class FlatAtk extends Stat {
    public FlatAtk() {
        label = "ATK";
        mainStatRolls = new float[]{47,
                60, 73, 86, 100,
                113, 126, 139, 152,
                166, 179, 192, 205,
                219, 232, 245, 258,
                272, 285, 298, 311};
        subStatRolls = new float[]{14, 16, 18, 19};
        subStatWeight = 6;
    }
}
