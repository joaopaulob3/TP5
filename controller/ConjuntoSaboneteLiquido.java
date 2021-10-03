package controller;

import java.util.ArrayList;

import model.SaboneteLiquido;

public class ConjuntoSaboneteLiquido {
	//Cria��o do ArrayList de objetos do tipo SaboneteLiquido
	private static final ArrayList<SaboneteLiquido> listaSabonetesLiquido = new ArrayList<>();

	//M�todo acessor do ArrayList
	public static ArrayList<SaboneteLiquido> getListaSabonetesLiquido() {
		return listaSabonetesLiquido;
	}
		
	//Adicionar o objeto do tipo SaboneteLiquido no ArrayList
	public static void cadastrarSaboneteLiquido(SaboneteLiquido sabonete) {
		listaSabonetesLiquido.add(sabonete);
	}

	//Deletar o objeto do tipo SaboneteLiquido do ArrayList
	public static void deletarSaboneteLiquido(SaboneteLiquido sabonete) {
		listaSabonetesLiquido.remove(sabonete);
	}
	
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