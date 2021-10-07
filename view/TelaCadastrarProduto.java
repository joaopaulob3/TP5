package view;

/**
 * Apresenta a tela de cadastro dos 6 produtos
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

public class TelaCadastrarProduto implements ActionListener {
	//Atributos
	private JFrame frmCadastrarProduto = new JFrame("Cadastro de Produto");
	private JLabel lblTitulo = new JLabel("Qual produto deseja cadastrar?");
	private JButton btnPerfume = new JButton("Perfume");
	private JButton btnHidratante = new JButton("Hidratante");
	private JButton btnProtetorSolar = new JButton("Protetor Solar");
	private JButton btnShampoo = new JButton("Shampoo");
	private JButton btnCondicionador = new JButton("Condicionador");
	private JButton btnSaboneteLiquido = new JButton("Sabonete L\u00EDquido");
	private JButton btnVoltar = new JButton("Voltar");
	private JFrame frmMenuProduto;
	
	//Construtor
	public TelaCadastrarProduto(JFrame frmMenuProduto) {
		//Configura os componentes da JFrame da tela de cadastro de produto
		this.frmMenuProduto = frmMenuProduto;
		this.frmCadastrarProduto.setBounds(100, 100, 534, 451);
		this.frmCadastrarProduto.getContentPane().setLayout(null);
		this.frmCadastrarProduto.setResizable(false);
		this.frmCadastrarProduto.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frmCadastrarProduto.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente encerrar o programa?", null,
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		
		//Configura o label título da pergunta
		this.lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.lblTitulo.setBounds(143, 46, 264, 36);
		this.frmCadastrarProduto.getContentPane().add(lblTitulo);
		
		//Configura o botão de perfume
		this.btnPerfume.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnPerfume.setBounds(156, 112, 217, 27);
		this.frmCadastrarProduto.getContentPane().add(btnPerfume);
		
		//Configura o botão de hidratante
		this.btnHidratante.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnHidratante.setBounds(156, 150, 217, 27);
		this.frmCadastrarProduto.getContentPane().add(btnHidratante);
		
		//Configura o botão de protetor solar
		this.btnProtetorSolar.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnProtetorSolar.setBounds(156, 188, 217, 27);
		this.frmCadastrarProduto.getContentPane().add(btnProtetorSolar);
		
		//Configura o botão de shampoo
		this.btnShampoo.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnShampoo.setBounds(156, 227, 217, 27);
		this.frmCadastrarProduto.getContentPane().add(btnShampoo);
		
		//Configura o botão de condicionador
		this.btnCondicionador.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnCondicionador.setBounds(156, 266, 217, 27);
		this.frmCadastrarProduto.getContentPane().add(btnCondicionador);
		
		//Condigura o botão de sabonte líquido
		this.btnSaboneteLiquido.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnSaboneteLiquido.setBounds(156, 304, 217, 27);
		this.frmCadastrarProduto.getContentPane().add(btnSaboneteLiquido);
		
		//Condigura o botão de voltar
		this.btnVoltar.setBounds(415, 377, 89, 23);
		this.frmCadastrarProduto.getContentPane().add(btnVoltar);
		this.frmCadastrarProduto.setLocationRelativeTo(null);
		
		//Direciona e configura os eventos dos botões
		this.getBtnPerfume().addActionListener(this);
		this.getBtnHidratante().addActionListener(this);
		this.getBtnProtetorSolar().addActionListener(this);
		this.getBtnShampoo().addActionListener(this);
		this.getBtnCondicionador().addActionListener(this);
		this.getBtnSaboneteLiquido().addActionListener(this);
		this.getBtnVoltar().addActionListener(this);
		
		//Permite que a JFrame fique centralizada e visível
		this.frmCadastrarProduto.setLocationRelativeTo(null);
		this.frmCadastrarProduto.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Armazena o botão escolhido
		JButton botao = (JButton) e.getSource();
		
		//Oculta a tela de cadastro
		this.getFrmCadastrarProduto().dispose();
		
		//Inicia os eventos sobre o cadastro de perfume
		if (botao == this.getBtnPerfume()) {
			new TelaCadastrarPerfume(this.getFrmCadastrarProduto(), null);
		}
		
		//Inicia os eventos sobre o cadastro de hidratante
		if (botao == this.getBtnHidratante()) {
			new TelaCadastrarHidratante(this.getFrmCadastrarProduto(), null);
		}
		
		//Inicia os eventos sobre o cadastro de protetor solar
		if (botao == this.getBtnProtetorSolar()) {
			new TelaCadastrarProtetorSolar(this.getFrmCadastrarProduto(), null);
		}
		
		//Inicia os eventos sobre o cadastro de shampoo
		if (botao == this.getBtnShampoo()) {
			new TelaCadastrarShampoo(this.getFrmCadastrarProduto(), null);
		}
		
		//Inicia os eventos sobre o cadastro de condicionador
		if (botao == this.getBtnCondicionador()) {
			new TelaCadastrarCondicionador(this.getFrmCadastrarProduto(), null);
		}
		
		//Inicia os eventos sobre o cadastro de sabonete líquido
		if (botao == this.getBtnSaboneteLiquido()) {
			new TelaCadastrarSaboneteLiquido(this.getFrmCadastrarProduto(), null);
		}
		
		//Inicia os eventos sobre o botão voltar
		if (botao == this.getBtnVoltar()) {
			this.getFrmMenuProduto().setVisible(true);
		}
	}
	
	//Métodos acessores
	public JFrame getFrmCadastrarProduto() {
		return this.frmCadastrarProduto;
	}
	public JLabel getLblNewLabel() {
		return this.lblTitulo;
	}
	public JButton getBtnPerfume() {
		return this.btnPerfume;
	}
	public JButton getBtnHidratante() {
		return this.btnHidratante;
	}
	public JButton getBtnProtetorSolar() {
		return this.btnProtetorSolar;
	}
	public JButton getBtnShampoo() {
		return this.btnShampoo;
	}
	public JButton getBtnCondicionador() {
		return this.btnCondicionador;
	}
	public JButton getBtnSaboneteLiquido() {
		return this.btnSaboneteLiquido;
	}
	public JButton getBtnVoltar() {
		return this.btnVoltar;
	}
	public JFrame getFrmMenuProduto() {
		return this.frmMenuProduto;
	}
	
}
