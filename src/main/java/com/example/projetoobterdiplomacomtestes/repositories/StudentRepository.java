package com.example.projetoobterdiplomacomtestes.repositories;

import com.example.projetoobterdiplomacomtestes.entities.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private List<Student> db = new ArrayList<>();

    public void add(Student student) {
        db.add(student);
    }
}
