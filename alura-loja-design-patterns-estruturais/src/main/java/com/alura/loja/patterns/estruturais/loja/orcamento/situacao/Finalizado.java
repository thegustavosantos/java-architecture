package com.alura.loja.patterns.estruturais.loja.orcamento.situacao;

import java.math.BigDecimal;

import com.alura.loja.patterns.estruturais.loja.DomainException;
import com.alura.loja.patterns.estruturais.loja.orcamento.Orcamento;

public class Finalizado extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		throw new DomainException("Orcamento finalizado nao pode ter desconto extra!");
	}

}
