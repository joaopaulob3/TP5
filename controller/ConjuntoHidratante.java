package controller;

/**
 * Armazena o ArrayList de objetos do tipo Hidratante, adiciona o objeto do tipo Hidratante no ArrayList,
 * deleta o objeto do tipo Hidratante do ArrayList, pesquisa o objeto do tipo Hidratante no ArrayList e
 * verifica se há objetos do tipo Hidratante no ArrayList
 * @author João Paulo da Silva Freitas
 * @version 1.0
 */

import java.util.ArrayList;

import model.Hidratante;

public class ConjuntoHidratante {
	//Criação do ArrayList de objetos do tipo Hidratante
	private static final ArrayList<Hidratante> listaHidratantes = new ArrayList<>();
	
	/**
	 * @return ArrayList de objetos do tipo Hidratante
	 */
	//Método acessor do ArrayList
	public static ArrayList<Hidratante> getListaHidratantes() {
		return listaHidratantes;
	}
	
	/**
	 * Cadastra (armazena) o objeto do tipo Hidratante no ArrayList
	 * @param objeto Hidratante que será armazenado no ArrayList
	 */
	//Adicionar o objeto do tipo Hidratante no ArrayList
	public static void cadastrarHidratante(Hidratante Hidratante) {
		listaHidratantes.add(Hidratante);
	}
	
	/**
	 * Deleta (retira) o objeto do tipo Hidratante no ArrayList
	 * @param objeto Hidratante que será retirado do ArrayList
	 */
	//Deletar o objeto do tipo Hidratante do ArrayList
	public static void deletarHidratante(Hidratante hidratante) {
		listaHidratantes.remove(hidratante);
	}
	
	/**
	 * Pesquisa o objeto do tipo Hidratante no ArrayList
	 * @param String que será pesquisada no ArrayList
	 * @return objeto Hidratante que foi encontrado no ArrayList
	 */
	//Pesquisa o objeto do tipo Hidratante pelo código dentro do ArrayList
	//e retorna esse objeto. Se o código informado não bater com o de nenhum
	//objeto, retorna null
	public static Hidratante pesquisarHidratante(String codigo) {
		for (Hidratante hidratante : listaHidratantes) {
			if(codigo.equals(hidratante.getCodigoDoProduto())) {
				return hidratante;
			}
		}
		return null;
	}
	
	/**
	 * Verifica se há objetos do tipo Hidratante no ArrayList
	 * @return verdadeiro ou falso a depender do método isEmpty() do ArrayList
	 */
	//Verifica se há objeto do tipo Hidratante cadastrado no ArrayList
	//Se tiver retorna true, senão retorna false
	public static boolean temHidratante() {
		if (listaHidratantes.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

}