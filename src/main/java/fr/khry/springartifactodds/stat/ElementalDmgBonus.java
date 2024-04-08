package fr.khry.springartifactodds.stat;

import static fr.khry.springartifactodds.utils.ArtifactHelper.getRandomElement;

public class ElementalDmgBonus extends Stat {
    public ElementalDmgBonus() {
        label = createLabel(getRandomElement());
        unit = "%";
        mainStatRolls = new float[]{7.0f,
                9.0f, 11.0f, 12.9f, 14.9f,
                16.9f, 18.9f, 20.9f, 22.8f,
                24.8f, 26.8f, 28.8f, 30.8f,
                32.8f, 34.7f, 36.7f, 38.7f,
                40.7f, 42.7f, 4577, 44.6f};
        subStatRolls = new float[]{};
        subStatWeight = 0;
    }

    // get specific element
    public ElementalDmgBonus(Element element) {
        label = createLabel(element);
        unit = "%";
        mainStatRolls = new float[]{7.0f,
                9.0f, 11.0f, 12.9f, 14.9f,
                16.9f, 18.9f, 20.9f, 22.8f,
                24.8f, 26.8f, 28.8f, 30.8f,
                32.8f, 34.7f, 36.7f, 38.7f,
                40.7f, 42.7f, 4577, 44.6f};
        subStatRolls = new float[]{};
        subStatWeight = 0;
    }

    private static String createLabel(Element element) {
        return element.label + " DMG Bonus";
    }

    public enum Element {
        PYRO("Pyro"),
        ELECTRO("Electro"),
        CRYO("Cryo"),
        HYDRO("Hydro"),
        DENDRO("Dendro"),
        ANEMO("Anemo"),
        GEO("Geo"),
        PHYSICAL("Physical");

        public final String label;

        private Element(String label) {
            this.label = label;
        }
    }
}