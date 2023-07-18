package com.alura.loja.patterns.estruturais.loja.pedido.acoes;

import com.alura.loja.patterns.estruturais.loja.pedido.Pedido;

public class CriarPedidoNoBanco implements AcaoAposGerarPedido {

	public void executarAcao(Pedido pedido) {
		System.out.println("Salvando pedido no banco de dados...");
	}

}
