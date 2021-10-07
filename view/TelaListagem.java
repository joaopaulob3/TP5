package view;

/**
 * Apresenta a tela de listagem dos 6 produtos
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

import controller.*;

public class TelaListagem implements ActionListener {
	//Atributos
	private JFrame frmListagem = new JFrame("Listagem de dados");
	private JLabel lblTitulo = new JLabel("Deseja listar os dados de qual produto?");
	private JButton btnPerfume = new JButton("Perfume");
	private JButton btnHidratante = new JButton("Hidratante");
	private JButton btnProtetorSolar = new JButton("Protetor Solar");
	private JButton btnShampoo = new JButton("Shampoo");
	private JButton btnCondicionador = new JButton("Condicionador");
	private JButton btnSaboneteLiquido = new JButton("Sabonete L\u00EDquido");
	private JButton btnVoltar = new JButton("Voltar");
	private JFrame telaMenuProduto;
	
	//Construtor
	public TelaListagem(JFrame telaMenuProduto) {
		//Configura os componentes da JFrame da tela de listagem de produto
		this.telaMenuProduto = telaMenuProduto;
		this.frmListagem.setBounds(100, 100, 534, 451);
		this.frmListagem.getContentPane().setLayout(null);
		this.frmListagem.setResizable(false);
		this.frmListagem.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frmListagem.addWindowListener(new WindowAdapter() {
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
		this.lblTitulo.setBounds(110, 46, 350, 36);
		this.frmListagem.getContentPane().add(lblTitulo);
		
		//Configura o botão de perfume
		this.btnPerfume.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnPerfume.setBounds(156, 112, 217, 27);
		this.frmListagem.getContentPane().add(btnPerfume);
		
		//Configura o botão de hidratante
		this.btnHidratante.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnHidratante.setBounds(156, 150, 217, 27);
		this.frmListagem.getContentPane().add(btnHidratante);
		
		//Configura o botão de protetor solar
		this.btnProtetorSolar.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnProtetorSolar.setBounds(156, 188, 217, 27);
		this.frmListagem.getContentPane().add(btnProtetorSolar);
		
		//Configura o botão de shampoo
		this.btnShampoo.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnShampoo.setBounds(156, 227, 217, 27);
		this.frmListagem.getContentPane().add(btnShampoo);
		
		//Configura o botão de condicionador
		this.btnCondicionador.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnCondicionador.setBounds(156, 266, 217, 27);
		this.frmListagem.getContentPane().add(btnCondicionador);
		
		//Condigura o botão de sabonte líquido
		this.btnSaboneteLiquido.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnSaboneteLiquido.setBounds(156, 304, 217, 27);
		this.frmListagem.getContentPane().add(btnSaboneteLiquido);
		
		//Condigura o botão de voltar
		this.btnVoltar.setBounds(415, 377, 89, 23);
		this.frmListagem.getContentPane().add(btnVoltar);
		this.frmListagem.setLocationRelativeTo(null);
		
		//Direciona e configura os eventos dos botões
		this.getBtnPerfume().addActionListener(this);
		this.getBtnHidratante().addActionListener(this);
		this.getBtnProtetorSolar().addActionListener(this);
		this.getBtnShampoo().addActionListener(this);
		this.getBtnCondicionador().addActionListener(this);
		this.getBtnSaboneteLiquido().addActionListener(this);
		this.getBtnVoltar().addActionListener(this);
		
		//Permite que a JFrame fique centralizada e visível
		this.frmListagem.setLocationRelativeTo(null);
		this.frmListagem.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//Armazena o botão escolhido
		JButton botao = (JButton) e.getSource();
		
		//Inicia os eventos sobre o cadastro de perfume
		if (botao == this.getBtnPerfume()) {
			//Se há perfume no sistema, podemos prosseguir
			if (ConjuntoPerfumaria.temPerfume()) {
				new TelaListaPerfume(ConjuntoPerfumaria.getListaPerfumes());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda não foi cadastrado nenhum perfume!", "", JOptionPane.WARNING_MESSAGE);
				this.getFrmListagem().setVisible(true);
			}
		}

		//Inicia os eventos sobre o cadastro de hidratante
		if (botao == this.getBtnHidratante()) {
			//Se há hidratante no sistema, podemos prosseguir
			if (ConjuntoPerfumaria.temPerfume()) {
				new TelaListaHidratante(ConjuntoHidratante.getListaHidratantes());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda não foi cadastrado nenhum hidratante!", "", JOptionPane.WARNING_MESSAGE);
				this.getFrmListagem().setVisible(true);
			}
		}

		//Inicia os eventos sobre o cadastro de protetor solar
		if (botao == this.getBtnProtetorSolar()) {
			//Se há protetor solar no sistema, podemos prosseguir
			if (ConjuntoProtetorSolar.temProtetorSolar()) {
				new TelaListaProtetorSolar(ConjuntoProtetorSolar.getListaProtetorSolar());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda não foi cadastrado nenhum protetor solar!", "", JOptionPane.WARNING_MESSAGE);
				this.getFrmListagem().setVisible(true);
			}
		}

		//Inicia os eventos sobre o cadastro de shampoo
		if (botao == this.getBtnShampoo()) {
			//Se há shampoo no sistema, podemos prosseguir
			if (ConjuntoShampoo.temShampoo()) {
				new TelaListaShampoo(ConjuntoShampoo.getListaShampoos());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda não foi cadastrado nenhum shampoo!", "", JOptionPane.WARNING_MESSAGE);
				this.getFrmListagem().setVisible(true);
			}
		}

		//Inicia os eventos sobre o cadastro de condicionador
		if (botao == this.getBtnCondicionador()) {
			//Se há condicionador no sistema, podemos prosseguir
			if (ConjuntoCondicionador.temCondicionador()) {
				new TelaListaCondicionador(ConjuntoCondicionador.getListaCondicionadores());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda não foi cadastrado nenhum condicionador!", "", JOptionPane.WARNING_MESSAGE);
				this.getFrmListagem().setVisible(true);
			}
		}

		//Inicia os eventos sobre o cadastro de sabonete líquido
		if (botao == this.getBtnSaboneteLiquido()) {
			//Se há sabonete líquido no sistema, podemos prosseguir
			if (ConjuntoSaboneteLiquido.temSaboneteLiquido()) {
				new TelaListaSaboneteLiquido(ConjuntoSaboneteLiquido.getListaSabonetesLiquido());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda não foi cadastrado nenhum sabonete líquido!", "", JOptionPane.WARNING_MESSAGE);
				this.getFrmListagem().setVisible(true);
			}
		}

		//Inicia os eventos sobre o botão voltar
		if (botao == this.getBtnVoltar()) {
			this.getFrmListagem().dispose();
			this.getTelaMenuProduto().setVisible(true);
		}
	}
	//Métodos acessores
	public JFrame getFrmListagem() {
		return this.frmListagem;
	}
	public JLabel getLblTitulo() {
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
	public JFrame getTelaMenuProduto() {
		return this.telaMenuProduto;
	}
}