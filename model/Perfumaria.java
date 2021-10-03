package model;

public class Perfumaria extends Produto{
	//Atributos
	private String categoriaDoPerfume;
	private String propriedadesDoPerfume;
	private String familiaOlfativaDoPerfume;
	private String subfamiliaDoPerfume;
	
	//Construtor
	public Perfumaria(double precoDoProduto, double volumeDoProduto, 
			String codigoDoProduto, String marcaDoProduto, String linhaDoProduto,
			int quantidadeProduto, String categoriaDoPerfume, String propriedadesDoPerfume, 
			String familiaOlfativaDoPerfume, String subfamiliaDoPerfume) {
		super(precoDoProduto, volumeDoProduto, codigoDoProduto, marcaDoProduto, 
				linhaDoProduto, quantidadeProduto);
		this.setCategoriaDoPerfume(categoriaDoPerfume);
		this.setPropriedadesDoPerfume(propriedadesDoPerfume);
		this.setFamiliaOlfativaDoPerfume(familiaOlfativaDoPerfume);
		this.setSubfamiliaDoPerfume(subfamiliaDoPerfume);
	}
	
	//M�todos modificadores
	public void setCategoriaDoPerfume(String categoriaDoPerfume) {
		this.categoriaDoPerfume = categoriaDoPerfume;
	}
	public void setPropriedadesDoPerfume(String propriedadesDoPerfume) {
		this.propriedadesDoPerfume = propriedadesDoPerfume;
	}
	public void setFamiliaOlfativaDoPerfume(String familiaOlfativaDoPerfume) {
		this.familiaOlfativaDoPerfume = familiaOlfativaDoPerfume;
	}
	public void setSubfamiliaDoPerfume(String subfamiliaDoPerfume) {
		this.subfamiliaDoPerfume = subfamiliaDoPerfume;
	}
	
	//M�todos acessores
	public String getCategoriaDoPerfume() {
		return this.categoriaDoPerfume;
	}
	public String getPropriedadesDoPerfume() {
		return this.propriedadesDoPerfume;
	}
	public String getFamiliaOlfativaDoPerfume() {
		return this.familiaOlfativaDoPerfume;
	}
	public String getSubfamiliaDoPerfume() {
		return this.subfamiliaDoPerfume;
	}
	
}