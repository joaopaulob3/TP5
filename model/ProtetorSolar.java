package model;

public class ProtetorSolar extends Produto{
	//Atributos
	private String propriedadesDoProtetorSolar;
	private int fpsDoProtetorSolar;
	
	//Construtor
	public ProtetorSolar(double precoDoProduto, double volumeDoProduto, String codigoDoProduto, 
			String marcaDoProduto, String linhaDoProduto, int quantidadeProduto, 
			String propriedadesDoProtetorSolar, int fpsDoProtetorSolar) {
		super(precoDoProduto, volumeDoProduto, codigoDoProduto, marcaDoProduto, linhaDoProduto,
				quantidadeProduto);
		this.setPropriedadesDoProtetorSolar(propriedadesDoProtetorSolar);
		this.setFpsDoProtetorSolar(fpsDoProtetorSolar);
	}
	
	//M�todos modificadores
	public void setPropriedadesDoProtetorSolar(String propriedadesDoProtetorSolar) {
		this.propriedadesDoProtetorSolar = propriedadesDoProtetorSolar;
	}
	public void setFpsDoProtetorSolar(int fpsDoProtetorSolar) {
		this.fpsDoProtetorSolar = fpsDoProtetorSolar;
	}
	
	//M�todos acessores
	public String getPropriedadesDoProtetorSolar() {
		return this.propriedadesDoProtetorSolar;
	}
	public int getFpsDoProtetorSolar() {
		return this.fpsDoProtetorSolar;
	}

}