package com.alura.loja.patterns.estruturais.loja.orcamento;

import com.alura.loja.patterns.estruturais.loja.DomainException;
import com.alura.loja.patterns.estruturais.loja.http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {

    private HttpAdapter httpAdapter;

    public RegistroDeOrcamento(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void registrar(Orcamento orcamento){

        if(!orcamento.isFinalizado()){
            throw new DomainException("Orcamento nao finalizado");
        }

        String url = "http/api.externa/orcamento";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeItens()
        );
        httpAdapter.post(url, dados);

    }

}
