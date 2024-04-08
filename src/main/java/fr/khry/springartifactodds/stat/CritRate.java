package fr.khry.springartifactodds.stat;

public class CritRate extends Stat {
    public CritRate() {
        label = "CRIT Rate";
        unit = "%";
        mainStatRolls = new float[]{4.7f,
                6.0f, 7.3f, 8.6f, 9.9f,
                11.3f, 12.6f, 13.9f, 15.2f,
                16.6f, 17.9f, 19.2f, 20.5f,
                21.8f, 23.2f, 24.5f, 25.8f,
                27.1f, 28.4f, 29.8f, 31.1f};
        subStatRolls = new float[]{2.7f, 3.1f, 3.5f, 3.9f};
        subStatWeight = 3;
    }
}
