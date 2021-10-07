package model;

/**
 * Classe modelo para objetos do tipo Shampoo que possuem pre�o, volume, c�digo,
 * marca, linha, quantidade, tipo de cabelo, propriedades e condi��o dos fios.
 * 
 * @author Jo�o Paulo da Silva Freitas
 * @version 1.0
 */

public class Shampoo extends Produto{
	//Atributos
	private String tipoDeCabeloDoShampoo;
	private String propriedadesDoShampoo;
	private String condicaoDosFiosDoShampoo;
	
	//Construtor
	public Shampoo(double precoDoProduto, double volumeDoProduto, 
			String codigoDoProduto, String marcaDoProduto, String linhaDoProduto,
			int quantidadeProduto, String tipoDeCabeloDoShampoo, String propriedadesDoShampoo, 
			String condicaoDosFiosDoShampoo) {
		super(precoDoProduto, volumeDoProduto, codigoDoProduto, marcaDoProduto, 
				linhaDoProduto, quantidadeProduto);
		this.setTipoDeCabeloDoShampoo(tipoDeCabeloDoShampoo);
		this.setPropriedadesDoShampoo(propriedadesDoShampoo);
		this.setCondicaoDosFiosDoShampoo(condicaoDosFiosDoShampoo);
	}
	
	//M�todos modificadores
	public void setTipoDeCabeloDoShampoo(String tipoDeCabeloDoShampoo) {
		this.tipoDeCabeloDoShampoo = tipoDeCabeloDoShampoo;
	}
	public void setPropriedadesDoShampoo(String propriedadesDoShampoo) {
		this.propriedadesDoShampoo = propriedadesDoShampoo;
	}
	public void setCondicaoDosFiosDoShampoo(String condicaoDosFiosDoShampoo) {
		this.condicaoDosFiosDoShampoo = condicaoDosFiosDoShampoo;
	}
	
	//M�todos acessores
	public String getTipoDeCabeloDoShampoo() {
		return this.tipoDeCabeloDoShampoo;
	}
	public String getPropriedadesDoShampoo() {
		return this.propriedadesDoShampoo;
	}
	public String getCondicaoDosFiosDoShampoo() {
		return this.condicaoDosFiosDoShampoo;
	}
	
}