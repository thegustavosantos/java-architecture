package com.alura.loja.patterns.estruturais.loja.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.alura.loja.patterns.estruturais.loja.orcamento.situacao.EmAnalise;
import com.alura.loja.patterns.estruturais.loja.orcamento.situacao.SituacaoOrcamento;
import com.alura.loja.patterns.estruturais.loja.orcamento.situacao.Finalizado;

public class Orcamento implements Orcavel {

	private BigDecimal valor;
	private SituacaoOrcamento situacao;
	private List<Orcavel> itens;


	public Orcamento() {
		this.valor = BigDecimal.ZERO;
		this.situacao = new EmAnalise();
		this.itens = new ArrayList<>();
	}

	public void aplicarDescontoExtra() {
		BigDecimal valorDescontoExtra = this.situacao.calcularDescontoExtra(this);
		this.valor = this.valor.subtract(valorDescontoExtra);
	}
	
	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	
	public void finalizar() {
		this.situacao.finalizar(this);
	}

	public BigDecimal getValor() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		return valor;
	}

	public int getQuantidadeItens() {
		return itens.size();
	}

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}
	
	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

	public boolean isFinalizado(){
		return situacao instanceof Finalizado;
	}

	public void adicionarItem(Orcavel itemOrcamento){
		this.valor = valor.add(itemOrcamento.getValor());
		itens.add(itemOrcamento);
	}

}
