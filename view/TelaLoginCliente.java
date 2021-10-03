package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLoginCliente implements ActionListener {
	//Atributos
	private JFrame frmLogin = new JFrame("Login do cliente");
	private JLabel lblCPF = new JLabel("CPF:");
	private JTextField textField = new JTextField();
	private JLabel lblSenha = new JLabel("Senha:");
	private JPasswordField passwordField = new JPasswordField();
	private JButton btnEntrar = new JButton("Entrar");
	private JButton btnCancelar = new JButton("Cancelar");

	//Construtor
	public TelaLoginCliente() {
		//Configura a JFrmame de login do cliente
		this.frmLogin.setBounds(100, 100, 469, 261);
		this.frmLogin.setResizable(false);
		this.frmLogin.getContentPane().setLayout(null);
		this.frmLogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		//Configura o label CPF
		this.lblCPF.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.lblCPF.setBounds(30, 53, 95, 25);
		this.frmLogin.getContentPane().add(lblCPF);

		//Configura o campo de texto CPF
		this.textField.setBounds(89, 51, 300, 33);
		this.frmLogin.getContentPane().add(textField);
		this.textField.setColumns(10);

		//Configura o label Senha
		this.lblSenha.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.lblSenha.setBounds(30, 114, 95, 25);
		this.frmLogin.getContentPane().add(lblSenha);

		//Configura o campo de senha
		this.passwordField.setBounds(89, 112, 300, 33);
		this.frmLogin.getContentPane().add(passwordField);

		//Configura o botão entrar
		this.btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		this.btnEntrar.setBounds(89, 169, 126, 33);
		this.frmLogin.getContentPane().add(btnEntrar);

		//Configura o botão cancelar
		this.btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		this.btnCancelar.setBounds(264, 169, 126, 33);
		this.frmLogin.getContentPane().add(btnCancelar);

		//Direciona e configura os eventos dos botões
		this.getBtnEntrar().addActionListener(this);
		this.getBtnCancelar().addActionListener(this);

		//Permite que a tela fique centralizada e visível
		this.frmLogin.setLocationRelativeTo(null);
		this.frmLogin.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	//Métodos acessores
	public JFrame getFrmLogin() {
		return frmLogin;
	}

	public JLabel getLblCPF() {
		return lblCPF;
	}

	public JTextField getTextField() {
		return textField;
	}

	public JLabel getLblSenha() {
		return lblSenha;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public JButton getBtnEntrar() {
		return btnEntrar;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

}