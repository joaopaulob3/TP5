package controller;

/**
 * Armazena o ArrayList de objetos do tipo Cliente, adiciona o objeto do tipo Cliente no ArrayList,
 * deleta o objeto do tipo Cliente do ArrayList, pesquisa o objeto do tipo Cliente no ArrayList e
 * verifica se h� objetos do tipo Cliente no ArrayList
 * @author Jo�o Paulo da Silva Freitas
 * @version 1.0
 */

import java.util.ArrayList;

import model.Cliente;

public class ConjuntoCliente {
	//Cria��o do ArrayList de objetos do tipo Cliente
	private static final ArrayList<Cliente> listaClientes = new ArrayList<>();
	
	/**
	 * @return ArrayList de objetos do tipo Cliente
	 */
	//M�todo acessor do ArrayList
	public static ArrayList<Cliente> getListaClientes() {
		return listaClientes;
	}
		
	/**
	 * Cadastra (armazena) o objeto do tipo Cliente no ArrayList
	 * @param objeto cliente que ser� armazenado no ArrayList
	 */
	//Adicionar o objeto do tipo Cliente no ArrayList
	public static void cadastrarCliente(Cliente cliente) {
		listaClientes.add(cliente);
	}
	
	/**
	 * Deleta (retira) o objeto do tipo Cliente no ArrayList
	 * @param objeto cliente que ser� retirado do ArrayList
	 */
	//Deletar o objeto do tipo Cliente do ArrayList
	public static void deletarCliente(Cliente cliente) {
		listaClientes.remove(cliente);
	}
	
	/**
	 * Pesquisa o objeto do tipo Cliente no ArrayList
	 * @param String que ser� pesquisada no ArrayList
	 * @return objeto Cliente que foi encontrado no ArrayList
	 */
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
	
	/**
	 * Verifica se h� objetos do tipo Cliente no ArrayList
	 * @return verdadeiro ou falso a depender do m�todo isEmpty() do ArrayList
	 */
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