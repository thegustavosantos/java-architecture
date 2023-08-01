package br.com.alura.academico.aplicacao.indicacao;

import br.com.alura.academico.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
	
	void enviarPara(Aluno indicado);

}
