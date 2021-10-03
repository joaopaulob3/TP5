package view;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Cliente;

public class TelaListaClientes {
	//Atributos
	private JFrame janela = new JFrame("Lista dos clientes");
	private JPanel painelFundo = new JPanel();
	private String [] colunas = {"Cliente", "Nome", "Email", 
			"Celular", "Gênero", "CPF"};
	private DefaultTableModel tabelaModelo = new DefaultTableModel(this.colunas, 0);
	private JTable tabela = new JTable(tabelaModelo);
	private JScrollPane barraRolagem = new JScrollPane(tabela);

	//Construtor
	public TelaListaClientes (ArrayList<Cliente> listaClientes) {
		//Declarações
		int contador = 1;

		for (Cliente cliente : listaClientes) {
			Object [] dados = {new String(Integer.toString(contador)), cliente.getNomeCliente(),
					cliente.getEmailCliente(), cliente.getCelularCliente(), cliente.getGeneroCliente(),
					cliente.getCpf()};
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