package controller;

/**
 * Armazena o ArrayList de objetos do tipo Condicionador, adiciona o objeto do tipo Condicionador no ArrayList,
 * deleta o objeto do tipo Condicionador do ArrayList, pesquisa o objeto do tipo Condicionador no ArrayList e
 * verifica se h� objetos do tipo Condicionador no ArrayList
 * @author Jo�o Paulo da Silva Freitas
 * @version 1.0
 */

import java.util.ArrayList;

import model.Condicionador;

public class ConjuntoCondicionador {
	//Cria��o do ArrayList de objetos do tipo Condicionador
	private static final ArrayList<Condicionador> listaCondicionadores = new ArrayList<>();

	/**
	 * @return ArrayList de objetos do tipo Condicionador
	 */
	//M�todo acessor do ArrayList
	public static ArrayList<Condicionador> getListaCondicionadores() {
		return listaCondicionadores;
	}
		
	/**
	 * Cadastra (armazena) o objeto do tipo Condicionador no ArrayList
	 * @param objeto Condicionador que ser� armazenado no ArrayList
	 */
	//Adicionar o objeto do tipo Condicionador no ArrayList
	public static void cadastrarCondicionador(Condicionador condicionador) {
		listaCondicionadores.add(condicionador);
	}

	/**
	 * Deleta (retira) o objeto do tipo Condicionador no ArrayList
	 * @param objeto Condicionador que ser� retirado do ArrayList
	 */
	//Deletar o objeto do tipo Condicionador do ArrayList
	public static void deletarCondicionador(Condicionador condicionador) {
		listaCondicionadores.remove(condicionador);
	}
	
	/**
	 * Pesquisa o objeto do tipo Condicionador no ArrayList
	 * @param String que ser� pesquisada no ArrayList
	 * @return objeto Condicionador que foi encontrado no ArrayList
	 */
	//Pesquisa o objeto do tipo Condicionador pelo c�digo dentro do ArrayList
	//e retorna esse objeto. Se o c�digo informado n�o bater com o de nenhum
	//objeto, retorna null
	public static Condicionador pesquisarCondicionador(String codigo) {
		for (Condicionador condicionador : listaCondicionadores) {
			if (codigo.equals(condicionador.getCodigoDoProduto())) {
				return condicionador;
			}
		}
		return null;
	}
	
	/**
	 * Verifica se h� objetos do tipo Condicionador no ArrayList
	 * @return verdadeiro ou falso a depender do m�todo isEmpty() do ArrayList
	 */
	//Verifica se h� objeto do tipo Condicionador cadastrado no ArrayList
	//Se tiver retorna true, sen�o retorna false
	public static boolean temCondicionador() {
		if (listaCondicionadores.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
	
}