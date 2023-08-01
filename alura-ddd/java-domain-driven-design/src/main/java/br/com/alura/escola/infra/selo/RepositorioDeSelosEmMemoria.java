package br.com.alura.escola.infra.selo;

import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.selo.RepositorioDeSelos;
import br.com.alura.escola.dominio.selo.Selo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioDeSelosEmMemoria implements RepositorioDeSelos {

    private List<Selo> selos = new ArrayList<>();

    @Override
    public void adicionar(Selo selo) {
        this.selos.add(selo);
    }

    @Override
    public List<Selo> selosDoAlunoDeCPF(CPF cpf) {
        return this.selos.stream()
                .filter(selo -> selo.getCpfDoAluno().getNumero().equalsIgnoreCase(cpf.getNumero()))
                .collect(Collectors.toList());
    }
}
