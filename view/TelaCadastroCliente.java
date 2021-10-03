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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.ConjuntoCliente;
import model.Cliente;

public class TelaCadastroCliente implements ActionListener {
	//Atributos
	private JFrame frmCadastroCliente = new JFrame("Cadastro de cliente");
	private JLabel lblNome = new JLabel("Nome do cliente:");
	private JTextField txtCampoNome = new JTextField();
	private JLabel lblEmail = new JLabel("E-mail do cliente:");
	private JTextField txtCampoEmail = new JTextField();
	private JLabel lblCPFCliente = new JLabel("CPF do cliente:");
	private JTextField txtCampoCPF = new JTextField();
	private JLabel lblCelular = new JLabel("Celular do cliente:");
	private JTextField txtCampoCelular = new JTextField();
	private JLabel lblGenero = new JLabel("G\u00EAnero do cliente:");
	private JTextField txtCampoGenero = new JTextField();
	private JLabel lblSenha = new JLabel("Senha do cliente:");
	private JPasswordField txtCampoSenha = new JPasswordField();
	private JButton btnCadastrar = new JButton("Cadastrar");
	private JButton btnCancelar = new JButton("Cancelar");
	private JFrame telaMenuCliente;
	
	//Construtor
	public TelaCadastroCliente(JFrame telaMenuCliente) {
		//Configuração da janela TelaCadastroCliente
		this.telaMenuCliente = telaMenuCliente;
		this.frmCadastroCliente.setBounds(100, 100, 646, 404);
		this.frmCadastroCliente.setResizable(false);
		this.frmCadastroCliente.getContentPane().setLayout(null);
		this.frmCadastroCliente.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frmCadastroCliente.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente encerrar o programa?", null,
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});

		
		//Configura o label nome do cliente
		this.lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.lblNome.setBounds(47, 31, 130, 31);
		this.frmCadastroCliente.getContentPane().add(lblNome);
		
		//Configura o campo de texto nome do cliente
		this.txtCampoNome.setBounds(165, 33, 383, 31);
		this.frmCadastroCliente.getContentPane().add(txtCampoNome);
		this.txtCampoNome.setColumns(10);
		
		//Configura o label email do cliente
		this.lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.lblEmail.setBounds(47, 81, 130, 31);
		this.frmCadastroCliente.getContentPane().add(lblEmail);
		
		//Configura o campo de texto email do cliente
		this.txtCampoEmail.setColumns(10);
		this.txtCampoEmail.setBounds(165, 81, 383, 31);
		this.frmCadastroCliente.getContentPane().add(txtCampoEmail);
		
		//Configura o label CPF do cliente
		this.lblCPFCliente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.lblCPFCliente.setBounds(47, 123, 130, 31);
		this.frmCadastroCliente.getContentPane().add(lblCPFCliente);
		
		//Configura o campo de texto CPF do cliente
		this.txtCampoCPF.setColumns(10);
		this.txtCampoCPF.setBounds(165, 130, 383, 31);
		this.frmCadastroCliente.getContentPane().add(txtCampoCPF);
		
		//Configura o label celular do cliente
		this.lblCelular.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.lblCelular.setBounds(47, 170, 130, 31);
		this.frmCadastroCliente.getContentPane().add(lblCelular);
		
		//Configura o campo de texto celular do cliente
		this.txtCampoCelular.setColumns(10);
		this.txtCampoCelular.setBounds(165, 177, 383, 31);
		this.frmCadastroCliente.getContentPane().add(txtCampoCelular);
		
		//Configura o label gênero do cliente
		this.lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.lblGenero.setBounds(47, 212, 130, 31);
		this.frmCadastroCliente.getContentPane().add(lblGenero);
		
		//Configurao campo de texto gênero do cliente
		this.txtCampoGenero.setColumns(10);
		this.txtCampoGenero.setBounds(165, 219, 383, 31);
		this.frmCadastroCliente.getContentPane().add(txtCampoGenero);
		
		//Configura o label senha do cliente
		this.lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.lblSenha.setBounds(47, 254, 130, 31);
		this.frmCadastroCliente.getContentPane().add(lblSenha);
		
		//Configura o campo de texto senha do cliente
		this.txtCampoSenha.setBounds(165, 261, 383, 31);
		this.frmCadastroCliente.getContentPane().add(txtCampoSenha);
		
		//Configura o botão cadastrar
		this.btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.btnCadastrar.setBounds(165, 313, 160, 36);
		this.frmCadastroCliente.getContentPane().add(btnCadastrar);
		
		//Configura o botão cancelar
		this.btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.btnCancelar.setBounds(388, 313, 160, 36);
		this.frmCadastroCliente.getContentPane().add(btnCancelar);
		
		//Direciona os eventos dos botões
		this.getBtnCadastrar().addActionListener(this);
		this.getBtnCancelar().addActionListener(this);
		
		//Permite que a JFrame fique centralizada e visível
		this.frmCadastroCliente.setLocationRelativeTo(null);
		this.frmCadastroCliente.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Armazena o botão escolhido
		JButton botao = (JButton) e.getSource();
		
		//Inicia os eventos sobre o botão cadastrar
		if (botao == this.getBtnCadastrar()) {
			String nome = this.getTxtCampoNome().getText();
			String email = this.getTxtCampoEmail().getText();
			String cpf = this.getTxtCampoCPF().getText();
			String celular = this.getTxtCampoCelular().getText();
			String genero = this.getTxtCampoGenero().getText();
			String senha = new String(this.getTxtCampoSenha().getPassword());
			
			//Criação do objeto do tipo Cliente através Construtor
			Cliente cliente = new Cliente(cpf, senha, nome, email, celular, genero);
			
			//Adicionando o objeto criado no ArrayList listaClientes
			ConjuntoCliente.cadastrarCliente(cliente);
			
			JOptionPane.showMessageDialog(null, "Cliente cadastrado!", "", JOptionPane.INFORMATION_MESSAGE);
			this.getFrmCadastroCliente().dispose();
			this.getTelaMenuCliente().setVisible(true);
		}
		
		//Inicia os eventos sobre o botão cancelar
		if (botao == this.getBtnCancelar()) {
			this.getFrmCadastroCliente().dispose();
			this.getTelaMenuCliente().setVisible(true);
		}
	}

	//Métodos acessores
	public JFrame getFrmCadastroCliente() {
		return frmCadastroCliente;
	}

	public JLabel getLblNome() {
		return lblNome;
	}

	public JTextField getTxtCampoNome() {
		return txtCampoNome;
	}

	public JLabel getLblEmail() {
		return lblEmail;
	}

	public JTextField getTxtCampoEmail() {
		return txtCampoEmail;
	}

	public JLabel getLblCPFCliente() {
		return lblCPFCliente;
	}

	public JTextField getTxtCampoCPF() {
		return txtCampoCPF;
	}

	public JLabel getLblCelular() {
		return lblCelular;
	}

	public JTextField getTxtCampoCelular() {
		return txtCampoCelular;
	}

	public JLabel getLblGenero() {
		return lblGenero;
	}

	public JTextField getTxtCampoGenero() {
		return txtCampoGenero;
	}

	public JLabel getLblSenha() {
		return lblSenha;
	}

	public JPasswordField getTxtCampoSenha() {
		return txtCampoSenha;
	}

	public JButton getBtnCadastrar() {
		return btnCadastrar;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public JFrame getTelaMenuCliente() {
		return telaMenuCliente;
	}
}
