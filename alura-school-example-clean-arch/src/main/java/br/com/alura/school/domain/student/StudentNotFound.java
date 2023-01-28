package br.com.alura.school.domain.student;

public class StudentNotFound extends RuntimeException {

    public StudentNotFound(CPF cpf) {
        super("Student not found with CPF: " + cpf.getNumber());
    }
}
