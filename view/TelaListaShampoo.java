package view;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Shampoo;

public class TelaListaShampoo {
	//Atributos
	private JFrame janela = new JFrame("Lista dos shampoos");
	private JPanel painelFundo = new JPanel();
	private String [] colunas = {"Shampoo", "Marca", "Linha", 
			"Tipo de cabelo", "Propriedades", "Condição dos fios", 
			"Código", "Preço (R$)", "Volume (ml)", "Quantidade no estoque"};
	private DefaultTableModel tabelaModelo = new DefaultTableModel(this.colunas, 0);
	private JTable tabela = new JTable(tabelaModelo);
	private JScrollPane barraRolagem = new JScrollPane(tabela);
	
	//Construtor
	public TelaListaShampoo (ArrayList<Shampoo> listaShampoos) {
		//Declarações
		int contador = 1;
		
		for (Shampoo shampoo : listaShampoos) {
			Object [] dados = {new String(Integer.toString(contador)), shampoo.getMarcaDoProduto(), 
					shampoo.getLinhaDoProduto(), shampoo.getTipoDeCabeloDoShampoo(), 
					shampoo.getPropriedadesDoShampoo(), shampoo.getCondicaoDosFiosDoShampoo(),
					shampoo.getCodigoDoProduto(),
					new String(Double.toString(shampoo.getPrecoDoProduto())),
					new String(Double.toString(shampoo.getVolumeDoProduto())),
					new String(Integer.toString(shampoo.getQuantidadeProduto()))};
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
