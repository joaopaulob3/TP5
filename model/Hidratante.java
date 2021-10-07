package model;

/**
 * Classe modelo para objetos do tipo Hidratante que possuem pre�o, volume, c�digo,
 * marca, linha, quantidade e tipo de pele.
 * 
 * @author Jo�o Paulo da Silva Freitas
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
	
	//M�todos modificadores
	public void setTipoDePeleDoHidratante(String tipoDePeleDoHidratante) {
		this.tipoDePeleDoHidratante = tipoDePeleDoHidratante;
	}
	
	//M�todos acessores
	public String getTipoDePeleDoHidratante() {
		return this.tipoDePeleDoHidratante;
	}

}