package com.example.projetoobterdiplomacomtestes.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class ExceptionDTO {
    @JsonProperty("ValidationError")
    private Map<String, String> validationErrors;

    public ExceptionDTO(Map<String, String> validationErrors) {
        this.validationErrors = validationErrors;
    }

    public Map<String, String> getValidationErrors() {
        return validationErrors;
    }
}
