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

import controller.ConjuntoHidratante;
import model.Hidratante;

public class TelaCadastrarHidratante implements ActionListener {
	//Atributos
	private JFrame frmCadastrarHidratante = new JFrame("Cadastro de Hidratante");
	private JLabel lblPreco = new JLabel("Pre\u00E7o do hidratante: R$");
	private JTextField txtPreco = new JTextField();
	private JLabel lblVolume = new JLabel("Volume do hidratante: (ml)");
	private JTextField txtVolume = new JTextField();
	private JLabel lblCodigo = new JLabel("C\u00F3digo do hidratante:");
	private JTextField txtCodigo = new JTextField();
	private JLabel lblMarca = new JLabel("Marca do hidratante:");
	private JTextField txtMarca = new JTextField();
	private JLabel lblLinha = new JLabel("Linha do hidratante:");
	private JTextField txtLinha = new JTextField();
	private JLabel lblEstoque = new JLabel("Quantidade em estoque:");
	private JTextField txtEstoque = new JTextField();
	private JLabel lblTipoDePele = new JLabel("Tipo de pele do hidratante:");
	private JTextField txtTipoDePele = new JTextField();
	private JButton btnCadastrar = new JButton("Cadastrar");
	private JButton btnCancelar = new JButton("Cancelar");
	private JFrame frmCadastrarProduto;
	private Hidratante hidratante;
	
	//Construtor
	public TelaCadastrarHidratante(JFrame frmCadastrarProduto, Hidratante hidratante) {
		//Configura os componentes da JFrame da tela de cadastro de hidratante
		this.frmCadastrarProduto = frmCadastrarProduto;
		this.hidratante = hidratante;
		this.frmCadastrarHidratante.setBounds(100, 100, 537, 430);
		this.frmCadastrarHidratante.getContentPane().setLayout(null);
		this.frmCadastrarHidratante.setResizable(false);
		this.frmCadastrarHidratante.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frmCadastrarHidratante.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente encerrar o programa?", null,
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		
		//Configura o label preço do hidratante
		this.lblPreco.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblPreco.setBounds(27, 43, 159, 27);
		this.frmCadastrarHidratante.getContentPane().add(lblPreco);
		
		//Configura o campo de texto do preço do hidratante
		this.txtPreco.setBounds(230, 43, 253, 27);
		this.frmCadastrarHidratante.getContentPane().add(txtPreco);
		this.txtPreco.setColumns(10);
		
		//Configura o label volume do hidratante
		this.lblVolume.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblVolume.setBounds(27, 84, 193, 27);
		this.frmCadastrarHidratante.getContentPane().add(lblVolume);
		
		//Configura o campo de texto do volume do hidratante
		this.txtVolume.setColumns(10);
		this.txtVolume.setBounds(230, 83, 253, 27);
		this.frmCadastrarHidratante.getContentPane().add(txtVolume);
		
		//Configura o label do código do hidratante
		this.lblCodigo.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblCodigo.setBounds(27, 126, 147, 27);
		this.frmCadastrarHidratante.getContentPane().add(lblCodigo);
		
		//Configura o campo de texto do código do hidratante
		this.txtCodigo.setColumns(10);
		this.txtCodigo.setBounds(230, 125, 253, 27);
		this.frmCadastrarHidratante.getContentPane().add(txtCodigo);
		
		//Configura o label marca do hidratante
		this.lblMarca.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblMarca.setBounds(27, 165, 147, 27);
		this.frmCadastrarHidratante.getContentPane().add(lblMarca);
		
		//Configura o campo de texto marca do hidratante
		this.txtMarca.setColumns(10);
		this.txtMarca.setBounds(230, 164, 253, 27);
		this.frmCadastrarHidratante.getContentPane().add(txtMarca);
		
		//Configura o label linha do hidratante
		this.lblLinha.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblLinha.setBounds(27, 204, 147, 27);
		this.frmCadastrarHidratante.getContentPane().add(lblLinha);
		
		//Configura o campo de texto linha do hidratante
		this.txtLinha.setColumns(10);
		this.txtLinha.setBounds(230, 203, 253, 27);
		this.frmCadastrarHidratante.getContentPane().add(txtLinha);
		
		//Configura o label de estoque do hidratante
		this.lblEstoque.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblEstoque.setBounds(27, 238, 159, 32);
		this.frmCadastrarHidratante.getContentPane().add(lblEstoque);
		
		//Configura o campo de texto do estoque do hidratante
		this.txtEstoque.setColumns(10);
		this.txtEstoque.setBounds(230, 241, 253, 27);
		this.frmCadastrarHidratante.getContentPane().add(txtEstoque);
		
		//Configura o label tipo de pele do hidratante
		this.lblTipoDePele.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblTipoDePele.setBounds(27, 278, 177, 32);
		this.frmCadastrarHidratante.getContentPane().add(lblTipoDePele);
		
		//Configura o campo de texto tipo de pele do hidratante
		this.txtTipoDePele.setColumns(10);
		this.txtTipoDePele.setBounds(230, 279, 253, 27);
		this.frmCadastrarHidratante.getContentPane().add(txtTipoDePele);
		
		//Configura o botão cadastrar
		this.btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.btnCadastrar.setBounds(230, 327, 110, 32);
		this.frmCadastrarHidratante.getContentPane().add(btnCadastrar);
		
		//Configura o botão cancelar
		this.btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.btnCancelar.setBounds(373, 326, 110, 32);
		this.frmCadastrarHidratante.getContentPane().add(btnCancelar);
		
		//Direciona os eventos dos botões
		this.getBtnCadastrar().addActionListener(this);
		this.getBtnCancelar().addActionListener(this);
		
		//Permite que a JFrame fique centralizada e visível
		this.frmCadastrarHidratante.setLocationRelativeTo(null);
		this.frmCadastrarHidratante.setVisible(true);
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
			} else if (this.getTxtTipoDePele().getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Não deixe nenhum campo em branco!", "", JOptionPane.WARNING_MESSAGE);
				this.getTxtTipoDePele().requestFocusInWindow();
			}
			
