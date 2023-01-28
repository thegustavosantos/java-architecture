package br.com.alura.school.domain.student.subscribe;

import br.com.alura.school.domain.student.CPF;
import br.com.alura.school.infra.student.StudentRepositoryMemory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentSubscribeTest {

    // Example of integration test because Im using StudentRepositoryMemory
    // That is implementation of StudentRepository
    // If I had use StudentRepository had been an unit Test
    @Test
    void studentMustBePersisted(){

        var repository = new StudentRepositoryMemory();
        var useCase = new StudentSubscribe(repository);

        var data = new StudentSubscribeDto(
                "pipoca",
                "123.456.789-00",
                "pipoca@teste.com");

        useCase.execute(data);

        var found = repository.getByCPF(new CPF("123.456.789-00"));

        assertEquals("pipoca", found.getName());
        assertEquals("123.456.789-00" , found.getCPF());
        assertEquals("pipoca@teste.com", found.getEmail());

    }

}