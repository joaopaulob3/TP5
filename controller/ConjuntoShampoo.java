package controller;

/**
 * Armazena o ArrayList de objetos do tipo Shampoo, adiciona o objeto do tipo Shampoo no ArrayList,
 * deleta o objeto do tipo Shampoo do ArrayList, pesquisa o objeto do tipo Shampoo no ArrayList e
 * verifica se h� objetos do tipo Shampoo no ArrayList
 * @author Jo�o Paulo da Silva Freitas
 * @version 1.0
 */

import java.util.ArrayList;

import model.Shampoo;

public class ConjuntoShampoo {
	//Cria��o do ArrayList de objetos do tipo Shampoo
	private static final ArrayList<Shampoo> listaShampoos = new ArrayList<>();

	/**
	 * @return ArrayList de objetos do tipo Shampoo
	 */
	//M�todo acessor do ArrayList
	public static ArrayList<Shampoo> getListaShampoos() {
		return listaShampoos;
	}
		
	/**
	 * Cadastra (armazena) o objeto do tipo Shampoo no ArrayList
	 * @param objeto Shampoo que ser� armazenado no ArrayList
	 */
	//Adicionar o objeto do tipo Shampoo no ArrayList
	public static void cadastrarShampoo(Shampoo shampoo) {
		listaShampoos.add(shampoo);
	}

	/**
	 * Deleta (retira) o objeto do tipo Shampoo no ArrayList
	 * @param objeto Shampoo que ser� retirado do ArrayList
	 */
	//Deletar o objeto do tipo Shampoo do ArrayList
	public static void deletarShampoo(Shampoo shampoo) {
		listaShampoos.remove(shampoo);
	}
	
	/**
	 * Pesquisa o objeto do tipo Shampoo no ArrayList
	 * @param String que ser� pesquisada no ArrayList
	 * @return objeto Shampoo que foi encontrado no ArrayList
	 */
	//Pesquisa o objeto do tipo Shampoo pelo c�digo dentro do ArrayList
	//e retorna esse objeto. Se o c�digo informado n�o bater com o de nenhum
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
	 * Verifica se h� objetos do tipo Shampoo no ArrayList
	 * @return verdadeiro ou falso a depender do m�todo isEmpty() do ArrayList
	 */
	//Verifica se h� objeto do tipo Shampoo cadastrado no ArrayList
	//Se tiver retorna true, sen�o retorna false
	public static boolean temShampoo() {
		if (listaShampoos.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

}