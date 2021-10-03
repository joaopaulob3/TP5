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

import model.Cliente;
import controller.ConjuntoCliente;

public class TelaPesquisaPorCPF implements ActionListener{
	//Atributos
	private JFrame frmPesquisa = new JFrame("Pesquisa pelo CPF:");
	private JLabel lblTitulo = new JLabel("Informe o CPF do cliente:");
	private JTextField txtPesquisa = new JTextField();
	private JButton btnPesquisar = new JButton("Pesquisar");
	private JButton btnCancelar = new JButton("Cancelar");
	private JFrame telaListaClientes;
	private JFrame telaMenuCliente;
	private int opcao;

	//Construtor
	public TelaPesquisaPorCPF (JFrame telaListaClientes, JFrame telaMenuCliente, int opcao) {
		//Configura os componentes da JFrame da tela de pesquisa pelo código
		this.telaListaClientes = telaListaClientes;
		this.telaMenuCliente = telaMenuCliente;
		this.opcao = opcao;
		this.frmPesquisa.setBounds(100, 100, 440, 257);
		this.frmPesquisa.getContentPane().setLayout(null);
		this.frmPesquisa.setResizable(false);
		this.frmPesquisa.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frmPesquisa.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente encerrar o programa?", null,
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});

		//Configura o label título
		this.lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		this.lblTitulo.setBounds(67, 58, 224, 24);
		this.frmPesquisa.getContentPane().add(lblTitulo);

		//Configura o campo de texto da pesquisa
		this.txtPesquisa.setBounds(67, 93, 285, 30);
		this.frmPesquisa.getContentPane().add(txtPesquisa);
		this.txtPesquisa.setColumns(10);

		//Configura o botão Pesquisar
		this.btnPesquisar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.btnPesquisar.setBounds(67, 136, 136, 33);
		this.frmPesquisa.getContentPane().add(btnPesquisar);

		//Configura o botão Cancelar
		this.btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.btnCancelar.setBounds(216, 136, 136, 33);
		this.frmPesquisa.getContentPane().add(btnCancelar);

		//Direciona e configura os eventos dos botões
		this.getBtnPesquisar().addActionListener(this);
		this.getBtnCancelar().addActionListener(this);

		//Permite que a JFrame fique centralizada e visível
		this.frmPesquisa.setLocationRelativeTo(null);
		this.frmPesquisa.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Armazena o botão escolhido
		JButton botao = (JButton) e.getSource();

		//Inicia os eventos sobre o botão cadastrar
		if (botao == this.getBtnPesquisar()) {
			//Armazena o nome digitado
			String cpf = this.getTxtPesquisa().getText();

			//Resgata o objeto do tipo Cliente do ArrayList listaClientes
			Cliente cliente = ConjuntoCliente.pesquisarCliente(cpf);

			//Programa continua se o nome for encontrado no sistema
			if (cliente != null) {
				//Cliente é deletado e recadastrado a depender da opção que veio da TelaLogin
				ConjuntoCliente.deletarCliente(cliente);
				if (this.getOpcao() == 0) {
					JOptionPane.showMessageDialog(null, "Cliente deletado!", "", JOptionPane.INFORMATION_MESSAGE);
					this.getFrmPesquisa().dispose();
					this.getTelaListaClientes().dispose();
					this.getTelaMenuCliente().setVisible(true);
				}
				if (this.getOpcao() == 1) {
					new TelaCadastroCliente(this.getTelaMenuCliente());
				}
			} else {
				JOptionPane.showMessageDialog(null, "O CPF informado não foi encontrado no sistema!", "", JOptionPane.WARNING_MESSAGE);
				this.getFrmPesquisa().dispose();
				this.getTelaListaClientes().dispose();
				this.getTelaMenuCliente().setVisible(true);
			}
		}

		//Inicia os eventos sobre o botão cancelar
		if (botao == this.getBtnCancelar()) {
			this.getFrmPesquisa().dispose();
			this.getTelaListaClientes().dispose();
			this.getTelaMenuCliente().setVisible(true);
		}
	}

	//Métodos acessores
	public JFrame getFrmPesquisa() {
		return this.frmPesquisa;
	}

	public JLabel getLblTitulo() {
		return this.lblTitulo;
	}

	public JTextField getTxtPesquisa() {
		return this.txtPesquisa;
	}

	public JButton getBtnPesquisar() {
		return this.btnPesquisar;
	}

	public JButton getBtnCancelar() {
		return this.btnCancelar;
	}

	public JFrame getTelaListaClientes() {
		return this.telaListaClientes;
	}

	public JFrame getTelaMenuCliente() {
		return this.telaMenuCliente;
	}

	public int getOpcao() {
		return this.opcao;
	}
}