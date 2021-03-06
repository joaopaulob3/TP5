package view;

/**
 * Apresenta a tela de pesquisa de um produto pelo c?digo
 * direcionando para a classe de cadastro do produto
 * @author Jo?o Paulo da Silva Freitas
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

import controller.*;
import model.*;

public class TelaPesquisaPorCodigo2 implements ActionListener {
	//Atributos
	private JFrame frmPesquisa = new JFrame("Pesquise pelo c\u00F3digo");
	private JLabel lblNewLabel = new JLabel("Informe o c\u00F3digo do produto:");
	private JTextField txtPesquisa = new JTextField();
	private JButton btnPesquisar = new JButton("Pesquisar");
	private JButton btnCancelar = new JButton("Cancelar");
	private JFrame frmEdicao;
	private int opcao;
	private JFrame telaListagem;
	private Perfumaria perfume;
	private Hidratante hidratante;
	private ProtetorSolar protetor;
	private Shampoo shampoo;
	private Condicionador condicionador;
	private SaboneteLiquido sabonete;
	
	//Construtor
	public TelaPesquisaPorCodigo2 (JFrame frmEdicao, int opcao, JFrame telaListagem) {
		//Configura os componentes da JFrame da tela de pesquisa pelo c?digo
		this.frmEdicao = frmEdicao;
		this.opcao = opcao;
		this.telaListagem = telaListagem;
		this.frmPesquisa.setBounds(100, 100, 440, 257);
		this.frmPesquisa.getContentPane().setLayout(null);
		this.frmPesquisa.setResizable(false);
		this.frmPesquisa.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frmPesquisa.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente encerrar o programa?", null,
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		
		//Configura o label t?tulo
		this.lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		this.lblNewLabel.setBounds(67, 58, 224, 24);
		this.frmPesquisa.getContentPane().add(lblNewLabel);
		
		//Configura o campo de texto da pesquisa
		this.txtPesquisa.setBounds(67, 93, 285, 30);
		this.frmPesquisa.getContentPane().add(txtPesquisa);
		this.txtPesquisa.setColumns(10);
		
		//Configura o bot?o Pesquisar
		this.btnPesquisar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.btnPesquisar.setBounds(67, 136, 136, 33);
		this.frmPesquisa.getContentPane().add(btnPesquisar);
		
		//Configura o bot?o Cancelar
		this.btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.btnCancelar.setBounds(216, 136, 136, 33);
		this.frmPesquisa.getContentPane().add(btnCancelar);
		
		//Direciona e configura os eventos dos bot?es
		this.getBtnPesquisar().addActionListener(this);
		this.getBtnCancelar().addActionListener(this);
		
		//Permite que a JFrame fique centralizada e vis?vel
		this.frmPesquisa.setLocationRelativeTo(null);
		this.frmPesquisa.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Armazena o bot?o escolhido
		JButton botao = (JButton) e.getSource();
		
		//Oculta janela de pesquisa e estoque
		this.getfrmEdicao().dispose();
		this.getFrmPesquisa().dispose();
		
		//Armazena o c?digo digitado
		String codigo = this.getTxtPesquisa().getText();
		
		//Inicia os eventos sobre o bot?o pesquisar
		if (botao == this.getBtnPesquisar()) {
			
			this.getTelaListagem().dispose();
			
			switch (this.getOpcao()) {
			case 1:
				//Resgata o objeto do tipo Perfumaria do ArrayList listaPerfumes
				this.perfume = ConjuntoPerfumaria.pesquisarPerfume(codigo);
				
				//Se o c?digo for reconhecido no sistema, podemos prosseguir
				if (perfume != null) {
					new TelaCadastrarPerfume(this.getfrmEdicao(), perfume);
				} else {
					JOptionPane.showMessageDialog(null, "O c?digo informado n?o foi encontrado no sistema.", "", JOptionPane.WARNING_MESSAGE);
					this.getfrmEdicao().setLocationRelativeTo(null);
					this.getfrmEdicao().setVisible(true);
				}
				break;
			case 2:
				//Resgata o objeto do tipo Hidratante do ArrayList listaHidratantes
				this.hidratante = ConjuntoHidratante.pesquisarHidratante(codigo);
				
				//Se o c?digo for reconhecido no sistema, podemos prosseguir
				if (hidratante != null) {
					new TelaCadastrarHidratante(this.getfrmEdicao(), hidratante);
				} else {
					JOptionPane.showMessageDialog(null, "O c?digo informado n?o foi encontrado no sistema.", "", JOptionPane.WARNING_MESSAGE);
					this.getfrmEdicao().setLocationRelativeTo(null);
					this.getfrmEdicao().setVisible(true);
				}
				break;
			case 3:
				//Resgata o objeto do tipo ProtetorSolar do ArrayList listaProtetorSolar
				this.protetor = ConjuntoProtetorSolar.pesquisarProtetorSolar(codigo);
				
				//Se o c?digo for reconhecido no sistema, podemos prosseguir
				if (protetor != null) {
					new TelaCadastrarProtetorSolar(this.getfrmEdicao(), protetor);
				} else {
					JOptionPane.showMessageDialog(null, "O c?digo informado n?o foi encontrado no sistema.", "", JOptionPane.WARNING_MESSAGE);
					this.getfrmEdicao().setLocationRelativeTo(null);
					this.getfrmEdicao().setVisible(true);
				}
				break;
			case 4:
				//Resgata o objeto do tipo Shampoo do ArrayList listaShampoos
				this.shampoo = ConjuntoShampoo.pesquisarShampoo(codigo);
				
				//Se o c?digo for reconhecido no sistema, podemos prosseguir
				if (shampoo != null) {
					new TelaCadastrarShampoo(this.getfrmEdicao(), shampoo);
				} else {
					JOptionPane.showMessageDialog(null, "O c?digo informado n?o foi encontrado no sistema.", "", JOptionPane.WARNING_MESSAGE);
					this.getfrmEdicao().setLocationRelativeTo(null);
					this.getfrmEdicao().setVisible(true);
				}
				break;
			case 5:
				//Resgata o objeto do tipo Condicionador do ArrayList listaCondicionadores
				this.condicionador = ConjuntoCondicionador.pesquisarCondicionador(codigo);
				
				//Se o c?digo for reconhecido no sistema, podemos prosseguir
				if (condicionador != null) {
					new TelaCadastrarCondicionador(this.getfrmEdicao(), condicionador);
				} else {
					JOptionPane.showMessageDialog(null, "O c?digo informado n?o foi encontrado no sistema.", "", JOptionPane.WARNING_MESSAGE);
					this.getfrmEdicao().setLocationRelativeTo(null);
					this.getfrmEdicao().setVisible(true);
				}
				break;
			case 6:
				//Resgata o objeto do tipo SaboneteLiquido do ArrayList listaSabonetesLiquido
				this.sabonete = ConjuntoSaboneteLiquido.pesquisarSaboneteLiquido(codigo);
				
				//Se o c?digo for reconhecido no sistema, podemos prosseguir
				if (sabonete != null) {
					new TelaCadastrarSaboneteLiquido(this.getfrmEdicao(), sabonete);
				} else {
					JOptionPane.showMessageDialog(null, "O c?digo informado n?o foi encontrado no sistema.", "", JOptionPane.WARNING_MESSAGE);
					this.getfrmEdicao().setLocationRelativeTo(null);
					this.getfrmEdicao().setVisible(true);
				}
				break;
			}
		}
		
		//Inicia os eventos sobre o bot?o cancelar
		if (botao == this.getBtnCancelar()) {
			this.getTelaListagem().dispose();
			this.getfrmEdicao().setLocationRelativeTo(null);
			this.getfrmEdicao().setVisible(true);
		}
	}
	
	//M?todos acessores
	public JFrame getFrmPesquisa() {
		return this.frmPesquisa;
	}

	public JLabel getLblNewLabel() {
		return this.lblNewLabel;
	}

	public JTextField getTxtPesquisa() {
		return this.txtPesquisa;
	}

	public JButton getBtnPesquisar() {
		return this.btnPesquisar;
	}

	public JButton getBtnCancelar() {
		return this.btnCancelar;
	}

	public JFrame getfrmEdicao() {
		return this.frmEdicao;
	}
	
	public int getOpcao() {
		return this.opcao;
	}
	
	public JFrame getTelaListagem() {
		return this.telaListagem;
	}

}
