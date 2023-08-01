package br.com.alura.gamificacao.dominio.selo;

import br.com.alura.academico.dominio.aluno.CPF;

import java.util.List;

public interface RepositorioDeSelos {

    void adicionar(Selo selo);
    List<Selo> selosDoAlunoDeCPF(CPF cpf);

}
