package controller;

/**
 * Armazena o ArrayList de objetos do tipo Shampoo, adiciona o objeto do tipo Shampoo no ArrayList,
 * deleta o objeto do tipo Shampoo do ArrayList, pesquisa o objeto do tipo Shampoo no ArrayList e
 * verifica se há objetos do tipo Shampoo no ArrayList
 * @author João Paulo da Silva Freitas
 * @version 1.0
 */

import java.util.ArrayList;

import model.Shampoo;

public class ConjuntoShampoo {
	//Criação do ArrayList de objetos do tipo Shampoo
	private static final ArrayList<Shampoo> listaShampoos = new ArrayList<>();

	/**
	 * @return ArrayList de objetos do tipo Shampoo
	 */
	//Método acessor do ArrayList
	public static ArrayList<Shampoo> getListaShampoos() {
		return listaShampoos;
	}
		
	/**
	 * Cadastra (armazena) o objeto do tipo Shampoo no ArrayList
	 * @param objeto Shampoo que será armazenado no ArrayList
	 */
	//Adicionar o objeto do tipo Shampoo no ArrayList
	public static void cadastrarShampoo(Shampoo shampoo) {
		listaShampoos.add(shampoo);
	}

	/**
	 * Deleta (retira) o objeto do tipo Shampoo no ArrayList
	 * @param objeto Shampoo que será retirado do ArrayList
	 */
	//Deletar o objeto do tipo Shampoo do ArrayList
	public static void deletarShampoo(Shampoo shampoo) {
		listaShampoos.remove(shampoo);
	}
	
	/**
	 * Pesquisa o objeto do tipo Shampoo no ArrayList
	 * @param String que será pesquisada no ArrayList
	 * @return objeto Shampoo que foi encontrado no ArrayList
	 */
	//Pesquisa o objeto do tipo Shampoo pelo código dentro do ArrayList
	//e retorna esse objeto. Se o código informado não bater com o de nenhum
	//objeto, retorna null
	public static Shampoo pesquisarShampoo(String codigo) {
		for (Shampoo shampoo : listaShampoos) {
			if (codigo.equals(shampoo.getCodigoDoProduto())) {
				return shampoo;
			}
		}
		return null;
	}
	
	/**
	 * Verifica se há objetos do tipo Shampoo no ArrayList
	 * @return verdadeiro ou falso a depender do método isEmpty() do ArrayList
	 */
	//Verifica se há objeto do tipo Shampoo cadastrado no ArrayList
	//Se tiver retorna true, senão retorna false
	public static boolean temShampoo() {
		if (listaShampoos.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

}