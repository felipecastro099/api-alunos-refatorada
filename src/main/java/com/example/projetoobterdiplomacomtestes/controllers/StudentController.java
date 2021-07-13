package com.example.projetoobterdiplomacomtestes.controllers;

import com.example.projetoobterdiplomacomtestes.dto.StudentRequestDTO;
import com.example.projetoobterdiplomacomtestes.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/analyzeNotes")
    public ResponseEntity<?> analyzeNotes(@RequestBody @Valid StudentRequestDTO student) {
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.create(student));
    }
}
