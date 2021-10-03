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
import javax.swing.JTextField;

import controller.ConjuntoCondicionador;
import model.Condicionador;

public class TelaCadastrarCondicionador implements ActionListener {
	//Atributos
	private JFrame frmCadastrarCondicionador = new JFrame("Cadastro de condicionador");
	private JLabel lblPreco = new JLabel("Pre\u00E7o do condicionador: R$"); 
	private JTextField txtPreco = new JTextField();
	private JLabel lblVolume = new JLabel("Volume do condicionador: (ml)");
	private JTextField txtVolume = new JTextField();
	private JLabel lblCodigo = new JLabel("C\u00F3digo do condicionador:");
	private JTextField txtCodigo = new JTextField();
	private JLabel lblMarca = new JLabel("Marca do condicionador:");
	private JTextField txtMarca = new JTextField();
	private JLabel lblLinha = new JLabel("Linha do condicionador:");
	private JTextField txtLinha = new JTextField();
	private JLabel lblEstoque = new JLabel("Quantidade em estoque:");
	private JTextField txtEstoque = new JTextField();
	private JLabel lblTipo = new JLabel("Tipo de cabelo do condicionador:");
	private JTextField txtTipo = new JTextField();
	private JLabel lblPropriedades = new JLabel("Propridades do condicionador:");
	private JTextField txtPropriedades = new JTextField();
	private JLabel lblCondicao = new JLabel("Condi\u00E7\u00E3o dos fios:");
	private JTextField txtCondicao = new JTextField();
	private JButton btnCadastrar = new JButton("Cadastrar");
	private JButton btnCancelar = new JButton("Cancelar");
	private JFrame frmCadastrarProduto;
	private Condicionador condicionador;
	
