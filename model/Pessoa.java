package model;

public abstract class Pessoa {
	//Atributos
	private String cpf;
	private String senha;
	
	//Construtor
	public Pessoa(String cpf, String senha) {
		this.setCpf(cpf);
		this.setSenha(senha);
	}
	
	//M�todos modificadores
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	//M�todos acessores
	public String getCpf() {
		return this.cpf;
	}
	public String getSenha() {
		return this.senha;
	}
}