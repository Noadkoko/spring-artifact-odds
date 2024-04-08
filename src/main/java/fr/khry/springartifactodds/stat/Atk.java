package fr.khry.springartifactodds.stat;

public class Atk extends Stat {
    public Atk() {
        label = "ATK";
        unit = "%";
        mainStatRolls = new float[]{7f,
                9f, 11f, 12.9f, 14.9f,
                16.9f, 18.9f, 20.9f, 22.8f,
                24.8f, 26.8f, 28.8f, 30.8f,
                32.8f, 34.7f, 36.7f, 38.7f,
                40.7f, 42.7f, 44.6f, 46.6f};
        subStatRolls = new float[]{4.1f, 4.7f, 5.3f, 5.8f};
        subStatWeight = 4;
    }
}
