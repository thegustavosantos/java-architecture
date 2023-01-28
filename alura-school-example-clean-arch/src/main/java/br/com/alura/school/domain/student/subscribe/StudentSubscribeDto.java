package br.com.alura.school.domain.student.subscribe;

import br.com.alura.school.domain.student.CPF;
import br.com.alura.school.domain.student.Email;
import br.com.alura.school.domain.student.Student;

public class StudentSubscribeDto {

    private final String name;
    private final String cpf;
    private final String email;

    public StudentSubscribeDto(String name, String cpf, String email) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
    }


    public Student studentBuilder(StudentSubscribeDto data) {
        return new Student(
                    new CPF(data.cpf),
                    data.name,
                    new Email(data.email));

    }
}
