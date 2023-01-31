package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImpostos {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100") , 1);
        CalculadoraDeImpostos calculator = new CalculadoraDeImpostos();

        System.out.println(calculator.calcular(orcamento , new ICMS()));
        System.out.println(calculator.calcular(orcamento , new ISS()));

    }

}
