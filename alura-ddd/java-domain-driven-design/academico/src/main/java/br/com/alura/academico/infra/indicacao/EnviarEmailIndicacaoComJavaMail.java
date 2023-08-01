package br.com.alura.academico.infra.indicacao;

import br.com.alura.academico.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.alura.academico.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

	@Override
	public void enviarPara(Aluno indicado) {
		// logica de envio de email com a lib Java Mail
	}
}
