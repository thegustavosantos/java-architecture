package br.com.alura.school.application.recommendation;

import br.com.alura.school.domain.student.Student;

public interface SendEmailRecommendation {

    void sendTo(Student studentIndicated);

}
