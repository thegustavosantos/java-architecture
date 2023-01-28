package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {


    public void aprovar(Orcamento orcamento){
        throw new DomainException("Orcamento não pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento){
        throw new DomainException("Orcamento não pode ser reprovado");
    }

    public void finalizado(Orcamento orcamento){
        throw new DomainException("Orcamento não pode ser finalizado");
    }

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }



}
