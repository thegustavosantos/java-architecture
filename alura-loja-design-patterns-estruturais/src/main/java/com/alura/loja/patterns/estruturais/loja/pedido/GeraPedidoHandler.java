package com.alura.loja.patterns.estruturais.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import com.alura.loja.patterns.estruturais.loja.orcamento.ItemOrcamento;
import com.alura.loja.patterns.estruturais.loja.orcamento.Orcamento;
import com.alura.loja.patterns.estruturais.loja.pedido.acoes.AcaoAposGerarPedido;

public class GeraPedidoHandler {

	private List<AcaoAposGerarPedido> acoesAposGerarPedido;
	
	// injecao de dependencias para servicos de infra
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoesAposGerarPedidos) {
		acoesAposGerarPedido = acoesAposGerarPedidos;
	}

	public void executar(GeraPedido geraPedido) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(geraPedido.getValorOrcamento()));
		Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

		this.acoesAposGerarPedido.forEach(a -> a.executarAcao(pedido));
	}
	
}
