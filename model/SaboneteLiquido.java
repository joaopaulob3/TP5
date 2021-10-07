package model;

/**
 * Classe modelo para objetos do tipo SaboneteLiquido que possuem preço, volume, código,
 * marca, linha, quantidade e propriedades.
 * 
 * @author João Paulo da Silva Freitas
 * @version 1.0
 */

public class SaboneteLiquido extends Produto{
	//Atributos
	private String propriedadesDoSaboneteLiquido;
	
	//Construor
	public SaboneteLiquido(double precoDoProduto, double volumeDoProduto, 
			String codigoDoProduto, String marcaDoProduto, String linhaDoProduto, 
			int quantidadeProduto, String propriedadesDoSaboneteLiquido) {
		super(precoDoProduto, volumeDoProduto, codigoDoProduto, 
				marcaDoProduto, linhaDoProduto, quantidadeProduto);
		this.setPropriedadesDoSaboneteLiquido(propriedadesDoSaboneteLiquido);
	}

	//Métodos modificadores
	public void setPropriedadesDoSaboneteLiquido(String propriedadesDoSaboneteLiquido) {
		this.propriedadesDoSaboneteLiquido = propriedadesDoSaboneteLiquido;
	}
	
	//Métodos acessores
	public String getPropriedadesDoSaboneteLiquido() {
		return this.propriedadesDoSaboneteLiquido;
	}

}