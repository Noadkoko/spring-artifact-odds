package fr.khry.springartifactodds.stat;

public class HealingBonus extends Stat {
    public HealingBonus() {
        label = "Healing Bonus";
        unit = "%";
        mainStatRolls = new float[]{5.4f,
                6.9f, 8.4f, 10.0f, 11.5f,
                13.0f, 14.5f, 16.1f, 17.6f,
                19.1f, 20.6f, 22.1f, 23.7f,
                25.2f, 26.7f, 28.2f, 29.8f,
                31.3f, 32.8f, 34.3f, 35.9f};
        subStatRolls = new float[]{};
        subStatWeight = 0;
    }
}
