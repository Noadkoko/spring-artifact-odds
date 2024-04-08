package fr.khry.springartifactodds.utils;

import fr.khry.springartifactodds.dto.StatDTO;
import fr.khry.springartifactodds.stat.Stat;

import java.util.List;

public class StatMapper {

    private StatMapper() {}

    public static StatDTO toDTO(Stat stat) {
        StatDTO dto = new StatDTO();
        dto.setLabel(stat.getLabel());
        dto.setValue(stat.getValue());
        dto.setUnit(stat.getUnit());
        return dto;
    }

    public static List<StatDTO> toDTOs(List<Stat> stats) {
        return stats.stream().map(StatMapper::toDTO).toList();
    }
}
