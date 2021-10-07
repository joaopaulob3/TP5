package view;

/**
 * Apresenta a tela de alter��o de estoque dos 6 produtos
 * @author Jo�o Paulo da Silva Freitas
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
		//Configura os componentes da JFrame da tela de altera��o de estoque
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
		
		//Configura o label t�tulo da janela
		this.lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.lblTitulo.setBounds(119, 25, 350, 40);
		this.frmEstoque.getContentPane().add(lblTitulo);
		
		//Configura o bot�o Perfume
		this.btnPerfume.setFont(new Font("Tahoma", Font.BOLD, 14));
		this.btnPerfume.setBounds(160, 76, 218, 28);
		this.frmEstoque.getContentPane().add(btnPerfume);
		
		//Configura o bot�o Hidratante
		this.btnHidratante.setFont(new Font("Tahoma", Font.BOLD, 14));
		this.btnHidratante.setBounds(160, 115, 218, 28);
		this.frmEstoque.getContentPane().add(btnHidratante);
		
		//Configura o bot�o Protetor Solar
		this.btnProtetorSolar.setFont(new Font("Tahoma", Font.BOLD, 14));
		this.btnProtetorSolar.setBounds(160, 154, 218, 28);
		this.frmEstoque.getContentPane().add(btnProtetorSolar);
		
		//Configura o bot�o Shampoo
		this.btnShampoo.setFont(new Font("Tahoma", Font.BOLD, 14));
		this.btnShampoo.setBounds(160, 193, 218, 28);
		this.frmEstoque.getContentPane().add(btnShampoo);
		
		//Configura o bot�o Condicionador
		this.btnCondicionador.setFont(new Font("Tahoma", Font.BOLD, 14));
		this.btnCondicionador.setBounds(160, 232, 218, 28);
		this.frmEstoque.getContentPane().add(btnCondicionador);
		
		//Configura o Sabonete L�quido
		this.btnSaboneteLiquido.setFont(new Font("Tahoma", Font.BOLD, 14));
		this.btnSaboneteLiquido.setBounds(160, 271, 218, 28);
		this.frmEstoque.getContentPane().add(btnSaboneteLiquido);
		
		//Configura o bot�o voltar
		this.btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.btnVoltar.setBounds(397, 334, 110, 28);
		this.frmEstoque.getContentPane().add(btnVoltar);
		
		//Direciona e configura os eventos dos bot�es
		this.getBtnPerfume().addActionListener(this);
		this.getBtnHidratante().addActionListener(this);
		this.getBtnProtetorSolar().addActionListener(this);
		this.getBtnShampoo().addActionListener(this);
		this.getBtnCondicionador().addActionListener(this);
		this.getBtnSaboneteLiquido().addActionListener(this);
		this.getBtnVoltar().addActionListener(this);
				
		//Permite que a JFrame fique centralizada e vis�vel
		this.frmEstoque.setLocationRelativeTo(null);
		this.frmEstoque.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Declara��es
		int opcao;
		
		//Armazena o bot�o escolhido
		JButton botao = (JButton) e.getSource();
		
		//Inicia os eventos sobre altera��o de estoque de perfume
		if (botao == this.getBtnPerfume()) {
			//Se h� perfume no sistema, podemos prosseguir
			if (ConjuntoPerfumaria.temPerfume()) {
				this.getFrmEstoque().dispose();
				//Lista os perfumes no sistema e aciona a tela de pesquisa por c�digo
				opcao = 1;
				TelaListaPerfume telaListaPerfume = new TelaListaPerfume(ConjuntoPerfumaria.getListaPerfumes());
				new TelaPesquisaPorCodigo(this.getFrmEstoque(), opcao, telaListaPerfume.getJanela());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda n�o foi cadastrado nenhum perfume!", "", JOptionPane.WARNING_MESSAGE);
				this.getFrmEstoque().setVisible(true);
			}
		}

		//Inicia os eventos sobre altera��o de estoque de hidratante
		if (botao == this.getBtnHidratante()) {
			//Se h� hidratante no sistema, podemos prosseguir
			if (ConjuntoHidratante.temHidratante()) {
				this.getFrmEstoque().dispose();
				//Lista os hidratantes do sistema e aciona a tela de pesquisa por c�digo
				opcao = 2;
				TelaListaHidratante telaListaHidratante = new TelaListaHidratante(ConjuntoHidratante.getListaHidratantes());
				new TelaPesquisaPorCodigo(this.getFrmEstoque(), opcao, telaListaHidratante.getJanela());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda n�o foi cadastrado nenhum hidratante!", "", JOptionPane.WARNING_MESSAGE);
				this.getFrmEstoque().setVisible(true);
			}
		}

		//Inicia os eventos sobre altera��o de estoque de protetor solar
		if (botao == this.getBtnProtetorSolar()) {
			//Se h� protetor solar no sistema, podemos prosseguir
			if (ConjuntoProtetorSolar.temProtetorSolar()) {
				this.getFrmEstoque().dispose();
				//Lista os protetores solares do sistema e aciona a tela de pesquisa por c�digo
				opcao = 3;
				TelaListaProtetorSolar telaProtetor = new TelaListaProtetorSolar(ConjuntoProtetorSolar.getListaProtetorSolar());
				new TelaPesquisaPorCodigo(this.getFrmEstoque(), opcao, telaProtetor.getJanela());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda n�o foi cadastrado nenhum protetor solar!", "", JOptionPane.WARNING_MESSAGE);
				this.getFrmEstoque().setVisible(true);
			}
		}

		//Inicia os eventos sobre altera��o de estoque de shampoo
		if (botao == this.getBtnShampoo()) {
			//Se h� shampoo no sistema, podemos prosseguir
			if (ConjuntoShampoo.temShampoo()) {
				this.getFrmEstoque().dispose();
				//Lista os shampoos do sistema e aciona a tela de pesquisa por c�digo
				opcao = 4;
				TelaListaShampoo telaShampoo = new TelaListaShampoo(ConjuntoShampoo.getListaShampoos());
				new TelaPesquisaPorCodigo(this.getFrmEstoque(), opcao, telaShampoo.getJanela());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda n�o foi cadastrado nenhum shampoo!", "", JOptionPane.WARNING_MESSAGE);
				this.getFrmEstoque().setVisible(true);
			}
		}

		//Inicia os eventos sobre altera��o de estoque de condicionador
		if (botao == this.getBtnCondicionador()) {
			//Se h� condicionador no sistema, podemos prosseguir
			if (ConjuntoCondicionador.temCondicionador()) {
				this.getFrmEstoque().dispose();
				//Lista os condicionadores do sistema e aciona a tela de pesquisa por c�digo
				opcao = 5;
				TelaListaCondicionador telaCondicionador = new TelaListaCondicionador(ConjuntoCondicionador.getListaCondicionadores());
				new TelaPesquisaPorCodigo(this.getFrmEstoque(), opcao, telaCondicionador.getJanela());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda n�o foi cadastrado nenhum condicionador!", "", JOptionPane.WARNING_MESSAGE);
				this.getFrmEstoque().setVisible(true);
			}
		}

		//Inicia os eventos sobre altera��o de estoque de sabonete l�quido
		if (botao == this.getBtnSaboneteLiquido()) {
			//Se h� sabonete l�quido no sistema, podemos prosseguir
			if (ConjuntoSaboneteLiquido.temSaboneteLiquido()) {
				this.getFrmEstoque().dispose();
				//Lista os sabonetes l�quido do sistema e aciona a tela de pesquisa por c�digo
				opcao = 6;
				TelaListaSaboneteLiquido telaSabonete = new TelaListaSaboneteLiquido(ConjuntoSaboneteLiquido.getListaSabonetesLiquido());
				new TelaPesquisaPorCodigo(this.getFrmEstoque(), opcao, telaSabonete.getJanela());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda n�o foi cadastrado nenhum sabonete l�quido!", "", JOptionPane.WARNING_MESSAGE);
				this.getFrmEstoque().setVisible(true);
			}
		}

		//Inicia os eventos sobre o bot�o voltar
		if (botao == this.getBtnVoltar()) {
			this.getFrmEstoque().dispose();
			this.getFrmMenuProduto().setVisible(true);
		}
	}
	
	//M�todos acessores
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
