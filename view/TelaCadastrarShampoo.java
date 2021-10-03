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

import controller.ConjuntoShampoo;
import model.Shampoo;

public class TelaCadastrarShampoo implements ActionListener {
	//Atributos
	private JFrame frmCadastrarShampoo = new JFrame("Cadastro de Shampoo");
	private JLabel lblPreco = new JLabel("Pre\u00E7o do shampoo: R$");
	private JTextField txtPreco = new JTextField();
	private JLabel lblVolume = new JLabel("Volume do shampoo: (ml)");
	private JTextField txtVolume = new JTextField();
	private JLabel lblCodigo = new JLabel("C\u00F3digo do shampoo:");
	private JTextField txtCodigo = new JTextField();
	private JLabel lblMarca = new JLabel("Marca do shampoo:");
	private JTextField txtMarca = new JTextField();
	private JLabel lblLinha = new JLabel("Linha do shampoo:");
	private JTextField txtLinha = new JTextField();
	private JLabel lblEstoque = new JLabel("Quantidade em estoque:");
	private JTextField txtEstoque = new JTextField();
	private JLabel lblTipo = new JLabel("Tipo de cabelo do shampoo:");
	private JTextField txtTipo = new JTextField();
	private JLabel lblPropriedades = new JLabel("Propridades do shampoo:");
	private JTextField txtPropriedades = new JTextField();
	private JLabel lblCondicao = new JLabel("Condi\u00E7\u00E3o dos fios:");
	private JTextField txtCondicao = new JTextField();
	private JButton btnCadastrar = new JButton("Cadastrar");
	private JButton btnCancelar = new JButton("Cancelar");
	private JFrame frmCadastrarProduto;
	private Shampoo shampoo;
	
	//Construtor
	public TelaCadastrarShampoo(JFrame frmCadastrarProduto, Shampoo shampoo) {
		//Configura os componentes da JFrame da tela de cadastro de shampoo
		this.frmCadastrarProduto = frmCadastrarProduto;
		this.shampoo = shampoo;
		this.frmCadastrarShampoo.setBounds(100, 100, 539, 488);
		this.frmCadastrarShampoo.getContentPane().setLayout(null);
		this.frmCadastrarShampoo.setResizable(false);
		this.frmCadastrarShampoo.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frmCadastrarShampoo.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente encerrar o programa?", null,
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		
		//Configura o label preço do shampoo
		this.lblPreco.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblPreco.setBounds(27, 43, 177, 27);
		this.frmCadastrarShampoo.getContentPane().add(lblPreco);
		
		//Configura o campo de texto preço do shampoo
		this.txtPreco.setBounds(230, 43, 253, 27);
		this.frmCadastrarShampoo.getContentPane().add(txtPreco);
		this.txtPreco.setColumns(10);
		
		//Configura o label volume do shampoo
		this.lblVolume.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblVolume.setBounds(27, 84, 193, 27);
		this.frmCadastrarShampoo.getContentPane().add(lblVolume);
		
		//Configura o campo de texto volume do shampoo
		this.txtVolume.setColumns(10);
		this.txtVolume.setBounds(230, 83, 253, 27);
		this.frmCadastrarShampoo.getContentPane().add(txtVolume);
		
		//Configura o label código do shampoo
		this.lblCodigo.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblCodigo.setBounds(27, 126, 177, 27);
		this.frmCadastrarShampoo.getContentPane().add(lblCodigo);
		
		//Configura o campo de texto código do shampoo
		this.txtCodigo.setColumns(10);
		this.txtCodigo.setBounds(230, 125, 253, 27);
		this.frmCadastrarShampoo.getContentPane().add(txtCodigo);
		
		//Configura o label marca do shampoo
		this.lblMarca.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblMarca.setBounds(27, 165, 177, 27);
		this.frmCadastrarShampoo.getContentPane().add(lblMarca);
		
		//Configura o campo de texto marca do shampoo
		this.txtMarca.setColumns(10);
		this.txtMarca.setBounds(230, 164, 253, 27);
		this.frmCadastrarShampoo.getContentPane().add(txtMarca);
		
		//Configura o label linha do shampoo
		this.lblLinha.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblLinha.setBounds(27, 204, 159, 27);
		this.frmCadastrarShampoo.getContentPane().add(lblLinha);
		
		//Configura o campo de texto linha do shampoo
		this.txtLinha.setColumns(10);
		this.txtLinha.setBounds(230, 203, 253, 27);
		this.frmCadastrarShampoo.getContentPane().add(txtLinha);
		
		//Configura o estoque do shampoo
		this.lblEstoque.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblEstoque.setBounds(27, 238, 159, 32);
		this.frmCadastrarShampoo.getContentPane().add(lblEstoque);
		
		//Configura o campo de texto do estoque do shampoo
		this.txtEstoque.setColumns(10);
		this.txtEstoque.setBounds(230, 241, 253, 27);
		this.frmCadastrarShampoo.getContentPane().add(txtEstoque);
		
		//Configura o label tipo de cabelo do shampoo
		this.lblTipo.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblTipo.setBounds(27, 273, 193, 32);
		this.frmCadastrarShampoo.getContentPane().add(lblTipo);
		
		//Configura o campo de texto tipo de cabelo do shampoo
		this.txtTipo.setColumns(10);
		this.txtTipo.setBounds(230, 277, 253, 27);
		this.frmCadastrarShampoo.getContentPane().add(txtTipo);
		
		//Configura o label propriedades do shampoo
		this.lblPropriedades.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblPropriedades.setBounds(27, 313, 193, 32);
		this.frmCadastrarShampoo.getContentPane().add(lblPropriedades);
		
		//Configura o campo de texto propriedades do shampoo
		this.txtPropriedades.setColumns(10);
		this.txtPropriedades.setBounds(230, 314, 253, 27);
		this.frmCadastrarShampoo.getContentPane().add(txtPropriedades);
		
		//Configura o label condição dos fios
		this.lblCondicao.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblCondicao.setBounds(27, 354, 193, 32);
		this.frmCadastrarShampoo.getContentPane().add(lblCondicao);
		
		//Configura o campo de texto condição dos fios
		this.txtCondicao.setColumns(10);
		this.txtCondicao.setBounds(230, 352, 253, 27);
		this.frmCadastrarShampoo.getContentPane().add(txtCondicao);
		
		//Configura o botão cadastrar
		this.btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.btnCadastrar.setBounds(230, 399, 110, 32);
		this.frmCadastrarShampoo.getContentPane().add(btnCadastrar);
		
		//Configura o botão cancelar
		this.btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.btnCancelar.setBounds(373, 398, 110, 32);
		this.frmCadastrarShampoo.getContentPane().add(btnCancelar);
		
		//Direciona os eventos dos botões
		this.getBtnCadastrar().addActionListener(this);
		this.getBtnCancelar().addActionListener(this);
		
		//Permite que a JFrame fique centralizada e visível
		this.frmCadastrarShampoo.setLocationRelativeTo(null);
		this.frmCadastrarShampoo.setVisible(true);
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
			
			if (this.getShampoo() != null) {
				//Deleta o shampoo e faz o recadastro
				ConjuntoShampoo.deletarShampoo(shampoo);
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
			
			//Criação do objeto do tipo Shampoo através do Construtor
			Shampoo shampoo = new Shampoo(preco, volume, codigo, marca, linha, 
					quantidade, tipo, propriedades, condicao);
			
			//Adicionando o objeto criado no ArrayList listaShampoos
			ConjuntoShampoo.cadastrarShampoo(shampoo);
		
			//Mensagem de cadastro bem sucedido
			JOptionPane.showMessageDialog(null, "Shampoo cadastrado!", "", JOptionPane.INFORMATION_MESSAGE);
			
			//Oculta a tela de CadastroProtetorSolarShampoo
			this.getFrmCadastrarShampoo().dispose();
			
			//Torna a tela MenuProduto visível
			this.getFrmCadastrarProduto().setVisible(true);
		}
		
		//Inicia os eventos sobre o botão cancelar
		if (botao == this.getBtnCancelar()) {
			this.getFrmCadastrarShampoo().dispose();
			this.getFrmCadastrarProduto().setVisible(true);
		}
	}
	
