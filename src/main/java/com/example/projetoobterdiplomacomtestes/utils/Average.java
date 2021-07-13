package com.example.projetoobterdiplomacomtestes.utils;

import com.example.projetoobterdiplomacomtestes.dto.SubjectRequestDTO;

import java.util.List;

public class Average {

    public static double calculate(List<SubjectRequestDTO> subjects) {
        double average = 0;

        for (SubjectRequestDTO subject : subjects) {
            average += subject.getNote();
        }

        return average / subjects.size();
    }

}
