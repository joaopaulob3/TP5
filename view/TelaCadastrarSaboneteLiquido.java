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

import controller.ConjuntoSaboneteLiquido;
import model.SaboneteLiquido;

public class TelaCadastrarSaboneteLiquido implements ActionListener {
	//Atributos
	private JFrame frmCadastrarSaboneteLiquido = new JFrame("Cadastro de Sabonete L\u00EDquido");
	private JLabel lblPreco = new JLabel("Pre\u00E7o do sabonete l\u00EDquido: R$");
	private JTextField txtPreco = new JTextField();
	private JLabel lblVolume = new JLabel("Volume do sabonete l\u00EDquido: (ml)");
	private JTextField txtVolume = new JTextField();
	private JLabel lblCodigo = new JLabel("C\u00F3digo do sabonete l\u00EDquido: ");
	private JTextField txtCodigo = new JTextField();
	private JLabel lblMarca = new JLabel("Marca do sabonete l\u00EDquido:");
	private JTextField txtMarca = new JTextField();
	private JLabel lblLinha = new JLabel("Linha do sabonete l\u00EDquido:");
	private JTextField txtLinha = new JTextField();
	private JLabel lblEstoque = new JLabel("Quantidade em estoque:");
	private JTextField txtEstoque = new JTextField();
	private JLabel lblPropriedades = new JLabel("Propridades do sabonete l\u00EDquido:");
	private JTextField txtPropriedades = new JTextField();
	private JButton btnCadastrar = new JButton("Cadastrar");
	private JButton btnCancelar = new JButton("Cancelar");
	private JFrame frmCadastrarProduto;
	private SaboneteLiquido sabonete;
	
	//Construtor
	public TelaCadastrarSaboneteLiquido(JFrame frmCadastrarProduto, SaboneteLiquido sabonete) {
		//Configura os componentes da JFrame da tela de cadastro de sabonete líquido
		this.frmCadastrarProduto = frmCadastrarProduto;
		this.sabonete = sabonete;
		this.frmCadastrarSaboneteLiquido.setBounds(100, 100, 538, 417);
		this.frmCadastrarSaboneteLiquido.getContentPane().setLayout(null);
		this.frmCadastrarSaboneteLiquido.setResizable(false);
		this.frmCadastrarSaboneteLiquido.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frmCadastrarSaboneteLiquido.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente encerrar o programa?", null,
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		
		//Configura o label preço do sabonete líquido
		this.lblPreco.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblPreco.setBounds(17, 43, 193, 27);
		this.frmCadastrarSaboneteLiquido.getContentPane().add(lblPreco);
		
		//Configura o campo de texto sabonete líquido
		this.txtPreco.setBounds(230, 43, 253, 27);
		this.frmCadastrarSaboneteLiquido.getContentPane().add(txtPreco);
		this.txtPreco.setColumns(10);
		
		//Configura o label volume do sabonete líquido
		this.lblVolume.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblVolume.setBounds(17, 84, 203, 27);
		this.frmCadastrarSaboneteLiquido.getContentPane().add(lblVolume);
		
		//Configura o campo de texto volume do sabonete líquido
		this.txtVolume.setColumns(10);
		this.txtVolume.setBounds(230, 83, 253, 27);
		this.frmCadastrarSaboneteLiquido.getContentPane().add(txtVolume);
		
		//Configura o label código do sabonete líquido
		this.lblCodigo.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblCodigo.setBounds(17, 126, 193, 27);
		this.frmCadastrarSaboneteLiquido.getContentPane().add(lblCodigo);
		
		//Configura o campo de texto código do sabonete líquido
		this.txtCodigo.setColumns(10);
		this.txtCodigo.setBounds(230, 125, 253, 27);
		this.frmCadastrarSaboneteLiquido.getContentPane().add(txtCodigo);
		
		//Configura o label marca do sabonete líquido
		this.lblMarca.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblMarca.setBounds(17, 165, 177, 27);
		this.frmCadastrarSaboneteLiquido.getContentPane().add(lblMarca);
		
		//Configura o campo de texto marca do sabonete líquido
		this.txtMarca.setColumns(10);
		this.txtMarca.setBounds(230, 164, 253, 27);
		this.frmCadastrarSaboneteLiquido.getContentPane().add(txtMarca);
		
		//Configura o label linha do sabonete líquido
		this.lblLinha.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblLinha.setBounds(17, 204, 177, 27);
		this.frmCadastrarSaboneteLiquido.getContentPane().add(lblLinha);
		
		//Configura o campo de texto linha do sabonete líquido
		this.txtLinha.setColumns(10);
		this.txtLinha.setBounds(230, 203, 253, 27);
		this.frmCadastrarSaboneteLiquido.getContentPane().add(txtLinha);
		
		//Configura o estoque sabonete líquido
		this.lblEstoque.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblEstoque.setBounds(17, 238, 159, 32);
		this.frmCadastrarSaboneteLiquido.getContentPane().add(lblEstoque);
		
		//Configura o campo de texto do estoque do sabonete líquido
		this.txtEstoque.setColumns(10);
		this.txtEstoque.setBounds(230, 241, 253, 27);
		this.frmCadastrarSaboneteLiquido.getContentPane().add(txtEstoque);
		
		//Configura o label propriedades do sabonete líquido
		this.lblPropriedades.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblPropriedades.setBounds(17, 273, 203, 32);
		this.frmCadastrarSaboneteLiquido.getContentPane().add(lblPropriedades);
		
		//Configura o campo de texto propriedades do sabonete líquido
		this.txtPropriedades.setColumns(10);
		this.txtPropriedades.setBounds(230, 279, 253, 27);
		this.frmCadastrarSaboneteLiquido.getContentPane().add(txtPropriedades);
		
		//Configura o botão cadastrar
		this.btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.btnCadastrar.setBounds(230, 318, 110, 32);
		this.frmCadastrarSaboneteLiquido.getContentPane().add(btnCadastrar);
		
		//Configura o botão cancelar
		this.btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.btnCancelar.setBounds(373, 317, 110, 32);
		this.frmCadastrarSaboneteLiquido.getContentPane().add(btnCancelar);
		
		//Direciona os eventos dos botões
		this.getBtnCadastrar().addActionListener(this);
		this.getBtnCancelar().addActionListener(this);
		
		//Permite que a JFrame fique centralizada e visível
		this.frmCadastrarSaboneteLiquido.setLocationRelativeTo(null);
		this.frmCadastrarSaboneteLiquido.setVisible(true);
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
				this.getTxtEstoque().requestFocusInWindow();
			} else if (this.getTxtPropriedades().getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Não deixe nenhum campo em branco!", "", JOptionPane.WARNING_MESSAGE);
				this.getTxtPropriedades().requestFocusInWindow();
			}
			
