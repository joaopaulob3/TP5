package controller;

/**
 * Armazena o ArrayList de objetos do tipo Perfumaria, adiciona o objeto do tipo Perfumaria no ArrayList,
 * deleta o objeto do tipo Perfumaria do ArrayList, pesquisa o objeto do tipo Perfumaria no ArrayList e
 * verifica se há objetos do tipo Perfumaria no ArrayList
 * @author João Paulo da Silva Freitas
 * @version 1.0
 */

import java.util.ArrayList;

import model.Perfumaria;

public class ConjuntoPerfumaria{
	//Criação do ArrayList de objetos do tipo Perfumaria
	private static final ArrayList<Perfumaria> listaPerfumes = new ArrayList<>();

	/**
	 * @return ArrayList de objetos do tipo Perfumaria
	 */
	//Método acessor do ArrayList
	public static ArrayList<Perfumaria> getListaPerfumes(){
		return listaPerfumes;
	}
		
	/**
	 * Cadastra (armazena) o objeto do tipo Perfumaria no ArrayList
	 * @param objeto Perfumaria que será armazenado no ArrayList
	 */
	//Adicionar o objeto do tipo Perfumaria no ArrayList
	public static void cadastrarPerfume(Perfumaria perfume) {
		listaPerfumes.add(perfume);
	}

	/**
	 * Deleta (retira) o objeto do tipo Perfumaria no ArrayList
	 * @param objeto Perfumaria que será retirado do ArrayList
	 */
	//Deletar o objeto do tipo Perfumaria do ArrayList
	public static void deletarPerfume(Perfumaria perfume) {
		listaPerfumes.remove(perfume);
	}
	
	/**
	 * Pesquisa o objeto do tipo Perfumaria no ArrayList
	 * @param String que será pesquisada no ArrayList
	 * @return objeto Perfumaria que foi encontrado no ArrayList
	 */
	//Pesquisa o objeto do tipo Perfumaria pelo código dentro do ArrayList
	//e retorna esse objeto. Se o código informado não bater com o de nenhum
	//objeto, retorna null
	public static Perfumaria pesquisarPerfume(String codigo) {
		for (Perfumaria perfume : listaPerfumes) {
			if (codigo.equals(perfume.getCodigoDoProduto())) {
				return perfume;
			}
		}
		return null;
	}
	
	/**
	 * Verifica se há objetos do tipo Perfumaria no ArrayList
	 * @return verdadeiro ou falso a depender do método isEmpty() do ArrayList
	 */
	//Verifica se há objeto do tipo Perfumaria cadastrado no ArrayList
	//Se tiver retorna true, senão retorna false
	public static boolean temPerfume() {
		if (listaPerfumes.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
	
}