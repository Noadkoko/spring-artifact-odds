package fr.khry.springartifactodds.stat;

public class Def extends Stat {
    public Def() {
        label = "DEF";
        unit = "%";
        mainStatRolls = new float[]{8.7f,
                11.2f, 13.7f, 16.2f, 18.6f,
                21.1f, 23.6f, 26.1f, 28.6f,
                31.0f, 33.5f, 36.0f, 38.5f,
                40.9f, 43.4f, 45.9f, 48.4f,
                50.8f, 53.3f, 55.8f, 58.3f};
        subStatRolls = new float[]{5.1f, 5.8f, 6.6f, 7.3f};
        subStatWeight = 4;
    }
}
