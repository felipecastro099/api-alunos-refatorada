package com.example.projetoobterdiplomacomtestes.mappers;

import com.example.projetoobterdiplomacomtestes.dto.StudentRequestDTO;
import com.example.projetoobterdiplomacomtestes.dto.SubjectRequestDTO;
import com.example.projetoobterdiplomacomtestes.entities.Student;
import com.example.projetoobterdiplomacomtestes.entities.Subject;

import java.util.ArrayList;
import java.util.List;

public class StudentRequestMapper {
    public static StudentRequestDTO toDto (Student student) {
        return new StudentRequestDTO(student.getName(), toListSubjectsRequest(student.getSubjects()));
    }

    public static Student toEntity (StudentRequestDTO dto) {
        return new Student(dto.getName(), toListSubjects(dto.getSubjects()));
    }

    public static List<Subject> toListSubjects(List<SubjectRequestDTO> subjects) {
        List<Subject> list = new ArrayList<>();

        subjects.forEach(subject -> {
            list.add(SubjectRequestMapper.toEntity(subject));
        });

        return list;
    }

    public static List<SubjectRequestDTO> toListSubjectsRequest(List<Subject> subjects) {
        List<SubjectRequestDTO> subjectRequestDTOS = new ArrayList<>();

        subjects.forEach(subject -> {
            subjectRequestDTOS.add(SubjectRequestMapper.toDto(subject));
        });

        return  subjectRequestDTOS;
    }
}
