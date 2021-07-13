package com.example.projetoobterdiplomacomtestes.dto;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

public class StudentRequestDTO {
    @Size(min = 8, max = 50, message = "Name must have at least 8 character and 50 at maximum")
    @NotNull(message = "Name is required")
    @NotEmpty(message = "Name not empty")
    @Pattern(regexp = "^([a-zA-Z]+\\s)*[a-zA-Z]+$", message = "Name must have only characters")
    private String name;

    @NotNull(message = "List of subject must not be null")
    @NotEmpty(message = "List of subjects must not be empty")
    @Valid
    private List<SubjectRequestDTO> subjects;

    public StudentRequestDTO(String name, List<SubjectRequestDTO> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public List<SubjectRequestDTO> getSubjects() {
        return subjects;
    }
}
