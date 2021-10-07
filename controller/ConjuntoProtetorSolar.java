package controller;

import java.util.ArrayList;

import model.ProtetorSolar;

/**
 * Armazena o ArrayList de objetos do tipo ProtetorSolar, adiciona o objeto do tipo ProtetorSolar no ArrayList,
 * deleta o objeto do tipo ProtetorSolar do ArrayList, pesquisa o objeto do tipo ProtetorSolar no ArrayList e
 * verifica se há objetos do tipo ProtetorSolar no ArrayList
 * @author João Paulo da Silva Freitas
 * @version 1.0
 */

public class ConjuntoProtetorSolar {
	//Criação do ArrayList de objetos do tipo ProtetorSolar
	private static final ArrayList<ProtetorSolar> listaProtetorSolar = new ArrayList<>();

	/**
	 * @return ArrayList de objetos do tipo ProtetorSolar
	 */
	//Método acessor do ArrayList
	public static ArrayList<ProtetorSolar> getListaProtetorSolar() {
		return listaProtetorSolar;
	}
	
	/**
	 * Cadastra (armazena) o objeto do tipo ProtetorSolar no ArrayList
	 * @param objeto ProtetorSolar que será armazenado no ArrayList
	 */	
	//Adicionar o objeto do tipo ProtetorSolar no ArrayList
	public static void cadastrarProtetorSolar(ProtetorSolar protetor) {
		listaProtetorSolar.add(protetor);
	}

	/**
	 * Deleta (retira) o objeto do tipo ProtetorSolar no ArrayList
	 * @param objeto ProtetorSolar que será retirado do ArrayList
	 */
	//Deletar o objeto do tipo ProtetorSolar do ArrayList
	public static void deletarProtetorSolar(ProtetorSolar protetor) {
		listaProtetorSolar.remove(protetor);
	}
	
	/**
	 * Pesquisa o objeto do tipo ProtetorSolar no ArrayList
	 * @param String que será pesquisada no ArrayList
	 * @return objeto ProtetorSolar que foi encontrado no ArrayList
	 */
	//Pesquisa o objeto do tipo ProtetorSolar pelo código dentro do ArrayList
	//e retorna esse objeto. Se o código informado não bater com o de nenhum
	//objeto, retorna null
	public static ProtetorSolar pesquisarProtetorSolar(String codigo) {
		for (ProtetorSolar protetor : listaProtetorSolar) {
			if (codigo.equals(protetor.getCodigoDoProduto())) {
				return protetor;
			}
		}
		return null;
	}
	
	/**
	 * Verifica se há objetos do tipo ProtetorSolar no ArrayList
	 * @return verdadeiro ou falso a depender do método isEmpty() do ArrayList
	 */
	//Verifica se há objeto do tipo ProtetorSolar cadastrado no ArrayList
	//Se tiver retorna true, senão retorna false
	public static boolean temProtetorSolar() {
		if (listaProtetorSolar.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

}