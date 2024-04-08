package fr.khry.springartifactodds.dto;

import java.util.List;

public class ArtifactDTO {
    private ArtifactType artifactType;
    private int level;
    private StatDTO main;
    private List<StatDTO> subs;

    public ArtifactType getArtifactType() {
        return artifactType;
    }

    public void setArtifactType(ArtifactType artifactType) {
        this.artifactType = artifactType;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public StatDTO getMain() {
        return main;
    }

    public void setMain(StatDTO main) {
        this.main = main;
    }

    public List<StatDTO> getSubs() {
        return subs;
    }

    public void setSubs(List<StatDTO> subs) {
        this.subs = subs;
    }
}
