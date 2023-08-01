package br.com.alura.academico;

import br.com.alura.academico.aplicacao.aluno.matricular.MatricularAluno;
import br.com.alura.academico.aplicacao.aluno.matricular.MatricularAlunoDto;
import br.com.alura.academico.dominio.PublicadorDeEventos;
import br.com.alura.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.alura.academico.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {
	
	public static void main(String[] args) {
		String nome = "Fulano da Silva";
		String cpf = "123.456.789-00";
		String email = "fulano@email.com";

		PublicadorDeEventos publicador = new PublicadorDeEventos();
		publicador.adicionar(new LogDeAlunoMatriculado());

		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria(), publicador);
		matricular.executa(
				new MatricularAlunoDto(nome, 
						cpf, 
						email));
	}

}
