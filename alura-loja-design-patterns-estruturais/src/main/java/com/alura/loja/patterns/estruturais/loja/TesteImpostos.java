package com.alura.loja.patterns.estruturais.loja;

import com.alura.loja.patterns.estruturais.loja.imposto.CalculadoraDeImpostos;
import com.alura.loja.patterns.estruturais.loja.imposto.ICMS;
import com.alura.loja.patterns.estruturais.loja.imposto.ISS;
import com.alura.loja.patterns.estruturais.loja.orcamento.ItemOrcamento;
import com.alura.loja.patterns.estruturais.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImpostos {

    public static void main(String[] args) {
        var orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
        var calculadora = new CalculadoraDeImpostos();

        System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
        System.out.println(calculadora.calcular(orcamento, new ISS(null)));
        System.out.println(calculadora.calcular(orcamento, new ICMS(null)));
    }

}
