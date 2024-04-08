package fr.khry.springartifactodds.stat;

public class FlatHP extends Stat {
    public FlatHP() {
        label = "HP";
        mainStatRolls = new float[]{717,
                920, 1123, 1326, 1530,
                1733, 1936, 2139, 2342,
                2545, 2749, 2952, 3155,
                3358, 3561, 3764, 3967,
                4171, 4374, 4577, 4780};
        subStatRolls = new float[]{209, 239, 269, 299};
        subStatWeight = 6;
    }
}
