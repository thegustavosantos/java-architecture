package br.com.alura.school.infra.student;

import br.com.alura.school.domain.student.CPF;
import br.com.alura.school.domain.student.Student;
import br.com.alura.school.domain.student.StudentNotFound;
import br.com.alura.school.domain.student.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepositoryMemory implements StudentRepository {

    private List<Student> registered = new ArrayList<>();

    @Override
    public void register(Student student) {
        this.registered.add(student);
    }

    @Override
    public Student getByCPF(CPF cpf) {
        return this.registered.stream()
                .filter(student -> student.getCPF().equals(cpf.getNumber()))
                .findFirst()
                .orElseThrow(() -> new StudentNotFound(cpf));
    }

    @Override
    public List<Student> getAllStudents() {
        return this.registered;
    }
}
