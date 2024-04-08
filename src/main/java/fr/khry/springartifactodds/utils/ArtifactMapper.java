package fr.khry.springartifactodds.utils;

import fr.khry.springartifactodds.artifact.Artifact;
import fr.khry.springartifactodds.dto.ArtifactDTO;
import fr.khry.springartifactodds.dto.ArtifactType;
import org.apache.commons.lang3.StringUtils;

public class ArtifactMapper {

    private ArtifactMapper() {}

    public static ArtifactDTO toDTO(Artifact artifact) {
        ArtifactDTO dto = new ArtifactDTO();
        String artifactType = StringUtils.upperCase(artifact.getClass().getSimpleName());
        dto.setArtifactType(ArtifactType.valueOf(artifactType));
        dto.setLevel(artifact.getLevel());
        dto.setMain(StatMapper.toDTO(artifact.getMain()));
        dto.setSubs(StatMapper.toDTOs(artifact.getSubs()));
        return dto;
    }

}
