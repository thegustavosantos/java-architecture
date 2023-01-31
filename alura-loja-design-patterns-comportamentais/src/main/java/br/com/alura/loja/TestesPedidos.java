package br.com.alura.loja;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.Pedido;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args) {

       final var cliente = "Gustavo";
       final var valorOrcamento = new BigDecimal(300);
       final var quantidadeItens = Integer.parseInt("2");

       GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
       GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new EnviarEmailPedido(), new SalvarPedidoNoBancoDeDados()));
       handler.execute(gerador);




    }

}