	//Construtor
	public TelaCadastrarCondicionador(JFrame frmCadastrarProduto, Condicionador condicionador) {
		//Configura os componentes da JFrame da tela de cadastro de condicionador
		this.frmCadastrarProduto = frmCadastrarProduto;
		this.condicionador = condicionador;
		this.frmCadastrarCondicionador.setBounds(100, 100, 539, 488);
		this.frmCadastrarCondicionador.getContentPane().setLayout(null);
		this.frmCadastrarCondicionador.setResizable(false);
		this.frmCadastrarCondicionador.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frmCadastrarCondicionador.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente encerrar o programa?", null,
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		
		//Configura o label preço do condicionador
		this.lblPreco.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblPreco.setBounds(27, 43, 177, 27);
		this.frmCadastrarCondicionador.getContentPane().add(lblPreco);
		
		//Configura o campo de texto preço do condicionador
		this.txtPreco.setBounds(230, 43, 253, 27);
		this.frmCadastrarCondicionador.getContentPane().add(txtPreco);
		this.txtPreco.setColumns(10);
		
		//Configura o label volume do condicionador
		this.lblVolume.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblVolume.setBounds(27, 84, 193, 27);
		this.frmCadastrarCondicionador.getContentPane().add(lblVolume);
		
		//Configura o campo de texto volume do condicionador
		this.txtVolume.setColumns(10);
		this.txtVolume.setBounds(230, 83, 253, 27);
		this.frmCadastrarCondicionador.getContentPane().add(txtVolume);
		
		//Configura o label código do condicionador
		this.lblCodigo.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblCodigo.setBounds(27, 126, 177, 27);
		this.frmCadastrarCondicionador.getContentPane().add(lblCodigo);
		
		//Configura o campo de texto código do condicionador
		this.txtCodigo.setColumns(10);
		this.txtCodigo.setBounds(230, 125, 253, 27);
		this.frmCadastrarCondicionador.getContentPane().add(txtCodigo);
		
		//Configura o label marca do condicionador
		this.lblMarca.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblMarca.setBounds(27, 165, 177, 27);
		this.frmCadastrarCondicionador.getContentPane().add(lblMarca);
		
		//Configura o campo de texto marca do condicionador
		this.txtMarca.setColumns(10);
		this.txtMarca.setBounds(230, 164, 253, 27);
		this.frmCadastrarCondicionador.getContentPane().add(txtMarca);
		
		//Configura o label linha do condicionador
		this.lblLinha.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblLinha.setBounds(27, 204, 159, 27);
		this.frmCadastrarCondicionador.getContentPane().add(lblLinha);
		
		//Configura o campo de texto linha do condicionador
		this.txtLinha.setColumns(10);
		this.txtLinha.setBounds(230, 203, 253, 27);
		this.frmCadastrarCondicionador.getContentPane().add(txtLinha);
		
		//Configura o estoque do condicionador
		this.lblEstoque.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblEstoque.setBounds(27, 238, 159, 32);
		this.frmCadastrarCondicionador.getContentPane().add(lblEstoque);
		
		//Configura o campo de texto do estoque do condicionador
		this.txtEstoque.setColumns(10);
		this.txtEstoque.setBounds(230, 241, 253, 27);
		this.frmCadastrarCondicionador.getContentPane().add(txtEstoque);
		
		//Configura o label tipo de cabelo do condicionador
		this.lblTipo.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblTipo.setBounds(27, 273, 210, 32);
		this.frmCadastrarCondicionador.getContentPane().add(lblTipo);
		
		//Configura o campo de texto tipo de cabelo do condicionador
		this.txtTipo.setColumns(10);
		this.txtTipo.setBounds(230, 277, 253, 27);
		this.frmCadastrarCondicionador.getContentPane().add(txtTipo);
		
		//Configura o label propriedades do condicionador
		this.lblPropriedades.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblPropriedades.setBounds(27, 313, 193, 32);
		this.frmCadastrarCondicionador.getContentPane().add(lblPropriedades);
		
		//Configura o campo de texto propriedades do condicionador
		this.txtPropriedades.setColumns(10);
		this.txtPropriedades.setBounds(230, 314, 253, 27);
		this.frmCadastrarCondicionador.getContentPane().add(txtPropriedades);
		
		//Configura o label condição dos fios
		this.lblCondicao.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblCondicao.setBounds(27, 354, 193, 32);
		this.frmCadastrarCondicionador.getContentPane().add(lblCondicao);
		
		//Configura o campo de texto condição dos fios
		this.txtCondicao.setColumns(10);
		this.txtCondicao.setBounds(230, 352, 253, 27);
		this.frmCadastrarCondicionador.getContentPane().add(txtCondicao);
		
		//Configura o botão cadastrar
		this.btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.btnCadastrar.setBounds(230, 399, 110, 32);
		this.frmCadastrarCondicionador.getContentPane().add(btnCadastrar);
		
		//Configura o botão cancelar
		this.btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.btnCancelar.setBounds(373, 398, 110, 32);
		this.frmCadastrarCondicionador.getContentPane().add(btnCancelar);
		
		//Direciona os eventos dos botões
		this.getBtnCadastrar().addActionListener(this);
		this.getBtnCancelar().addActionListener(this);
		
		//Permite que a JFrame fique centralizada e visível
		this.frmCadastrarCondicionador.setLocationRelativeTo(null);
		this.frmCadastrarCondicionador.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//Armazena o botão escolhido
		JButton botao = (JButton) e.getSource();
		
		//Inicia os eventos sobre o botão cadastrar
		if (botao == this.getBtnCadastrar()) {
			//Validação dos campos
			if (this.getTxtPreco().getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Não deixe nenhum campo em branco!", "", JOptionPane.WARNING_MESSAGE);
				this.getTxtPreco().requestFocusInWindow();
			} else if (this.getTxtVolume().getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Não deixe nenhum campo em branco!", "", JOptionPane.WARNING_MESSAGE);
				this.getTxtVolume().requestFocusInWindow();
			} else if (this.getTxtCodigo().getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Não deixe nenhum campo em branco!", "", JOptionPane.WARNING_MESSAGE);
				this.getTxtCodigo().requestFocusInWindow();
			} else if (this.getTxtMarca().getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Não deixe nenhum campo em branco!", "", JOptionPane.WARNING_MESSAGE);
				this.getTxtMarca().requestFocusInWindow();
			} else if (this.getTxtLinha().getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Não deixe nenhum campo em branco!", "", JOptionPane.WARNING_MESSAGE);
				this.getTxtLinha().requestFocusInWindow();
			} else if (this.getTxtEstoque().getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Não deixe nenhum campo em branco!", "", JOptionPane.WARNING_MESSAGE);
				this.getTxtEstoque().requestFocusInWindow();
			} else if (this.getTxtTipo().getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Não deixe nenhum campo em branco!", "", JOptionPane.WARNING_MESSAGE);
				this.getTxtTipo().requestFocusInWindow();
			} else if (this.getTxtPropriedades().getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Não deixe nenhum campo em branco!", "", JOptionPane.WARNING_MESSAGE);
				this.getTxtPropriedades().requestFocusInWindow();
			} else if (this.getTxtCondicao().getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Não deixe nenhum campo em branco!", "", JOptionPane.WARNING_MESSAGE);
				this.getTxtCondicao().requestFocusInWindow();
			}
			
			if (this.getCondicionador() != null) {
				//Deleta o condicionador e faz o recadastro
				ConjuntoCondicionador.deletarCondicionador(condicionador);
			}
			
			//Armazena os valores com as devidas conversões e tratamentos
			double preco = Double.valueOf(this.getTxtPreco().getText()).doubleValue();
			double volume = Double.valueOf(this.getTxtVolume().getText()).doubleValue();
			String codigo = this.getTxtCodigo().getText();
			String marca = this.getTxtMarca().getText();
			String linha = this.getTxtLinha().getText();
			int quantidade = Integer.valueOf(this.getTxtEstoque().getText()).intValue();
			String tipo = this.getTxtTipo().getText();
			String propriedades = this.getTxtPropriedades().getText();
			String condicao = this.getTxtCondicao().getText();
			
			//Criação do objeto do tipo Condicionador através do Construtor
			Condicionador condicionador = new Condicionador(preco, volume, codigo, 
					marca, linha, quantidade, tipo, propriedades, condicao);
			
			//Adicionando o objeto criado no ArrayList listaCondicionadores
			ConjuntoCondicionador.cadastrarCondicionador(condicionador);
		
			//Mensagem de cadastro bem sucedido
			JOptionPane.showMessageDialog(null, "Shampoo cadastrado!", "", JOptionPane.INFORMATION_MESSAGE);
			
			//Oculta a tela de CadastroProtetorSolarShampoo
			this.getFrmCadastrarCondicionador().dispose();
			
			//Torna a tela MenuProduto visível
			this.getFrmCadastrarProduto().setVisible(true);
		}
		
		//Inicia os eventos sobre o botão cancelar
		if (botao == this.getBtnCancelar()) {
			this.getFrmCadastrarCondicionador().dispose();
			this.getFrmCadastrarProduto().setVisible(true);
		}
	}
	
