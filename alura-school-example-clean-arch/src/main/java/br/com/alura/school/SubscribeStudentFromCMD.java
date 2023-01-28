package br.com.alura.school;

import br.com.alura.school.domain.student.subscribe.StudentSubscribe;
import br.com.alura.school.domain.student.subscribe.StudentSubscribeDto;
import br.com.alura.school.infra.student.StudentRepositoryMemory;

public class SubscribeStudentFromCMD {

    public static void main(String[] args) {

        var name = "Pipoca de Goias";
        var cpf = "123.456.789-10";
        var email = "pipoca03@gmail.com";

        var subscribe = new StudentSubscribe(new StudentRepositoryMemory());
        subscribe.execute(new StudentSubscribeDto(name, cpf, email));

    }

}
