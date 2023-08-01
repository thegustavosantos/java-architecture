package br.com.alura.adapter.web.input;

import br.com.alura.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.academico.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.alura.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import br.com.alura.gamificacao.aplicacao.GeraSeloAlunoNovato;
import br.com.alura.gamificacao.infra.selo.RepositorioDeSelosEmMemoria;
import br.com.alura.shared.dominio.eventos.PublicadorDeEventos;

public class MatricularAlunoPorLinhaDeComando {
	
	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "123.456.789-00";
		String email = "fulano@email.com";

		PublicadorDeEventos publicador = new PublicadorDeEventos();
		publicador.adicionar(new LogDeAlunoMatriculado());

		publicador.adicionar(new GeraSeloAlunoNovato(
				new RepositorioDeSelosEmMemoria()));

		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria(), publicador);
		matricular.executa(
				new MatricularAlunoDto(nome, 
						cpf, 
						email));
	}

}
