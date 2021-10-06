package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaMenuProduto implements ActionListener {
	//Atributos
	private JFrame frmMenuProduto = new JFrame("Produto");
	private JButton btnCadastrarProduto = new JButton("Cadastrar um produto");
	private JButton btnAumentarOuDiminuirEstoque = new JButton("Aumentar ou diminuir estoque de um produto");
	private JButton btnEditarInformacoesProduto = new JButton("Editar informa\u00E7\u00F5es de um produto");
	private JButton btnListarDadosProduto = new JButton("Listar dados dos produtos");
	private JButton btnDeletarUmProduto = new JButton("Deletar um produto");
	private JButton btnVoltar = new JButton("Voltar");
	private JFrame frmTelaMenuInicial;
	
	//Construtor
	public TelaMenuProduto(JFrame telaMenuInicial) {
		//Configura os componentes da JFrame da tela Produto
		this.frmTelaMenuInicial = telaMenuInicial;
		this.frmMenuProduto.setBounds(100, 100, 651, 409);
		this.frmMenuProduto.getContentPane().setLayout(null);
		this.frmMenuProduto.setResizable(false);
		this.frmMenuProduto.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frmMenuProduto.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente encerrar o programa?", null,
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		
		//Configura o bot�o de cadastro de um produto
		this.btnCadastrarProduto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.btnCadastrarProduto.setBounds(112, 38, 405, 47);
		this.frmMenuProduto.getContentPane().add(btnCadastrarProduto);
		
		//Configura o bot�o de aumento ou diminui��o do estoque
		this.btnAumentarOuDiminuirEstoque.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.btnAumentarOuDiminuirEstoque.setBounds(112, 96, 405, 47);
		this.frmMenuProduto.getContentPane().add(btnAumentarOuDiminuirEstoque);
		
		//Configura o bot�o de edi��o de informa��es do produto
		this.btnEditarInformacoesProduto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.btnEditarInformacoesProduto.setBounds(112, 154, 405, 47);
		this.frmMenuProduto.getContentPane().add(btnEditarInformacoesProduto);
		
		//Configura o bot�o de listagem de dados dos produtos
		this.btnListarDadosProduto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.btnListarDadosProduto.setBounds(112, 212, 405, 47);
		this.frmMenuProduto.getContentPane().add(btnListarDadosProduto);
		
		//Configura o bot�o de dele��o de um produto
		this.btnDeletarUmProduto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.btnDeletarUmProduto.setBounds(112, 270, 405, 47);
		this.frmMenuProduto.getContentPane().add(btnDeletarUmProduto);
		this.frmMenuProduto.setResizable(false);
		
		//Configura o bot�o voltar
		this.btnVoltar.setBounds(536, 336, 89, 23);
		this.frmMenuProduto.getContentPane().add(btnVoltar);
		
		//Direciona os eventos dos bot�es
		this.btnCadastrarProduto.addActionListener(this);
		this.btnAumentarOuDiminuirEstoque.addActionListener(this);
		this.btnEditarInformacoesProduto.addActionListener(this);
		this.btnListarDadosProduto.addActionListener(this);
		this.btnDeletarUmProduto.addActionListener(this);
		this.btnVoltar.addActionListener(this);
		
		//Permite que a JFrame fique centralizada e vis�vel
		this.frmMenuProduto.setLocationRelativeTo(null);
		this.frmMenuProduto.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//Declara��es 
		int opcao;
		
		//Armazena o bot�o escolhido
		JButton botao = (JButton) e.getSource();
		
		//Inicia os eventos sobre o cadastro de um produto
		//Apenas o administrador do sistema pode cadastrar um produto
		if (botao == this.getBtnCadastrarProduto()) {
			opcao = 1;
			new TelaLogin(this.getFrmMenuProduto(), opcao);
		}
		
		//Inicia os eventos sobre o estoque
		//Apenas o administrador do sistema pode alterar o estoque de um produto
		if (botao == this.getBtnAumentarOuDiminuirEstoque()) {
			opcao = 2;
			new TelaLogin(this.getFrmMenuProduto(), opcao);
		}
		
		//Inicia os eventos sobre a edi��o de informa��es de um produto
		//Apenas o administrador do sistema editar informa��es de um produto
		if (botao == this.getBtnEditarInformacoesProduto()) {
			opcao = 3;
			new TelaLogin(this.getFrmMenuProduto(), opcao);
		}
		
		//Inicia os eventos sobre listagem de dados dos produtos
		if (botao == this.getBtnListarDadosProduto()) {
			this.getFrmMenuProduto().dispose();
			new TelaListagem(this.getFrmMenuProduto());
		}
		
		//Inicia os eventos sobre dele��o de um produto
		//Apenas o administrador do sistema pode deletar um produto
		if (botao == this.getBtnDeletarUmProduto()) {
			opcao = 4;
			new TelaLogin(this.getFrmMenuProduto(), opcao);
		}
		
		//Inicia os eventos sobre o bot�o voltar
		if (botao == this.getBtnVoltar()) {
			this.getFrmMenuProduto().dispose();
			this.getFrmTelaMenuInicial().setVisible(true);
		}
	}
	
	//M�todos acessores
	public JFrame getFrmMenuProduto() {
		return this.frmMenuProduto;
	}
	public JButton getBtnCadastrarProduto() {
		return this.btnCadastrarProduto;
	}
	public JButton getBtnAumentarOuDiminuirEstoque() {
		return this.btnAumentarOuDiminuirEstoque;
	}
	public JButton getBtnEditarInformacoesProduto() {
		return this.btnEditarInformacoesProduto;
	}
	public JButton getBtnListarDadosProduto() {
		return this.btnListarDadosProduto;
	}
	public JButton getBtnDeletarUmProduto() {
		return this.btnDeletarUmProduto;
	}
	public JButton getBtnVoltar() {
		return this.btnVoltar;
	}
	public JFrame getFrmTelaMenuInicial() {
		return this.frmTelaMenuInicial;
	}

}
