package com.example.projetoobterdiplomacomtestes.exceptions;

import com.example.projetoobterdiplomacomtestes.dto.ExceptionDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice
public class ApiExceptionControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> argumentNotValidHandler(MethodArgumentNotValidException e) {
        BindingResult result = e.getBindingResult();

        List<FieldError> fieldErrors = result.getFieldErrors();
        ExceptionDTO exceptions = processFieldErrors(fieldErrors);

        return ResponseEntity.badRequest().body(exceptions);
    }

    public static ExceptionDTO processFieldErrors(List<FieldError> fieldErrors) {
        Map<String, String> exceptions = new HashMap<>();
        for (FieldError fieldError: fieldErrors) {
            exceptions.put(fieldError.getField(), fieldError.getDefaultMessage());
        }
        return new ExceptionDTO(exceptions);
    }
}
