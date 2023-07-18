
package com.alura.loja.patterns.estruturais.loja;

import com.alura.loja.patterns.estruturais.loja.orcamento.ItemOrcamento;
import com.alura.loja.patterns.estruturais.loja.orcamento.Orcamento;
import com.alura.loja.patterns.estruturais.loja.orcamento.OrcamentoProxy;

import java.math.BigDecimal;

public class TesteProxy {

    public static void main(String[] args) {
        var antigoOrcamento = new Orcamento();
        antigoOrcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        antigoOrcamento.reprovar();

        var novoOrcamento = new Orcamento();
        novoOrcamento.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        novoOrcamento.adicionarItem(antigoOrcamento);

        var orcamentoProxy = new OrcamentoProxy(novoOrcamento);

        System.out.println(orcamentoProxy.getValor());
        System.out.println(orcamentoProxy.getValor());

    }

}
