package view;

/**
 * Apresenta a tela de login do cliente para poder realizar alguma compra
 * @author Jo�o Paulo da Silva Freitas
 * @version 1.0
 */

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import model.Cliente;
import controller.ConjuntoCliente;

public class TelaLoginCliente implements ActionListener {
	//Atributos
	private JFrame frmLogin = new JFrame("Login do cliente");
	private JLabel lblCPF = new JLabel("CPF:");
	private JTextField txtCPF = new JTextField();
	private JLabel lblSenha = new JLabel("Senha:");
	private JPasswordField campoSenha = new JPasswordField();
	private JButton btnEntrar = new JButton("Entrar");
	private JButton btnCancelar = new JButton("Cancelar");
	private JFrame telaMenuInicial;
	
	//Construtor
	public TelaLoginCliente(JFrame telaMenuInicial) {
		//Configura a JFrmame de login do cliente
		this.telaMenuInicial = telaMenuInicial;
		this.frmLogin.setBounds(100, 100, 469, 261);
		this.frmLogin.setResizable(false);
		this.frmLogin.getContentPane().setLayout(null);
		this.frmLogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		//Configura o label CPF
		this.lblCPF.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.lblCPF.setBounds(30, 53, 95, 25);
		this.frmLogin.getContentPane().add(lblCPF);

		//Configura o campo de texto CPF
		this.txtCPF.setBounds(89, 51, 300, 33);
		this.frmLogin.getContentPane().add(txtCPF);
		this.txtCPF.setColumns(10);

		//Configura o label Senha
		this.lblSenha.setFont(new Font("Tahoma", Font.BOLD, 15));
		this.lblSenha.setBounds(30, 114, 95, 25);
		this.frmLogin.getContentPane().add(lblSenha);

		//Configura o campo de senha
		this.campoSenha.setBounds(89, 112, 300, 33);
		this.frmLogin.getContentPane().add(campoSenha);

		//Configura o bot�o entrar
		this.btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		this.btnEntrar.setBounds(89, 169, 126, 33);
		this.frmLogin.getContentPane().add(btnEntrar);

		//Configura o bot�o cancelar
		this.btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		this.btnCancelar.setBounds(264, 169, 126, 33);
		this.frmLogin.getContentPane().add(btnCancelar);

		//Direciona e configura os eventos dos bot�es
		this.getBtnEntrar().addActionListener(this);
		this.getBtnCancelar().addActionListener(this);

		//Permite que a tela fique centralizada e vis�vel
		this.frmLogin.setLocationRelativeTo(null);
		this.frmLogin.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Armazena o bot�o escolhido
		JButton botao = (JButton) e.getSource();
		
		//Inicia os eventos sobre o bot�o entrar
		if (botao == this.getBtnEntrar()) {
			
			//Verifica se o CPF digitado existe no sistema e se a senha est� correta
			String cpf = this.getTxtCPF().getText();
			String senha = new String(this.getCampoSenha().getPassword());
			
			//Resgata o objeto do tipo Cliente do ArrayList listaClientes
			Cliente cliente = ConjuntoCliente.pesquisarCliente(cpf);
			
			//Se o cliente for encontrado no sistema e o cpf e a senha estiverem
			//corretos e atrelados a ele, podemos prosseguir
			if (cliente != null) {
				if (cpf.equals(cliente.getCPF()) && senha.equals(cliente.getSenha())) {
					this.getFrmLogin().dispose();
					this.getTelaMenuInicial().dispose();
					new TelaCompra(this.getTelaMenuInicial(), cliente);
				} 
				//Mensagem de erro se o Login n�o for validado	
				else {
					JOptionPane.showMessageDialog(null, "Login n�o validado!", "", JOptionPane.ERROR_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Cliente n�o est� cadastrado no sistema ainda.", "", JOptionPane.WARNING_MESSAGE);
				JOptionPane.showMessageDialog(null, "Fa�a um cadastro antes de prosseguir.", "", JOptionPane.INFORMATION_MESSAGE);
				this.getFrmLogin().dispose();
			}
		}
		//Inicia os eventos sobre o bot�o cancelar
		if (botao == this.getBtnCancelar()) {
			this.getFrmLogin().dispose();
		}
	}

	//M�todos acessores
	public JFrame getFrmLogin() {
		return this.frmLogin;
	}

	public JLabel getLblCPF() {
		return this.lblCPF;
	}

	public JTextField getTxtCPF() {
		return this.txtCPF;
	}

	public JLabel getLblSenha() {
		return this.lblSenha;
	}

	public JPasswordField getCampoSenha() {
		return this.campoSenha;
	}

	public JButton getBtnEntrar() {
		return this.btnEntrar;
	}

	public JButton getBtnCancelar() {
		return this.btnCancelar;
	}

	public JFrame getTelaMenuInicial() {
		return this.telaMenuInicial;
	}
}