			if (this.getSaboneteLiquido() != null) {
				//Deleta o sabonete líquido e faz o recadastro
				ConjuntoSaboneteLiquido.deletarSaboneteLiquido(sabonete);
			}
			
			//Armazena os valores com as devidas conversões e tratamentos
			double preco = Double.valueOf(this.getTxtPreco().getText()).doubleValue();
			double volume = Double.valueOf(this.getTxtVolume().getText()).doubleValue();
			String codigo = this.getTxtCodigo().getText();
			String marca = this.getTxtMarca().getText();
			String linha = this.getTxtLinha().getText();
			int quantidade = Integer.valueOf(this.getTxtEstoque().getText()).intValue();
			String propriedades = this.getTxtPropriedades().getText();
			
			//Criação do objeto do tipo SaboneteLiquido através do Construtor
			SaboneteLiquido sabonete = new SaboneteLiquido(preco, volume, codigo, 
					marca, linha, quantidade, propriedades);
			
			//Adicionando o objeto criado no ArrayList listaSabonetesLiquido
			ConjuntoSaboneteLiquido.cadastrarSaboneteLiquido(sabonete);
		
			//Mensagem de cadastro bem sucedido
			JOptionPane.showMessageDialog(null, "Protetor solar cadastrado!", "", JOptionPane.INFORMATION_MESSAGE);
			
			//Oculta a tela de CadastroProtetorSolar
			this.getFrmCadastrarSaboneteLiquido().dispose();
			
			//Torna a tela MenuProduto visível
			this.getFrmCadastrarProduto().setVisible(true);
		}
		
		//Inicia os eventos sobre o botão cancelar
		if (botao == this.getBtnCancelar()) {
			this.getFrmCadastrarSaboneteLiquido().dispose();
			this.getFrmCadastrarProduto().setVisible(true);
		}
	}
	
	//Métodos acessores
	public JFrame getFrmCadastrarSaboneteLiquido() {
		return this.frmCadastrarSaboneteLiquido;
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

	public JLabel getLblPropriedades() {
		return this.lblPropriedades;
	}

	public JTextField getTxtPropriedades() {
		return this.txtPropriedades;
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
	
	public SaboneteLiquido getSaboneteLiquido() {
		return this.sabonete;
	}
	
}