	//Métodos acessores
	public JFrame getFrmCadastrarShampoo() {
		return this.frmCadastrarShampoo;
	}

	public JLabel getLblPreco() {
		return this.lblPreco;
	}

	public JTextField getTxtPreco() {
		return this.txtPreco;
	}

	public JLabel getLblVolume() {
		return this.lblVolume;
	}

	public JTextField getTxtVolume() {
		return this.txtVolume;
	}

	public JLabel getLblCodigo() {
		return this.lblCodigo;
	}

	public JTextField getTxtCodigo() {
		return this.txtCodigo;
	}

	public JLabel getLblMarca() {
		return this.lblMarca;
	}

	public JTextField getTxtMarca() {
		return this.txtMarca;
	}

	public JLabel getLblLinha() {
		return this.lblLinha;
	}

	public JTextField getTxtLinha() {
		return this.txtLinha;
	}

	public JLabel getLblEstoque() {
		return this.lblEstoque;
	}

	public JTextField getTxtEstoque() {
		return this.txtEstoque;
	}

	public JLabel getLblTipo() {
		return this.lblTipo;
	}

	public JTextField getTxtTipo() {
		return this.txtTipo;
	}

	public JLabel getLblPropriedades() {
		return this.lblPropriedades;
	}

	public JTextField getTxtPropriedades() {
		return this.txtPropriedades;
	}

	public JLabel getLblCondicao() {
		return this.lblCondicao;
	}

	public JTextField getTxtCondicao() {
		return this.txtCondicao;
	}

	public JButton getBtnCadastrar() {
		return this.btnCadastrar;
	}

	public JButton getBtnCancelar() {
		return this.btnCancelar;
	}

	public JFrame getFrmCadastrarProduto() {
		return this.frmCadastrarProduto;
	}

	public Shampoo getShampoo() {
		return this.shampoo;
	}
}
