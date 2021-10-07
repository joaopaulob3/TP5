package controller;

/**
 * Armazena o ArrayList de objetos do tipo SaboneteLiquido, adiciona o objeto do tipo SaboneteLiquido no ArrayList,
 * deleta o objeto do tipo SaboneteLiquido do ArrayList, pesquisa o objeto do tipo SaboneteLiquido no ArrayList e
 * verifica se há objetos do tipo SaboneteLiquido no ArrayList
 * @author João Paulo da Silva Freitas
 * @version 1.0
 */

import java.util.ArrayList;

import model.SaboneteLiquido;

public class ConjuntoSaboneteLiquido {
	//Criação do ArrayList de objetos do tipo SaboneteLiquido
	private static final ArrayList<SaboneteLiquido> listaSabonetesLiquido = new ArrayList<>();

	/**
	 * @return ArrayList de objetos do tipo SaboneteLiquido
	 */
	//Método acessor do ArrayList
	public static ArrayList<SaboneteLiquido> getListaSabonetesLiquido() {
		return listaSabonetesLiquido;
	}
		
	/**
	 * Cadastra (armazena) o objeto do tipo SaboneteLiquido no ArrayList
	 * @param objeto SaboneteLiquido que será armazenado no ArrayList
	 */
	//Adicionar o objeto do tipo SaboneteLiquido no ArrayList
	public static void cadastrarSaboneteLiquido(SaboneteLiquido sabonete) {
		listaSabonetesLiquido.add(sabonete);
	}

	/**
	 * Deleta (retira) o objeto do tipo SaboneteLiquido no ArrayList
	 * @param objeto SaboneteLiquido que será retirado do ArrayList
	 */
	//Deletar o objeto do tipo SaboneteLiquido do ArrayList
	public static void deletarSaboneteLiquido(SaboneteLiquido sabonete) {
		listaSabonetesLiquido.remove(sabonete);
	}
	
	/**
	 * Pesquisa o objeto do tipo SaboneteLiquido no ArrayList
	 * @param String que será pesquisada no ArrayList
	 * @return objeto SaboneteLiquido que foi encontrado no ArrayList
	 */
	//Pesquisa o objeto do tipo SaboneteLiquido pelo código dentro do ArrayList
	//e retorna esse objeto. Se o código informado não bater com o de nenhum
	//objeto, retorna null
	public static SaboneteLiquido pesquisarSaboneteLiquido(String codigo) {
		for (SaboneteLiquido sabonete : listaSabonetesLiquido) {
			if (codigo.equals(sabonete.getCodigoDoProduto())) {
				return sabonete;
			}
		}
		return null;
	}
	
	/**
	 * Verifica se há objetos do tipo SaboneteLiquido no ArrayList
	 * @return verdadeiro ou falso a depender do método isEmpty() do ArrayList
	 */
	//Verifica se há objeto do tipo SaboneteLiquido cadastrado no ArrayList
	//Se tiver retorna true, senão retorna false
	public static boolean temSaboneteLiquido() {
		if (listaSabonetesLiquido.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

}