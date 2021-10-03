package controller;

import java.util.ArrayList;

import model.Shampoo;

public class ConjuntoShampoo {
	//Cria��o do ArrayList de objetos do tipo Shampoo
	private static final ArrayList<Shampoo> listaShampoos = new ArrayList<>();

	//M�todo acessor do ArrayList
	public static ArrayList<Shampoo> getListaShampoos() {
		return listaShampoos;
	}
		
	//Adicionar o objeto do tipo Shampoo no ArrayList
	public static void cadastrarShampoo(Shampoo shampoo) {
		listaShampoos.add(shampoo);
	}

	//Deletar o objeto do tipo Shampoo do ArrayList
	public static void deletarShampoo(Shampoo shampoo) {
		listaShampoos.remove(shampoo);
	}
	
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