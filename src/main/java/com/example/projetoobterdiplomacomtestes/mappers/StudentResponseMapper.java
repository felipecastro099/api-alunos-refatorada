package com.example.projetoobterdiplomacomtestes.mappers;

import com.example.projetoobterdiplomacomtestes.dto.StudentResponseDTO;
import com.example.projetoobterdiplomacomtestes.entities.Student;

public class StudentResponseMapper {
    public static StudentResponseDTO toDto (String message, Double average, Student student) {
        return new StudentResponseDTO(message, average, StudentRequestMapper.toDto(student));
    }
}
