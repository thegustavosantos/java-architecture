package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.Evento;
import br.com.alura.escola.dominio.Ouvinte;

import static java.lang.String.format;
import static java.time.format.DateTimeFormatter.ofPattern;

//Ouvinte do evento
public class LogDeAlunoMatriculado extends Ouvinte {

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento instanceof AlunoMatriculado;
    }

    @Override
    protected void reageAo(Evento evento) {
        System.out.println(
                format(
                        "Aluno com CPF %s matriculado em: %s"
                        , ((AlunoMatriculado) evento).getCpf().getNumero()
                        , evento.momento().format(ofPattern("dd/MM/yyyy HH:mm"))
                ));
    }
}
