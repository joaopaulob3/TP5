package model;

public class Cliente {
	//Atributos
	private String cpf;
	private String senha;
	private String nomeCliente;
	private String emailCliente;
	private String celularCliente;
	private String generoCliente;
	
	//Construtor
	public Cliente(String cpf, String senha, String nomeCliente, String emailCliente,
			String celularCliente, String generoCliente) {
		this.setCPFCliente(cpf);
		this.setSenha(senha);
		this.setNomeCliente(nomeCliente);
		this.setEmailCliente(emailCliente);
		this.setCelularCliente(celularCliente);
		this.setGeneroCliente(generoCliente);
	}
	
	//Métodos modificadores
	public void setCPFCliente(String cpf) {
		this.cpf = cpf;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	public void setCelularCliente(String celularCliente) {
		this.celularCliente = celularCliente;
	}
	public void setGeneroCliente(String generoCliente) {
		this.generoCliente = generoCliente;
	}
	
	//Métodos acessores
	public String getCPF() {
		return this.cpf;
	}
	public String getSenha() {
		return this.senha;
	}
	public String getNomeCliente() {
		return this.nomeCliente;
	}
	public String getEmailCliente() {
		return this.emailCliente;
	}
	public String getCelularCliente() {
		return this.celularCliente;
	}
	public String getGeneroCliente() {
		return this.generoCliente;
	}

}