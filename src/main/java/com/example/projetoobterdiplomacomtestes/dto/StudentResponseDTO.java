package com.example.projetoobterdiplomacomtestes.dto;

public class StudentResponseDTO {
    private String message;
    private Double average;
    private StudentRequestDTO student;

    public StudentResponseDTO(String message, Double average, StudentRequestDTO student) {
        this.message = message;
        this.average = average;
        this.student = student;
    }

    public String getMessage() {
        return message;
    }

    public Double getAverage() {
        return average;
    }

    public StudentRequestDTO getStudent() {
        return student;
    }
}
