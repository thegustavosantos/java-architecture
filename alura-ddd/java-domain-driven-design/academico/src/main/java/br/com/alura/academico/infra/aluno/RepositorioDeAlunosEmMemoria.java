package br.com.alura.academico.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.academico.dominio.aluno.Aluno;
import br.com.alura.academico.dominio.aluno.exception.AlunoNaoEncontrado;
import br.com.alura.academico.dominio.aluno.CPF;
import br.com.alura.academico.dominio.aluno.RepositorioDeAlunos;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

	private List<Aluno> matriculados = new ArrayList<>();
	
	@Override
	public void matricular(Aluno aluno) {
		this.matriculados.add(aluno);
	}

	@Override
	public Aluno buscarPorCPF(CPF cpf) {
		return this.matriculados.stream()
				.filter(a -> a.getCpf().getNumero().equals(cpf.getNumero()))
				.findFirst()
				.orElseThrow(() -> new AlunoNaoEncontrado(cpf));
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		return this.matriculados;
	}

}
