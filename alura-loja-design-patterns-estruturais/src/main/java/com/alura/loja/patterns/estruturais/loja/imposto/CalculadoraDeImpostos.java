package com.alura.loja.patterns.estruturais.loja.imposto;

import java.math.BigDecimal;

import com.alura.loja.patterns.estruturais.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}

}
