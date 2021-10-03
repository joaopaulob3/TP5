package view;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.ProtetorSolar;

public class TelaListaProtetorSolar {
	//Atributos
	private JFrame janela = new JFrame("Lista dos protetores");
	private JPanel painelFundo = new JPanel();
	private String [] colunas = {"Protetor Solar", "Marca", "Linha", 
			"Propriedades", "FPS", "Código", "Preço (R$)", 
			"Volume (ml)", "Quantidade no estoque"};
	private DefaultTableModel tabelaModelo = new DefaultTableModel(this.colunas, 0);
	private JTable tabela = new JTable(tabelaModelo);
	private JScrollPane barraRolagem = new JScrollPane(tabela);
	
	//Construtor
	public TelaListaProtetorSolar(ArrayList<ProtetorSolar> listaProtetores) {
		//Declarações
		int contador = 1;
		
		for (ProtetorSolar protetor : listaProtetores) {
			Object [] dados = {new String(Integer.toString(contador)), protetor.getMarcaDoProduto(), 
					protetor.getLinhaDoProduto(), protetor.getPropriedadesDoProtetorSolar(), 
					new String(Integer.toString(protetor.getFpsDoProtetorSolar())), protetor.getCodigoDoProduto(),
					new String(Double.toString(protetor.getPrecoDoProduto())),
					new String(Double.toString(protetor.getVolumeDoProduto())),
					new String(Integer.toString(protetor.getQuantidadeProduto()))};
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
