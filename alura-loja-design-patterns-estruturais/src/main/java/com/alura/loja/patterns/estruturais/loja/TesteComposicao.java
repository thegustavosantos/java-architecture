package com.alura.loja.patterns.estruturais.loja;

import com.alura.loja.patterns.estruturais.loja.imposto.CalculadoraDeImpostos;
import com.alura.loja.patterns.estruturais.loja.imposto.ICMS;
import com.alura.loja.patterns.estruturais.loja.imposto.ISS;
import com.alura.loja.patterns.estruturais.loja.orcamento.ItemOrcamento;
import com.alura.loja.patterns.estruturais.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteComposicao {

    public static void main(String[] args) {
        var antigoOrcamento = new Orcamento();
        antigoOrcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        antigoOrcamento.reprovar();

        var novoOrcamento = new Orcamento();
        novoOrcamento.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        novoOrcamento.adicionarItem(antigoOrcamento);

        System.out.println(novoOrcamento.getValor());

    }

}
