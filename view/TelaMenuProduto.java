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
		
		//Configura o botão de cadastro de um produto
		this.btnCadastrarProduto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.btnCadastrarProduto.setBounds(112, 38, 405, 47);
		this.frmMenuProduto.getContentPane().add(btnCadastrarProduto);
		
		//Configura o botão de aumento ou diminuição do estoque
		this.btnAumentarOuDiminuirEstoque.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.btnAumentarOuDiminuirEstoque.setBounds(112, 96, 405, 47);
		this.frmMenuProduto.getContentPane().add(btnAumentarOuDiminuirEstoque);
		
		//Configura o botão de edição de informações do produto
		this.btnEditarInformacoesProduto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.btnEditarInformacoesProduto.setBounds(112, 154, 405, 47);
		this.frmMenuProduto.getContentPane().add(btnEditarInformacoesProduto);
		
		//Configura o botão de listagem de dados dos produtos
		this.btnListarDadosProduto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.btnListarDadosProduto.setBounds(112, 212, 405, 47);
		this.frmMenuProduto.getContentPane().add(btnListarDadosProduto);
		
		//Configura o botão de deleção de um produto
		this.btnDeletarUmProduto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.btnDeletarUmProduto.setBounds(112, 270, 405, 47);
		this.frmMenuProduto.getContentPane().add(btnDeletarUmProduto);
		this.frmMenuProduto.setResizable(false);
		
		//Configura o botão voltar
		this.btnVoltar.setBounds(536, 336, 89, 23);
		this.frmMenuProduto.getContentPane().add(btnVoltar);
		
		//Direciona os eventos dos botões
		this.btnCadastrarProduto.addActionListener(this);
		this.btnAumentarOuDiminuirEstoque.addActionListener(this);
		this.btnEditarInformacoesProduto.addActionListener(this);
		this.btnListarDadosProduto.addActionListener(this);
		this.btnDeletarUmProduto.addActionListener(this);
		this.btnVoltar.addActionListener(this);
		
		//Permite que a JFrame fique centralizada e visível
		this.frmMenuProduto.setLocationRelativeTo(null);
		this.frmMenuProduto.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//Declarações
		int opcao;
		
		//Armazena o botão escolhido
		JButton botao = (JButton) e.getSource();
		
		//Inicia os eventos sobre o cadastro de um produto
		if (botao == this.getBtnCadastrarProduto()) {
			opcao = 1;
			new TelaLogin(this.getFrmMenuProduto(), opcao);
		}
		
		//Inicia os eventos sobre o estoque
		if (botao == this.getBtnAumentarOuDiminuirEstoque()) {
			opcao = 2;
			new TelaLogin(this.getFrmMenuProduto(), opcao);
		}
		
		//Inicia os eventos sobre a edição de informações de um produto
		if (botao == this.getBtnEditarInformacoesProduto()) {
			opcao = 3;
			new TelaLogin(this.getFrmMenuProduto(), opcao);
		}
		
		//Inicia os eventos sobre listagem de dados dos produtos
		if (botao == this.getBtnListarDadosProduto()) {
			this.getFrmMenuProduto().dispose();
			new TelaListagem(this.getFrmMenuProduto());
		}
		
		//Inicia os eventos sobre deleção de um produto
		if (botao == this.getBtnDeletarUmProduto()) {
			opcao = 4;
			new TelaLogin(this.getFrmMenuProduto(), opcao);
		}
		
		//Inicia os eventos sobre o botão voltar
		if (botao == this.getBtnVoltar()) {
			this.getFrmMenuProduto().dispose();
			this.getFrmTelaMenuInicial().setVisible(true);
		}
	}
	
	//Métodos acessores
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
