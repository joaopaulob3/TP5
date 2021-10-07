package model;

/**
 * Classe modelo para objetos do tipo Hidratante que possuem preço, volume, código,
 * marca, linha, quantidade e tipo de pele.
 * 
 * @author João Paulo da Silva Freitas
 * @version 1.0
 */

public class Hidratante extends Produto{
	//Atributos
	private String tipoDePeleDoHidratante;
	
	//Construtor
	public Hidratante(double precoDoProduto, double volumeDoProduto, String codigoDoProduto, 
			String marcaDoProduto, String linhaDoProduto, int quantidadeProduto, 
			String tipoDePeleDoHidratante) {
		super(precoDoProduto, volumeDoProduto, codigoDoProduto, marcaDoProduto, linhaDoProduto,
				quantidadeProduto);
		this.setTipoDePeleDoHidratante(tipoDePeleDoHidratante);
	}
	
	//Métodos modificadores
	public void setTipoDePeleDoHidratante(String tipoDePeleDoHidratante) {
		this.tipoDePeleDoHidratante = tipoDePeleDoHidratante;
	}
	
	//Métodos acessores
	public String getTipoDePeleDoHidratante() {
		return this.tipoDePeleDoHidratante;
	}

}