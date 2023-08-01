package br.com.alura.academico.aplicacao.aluno.matricular;

import br.com.alura.academico.dominio.PublicadorDeEventos;
import br.com.alura.academico.dominio.aluno.Aluno;
import br.com.alura.academico.dominio.aluno.AlunoMatriculado;
import br.com.alura.academico.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {
	
	private final RepositorioDeAlunos repositorio;
	private final PublicadorDeEventos publicador;

	public MatricularAluno(RepositorioDeAlunos repositorio, PublicadorDeEventos publicador) {
		this.repositorio = repositorio;
		this.publicador = publicador;
	}
	
	// COMMAND
	public void executa(MatricularAlunoDto dados) {
		Aluno novo = dados.criarAluno();
		repositorio.matricular(novo);

		AlunoMatriculado evento = new AlunoMatriculado(novo.getCpf());
		publicador.publicar(evento);

	}

}
