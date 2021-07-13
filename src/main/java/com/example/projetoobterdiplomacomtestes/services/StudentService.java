package com.example.projetoobterdiplomacomtestes.services;

import com.example.projetoobterdiplomacomtestes.dto.StudentRequestDTO;
import com.example.projetoobterdiplomacomtestes.dto.StudentResponseDTO;
import com.example.projetoobterdiplomacomtestes.entities.Student;
import com.example.projetoobterdiplomacomtestes.mappers.StudentRequestMapper;
import com.example.projetoobterdiplomacomtestes.mappers.StudentResponseMapper;
import com.example.projetoobterdiplomacomtestes.repositories.StudentRepository;
import com.example.projetoobterdiplomacomtestes.utils.Average;
import com.example.projetoobterdiplomacomtestes.utils.Situacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public StudentResponseDTO create(StudentRequestDTO studentRequestDTO) {
        Student student = StudentRequestMapper.toEntity(studentRequestDTO);
        Double note = Average.calculate(studentRequestDTO.getSubjects());
        String message = Situacion.status(note);
        studentRepository.add(student);
        return StudentResponseMapper.toDto(message, note, student);
    }
}
