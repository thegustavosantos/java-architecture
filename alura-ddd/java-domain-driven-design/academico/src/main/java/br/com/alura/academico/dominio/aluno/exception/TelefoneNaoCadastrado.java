package br.com.alura.academico.dominio.aluno.exception;

import br.com.alura.academico.dominio.aluno.Telefone;

public class TelefoneNaoCadastrado extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TelefoneNaoCadastrado(String message) {
		super(message);
	}

}
