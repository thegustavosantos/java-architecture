package br.com.alura.school.domain.recommendation;

import br.com.alura.school.domain.student.Student;

import java.time.LocalDateTime;

public class Recommendation {

    private Student studentIndicated;
    private Student studentThatIndicated;
    private LocalDateTime dateIndication;

    public Recommendation(Student studentIndicated, Student studentThatIndicated) {
        this.studentIndicated = studentIndicated;
        this.studentThatIndicated = studentThatIndicated;
        this.dateIndication = LocalDateTime.now();
    }


}
