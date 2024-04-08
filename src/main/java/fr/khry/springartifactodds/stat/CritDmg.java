package fr.khry.springartifactodds.stat;

public class CritDmg extends Stat {
    public CritDmg() {
        label = "CRIT DMG";
        unit = "%";
        mainStatRolls = new float[]{9.3f,
                12.0f, 14.6f, 17.3f, 19.9f,
                22.5f, 25.2f, 27.8f, 30.5f,
                33.1f, 35.7f, 38.4f, 41.0f,
                43.7f, 46.3f, 49.0f, 51.6f,
                54.2f, 56.9f, 59.5f, 62.2f};
        subStatRolls = new float[]{5.4f, 6.2f, 7.0f, 7.8f};
        subStatWeight = 6;
    }
}
