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

import controller.ConjuntoPerfumaria;
import model.Perfumaria;

public class TelaCadastrarPerfume implements ActionListener {
	//Atributos
	private JFrame frmCadastrarPerfume = new JFrame("Cadastro de Perfume");
	private JLabel lblPreco = new JLabel("Pre\u00E7o do perfume: R$");
	private JTextField txtPreco = new JTextField();
	private JLabel lblVolume = new JLabel("Volume do perfume: (ml)");
	private JTextField txtVolume = new JTextField();
	private JLabel lblCodigo = new JLabel("C\u00F3digo do perfume:");
	private JTextField txtCodigo = new JTextField();
	private JLabel lblMarca = new JLabel("Marca do perfume:");
	private JTextField txtMarca = new JTextField();
	private JLabel lblLinha = new JLabel("Linha do perfume:");
	private JTextField txtLinha = new JTextField();
	private JLabel lblEstoque = new JLabel("Quantidade em estoque:");
	private JTextField txtEstoque = new JTextField();
	private JLabel lblCategoria = new JLabel("Categoria do perfume:");
	private JTextField txtCategoria = new JTextField();
	private JLabel lblPropriedades = new JLabel("Propriedades do perfume:");
	private JTextField txtPropriedades = new JTextField();
	private JLabel lblFamilia = new JLabel("Fam\u00EDlia olfativa do perfume:");
	private JTextField txtFamilia = new JTextField();
	private JLabel lblSubfamilia = new JLabel("Subfam\u00EDlia olfativa do perfume:");
	private JTextField txtSubfamilia = new JTextField();
	private JButton btnCadastrar = new JButton("Cadastrar");
	private JButton btnCancelar = new JButton("Cancelar");
	private JFrame frmCadastrarProduto;
	private Perfumaria perfume;
	
	//Construtor
	public TelaCadastrarPerfume(JFrame frmCadastrarProduto, Perfumaria perfume) {
		//Configura os componentes da JFrame da tela de cadastro de perfume
		this.frmCadastrarProduto = frmCadastrarProduto;
		this.perfume = perfume;
		this.frmCadastrarPerfume.setBounds(100, 100, 538, 524);
		this.frmCadastrarPerfume.getContentPane().setLayout(null);
		this.frmCadastrarPerfume.setResizable(false);
		this.frmCadastrarPerfume.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frmCadastrarPerfume.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente encerrar o programa?", null,
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		
		//Configura o label preço do perfume
		this.lblPreco.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblPreco.setBounds(27, 43, 147, 27);
		this.frmCadastrarPerfume.getContentPane().add(lblPreco);
		
		//Configura o campo de texto do preço do perfume
		this.txtPreco.setBounds(230, 43, 253, 27);
		this.frmCadastrarPerfume.getContentPane().add(txtPreco);
		this.txtPreco.setColumns(10);
		
		//Condigura o label do volume do perfume
		this.lblVolume.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblVolume.setBounds(27, 84, 155, 27);
		this.frmCadastrarPerfume.getContentPane().add(lblVolume);
		
		//Configura o campo de texto do volume do perfume
		this.txtVolume.setColumns(10);
		this.txtVolume.setBounds(230, 83, 253, 27);
		this.frmCadastrarPerfume.getContentPane().add(txtVolume);
		
		//Condigura o label do código do perfume
		this.lblCodigo.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblCodigo.setBounds(27, 126, 147, 27);
		this.frmCadastrarPerfume.getContentPane().add(lblCodigo);
		
		//Configura o campo de texto do código do perfume
		this.txtCodigo.setColumns(10);
		this.txtCodigo.setBounds(230, 125, 253, 27);
		this.frmCadastrarPerfume.getContentPane().add(txtCodigo);
		
		//Configura o label marca do perfume
		this.lblMarca.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblMarca.setBounds(27, 165, 147, 27);
		this.frmCadastrarPerfume.getContentPane().add(lblMarca);
		
		//Configura o campo de texto marca do perfume
		this.txtMarca.setColumns(10);
		this.txtMarca.setBounds(230, 164, 253, 27);
		this.frmCadastrarPerfume.getContentPane().add(txtMarca);
		
		//Configura o label linha do perfume
		this.lblLinha.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblLinha.setBounds(27, 204, 147, 27);
		this.frmCadastrarPerfume.getContentPane().add(lblLinha);
		
		//Configura o campo de texto linha do perfume
		this.txtLinha.setColumns(10);
		this.txtLinha.setBounds(230, 203, 253, 27);
		this.frmCadastrarPerfume.getContentPane().add(txtLinha);
		
		//Configura o label do estoque 
		this.lblEstoque.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblEstoque.setBounds(27, 238, 159, 32);
		this.frmCadastrarPerfume.getContentPane().add(lblEstoque);
		
		//Configura o campo de texto do estoque
		this.txtEstoque.setColumns(10);
		this.txtEstoque.setBounds(230, 241, 253, 27);
		this.frmCadastrarPerfume.getContentPane().add(txtEstoque);
		
		//Configura o label categoria do perfume
		this.lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblCategoria.setBounds(27, 278, 159, 32);
		this.frmCadastrarPerfume.getContentPane().add(lblCategoria);
		
		//Configura o campo de texto categoria do perfume
		this.txtCategoria.setColumns(10);
		this.txtCategoria.setBounds(230, 279, 253, 27);
		this.frmCadastrarPerfume.getContentPane().add(txtCategoria);
		
		//Configura o label propriedades do perfume
		this.lblPropriedades.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblPropriedades.setBounds(27, 321, 159, 32);
		this.frmCadastrarPerfume.getContentPane().add(lblPropriedades);
		
		//Configura o campo de texto propriedades do perfume
		this.txtPropriedades.setColumns(10);
		this.txtPropriedades.setBounds(230, 317, 253, 27);
		this.frmCadastrarPerfume.getContentPane().add(txtPropriedades);
		
		//Configura o label família do perfume
		this.lblFamilia.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblFamilia.setBounds(27, 360, 190, 27);
		this.frmCadastrarPerfume.getContentPane().add(lblFamilia);
		
		//Configura o campo de texto família do perfume
		this.txtFamilia.setColumns(10);
		this.txtFamilia.setBounds(230, 355, 253, 27);
		this.frmCadastrarPerfume.getContentPane().add(txtFamilia);
		
		//Configura o label subfamília olfativa do perfume
		this.lblSubfamilia.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblSubfamilia.setBounds(27, 398, 208, 27);
		this.frmCadastrarPerfume.getContentPane().add(lblSubfamilia);
		
		//Configura o campo de texto subfamília olfativa do perfume
		this.txtSubfamilia.setColumns(10);
		this.txtSubfamilia.setBounds(230, 397, 253, 27);
		this.frmCadastrarPerfume.getContentPane().add(txtSubfamilia);
		
		//Configura o botão cadastrar
		this.btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.btnCadastrar.setBounds(230, 436, 110, 32);
		this.frmCadastrarPerfume.getContentPane().add(btnCadastrar);
		
		//Configura o botão cancelar
		this.btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.btnCancelar.setBounds(373, 435, 110, 32);
		this.frmCadastrarPerfume.getContentPane().add(btnCancelar);
		
		//Direciona os eventos dos botões
		this.getBtnCadastrar().addActionListener(this);
		this.getBtnCancelar().addActionListener(this);
		
		//Permite que a JFrame fique centralizada e visível
		this.frmCadastrarPerfume.setLocationRelativeTo(null);
		this.frmCadastrarPerfume.setVisible(true);
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
			} else if (this.getTxtCategoria().getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Não deixe nenhum campo em branco!", "", JOptionPane.WARNING_MESSAGE);
				this.getTxtCategoria().requestFocusInWindow();
			} else if (this.getTxtPropriedades().getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Não deixe nenhum campo em branco!", "", JOptionPane.WARNING_MESSAGE);
				this.getTxtPropriedades().requestFocusInWindow();
			} else if (this.getTxtFamilia().getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Não deixe nenhum campo em branco!", "", JOptionPane.WARNING_MESSAGE);
				this.getTxtFamilia().requestFocusInWindow();
			} else if (this.getTxtSubfamilia().getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Não deixe nenhum campo em branco!", "", JOptionPane.WARNING_MESSAGE);
				this.getTxtSubfamilia().requestFocusInWindow();
			}
			
