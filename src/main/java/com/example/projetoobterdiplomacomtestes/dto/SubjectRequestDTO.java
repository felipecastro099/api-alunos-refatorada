package com.example.projetoobterdiplomacomtestes.dto;

import javax.validation.constraints.*;

public class SubjectRequestDTO {
    @Size(min = 8, max = 50, message = "Subject must have at least 8 character and 50 at maximum")
    @NotNull(message = "Subject is required")
    @NotEmpty(message = "Subject not empty")
    @Pattern(regexp = "^([a-zA-Z]+\\s)*[a-zA-Z]+$", message = "Name must have only characters")
    private String subject;

    @NotNull(message = "Note is required")
    @Digits(fraction = 0, message = "Note must be integer", integer = 2)
    @Min(value = 0, message = "note cannot be less than 0")
    @Max(value = 10, message = "note cannot be greater than 10")
    private Double note;

    public SubjectRequestDTO(String subject, Double note) {
        this.subject = subject;
        this.note = note;
    }

    public String getSubject() {
        return subject;
    }

    public Double getNote() {
        return note;
    }
}
