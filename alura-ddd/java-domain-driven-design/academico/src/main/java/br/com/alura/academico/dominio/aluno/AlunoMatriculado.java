package br.com.alura.academico.dominio.aluno;

import br.com.alura.shared.dominio.CPF;
import br.com.alura.shared.dominio.eventos.Evento;
import br.com.alura.shared.dominio.eventos.TipoDeEvento;

import java.time.LocalDateTime;
import java.util.Map;

import static br.com.alura.shared.dominio.eventos.TipoDeEvento.ALUNO_MATRICULADO;

public class AlunoMatriculado implements Evento {

    private final CPF cpf;
    private final LocalDateTime momento;

    public AlunoMatriculado(CPF cpf) {
        this.cpf = cpf;
        this.momento = LocalDateTime.now();
    }

    @Override
    public LocalDateTime momento() {
        return this.momento;
    }

    @Override
    public TipoDeEvento tipo() {
        return ALUNO_MATRICULADO;
    }

    @Override
    public Map<String, Object> informacoes() {
        return Map.of("cpf", this.cpf);
    }

    public CPF getCpf() {
        return cpf;
    }
}
