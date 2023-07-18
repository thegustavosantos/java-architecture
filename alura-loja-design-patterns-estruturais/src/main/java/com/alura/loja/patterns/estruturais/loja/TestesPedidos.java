package com.alura.loja.patterns.estruturais.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import com.alura.loja.patterns.estruturais.loja.pedido.GeraPedido;
import com.alura.loja.patterns.estruturais.loja.pedido.GeraPedidoHandler;
import com.alura.loja.patterns.estruturais.loja.pedido.acoes.CriarPedidoNoBanco;
import com.alura.loja.patterns.estruturais.loja.pedido.acoes.EnviarPedidoPorEmail;
import com.alura.loja.patterns.estruturais.loja.pedido.acoes.LogDePedido;

public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Ana da Silva";
		BigDecimal valorOrcamento = new BigDecimal("745.99");
		int quantidadeItens = 3;
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new  GeraPedidoHandler(Arrays.asList(
				new EnviarPedidoPorEmail(),
				new CriarPedidoNoBanco(),
				new LogDePedido()));
		handler.executar(gerador);
	}

}
