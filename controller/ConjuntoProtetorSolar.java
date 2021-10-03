package controller;

import java.util.ArrayList;

import model.ProtetorSolar;

public class ConjuntoProtetorSolar {
	//Cria��o do ArrayList de objetos do tipo ProtetorSolar
	private static final ArrayList<ProtetorSolar> listaProtetorSolar = new ArrayList<>();

	//M�todo acessor do ArrayList
	public static ArrayList<ProtetorSolar> getListaProtetorSolar() {
		return listaProtetorSolar;
	}
		
	//Adicionar o objeto do tipo ProtetorSolar no ArrayList
	public static void cadastrarProtetorSolar(ProtetorSolar protetor) {
		listaProtetorSolar.add(protetor);
	}

	//Deletar o objeto do tipo ProtetorSolar do ArrayList
	public static void deletarProtetorSolar(ProtetorSolar protetor) {
		listaProtetorSolar.remove(protetor);
	}
	
	//Pesquisa o objeto do tipo ProtetorSolar pelo c�digo dentro do ArrayList
	//e retorna esse objeto. Se o c�digo informado n�o bater com o de nenhum
	//objeto, retorna null
	public static ProtetorSolar pesquisarProtetorSolar(String codigo) {
		for (ProtetorSolar protetor : listaProtetorSolar) {
			if (codigo.equals(protetor.getCodigoDoProduto())) {
				return protetor;
			}
		}
		return null;
	}
	
	//Verifica se h� objeto do tipo ProtetorSolar cadastrado no ArrayList
	//Se tiver retorna true, sen�o retorna false
	public static boolean temProtetorSolar() {
		if (listaProtetorSolar.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

}