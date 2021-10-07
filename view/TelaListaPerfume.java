package view;

/**
 * Apresenta a tela de listagem dos perfumes armazenados no ArrayList
 * @author João Paulo da Silva Freitas
 * @version 1.0
 */

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Perfumaria;

public class TelaListaPerfume {
	//Atributos
	private JFrame janela = new JFrame("Lista dos perfumes");
	private JPanel painelFundo = new JPanel();
	private String [] colunas = {"Perfume", "Marca", "Linha", 
			"Categoria", "Propriedades", "Família olfativa", 
			"Subfamília", "Código", "Preço (R$)", 
			"Volume (ml)", "Quantidade no estoque"};
	private DefaultTableModel tabelaModelo = new DefaultTableModel(this.colunas, 0);
	private JTable tabela = new JTable(tabelaModelo);
	private JScrollPane barraRolagem = new JScrollPane(tabela);
	
	//Construtor
	public TelaListaPerfume(ArrayList<Perfumaria> listaPerfumes) {
		//Declarações
		int contador = 1;
		
		for (Perfumaria perfume : listaPerfumes) {
			Object [] dados = {new String(Integer.toString(contador)), perfume.getMarcaDoProduto(), 
					perfume.getLinhaDoProduto(), perfume.getCategoriaDoPerfume(), 
					perfume.getPropriedadesDoPerfume(), perfume.getFamiliaOlfativaDoPerfume(), 
					perfume.getSubfamiliaDoPerfume(), perfume.getCodigoDoProduto(), 
					new String(Double.toString(perfume.getPrecoDoProduto())),
					new String(Double.toString(perfume.getVolumeDoProduto())),
					new String(Integer.toString(perfume.getQuantidadeProduto()))};
			tabelaModelo.addRow(dados);
			contador++;
		}

        this.painelFundo.setLayout(new GridLayout(1, 1));
        this.painelFundo.add(barraRolagem);

        this.janela.getContentPane().add(painelFundo);
        this.janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.janela.setSize(500, 120);
        this.janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.janela.setResizable(true);
        this.janela.setVisible(true);
	}
	
	//Método acessor
	public JFrame getJanela() {
		return this.janela;
	}
}