	//Métodos acessores
	public JFrame getFrmCadastrarCondicionador() {
		return frmCadastrarCondicionador;
	}


	public JLabel getLblPreco() {
		return lblPreco;
	}


	public JTextField getTxtPreco() {
		return txtPreco;
	}


	public JLabel getLblVolume() {
		return lblVolume;
	}


	public JTextField getTxtVolume() {
		return txtVolume;
	}


	public JLabel getLblCodigo() {
		return lblCodigo;
	}


	public JTextField getTxtCodigo() {
		return txtCodigo;
	}


	public JLabel getLblMarca() {
		return lblMarca;
	}


	public JTextField getTxtMarca() {
		return txtMarca;
	}


	public JLabel getLblLinha() {
		return lblLinha;
	}


	public JTextField getTxtLinha() {
		return txtLinha;
	}


	public JLabel getLblEstoque() {
		return lblEstoque;
	}


	public JTextField getTxtEstoque() {
		return txtEstoque;
	}


	public JLabel getLblTipo() {
		return lblTipo;
	}


	public JTextField getTxtTipo() {
		return txtTipo;
	}


	public JLabel getLblPropriedades() {
		return lblPropriedades;
	}


	public JTextField getTxtPropriedades() {
		return txtPropriedades;
	}


	public JLabel getLblCondicao() {
		return lblCondicao;
	}


	public JTextField getTxtCondicao() {
		return txtCondicao;
	}


	public JButton getBtnCadastrar() {
		return btnCadastrar;
	}


	public JButton getBtnCancelar() {
		return btnCancelar;
	}


	public JFrame getFrmCadastrarProduto() {
		return frmCadastrarProduto;
	}

	public Condicionador getCondicionador() {
		return this.condicionador;
	}
}
