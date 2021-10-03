package view;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.SaboneteLiquido;

public class TelaListaSaboneteLiquido {
	//Atributos
	private JFrame janela = new JFrame("Lista dos sabonetes líquido");
	private JPanel painelFundo = new JPanel();
	private String [] colunas = {"Sabonete líquido", "Marca", "Linha", 
			"Propriedades", "Código", "Preço (R$)", 
			"Volume (ml)", "Quantidade no estoque"};
	private DefaultTableModel tabelaModelo = new DefaultTableModel(this.colunas, 0);
	private JTable tabela = new JTable(tabelaModelo);
	private JScrollPane barraRolagem = new JScrollPane(tabela);
	
	//Construtor
	public TelaListaSaboneteLiquido (ArrayList<SaboneteLiquido> listaSabonetes) {
		//Declarações
		int contador = 1;
		
		for (SaboneteLiquido sabonete : listaSabonetes) {
			Object [] dados = {new String(Integer.toString(contador)), sabonete.getMarcaDoProduto(), 
					sabonete.getLinhaDoProduto(), sabonete.getPropriedadesDoSaboneteLiquido(), 
					sabonete.getCodigoDoProduto(),
					new String(Double.toString(sabonete.getPrecoDoProduto())),
					new String(Double.toString(sabonete.getVolumeDoProduto())),
					new String(Integer.toString(sabonete.getQuantidadeProduto()))};
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
