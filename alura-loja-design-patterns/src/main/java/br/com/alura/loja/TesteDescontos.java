package br.com.alura.loja;

import br.com.alura.loja.descontos.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.imposto.TipoImposto;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {

    public static void main(String[] args) {

        Orcamento primeiro = new Orcamento(new BigDecimal("200") , 10);
        Orcamento segundo = new Orcamento(new BigDecimal("1000") , 1);
        CalculadoraDeDescontos calculator = new CalculadoraDeDescontos();
        System.out.println(calculator.calcular(primeiro));
        System.out.println(calculator.calcular(segundo));

    }

}
