package br.com.alura.gamificacao.aplicacao;

import br.com.alura.gamificacao.dominio.selo.RepositorioDeSelos;
import br.com.alura.gamificacao.dominio.selo.Selo;
import br.com.alura.shared.dominio.CPF;
import br.com.alura.shared.dominio.eventos.Evento;
import br.com.alura.shared.dominio.eventos.Ouvinte;

import static br.com.alura.shared.dominio.eventos.TipoDeEvento.ALUNO_MATRICULADO;

public class GeraSeloAlunoNovato extends Ouvinte {

    private final RepositorioDeSelos repositorioDeSelos;

    public GeraSeloAlunoNovato(RepositorioDeSelos repositorioDeSelos) {
        this.repositorioDeSelos = repositorioDeSelos;
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento.tipo() == ALUNO_MATRICULADO;
    }

    @Override
    protected void reageAo(Evento evento) {
        var cpfDoAluno = (CPF) evento.informacoes().get("cpf");
        var selo = new Selo(cpfDoAluno, "Novato");
        repositorioDeSelos.adicionar(selo);
    }
}
