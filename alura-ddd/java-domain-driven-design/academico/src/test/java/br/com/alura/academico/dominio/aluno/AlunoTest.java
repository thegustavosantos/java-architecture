package br.com.alura.academico.dominio.aluno;

import br.com.alura.academico.dominio.aluno.exception.TelefoneNaoCadastrado;
import br.com.alura.shared.dominio.CPF;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    private Aluno aluno;

    @BeforeEach
    void setup(){
        this.aluno = new Aluno(
                new CPF("123.456.789-00"),
                "Gustavo",
                new Email("teste@teste.com"));
    }

    @Test
    void permiteCadastrarUmTelefone() {
        this.aluno.adicionarTelefone("11" , "54455123");
        assertEquals(this.aluno.getTelefones().size() , 1);
    }

    @Test
    void permiteCadastrarDoisTelefones() {
        this.aluno.adicionarTelefone("11" , "54455123");
        this.aluno.adicionarTelefone("11" , "54455123");
        assertEquals(this.aluno.getTelefones().size() , 2);
    }

    @Test
    void naoDevePermiteCadastrarTresTelefones() {
        assertThrows(TelefoneNaoCadastrado.class, () -> {
            this.aluno.adicionarTelefone("11" , "54455123");
            this.aluno.adicionarTelefone("11" , "54455123");
            this.aluno.adicionarTelefone("11" , "54455123");
        });

    }
}