			if (this.getPerfume() != null) {
				//Deleta o perfume e faz o recadastro
				ConjuntoPerfumaria.deletarPerfume(perfume);
			}
			
			//Armazena os valores com as devidas conversões e tratamentos
			double preco = Double.valueOf(this.getTxtPreco().getText()).doubleValue();
			double volume = Double.valueOf(this.getTxtVolume().getText()).doubleValue();
			String codigo = this.getTxtCodigo().getText();
			String marca = this.getTxtMarca().getText();
			String linha = this.getTxtLinha().getText();
			int quantidade = Integer.valueOf(this.getTxtEstoque().getText()).intValue();
			String categoria = this.getTxtCategoria().getText();
			String propriedades = this.getTxtPropriedades().getText();
			String familia = this.getTxtFamilia().getText();
			String subfamilia = this.getTxtSubfamilia().getText();
			
			//Criação do objeto do tipo Perfumaria através do Construtor
			Perfumaria perfume = new Perfumaria(preco, volume, codigo, marca, linha, quantidade,
					categoria, propriedades, familia, subfamilia);
			
			//Adicionando o objeto criado no ArrayList listaPerfumes
			ConjuntoPerfumaria.cadastrarPerfume(perfume);
		
			//Mensagem de cadastro bem sucedido
			JOptionPane.showMessageDialog(null, "Perfume cadastrado!", "", JOptionPane.INFORMATION_MESSAGE);
			
			//Oculta a tela de CadastroPerfume
			this.getFrmCadastrarPerfume().dispose();
			
			//Torna a tela MenuProduto visível
			this.getFrmCadastrarProduto().setVisible(true);
		}
		
		//Inicia os eventos sobre o botão cancelar
		if (botao == this.getBtnCancelar()) {
			this.getFrmCadastrarPerfume().dispose();
			this.getFrmCadastrarProduto().setVisible(true);
		}
	}
	
	//Métodos acessores
	public JFrame getFrmCadastrarPerfume() {
		return this.frmCadastrarPerfume;
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

	public JLabel getLblCategoria() {
		return this.lblCategoria;
	}

	public JTextField getTxtCategoria() {
		return this.txtCategoria;
	}

	public JLabel getLblPropriedades() {
		return this.lblPropriedades;
	}

	public JTextField getTxtPropriedades() {
		return this.txtPropriedades;
	}

	public JLabel getLblFamilia() {
		return this.lblFamilia;
	}

	public JTextField getTxtFamilia() {
		return this.txtFamilia;
	}

	public JLabel getLblSubfamilia() {
		return this.lblSubfamilia;
	}

	public JTextField getTxtSubfamilia() {
		return this.txtSubfamilia;
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
	
	public Perfumaria getPerfume() {
		return this.perfume;
	}
}
