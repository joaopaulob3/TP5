package view;

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

public class TelaEdicaoProduto implements ActionListener {
	//Atributos
	private JFrame frmEdicao = new JFrame("Edi\u00E7\u00E3o de dados");
	private JLabel lblTitulo = new JLabel("Deseja alterar os dados de qual produto?");
	private JButton btnPerfume = new JButton("Perfume");
	private JButton btnHidratante = new JButton("Hidratante");
	private JButton btnProtetorSolar = new JButton("Protetor Solar");
	private JButton btnShampoo = new JButton("Shampoo");
	private JButton btnCondicionador = new JButton("Condicionador");
	private JButton btnSaboneteLiquido = new JButton("Sabonete L\u00EDquido");
	private JButton btnVoltar = new JButton("Voltar");
	private JFrame frmMenuProduto;
	
	//Construtor
	public TelaEdicaoProduto(JFrame frmMenuProduto) {
		//Configura os componentes da JFrame da tela de edi��o de produto
		this.frmMenuProduto = frmMenuProduto;
		this.frmEdicao.setBounds(100, 100, 534, 451);
		this.frmEdicao.getContentPane().setLayout(null);
		this.frmEdicao.setResizable(false);
		this.frmEdicao.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frmEdicao.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente encerrar o programa?", null,
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		
		//Configura o label t�tulo da pergunta
		this.lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.lblTitulo.setBounds(110, 46, 350, 36);
		this.frmEdicao.getContentPane().add(lblTitulo);
		
		//Configura o bot�o de perfume
		this.btnPerfume.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnPerfume.setBounds(156, 112, 217, 27);
		this.frmEdicao.getContentPane().add(btnPerfume);
		
		//Configura o bot�o de hidratante
		this.btnHidratante.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnHidratante.setBounds(156, 150, 217, 27);
		this.frmEdicao.getContentPane().add(btnHidratante);
		
		//Configura o bot�o de protetor solar
		this.btnProtetorSolar.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnProtetorSolar.setBounds(156, 188, 217, 27);
		this.frmEdicao.getContentPane().add(btnProtetorSolar);
		
		//Configura o bot�o de shampoo
		this.btnShampoo.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnShampoo.setBounds(156, 227, 217, 27);
		this.frmEdicao.getContentPane().add(btnShampoo);
		
		//Configura o bot�o de condicionador
		this.btnCondicionador.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnCondicionador.setBounds(156, 266, 217, 27);
		this.frmEdicao.getContentPane().add(btnCondicionador);
		
		//Condigura o bot�o de sabonte l�quido
		this.btnSaboneteLiquido.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.btnSaboneteLiquido.setBounds(156, 304, 217, 27);
		this.frmEdicao.getContentPane().add(btnSaboneteLiquido);
		
		//Condigura o bot�o de voltar
		this.btnVoltar.setBounds(415, 377, 89, 23);
		this.frmEdicao.getContentPane().add(btnVoltar);
		this.frmEdicao.setLocationRelativeTo(null);
		
		//Direciona e configura os eventos dos bot�es
		this.getBtnPerfume().addActionListener(this);
		this.getBtnHidratante().addActionListener(this);
		this.getBtnProtetorSolar().addActionListener(this);
		this.getBtnShampoo().addActionListener(this);
		this.getBtnCondicionador().addActionListener(this);
		this.getBtnSaboneteLiquido().addActionListener(this);
		this.getBtnVoltar().addActionListener(this);
		
		//Permite que a JFrame fique centralizada e vis�vel
		this.frmEdicao.setLocationRelativeTo(null);
		this.frmEdicao.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//Declara��es
		int opcao;
				
		//Armazena o bot�o escolhido
		JButton botao = (JButton) e.getSource();
		
		//Inicia os eventos sobre o cadastro de perfume
		if (botao == this.getBtnPerfume()) {
			//Se h� perfume no sistema, podemos prosseguir
			if (ConjuntoPerfumaria.temPerfume()) {
				this.getFrmEdicao().dispose();
				//Lista os perfumes no sistema e aciona a tela de pesquisa por c�digo
				opcao = 1;
				TelaListaPerfume telaListaPerfume = new TelaListaPerfume(ConjuntoPerfumaria.getListaPerfumes());
				new TelaPesquisaPorCodigo2(this.getFrmEdicao(), opcao, telaListaPerfume.getJanela());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda n�o foi cadastrado nenhum perfume!", "", JOptionPane.WARNING_MESSAGE);
				this.getFrmEdicao().setVisible(true);
			}
		}

		//Inicia os eventos sobre o cadastro de hidratante
		if (botao == this.getBtnHidratante()) {
			//Se h� hidratante no sistema, podemos prosseguir
			if (ConjuntoHidratante.temHidratante()) {
				this.getFrmEdicao().dispose();
				//Lista os hidratantes no sistema e aciona a tela de pesquisa por c�digo
				opcao = 2;
				TelaListaHidratante telaListaHidratante = new TelaListaHidratante(ConjuntoHidratante.getListaHidratantes());
				new TelaPesquisaPorCodigo2(this.getFrmEdicao(), opcao, telaListaHidratante.getJanela());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda n�o foi cadastrado nenhum hidratante!", "", JOptionPane.WARNING_MESSAGE);
				this.getFrmEdicao().setVisible(true);
			}
		}

		//Inicia os eventos sobre o cadastro de protetor solar
		if (botao == this.getBtnProtetorSolar()) {
			//Se h� protetor solar no sistema, podemos prosseguir
			if (ConjuntoProtetorSolar.temProtetorSolar()) {
				this.getFrmEdicao().dispose();
				//Lista os protetores solar no sistema e aciona a tela de pesquisa por c�digo
				opcao = 3;
				TelaListaProtetorSolar telaListaProtetor = new TelaListaProtetorSolar(ConjuntoProtetorSolar.getListaProtetorSolar());
				new TelaPesquisaPorCodigo2(this.getFrmEdicao(), opcao, telaListaProtetor.getJanela());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda n�o foi cadastrado nenhum protetor solar!", "", JOptionPane.WARNING_MESSAGE);
				this.getFrmEdicao().setVisible(true);
			}
		}

		//Inicia os eventos sobre o cadastro de shampoo
		if (botao == this.getBtnShampoo()) {
			//Se h� shampoo no sistema, podemos prosseguir
			if (ConjuntoShampoo.temShampoo()) {
				this.getFrmEdicao().dispose();
				//Lista os shampoos no sistema e aciona a tela de pesquisa por c�digo
				opcao = 4;
				TelaListaShampoo telaListaShampoo = new TelaListaShampoo(ConjuntoShampoo.getListaShampoos());
				new TelaPesquisaPorCodigo2(this.getFrmEdicao(), opcao, telaListaShampoo.getJanela());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda n�o foi cadastrado nenhum shampoo!", "", JOptionPane.WARNING_MESSAGE);
				this.getFrmEdicao().setVisible(true);
			}
		}

		//Inicia os eventos sobre o cadastro de condicionador
		if (botao == this.getBtnCondicionador()) {
			//Se h� condicionador no sistema, podemos prosseguir
			if (ConjuntoCondicionador.temCondicionador()) {
				this.getFrmEdicao().dispose();
				//Lista os condicionadores no sistema e aciona a tela de pesquisa por c�digo
				opcao = 5;
				TelaListaCondicionador telaListaCondicionador = new TelaListaCondicionador(ConjuntoCondicionador.getListaCondicionadores());
				new TelaPesquisaPorCodigo2(this.getFrmEdicao(), opcao, telaListaCondicionador.getJanela());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda n�o foi cadastrado nenhum condicionador!", "", JOptionPane.WARNING_MESSAGE);
				this.getFrmEdicao().setVisible(true);
			}
		}

		//Inicia os eventos sobre o cadastro de sabonete l�quido
		if (botao == this.getBtnSaboneteLiquido()) {
			//Se h� sabonete l�quido no sistema, podemos prosseguir
			if (ConjuntoSaboneteLiquido.temSaboneteLiquido()) {
				this.getFrmEdicao().dispose();
				//Lista os sabonetes l�quido no sistema e aciona a tela de pesquisa por c�digo
				opcao = 6;
				TelaListaSaboneteLiquido telaListaSabonete = new TelaListaSaboneteLiquido(ConjuntoSaboneteLiquido.getListaSabonetesLiquido());
				new TelaPesquisaPorCodigo2(this.getFrmEdicao(), opcao, telaListaSabonete.getJanela());
			} else {
				JOptionPane.showMessageDialog(null, "Ainda n�o foi cadastrado nenhum sabonete l�quido!", "", JOptionPane.WARNING_MESSAGE);
				this.getFrmEdicao().setVisible(true);
			}
		}

		//Inicia os eventos sobre o bot�o voltar
		if (botao == this.getBtnVoltar()) {
			this.getFrmEdicao().dispose();
			this.getFrmMenuProduto().setVisible(true);
		}
	}

	//M�todos acessores
	public JFrame getFrmEdicao() {
		return frmEdicao;
	}

	public JLabel getLblTitulo() {
		return lblTitulo;
	}

	public JButton getBtnPerfume() {
		return btnPerfume;
	}

	public JButton getBtnHidratante() {
		return btnHidratante;
	}

	public JButton getBtnProtetorSolar() {
		return btnProtetorSolar;
	}

	public JButton getBtnShampoo() {
		return btnShampoo;
	}

	public JButton getBtnCondicionador() {
		return btnCondicionador;
	}

	public JButton getBtnSaboneteLiquido() {
		return btnSaboneteLiquido;
	}

	public JButton getBtnVoltar() {
		return btnVoltar;
	}

	public JFrame getFrmMenuProduto() {
		return frmMenuProduto;
	}

}
