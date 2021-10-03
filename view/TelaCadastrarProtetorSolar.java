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

import controller.ConjuntoProtetorSolar;
import model.ProtetorSolar;

public class TelaCadastrarProtetorSolar implements ActionListener {
	//Atributos
	private JFrame frmCadastrarProtetorSolar = new JFrame("Cadastro de Hidratante");
	private JLabel lblPreco = new JLabel("Pre\u00E7o do protetor solar: R$");
	private JTextField txtPreco = new JTextField();
	private JLabel lblVolume = new JLabel("Volume do protetor solar: (ml)");
	private JTextField txtVolume = new JTextField();
	private JLabel lblCodigo = new JLabel("C\u00F3digo do protetor solar:");
	private JTextField txtCodigo = new JTextField();
	private JLabel lblMarca = new JLabel("Marca do protetor solar:");
	private JTextField txtMarca = new JTextField();
	private JLabel lblLinha = new JLabel("Linha do protetor solar:");
	private JTextField txtLinha = new JTextField();
	private JLabel lblEstoque = new JLabel("Quantidade em estoque:");
	private JTextField txtEstoque = new JTextField();
	private JLabel lblPropriedades = new JLabel("Propridades do protetor solar:");
	private JTextField txtPropriedades = new JTextField();
	private JLabel lblFPS = new JLabel("FPS do protetor solar:");
	private JTextField txtFPS = new JTextField();
	private JButton btnCadastrar = new JButton("Cadastrar");
	private JButton btnCancelar = new JButton("Cancelar");
	private JFrame frmCadastrarProduto;
	private ProtetorSolar protetor;
	
