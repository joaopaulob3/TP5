package controller;

/**
 * Armazena o ArrayList de objetos do tipo Condicionador, adiciona o objeto do tipo Condicionador no ArrayList,
 * deleta o objeto do tipo Condicionador do ArrayList, pesquisa o objeto do tipo Condicionador no ArrayList e
 * verifica se há objetos do tipo Condicionador no ArrayList
 * @author João Paulo da Silva Freitas
 * @version 1.0
 */

import java.util.ArrayList;

import model.Condicionador;

public class ConjuntoCondicionador {
	//Criação do ArrayList de objetos do tipo Condicionador
	private static final ArrayList<Condicionador> listaCondicionadores = new ArrayList<>();

	/**
	 * @return ArrayList de objetos do tipo Condicionador
	 */
	//Método acessor do ArrayList
	public static ArrayList<Condicionador> getListaCondicionadores() {
		return listaCondicionadores;
	}
		
	/**
	 * Cadastra (armazena) o objeto do tipo Condicionador no ArrayList
	 * @param objeto Condicionador que será armazenado no ArrayList
	 */
	//Adicionar o objeto do tipo Condicionador no ArrayList
	public static void cadastrarCondicionador(Condicionador condicionador) {
		listaCondicionadores.add(condicionador);
	}

	/**
	 * Deleta (retira) o objeto do tipo Condicionador no ArrayList
	 * @param objeto Condicionador que será retirado do ArrayList
	 */
	//Deletar o objeto do tipo Condicionador do ArrayList
	public static void deletarCondicionador(Condicionador condicionador) {
		listaCondicionadores.remove(condicionador);
	}
	
	/**
	 * Pesquisa o objeto do tipo Condicionador no ArrayList
	 * @param String que será pesquisada no ArrayList
	 * @return objeto Condicionador que foi encontrado no ArrayList
	 */
	//Pesquisa o objeto do tipo Condicionador pelo código dentro do ArrayList
	//e retorna esse objeto. Se o código informado não bater com o de nenhum
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
	 * Verifica se há objetos do tipo Condicionador no ArrayList
	 * @return verdadeiro ou falso a depender do método isEmpty() do ArrayList
	 */
	//Verifica se há objeto do tipo Condicionador cadastrado no ArrayList
	//Se tiver retorna true, senão retorna false
	public static boolean temCondicionador() {
		if (listaCondicionadores.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
	
}