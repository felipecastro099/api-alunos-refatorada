package com.example.projetoobterdiplomacomtestes;

import com.example.projetoobterdiplomacomtestes.dto.SubjectRequestDTO;
import com.example.projetoobterdiplomacomtestes.utils.Average;
import com.example.projetoobterdiplomacomtestes.utils.Situacion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class CertificateServiceImplTest {

    private List<SubjectRequestDTO> subjectsMock;

    @BeforeEach
    public void init() {
        SubjectRequestDTO subject1 = new SubjectRequestDTO("Subject 1", 10.0);
        SubjectRequestDTO subject2 = new SubjectRequestDTO("Subject 2", 8.0);

        this.subjectsMock = new ArrayList<>(Arrays.asList(subject1, subject2));
    }

    @Test
    public void shouldReturnTheAverageOfNotes() {
        double expectedAverage = (double) 18 / 2;

        double responseAverage = Average.calculate(this.subjectsMock);

        Assertions.assertEquals(expectedAverage, responseAverage);
    }

    @Test
    public void shouldReturnApproved() {
        String message = Situacion.status(6.8);

        Assertions.assertTrue(message.contains("aprovado"));
    }

    @Test
    public void shouldReturnRecovery() {
        String message = Situacion.status(4.7);

        Assertions.assertTrue(message.contains("recuperação"));
    }

    @Test
    public void shouldReturnReproved() {
        String message = Situacion.status(2.0);

        Assertions.assertTrue(message.contains("reprovado"));
    }
}
