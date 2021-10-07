package controller;

/**
 * Armazena o ArrayList de objetos do tipo SaboneteLiquido, adiciona o objeto do tipo SaboneteLiquido no ArrayList,
 * deleta o objeto do tipo SaboneteLiquido do ArrayList, pesquisa o objeto do tipo SaboneteLiquido no ArrayList e
 * verifica se h� objetos do tipo SaboneteLiquido no ArrayList
 * @author Jo�o Paulo da Silva Freitas
 * @version 1.0
 */

import java.util.ArrayList;

import model.SaboneteLiquido;

public class ConjuntoSaboneteLiquido {
	//Cria��o do ArrayList de objetos do tipo SaboneteLiquido
	private static final ArrayList<SaboneteLiquido> listaSabonetesLiquido = new ArrayList<>();

	/**
	 * @return ArrayList de objetos do tipo SaboneteLiquido
	 */
	//M�todo acessor do ArrayList
	public static ArrayList<SaboneteLiquido> getListaSabonetesLiquido() {
		return listaSabonetesLiquido;
	}
		
	/**
	 * Cadastra (armazena) o objeto do tipo SaboneteLiquido no ArrayList
	 * @param objeto SaboneteLiquido que ser� armazenado no ArrayList
	 */
	//Adicionar o objeto do tipo SaboneteLiquido no ArrayList
	public static void cadastrarSaboneteLiquido(SaboneteLiquido sabonete) {
		listaSabonetesLiquido.add(sabonete);
	}

	/**
	 * Deleta (retira) o objeto do tipo SaboneteLiquido no ArrayList
	 * @param objeto SaboneteLiquido que ser� retirado do ArrayList
	 */
	//Deletar o objeto do tipo SaboneteLiquido do ArrayList
	public static void deletarSaboneteLiquido(SaboneteLiquido sabonete) {
		listaSabonetesLiquido.remove(sabonete);
	}
	
	/**
	 * Pesquisa o objeto do tipo SaboneteLiquido no ArrayList
	 * @param String que ser� pesquisada no ArrayList
	 * @return objeto SaboneteLiquido que foi encontrado no ArrayList
	 */
	//Pesquisa o objeto do tipo SaboneteLiquido pelo c�digo dentro do ArrayList
	//e retorna esse objeto. Se o c�digo informado n�o bater com o de nenhum
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
	 * Verifica se h� objetos do tipo SaboneteLiquido no ArrayList
	 * @return verdadeiro ou falso a depender do m�todo isEmpty() do ArrayList
	 */
	//Verifica se h� objeto do tipo SaboneteLiquido cadastrado no ArrayList
	//Se tiver retorna true, sen�o retorna false
	public static boolean temSaboneteLiquido() {
		if (listaSabonetesLiquido.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

}