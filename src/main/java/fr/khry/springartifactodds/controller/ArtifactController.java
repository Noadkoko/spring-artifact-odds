package fr.khry.springartifactodds.controller;

import fr.khry.springartifactodds.dto.ArtifactDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static fr.khry.springartifactodds.utils.ArtifactHelper.generateRandomMaxedArtifact;
import static fr.khry.springartifactodds.utils.ArtifactMapper.toDTO;

@RestController
@RequestMapping("artifact")
public class ArtifactController {

    @GetMapping(value = "/generate", produces = "application/json")
    public ArtifactDTO getRandomArtifact() {
        return toDTO(generateRandomMaxedArtifact());
    }
}
