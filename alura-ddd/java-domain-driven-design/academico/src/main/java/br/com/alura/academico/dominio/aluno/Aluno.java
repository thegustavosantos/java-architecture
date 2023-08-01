package br.com.alura.academico.dominio.aluno;

import br.com.alura.academico.dominio.aluno.exception.TelefoneNaoCadastrado;

import java.util.ArrayList;
import java.util.List;

//AGGREGATE ROOT
public class Aluno {
	
	private CPF cpf;
	private String nome;
	private Email email;
	private List<Telefone> telefones = new ArrayList<>();
	private String senha;
	
	public Aluno(CPF cpf, String nome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	public void adicionarTelefone(String ddd, String numero) {
		if(this.telefones.size() == 2){
			throw new TelefoneNaoCadastrado("Número máximo de telefones atingido. Quantidade de telefones cadastrados deve ser menor que 2.");
		}
		this.telefones.add(new Telefone(ddd, numero));
	}
	
	public CPF getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email.getEndereco();
	}
	
	public List<Telefone> getTelefones() {
		return telefones;
	}

	public String getSenha() {
		return senha;
	}
	
}






