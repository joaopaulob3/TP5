package controller;

import java.util.ArrayList;

import model.Hidratante;

public class ConjuntoHidratante {
	//Cria��o do ArrayList de objetos do tipo Hidratante
	private static final ArrayList<Hidratante> listaHidratantes = new ArrayList<>();
	
	//M�todo acessor do ArrayList
	public static ArrayList<Hidratante> getListaHidratantes() {
		return listaHidratantes;
	}
	
	//Adicionar o objeto do tipo Hidratante no ArrayList
	public static void cadastrarHidratante(Hidratante Hidratante) {
		listaHidratantes.add(Hidratante);
	}
	
	//Deletar o objeto do tipo Hidratante do ArrayList
	public static void deletarHidratante(Hidratante hidratante) {
		listaHidratantes.remove(hidratante);
	}
	
	//Pesquisa o objeto do tipo Hidratante pelo c�digo dentro do ArrayList
	//e retorna esse objeto. Se o c�digo informado n�o bater com o de nenhum
	//objeto, retorna null
	public static Hidratante pesquisarHidratante(String codigo) {
		for (Hidratante hidratante : listaHidratantes) {
			if(codigo.equals(hidratante.getCodigoDoProduto())) {
				return hidratante;
			}
		}
		return null;
	}
	
	//Verifica se h� objeto do tipo Hidratante cadastrado no ArrayList
	//Se tiver retorna true, sen�o retorna false
	public static boolean temHidratante() {
		if (listaHidratantes.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

}