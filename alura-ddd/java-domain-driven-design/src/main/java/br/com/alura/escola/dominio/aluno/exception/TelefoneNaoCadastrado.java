package br.com.alura.escola.dominio.aluno.exception;

import br.com.alura.escola.dominio.aluno.Telefone;

public class TelefoneNaoCadastrado extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TelefoneNaoCadastrado(String message) {
		super(message);
	}

}
