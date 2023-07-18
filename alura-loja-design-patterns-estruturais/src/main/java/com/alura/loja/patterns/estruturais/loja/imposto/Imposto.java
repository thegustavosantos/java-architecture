package com.alura.loja.patterns.estruturais.loja.imposto;

import java.math.BigDecimal;

import com.alura.loja.patterns.estruturais.loja.orcamento.Orcamento;

public abstract class Imposto {

	private Imposto outroImposto;

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

	public BigDecimal calcular(Orcamento orcamento){
		BigDecimal valorImposto = realizarCalculo(orcamento);
		BigDecimal valorDoOutroImposto = BigDecimal.ZERO;

		if(outroImposto != null){
			valorDoOutroImposto = outroImposto.calcular(orcamento);
		}
		return valorImposto.add(valorDoOutroImposto);
	}

}