			if (this.getHidratante() != null) {
				//Deleta o hidratante e faz o recadastro
				ConjuntoHidratante.deletarHidratante(hidratante);
			}
			
			//Armazena os valores com as devidas conversões e tratamentos
			double preco = Double.valueOf(this.getTxtPreco().getText()).doubleValue();
			double volume = Double.valueOf(this.getTxtVolume().getText()).doubleValue();
			String codigo = this.getTxtCodigo().getText();
			String marca = this.getTxtMarca().getText();
			String linha = this.getTxtLinha().getText();
			int quantidade = Integer.valueOf(this.getTxtEstoque().getText()).intValue();
			String tipo = this.getTxtTipoDePele().getText();
			
			//Criação do objeto do tipo Hidratante através do Construtor
			Hidratante hidratante = new Hidratante(preco, volume, codigo, marca, linha,
					quantidade,tipo);
			
			//Adicionando o objeto criado no ArrayList listaHidratantes
			ConjuntoHidratante.cadastrarHidratante(hidratante);
		
			//Mensagem de cadastro bem sucedido
			JOptionPane.showMessageDialog(null, "Hidratante cadastrado!", "", JOptionPane.INFORMATION_MESSAGE);
			
			//Oculta a tela de CadastroHidratante
			this.getFrmCadastrarHidratante().dispose();
			
			//Torna a tela MenuProduto visível
			this.getFrmCadastrarProduto().setVisible(true);
		}
		
		//Inicia os eventos sobre o botão cancelar
		if (botao == this.getBtnCancelar()) {
			this.getFrmCadastrarHidratante().dispose();
			this.getFrmCadastrarProduto().setVisible(true);
		}
	}
	
	//Métodos acessores
	public JFrame getFrmCadastrarHidratante() {
		return this.frmCadastrarHidratante;
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

	public JLabel getLblTipoDePele() {
		return this.lblTipoDePele;
	}

	public JTextField getTxtTipoDePele() {
		return this.txtTipoDePele;
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
	
	public Hidratante getHidratante() {
		return this.hidratante;
	}
}
