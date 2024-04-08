package fr.khry.springartifactodds.stat;

public class EnergyRecharge extends Stat {

    public EnergyRecharge() {
        label = "Energy Recharge";
        unit = "%";
        mainStatRolls = new float[]{7.8f,
                10f, 12.2f, 14.4f, 16.6f,
                18.8f, 21.0f, 23.2f, 25.4f,
                27.6f, 29.8f, 32.0f, 34.2f,
                36.4f, 38.6f, 40.8f, 43.0f,
                45.2f, 47.4f, 49.6f, 51.8f};
        subStatRolls = new float[]{4.5f, 5.2f, 5.8f, 6.5f};
        subStatWeight = 4;
    }
}
