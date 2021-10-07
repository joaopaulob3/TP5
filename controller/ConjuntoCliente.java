package controller;

import java.util.ArrayList;

import model.Cliente;

public class ConjuntoCliente {
	//Cria��o do ArrayList de objetos do tipo Cliente
	private static final ArrayList<Cliente> listaClientes = new ArrayList<>();
	
	//M�todo acessor do ArrayList
	public static ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}
		
	//Adicionar o objeto do tipo Cliente no ArrayList
	public static void cadastrarCliente(Cliente cliente) {
		listaClientes.add(cliente);
	}
	
	//Deletar o objeto do tipo Cliente do ArrayList
	public static void deletarCliente(Cliente cliente) {
		listaClientes.remove(cliente);
	}
	
	//Pesquisa o objeto do tipo Cliente pelo CPF dentro do ArrayList
	//e retorna esse objeto. Se o CPF informado n�o bater com o de nenhum
	//objeto, retorna null
	public static Cliente pesquisarCliente(String cpf) {
		for (Cliente cliente : listaClientes) {
			if (cpf.equals(cliente.getCPF())) {
				return cliente;
			}
		}
		return null;
	}
	
	//Verifica se h� objeto do tipo Cliente cadastrado no ArrayList
	//Se tiver retorna true, sen�o retorna false
	public static boolean temCliente() {
		if (listaClientes.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

}