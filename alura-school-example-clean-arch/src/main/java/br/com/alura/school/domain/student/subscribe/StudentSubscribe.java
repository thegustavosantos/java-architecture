package br.com.alura.school.domain.student.subscribe;

import br.com.alura.school.domain.student.StudentRepository;

public class StudentSubscribe {

    private final StudentRepository repository;

    public StudentSubscribe(StudentRepository repository) {
        this.repository = repository;
    }

    public void execute(StudentSubscribeDto data){
        var student  = data.studentBuilder(data);
        repository.register(student);
    }




}
