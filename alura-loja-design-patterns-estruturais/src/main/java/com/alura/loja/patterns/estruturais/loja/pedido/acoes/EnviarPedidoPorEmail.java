package com.alura.loja.patterns.estruturais.loja.pedido.acoes;

import com.alura.loja.patterns.estruturais.loja.pedido.Pedido;

public class EnviarPedidoPorEmail implements AcaoAposGerarPedido {
	
	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando email para cliente sobre pedido...");
	}

}