	//Construtor
	public TelaCadastrarProtetorSolar(JFrame frmCadastrarProduto, ProtetorSolar protetor) {
		//Configura os componentes da JFrame da tela de cadastro de protetor solar
		this.frmCadastrarProduto = frmCadastrarProduto;
		this.protetor = protetor;
		this.frmCadastrarProtetorSolar.setBounds(100, 100, 539, 464);
		this.frmCadastrarProtetorSolar.getContentPane().setLayout(null);
		this.frmCadastrarProtetorSolar.setResizable(false);
		this.frmCadastrarProtetorSolar.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frmCadastrarProtetorSolar.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente encerrar o programa?", null,
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		
		//Configura o label preço do protetor solar
		this.lblPreco.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblPreco.setBounds(27, 43, 177, 27);
		this.frmCadastrarProtetorSolar.getContentPane().add(lblPreco);
		
		//Configura o campo de texto preço do protetor solar
		this.txtPreco.setBounds(230, 43, 253, 27);
		this.frmCadastrarProtetorSolar.getContentPane().add(txtPreco);
		this.txtPreco.setColumns(10);
		
		//Configura o label volume do protetor solar
		this.lblVolume.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblVolume.setBounds(27, 84, 193, 27);
		this.frmCadastrarProtetorSolar.getContentPane().add(lblVolume);
		
		//Configura o campo de texto volume do protetor solar
		this.txtVolume.setColumns(10);
		this.txtVolume.setBounds(230, 83, 253, 27);
		this.frmCadastrarProtetorSolar.getContentPane().add(txtVolume);
		
		//Configura o label código do protetor solar
		this.lblCodigo.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblCodigo.setBounds(27, 126, 177, 27);
		this.frmCadastrarProtetorSolar.getContentPane().add(lblCodigo);
		
		//Configura o campo de texto código do protetor solar
		this.txtCodigo.setColumns(10);
		this.txtCodigo.setBounds(230, 125, 253, 27);
		this.frmCadastrarProtetorSolar.getContentPane().add(txtCodigo);
		
		//Configura o label marca do protetor solar
		this.lblMarca.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblMarca.setBounds(27, 165, 177, 27);
		this.frmCadastrarProtetorSolar.getContentPane().add(lblMarca);
		
		//Configura o campo de texto marca do protetor solar
		this.txtMarca.setColumns(10);
		this.txtMarca.setBounds(230, 164, 253, 27);
		this.frmCadastrarProtetorSolar.getContentPane().add(txtMarca);
		
		//Configura o label linha do protetor solar
		this.lblLinha.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblLinha.setBounds(27, 204, 159, 27);
		this.frmCadastrarProtetorSolar.getContentPane().add(lblLinha);
		
		//Configura o campo de texto linha do protetor solar
		this.txtLinha.setColumns(10);
		this.txtLinha.setBounds(230, 203, 253, 27);
		this.frmCadastrarProtetorSolar.getContentPane().add(txtLinha);
		
		//Configura o label de estoque do protetor solar
		this.lblEstoque.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblEstoque.setBounds(27, 238, 159, 32);
		this.frmCadastrarProtetorSolar.getContentPane().add(lblEstoque);
		
		//Configura o campo de texto de estoque do protetor solar
		this.txtEstoque.setColumns(10);
		this.txtEstoque.setBounds(230, 241, 253, 27);
		this.frmCadastrarProtetorSolar.getContentPane().add(txtEstoque);
		
		//Configura o label propriedades do protetor solar
		this.lblPropriedades.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblPropriedades.setBounds(27, 278, 193, 32);
		this.frmCadastrarProtetorSolar.getContentPane().add(lblPropriedades);
		
		//Configura o campo de texto propriedades do protetor solar
		this.txtPropriedades.setColumns(10);
		this.txtPropriedades.setBounds(230, 279, 253, 27);
		this.frmCadastrarProtetorSolar.getContentPane().add(txtPropriedades);
		
		//Configura o label FPS do protetor solar
		this.lblFPS.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.lblFPS.setBounds(27, 313, 193, 32);
		this.frmCadastrarProtetorSolar.getContentPane().add(lblFPS);
		
		//Configura o campo de texto FPS do protetor solar
		this.txtFPS.setColumns(10);
		this.txtFPS.setBounds(230, 317, 253, 27);
		this.frmCadastrarProtetorSolar.getContentPane().add(txtFPS);
				
		//Configura o botão cadastrar
		this.btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.btnCadastrar.setBounds(230, 370, 110, 32);
		this.frmCadastrarProtetorSolar.getContentPane().add(btnCadastrar);
		
		//Configura o botão cancelar
		this.btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 12));
		this.btnCancelar.setBounds(373, 369, 110, 32);
		this.frmCadastrarProtetorSolar.getContentPane().add(btnCancelar);
	
		//Direciona os eventos dos botões
		this.getBtnCadastrar().addActionListener(this);
		this.getBtnCancelar().addActionListener(this);
		
		//Permite que a JFrame fique centralizada e visível
		this.frmCadastrarProtetorSolar.setLocationRelativeTo(null);
		this.frmCadastrarProtetorSolar.setVisible(true);
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
			} else if (this.getTxtFPS().getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Não deixe nenhum campo em branco!", "", JOptionPane.WARNING_MESSAGE);
				this.getTxtFPS().requestFocusInWindow();
			}
			
			if (this.getProtetorSolar() != null) {
				//Deleta o protetor e faz o recadastro
				ConjuntoProtetorSolar.deletarProtetorSolar(protetor);
			}
			
			//Armazena os valores com as devidas conversões e tratamentos
			double preco = Double.valueOf(this.getTxtPreco().getText()).doubleValue();
			double volume = Double.valueOf(this.getTxtVolume().getText()).doubleValue();
			String codigo = this.getTxtCodigo().getText();
			String marca = this.getTxtMarca().getText();
			String linha = this.getTxtLinha().getText();
			int quantidade = Integer.valueOf(this.getTxtEstoque().getText()).intValue();
			String propriedades = this.getTxtPropriedades().getText();
			int fps = Integer.valueOf(this.getTxtFPS().getText()).intValue();
			
			//Criação do objeto do tipo ProtetorSolar através do Construtor
			ProtetorSolar protetor = new ProtetorSolar(preco, volume, codigo, marca,
					linha, quantidade, propriedades, fps);
			
			//Adicionando o objeto criado no ArrayList listaProtetorSolar
			ConjuntoProtetorSolar.cadastrarProtetorSolar(protetor);
		
			//Mensagem de cadastro bem sucedido
			JOptionPane.showMessageDialog(null, "Protetor solar cadastrado!", "", JOptionPane.INFORMATION_MESSAGE);
			
			//Oculta a tela de CadastroProtetorSolar
			this.getFrmCadastrarProtetorSolar().dispose();
			
			//Torna a tela MenuProduto visível
			this.getFrmCadastrarProduto().setVisible(true);
		}
		
		//Inicia os eventos sobre o botão cancelar
		if (botao == this.getBtnCancelar()) {
			this.getFrmCadastrarProtetorSolar().dispose();
			this.getFrmCadastrarProduto().setVisible(true);
		}
	}
	
	//Métodos acessores
	public JFrame getFrmCadastrarProtetorSolar() {
		return this.frmCadastrarProtetorSolar;
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

	public JLabel getLblFPS() {
		return this.lblFPS;
	}

	public JTextField getTxtFPS() {
		return this.txtFPS;
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
	
	public ProtetorSolar getProtetorSolar() {
		return this.protetor;
	}
}
