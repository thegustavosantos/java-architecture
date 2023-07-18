package com.alura.loja.patterns.estruturais.loja.pedido.acoes;

import com.alura.loja.patterns.estruturais.loja.pedido.Pedido;

public class LogDePedido implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Pedido Foi gerado: " + pedido);
    }
}
