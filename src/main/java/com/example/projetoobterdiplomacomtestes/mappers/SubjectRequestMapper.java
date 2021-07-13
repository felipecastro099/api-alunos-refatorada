package com.example.projetoobterdiplomacomtestes.mappers;

import com.example.projetoobterdiplomacomtestes.dto.SubjectRequestDTO;
import com.example.projetoobterdiplomacomtestes.entities.Subject;

public class SubjectRequestMapper {
    public static SubjectRequestDTO toDto (Subject entity){
        return new SubjectRequestDTO(entity.getName(), entity.getNote());
    }

    public static Subject toEntity (SubjectRequestDTO dto) {
        return new Subject(dto.getSubject(), dto.getNote());
    }
}
