package view;

/**
 * Apresenta a tela que pede a quantidade do produto que o cliente
 * deseja comprar e realiza a validação da compra e o seu cadastro
 * no ArrayList
 * @author João Paulo da Silva Freitas
 * @version 1.0
 */

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import model.*;
import controller.*;

public class TelaInformarQuantidade implements ActionListener{
	//Atributos
	private JFrame frmInformarQuantidade = new JFrame("Compra");
	private JLabel lblPergunta = new JLabel("Quantidade que deseja comprar:");
	private JTextField textField = new JTextField();
	private JButton btnOK = new JButton("Ok");
	private JFrame telaCompra;
	private int opcao;
	private JFrame listagemPerfume;
	private Produto produto;
	private Cliente cliente;
	
	//Construtor
	public TelaInformarQuantidade(JFrame listagemPerfume, JFrame telaCompra, int opcao, Produto produto, Cliente cliente) {
		this.telaCompra = telaCompra;
		this.listagemPerfume = listagemPerfume;
		this.opcao = opcao;
		this.produto = produto;
		this.cliente = cliente;
		this.frmInformarQuantidade.setBounds(100, 100, 469, 231);
		this.frmInformarQuantidade.setResizable(false);
		this.frmInformarQuantidade.getContentPane().setLayout(null);
		this.frmInformarQuantidade.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frmInformarQuantidade.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente encerrar o programa?", null,
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		
		//Configura o label de pergunta
		this.lblPergunta.setFont(new Font("Tahoma", Font.PLAIN, 15));
		this.lblPergunta.setBounds(21, 38, 230, 38);
		this.frmInformarQuantidade.getContentPane().add(lblPergunta);
		
		//Configura o campo de texto
		this.textField.setBounds(243, 44, 196, 31);
		this.frmInformarQuantidade.getContentPane().add(textField);
		this.textField.setColumns(10);
		
		//Configura o botão OK
		this.btnOK.setBounds(350, 88, 89, 23);
		this.frmInformarQuantidade.getContentPane().add(btnOK);
		
		//Direciona os eventos do botão
		this.getBtnOK().addActionListener(this);
		
		//Permite que a tela fique centralizada e visível
		this.frmInformarQuantidade.setLocationRelativeTo(null);
		this.frmInformarQuantidade.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//Declarações
		double valorDaCompra = 0;
		Perfumaria perfume = ((Perfumaria) this.getProduto());
		
		//Armazena o botão escolhido
		JButton botao = (JButton) e.getSource();
		
		//Armazena a quantidade digitada
		int quantidade = Integer.valueOf(this.getTextField().getText()).intValue();
		
		if (botao == this.getBtnOK()) {
			if (this.getProduto() instanceof Perfumaria) {
				if (quantidade > perfume.getQuantidadeProduto()) {
					JOptionPane.showMessageDialog(null, "A quantidade informada é maior que a quantidade em estoque!", "", JOptionPane.WARNING_MESSAGE);
					this.getFrmInformarQuantidade().dispose();
					this.getListagemPerfume().dispose();
					this.getTelaCompra().setVisible(true);
				} else {
					//Armazena o valor da compra
					valorDaCompra = quantidade*perfume.getPrecoDoProduto();
					//Criação do objeto Compra através do Construtor
					Compra compraPerfume = new Compra(this.getCliente(), perfume, valorDaCompra, quantidade);
					//Adicionando o objeto criado no ArrayList listaCompras
					ConjuntoCompra.cadastrarCompra(compraPerfume);
					//Diminui a quantidade comprada do estoque do produto
					perfume.setQuantidadeProduto(perfume.getQuantidadeProduto() - quantidade);
			
					JOptionPane.showMessageDialog(null, "Compra finalizada! Agradecemos a preferência!", "", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Valor da compra: R$" + valorDaCompra, "", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Compras realizadas até o momento em nossa loja:" + quantidade, "", JOptionPane.INFORMATION_MESSAGE);
					
					this.getFrmInformarQuantidade().dispose();
					this.getListagemPerfume().dispose();
					this.getTelaCompra().setVisible(true);
				}
			}
		}
	}
	public JFrame getFrmInformarQuantidade() {
		return this.frmInformarQuantidade;
	}
	public JLabel getLblPergunta() {
		return this.lblPergunta;
	}
	public JTextField getTextField() {
		return this.textField;
	}
	public JButton getBtnOK() {
		return this.btnOK;
	}
	public JFrame getTelaCompra() {
		return this.telaCompra;
	}
	public int getOpcao() {
		return this.opcao;
	}
	public Produto getProduto() {
		return this.produto;
	}
	public Cliente getCliente() {
		return this.cliente;
	}
	public JFrame getListagemPerfume() {
		return this.listagemPerfume;
	}
}

