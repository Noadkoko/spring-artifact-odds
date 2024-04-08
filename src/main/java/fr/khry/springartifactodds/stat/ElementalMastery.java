package fr.khry.springartifactodds.stat;

public class ElementalMastery extends Stat {

    public ElementalMastery() {
        label = "Elemental Mastery";
        mainStatRolls = new float[]{28,
                36, 44, 52, 60,
                68, 76, 84, 91,
                99, 107, 115, 123,
                131, 139, 147, 155,
                163, 171, 179, 187};
        subStatRolls = new float[]{16, 19, 21, 23};
        subStatWeight = 4;
    }
}
