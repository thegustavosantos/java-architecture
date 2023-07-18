package com.alura.loja.patterns.estruturais.loja.imposto;

import java.math.BigDecimal;

import com.alura.loja.patterns.estruturais.loja.orcamento.Orcamento;

public class ISS extends Imposto {

	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	protected BigDecimal realizarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}


}
