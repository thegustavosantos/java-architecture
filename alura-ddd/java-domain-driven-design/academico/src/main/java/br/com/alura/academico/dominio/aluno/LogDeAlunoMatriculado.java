package br.com.alura.academico.dominio.aluno;

import br.com.alura.shared.dominio.eventos.Evento;
import br.com.alura.shared.dominio.eventos.Ouvinte;

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
