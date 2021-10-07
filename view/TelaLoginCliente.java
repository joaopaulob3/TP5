package view;

/**
 * Apresenta a tela de login do cliente para poder realizar alguma compra
 * @author João Paulo da Silva Freitas
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
		//Armazena o botão escolhido
		JButton botao = (JButton) e.getSource();
		
		//Inicia os eventos sobre o botão entrar
		if (botao == this.getBtnEntrar()) {
			
			//Verifica se o CPF digitado existe no sistema e se a senha está correta
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
				//Mensagem de erro se o Login não for validado	
				else {
					JOptionPane.showMessageDialog(null, "Login não validado!", "", JOptionPane.ERROR_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Cliente não está cadastrado no sistema ainda.", "", JOptionPane.WARNING_MESSAGE);
				JOptionPane.showMessageDialog(null, "Faça um cadastro antes de prosseguir.", "", JOptionPane.INFORMATION_MESSAGE);
				this.getFrmLogin().dispose();
			}
		}
		//Inicia os eventos sobre o botão cancelar
		if (botao == this.getBtnCancelar()) {
			this.getFrmLogin().dispose();
		}
	}

	//Métodos acessores
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