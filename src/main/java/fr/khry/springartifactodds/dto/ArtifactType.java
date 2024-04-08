package fr.khry.springartifactodds.dto;

public enum ArtifactType {
    FLOWER("Flower"),
    FEATHER("Feather"),
    SANDS("Sands"),
    GOBLET("Goblet"),
    CIRCLET("Circlet");

    public final String label;

    private ArtifactType(String label) { this.label = label; }
}
