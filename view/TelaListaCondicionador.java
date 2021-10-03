package view;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Condicionador;

public class TelaListaCondicionador {
	//Atributos
	private JFrame janela = new JFrame("Lista dos condicionadores");
	private JPanel painelFundo = new JPanel();
	private String [] colunas = {"Condicionador", "Marca", "Linha", 
			"Tipo de cabelo", "Propriedades", "Condição dos fios", 
			"Código", "Preço (R$)", "Volume (ml)", "Quantidade no estoque"};
	private DefaultTableModel tabelaModelo = new DefaultTableModel(this.colunas, 0);
	private JTable tabela = new JTable(tabelaModelo);
	private JScrollPane barraRolagem = new JScrollPane(tabela);
	
	//Construtor
	public TelaListaCondicionador (ArrayList<Condicionador> listaCondicionadores) {
		//Declarações
		int contador = 1;
		
		for (Condicionador condicionador : listaCondicionadores) {
			Object [] dados = {new String(Integer.toString(contador)), condicionador.getMarcaDoProduto(), 
					condicionador.getLinhaDoProduto(), condicionador.getTipoDeCabeloDoCondicionador(), 
					condicionador.getPropriedadesDoCondicionador(), condicionador.getCondicaoDosFiosDoCondicionador(),
					condicionador.getCodigoDoProduto(),
					new String(Double.toString(condicionador.getPrecoDoProduto())),
					new String(Double.toString(condicionador.getVolumeDoProduto())),
					new String(Integer.toString(condicionador.getQuantidadeProduto()))};
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
