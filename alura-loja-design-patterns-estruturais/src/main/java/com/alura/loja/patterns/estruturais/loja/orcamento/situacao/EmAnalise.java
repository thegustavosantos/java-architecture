package com.alura.loja.patterns.estruturais.loja.orcamento.situacao;

import java.math.BigDecimal;

import com.alura.loja.patterns.estruturais.loja.DomainException;
import com.alura.loja.patterns.estruturais.loja.orcamento.Orcamento;

public class EmAnalise extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public void aprovar(Orcamento orcamento) throws DomainException {
		orcamento.setSituacao(new Aprovado());
	}
	
	@Override
	public void reprovar(Orcamento orcamento) throws DomainException {
		orcamento.setSituacao(new Reprovado());
	}

}
