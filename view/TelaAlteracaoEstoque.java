package view;

/**
 * Apresenta a tela de alterção de estoque dos 6 produtos
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

public class TelaAlteracaoEstoque implements ActionListener {
	//Atributos
	private JFrame frmEstoque = new JFrame("Altera\u00E7\u00E3o de estoque");
	private JLabel lblTitulo = new JLabel("Deseja alterar o estoque de qual produto?");
	private JButton btnPerfume = new JButton("Perfume");
	private JButton btnHidratante = new JButton("Hidratante");
	private JButton btnProtetorSolar = new JButton("Protetor Solar");
	private JButton btnShampoo = new JButton("Shampoo");
	private JButton btnCondicionador = new JButton("Condicionador");
	private JButton btnSaboneteLiquido = new JButton("Sabonete L\u00EDquido");
	private JButton btnVoltar = new JButton("Voltar");
	private JFrame frmMenuProduto;
	
	//Construtor
	public TelaAlteracaoEstoque(JFrame frmMenuProduto) {
		//Configura os componentes da JFrame da tela de alteração de estoque
		this.frmMenuProduto = frmMenuProduto;
		this.frmEstoque.setBounds(100, 100, 538, 417);
		this.frmEstoque.setResizable(false);
		this.frmEstoque.getContentPane().setLayout(null);
		this.frmEstoque.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frmEstoque.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente encerrar o programa?", null,
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		
		//Configura o label título da janela
		this.lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.lblTitulo.setBounds(119, 25, 350, 40);
		this.frmEstoque.getContentPane().add(lblTitulo);
		
		//Configura o botão Perfume
		this.btnPerfume.setFont(new Font("Tahoma", Font.BOLD, 14));
		this.btnPerfume.setBounds(160, 76, 218, 28);
		this.frmEstoque.getContentPane().add(btnPerfume);
		
		//Configura o botão Hidratante
		this.btnHidratante.setFont(new Font("Tahoma", Font.BOLD, 14));
		this.btnHidratante.setBounds(160, 115, 218, 28);
		this.frmEstoque.getContentPane().add(btnHidratante);
		
		//Configura o botão Protetor Solar
		this.btnProtetorSolar.setFont(new Font("Tahoma", Font.BOLD, 14));
		this.btnProtetorSolar.setBounds(160, 154, 218, 28);
		this.frmEstoque.getContentPane().add(btnProtetorSolar);
		
		//Configura o botão Shampoo
		this.btnShampoo.setFont(new Font("Tahoma", Font.BOLD, 14));
		this.btnShampoo.setBounds(160, 193, 218, 28);
		this.frmEstoque.getContentPane().add(btnShampoo);
		
		//Configura o botão Condicionador
		this.btnCondicionador.setFont(new Font("Tahoma", Font.BOLD, 14));
		this.btnCondicionador.setBounds(160, 232, 218, 28);
		this.frmEstoque.getContentPane().add(btnCondicionador);
		
		//Configura o Sabonete Líquido
		this.btnSaboneteLiquido.setFont(new Font("Tahoma", Font.BOLD, 14));
		this.btnSaboneteLiquido.setBounds(160, 271, 218, 28);
		this.frmEstoque.getContentPane().add(btnSaboneteLiquido);
		
		//Configura o botão voltar
		this.btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.btnVoltar.setBounds(397, 334, 110, 28);
		this.frmEstoque.getContentPane().add(btnVoltar);
		
		//Direciona e configura os eventos dos botões
		this.getBtnPerfume().addActionListener(this);
		this.getBtnHidratante().addActionListener(this);
		this.getBtnProtetorSolar().addActionListener(this);
		this.getBtnShampoo().addActionListener(this);
		this.getBtnCondicionador().addActionListener(this);
		this.getBtnSaboneteLiquido().addActionListener(this);
		this.getBtnVoltar().addActionListener(this);
				
		//Permite que a JFrame fique centralizada e visível
		this.frmEstoque.setLocationRelativeTo(null);
		this.frmEstoque.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Declarações
		int opcao;
		
		//Armazena o botão escolhido
		JButton botao = (JButton) e.getSource();
		
		//Inicia os eventos sobre alteração de estoque de perfume
		if (botao == this.getBtnPerfume()) {
			//Se há perfume no sistema, podemos prosseguir
			if (ConjuntoPerfumaria.temPerfume()) {
				this.getFrmEstoque().dispose();
				//Lista os perfumes no sistema e aciona a tela de pesquisa por código
				opcao = 1;
				TelaListaPerfume telaListaPerfume = new TelaListaPerfume(ConjuntoPerfumaria.getListaPerfumes());
				new TelaPesquisaPorCodigo(this.getFrmEstoque(), opcao, telaListaPerfume.getJanela());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda não foi cadastrado nenhum perfume!", "", JOptionPane.WARNING_MESSAGE);
				this.getFrmEstoque().setVisible(true);
			}
		}

		//Inicia os eventos sobre alteração de estoque de hidratante
		if (botao == this.getBtnHidratante()) {
			//Se há hidratante no sistema, podemos prosseguir
			if (ConjuntoHidratante.temHidratante()) {
				this.getFrmEstoque().dispose();
				//Lista os hidratantes do sistema e aciona a tela de pesquisa por código
				opcao = 2;
				TelaListaHidratante telaListaHidratante = new TelaListaHidratante(ConjuntoHidratante.getListaHidratantes());
				new TelaPesquisaPorCodigo(this.getFrmEstoque(), opcao, telaListaHidratante.getJanela());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda não foi cadastrado nenhum hidratante!", "", JOptionPane.WARNING_MESSAGE);
				this.getFrmEstoque().setVisible(true);
			}
		}

		//Inicia os eventos sobre alteração de estoque de protetor solar
		if (botao == this.getBtnProtetorSolar()) {
			//Se há protetor solar no sistema, podemos prosseguir
			if (ConjuntoProtetorSolar.temProtetorSolar()) {
				this.getFrmEstoque().dispose();
				//Lista os protetores solares do sistema e aciona a tela de pesquisa por código
				opcao = 3;
				TelaListaProtetorSolar telaProtetor = new TelaListaProtetorSolar(ConjuntoProtetorSolar.getListaProtetorSolar());
				new TelaPesquisaPorCodigo(this.getFrmEstoque(), opcao, telaProtetor.getJanela());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda não foi cadastrado nenhum protetor solar!", "", JOptionPane.WARNING_MESSAGE);
				this.getFrmEstoque().setVisible(true);
			}
		}

		//Inicia os eventos sobre alteração de estoque de shampoo
		if (botao == this.getBtnShampoo()) {
			//Se há shampoo no sistema, podemos prosseguir
			if (ConjuntoShampoo.temShampoo()) {
				this.getFrmEstoque().dispose();
				//Lista os shampoos do sistema e aciona a tela de pesquisa por código
				opcao = 4;
				TelaListaShampoo telaShampoo = new TelaListaShampoo(ConjuntoShampoo.getListaShampoos());
				new TelaPesquisaPorCodigo(this.getFrmEstoque(), opcao, telaShampoo.getJanela());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda não foi cadastrado nenhum shampoo!", "", JOptionPane.WARNING_MESSAGE);
				this.getFrmEstoque().setVisible(true);
			}
		}

		//Inicia os eventos sobre alteração de estoque de condicionador
		if (botao == this.getBtnCondicionador()) {
			//Se há condicionador no sistema, podemos prosseguir
			if (ConjuntoCondicionador.temCondicionador()) {
				this.getFrmEstoque().dispose();
				//Lista os condicionadores do sistema e aciona a tela de pesquisa por código
				opcao = 5;
				TelaListaCondicionador telaCondicionador = new TelaListaCondicionador(ConjuntoCondicionador.getListaCondicionadores());
				new TelaPesquisaPorCodigo(this.getFrmEstoque(), opcao, telaCondicionador.getJanela());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda não foi cadastrado nenhum condicionador!", "", JOptionPane.WARNING_MESSAGE);
				this.getFrmEstoque().setVisible(true);
			}
		}

		//Inicia os eventos sobre alteração de estoque de sabonete líquido
		if (botao == this.getBtnSaboneteLiquido()) {
			//Se há sabonete líquido no sistema, podemos prosseguir
			if (ConjuntoSaboneteLiquido.temSaboneteLiquido()) {
				this.getFrmEstoque().dispose();
				//Lista os sabonetes líquido do sistema e aciona a tela de pesquisa por código
				opcao = 6;
				TelaListaSaboneteLiquido telaSabonete = new TelaListaSaboneteLiquido(ConjuntoSaboneteLiquido.getListaSabonetesLiquido());
				new TelaPesquisaPorCodigo(this.getFrmEstoque(), opcao, telaSabonete.getJanela());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda não foi cadastrado nenhum sabonete líquido!", "", JOptionPane.WARNING_MESSAGE);
				this.getFrmEstoque().setVisible(true);
			}
		}

		//Inicia os eventos sobre o botão voltar
		if (botao == this.getBtnVoltar()) {
			this.getFrmEstoque().dispose();
			this.getFrmMenuProduto().setVisible(true);
		}
	}
	
	//Métodos acessores
	public JFrame getFrmEstoque() {
		return this.frmEstoque;
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

	public JFrame getFrmMenuProduto() {
		return this.frmMenuProduto;
	}

}
