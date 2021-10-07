package model;

/**
 * Cria 2 objetos de cada tipo de Produto com seus respectivos dados e os armazena
 * em seus respectivos ArrayLists. Os 6 tipos de produto s�o: Perfumaria, Hidratante,
 * ProtetorSolar, Shampoo, Condicionador e SaboneteLiquido. Al�m disso, a classe tamb�m
 * cria 2 objetos do tipo Cliente e os armazena em seu respectivo ArrayList. 
 * 
 * @author Jo�o Paulo da Silva Freitas
 * @version 1.0
 */

import controller.*;

public class CarregamentoInicialDeDadosAleatorios {
	//Inst�ncia de objetos para pr�-carregamento do programa
	//adicionando-os aos seus respectivos ArrayList
	public static void carregamentoInicial() {
		//Perfume
		Perfumaria zaad = new Perfumaria(249.90, 95, "perfume1", "ZAAD", "Santal", 10,
				"Perfumaria Masculina", "Vegano e Cruelty Free", "Amadeirado", "Amadeirado");
		ConjuntoPerfumaria.cadastrarPerfume(zaad);
		Perfumaria malbec = new Perfumaria(143.90, 100, "perfume2", "Malbec", "Bleu", 15,
				"Perfumaria Masculina", "Cruelty Free", "", "");
		ConjuntoPerfumaria.cadastrarPerfume(malbec);
		
		//Hidratante
		Hidratante nativaSPA = new Hidratante(42.90, 200, "hidratante1", "Nativa SPA", 
				"Org�nico", 4, "Todos os tipos");
		ConjuntoHidratante.cadastrarHidratante(nativaSPA);
		Hidratante lily = new Hidratante(74.90, 250, "hidratante2", "Lily", "", 6,
				"Todos os tipos");
		ConjuntoHidratante.cadastrarHidratante(lily);
		
		//ProtetorSolar
		ProtetorSolar cuidesebem = new ProtetorSolar(54.90, 50, "protetor1", 
				"Cuide-se bem", "Faciall", 5, "Cruelty Free", 50);
		ConjuntoProtetorSolar.cadastrarProtetorSolar(cuidesebem);
		ProtetorSolar cuidesebem2 = new ProtetorSolar(55.90, 200, "protetor2", 
				"Cuide-se bem", "Solar", 2, "Cruelty Free", 30);
		ConjuntoProtetorSolar.cadastrarProtetorSolar(cuidesebem2);
		
		//Shampoo
		Shampoo nativaSPA2 = new Shampoo(44.90, 300, "shampoo1", "Nativa SPA", "Matcha",
				6, "Todos os tipos", "Cruelty Free", "Res�duos");
		ConjuntoShampoo.cadastrarShampoo(nativaSPA2);
		Shampoo match = new Shampoo(35.90, 250, "shampoo2", "Match.", "Anti Oleosidade",
				12, "Oleosos ou Mistos", "Vegano e Cruelty Free", "Olesosos");
		ConjuntoShampoo.cadastrarShampoo(match);
		
		//Condicionador
		Condicionador cuidesebem3 = new Condicionador(24.90, 250, "condicionador1", 
				"Cuide-se bem", "Lisos", 20, "Todos os tipos", "Cruelty Free", 
				"Envelhecimento dos fios");
		ConjuntoCondicionador.cadastrarCondicionador(cuidesebem3);
		Condicionador sophie = new Condicionador(30.90, 200, "condicionador2", 
				"Sophie", "", 12, "Todos os tipos", "Cruelty Free", "Res�duos");
		ConjuntoCondicionador.cadastrarCondicionador(sophie);
		
		//Sabonete L�quido
		SaboneteLiquido nativaSPA3 = new SaboneteLiquido(31.90, 200, "sabonete1",
				"Nativa SPA","Lichia", 10, "Cruelty Free");
		ConjuntoSaboneteLiquido.cadastrarSaboneteLiquido(nativaSPA3);
		SaboneteLiquido floratta = new SaboneteLiquido(15.90, 75, "sabonete2", 
				"Floratta","Rose", 18, "Cruelty Free");
		ConjuntoSaboneteLiquido.cadastrarSaboneteLiquido(floratta);
		
		//Cliente
		Cliente jonas = new Cliente("123456789", "12345", "Jonas",
				"jonas@gmail.com", "61991231231", "Masculino");
		ConjuntoCliente.cadastrarCliente(jonas);
		Cliente maria = new Cliente("127312731238", "772312", "Maria",
				"maria@gmail.com", "413123123", "Feminino");
		ConjuntoCliente.cadastrarCliente(maria);
	}
}