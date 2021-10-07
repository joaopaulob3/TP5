package view;

/**
 * Apresenta a tela de menu do cliente com as op��es de cadastrar um
 * cliente, editar informa��es de um cliente, listar dados dos clientes,
 * deletar um cliente e voltar. Nesse menu, apenas a op��o de cadastrar
 * um cliente est� dispon�vel ao cliente, as outras est�o restritas ao
 * administrador do sistema
 * @author Jo�o Paulo da Silva Freitas
 * @version 1.0
 */

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaMenuCliente implements ActionListener {
	//Atributos
	private JFrame frmMenuCliente = new JFrame("Cliente");
	private JButton btnCadastrarCliente = new JButton("Cadastrar um cliente");
	private JButton btnEditarInformaesDe = new JButton("Editar informa\u00E7\u00F5es de um cliente");
	private JButton btnListarDadosDos = new JButton("Listar dados dos clientes");
	private JButton btnDeletarUmCliente = new JButton("Deletar um cliente");
	private JButton btnVoltar = new JButton("Voltar");
	private JFrame frmTelaMenuInicial;
	
	//Construtor
	public TelaMenuCliente(JFrame telaMenuInicial) {
		//Configura��o da janela MenuCliente
		this.frmTelaMenuInicial = telaMenuInicial;
		this.frmMenuCliente.setBounds(100, 100, 658, 367);
		this.frmMenuCliente.setResizable(false);
		this.frmMenuCliente.getContentPane().setLayout(null);
		this.frmMenuCliente.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frmMenuCliente.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente encerrar o programa?", null,
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		
		//Configura bot�o cadastrar cliente
		this.btnCadastrarCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.btnCadastrarCliente.setBounds(153, 54, 353, 38);
		this.frmMenuCliente.getContentPane().add(btnCadastrarCliente);
		
		//Configura bot�o editar informa��es de um cliente
		this.btnEditarInformaesDe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.btnEditarInformaesDe.setBounds(153, 103, 353, 38);
		this.frmMenuCliente.getContentPane().add(btnEditarInformaesDe);
		
		//Configura bot�o listar dados dos clientes
		this.btnListarDadosDos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.btnListarDadosDos.setBounds(153, 152, 353, 38);
		this.frmMenuCliente.getContentPane().add(btnListarDadosDos);
		
		//Configura bot�o deletar um cliente
		this.btnDeletarUmCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.btnDeletarUmCliente.setBounds(153, 201, 353, 38);
		this.frmMenuCliente.getContentPane().add(btnDeletarUmCliente);
		
		//Configura bot�o voltar
		this.btnVoltar.setBounds(503, 291, 120, 27);
		this.frmMenuCliente.getContentPane().add(btnVoltar);
		
		//Direciona os eventos dos bot�es
		this.getBtnCadastrarCliente().addActionListener(this);
		this.getBtnEditarInformaesCliente().addActionListener(this);
		this.getBtnListarDadosClientes().addActionListener(this);
		this.getBtnDeletarUmCliente().addActionListener(this);
		this.getBtnVoltar().addActionListener(this);

		//Permite que a JFrame fique centralizada e vis�vel
		this.frmMenuCliente.setLocationRelativeTo(null);
		this.frmMenuCliente.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Armazena o bot�o escolhido
		JButton botao = (JButton) e.getSource();
		
		//Inicia os eventos sobre o bot�o cadastrar um cliente
		if (botao == this.getBtnCadastrarCliente()) {
			this.getFrmMenuCliente().dispose();
			new TelaCadastroCliente(this.getFrmMenuCliente());
		}
		
		//Inicia os eventos sobre o bot�o editar informa��es de um cliente
		if (botao == this.getBtnEditarInformaesCliente()) {
			new TelaLogin(this.getFrmMenuCliente(), 5);
		}
		
		//Inicia os eventos sobre o bot�o listar dados dos clientes
		if (botao == this.getBtnListarDadosClientes()) {
			new TelaLogin(this.getFrmMenuCliente(), 6);
		}
		
		//Inicia os eventos sobre o bot�o deletar um cliente
		if (botao == this.getBtnDeletarUmCliente()) {
			new TelaLogin(this.getFrmMenuCliente(), 7);
		}
		
		//Inicia os eventos sobre o bot�o voltar
		if (botao == this.getBtnVoltar()) {
			this.getFrmMenuCliente().dispose();
			this.getFrmTelaMenuInicial().setVisible(true);
		}
	}

	//M�todos acessor
	public JFrame getFrmMenuCliente() {
		return this.frmMenuCliente;
	}

	public JButton getBtnCadastrarCliente() {
		return this.btnCadastrarCliente;
	}

	public JButton getBtnEditarInformaesCliente() {
		return this.btnEditarInformaesDe;
	}

	public JButton getBtnListarDadosClientes() {
		return this.btnListarDadosDos;
	}

	public JButton getBtnDeletarUmCliente() {
		return this.btnDeletarUmCliente;
	}

	public JButton getBtnVoltar() {
		return this.btnVoltar;
	}

	public JFrame getFrmTelaMenuInicial() {
		return this.frmTelaMenuInicial;
	}
}
