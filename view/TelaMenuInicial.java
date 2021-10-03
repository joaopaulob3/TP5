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

import model.CarregamentoInicialDeDadosAleatorios;

public class TelaMenuInicial implements ActionListener {
	//Atributos
	private JFrame frmMenuInicial = new JFrame("Menu Inicial");
	private JLabel lblTituloInicial = new JLabel("Loja de Perfumes");
	private JButton btnProduto = new JButton("Produto");
	private JButton btnCliente = new JButton("Cliente");
	private JButton btnCompra = new JButton("Compra");
	
	//Constutor iniciando a montagem dos componentes gráficos da tela inicial
	public TelaMenuInicial() {
		//Configura os componentes da JFrame do Menu Inicial
		this.frmMenuInicial.setBounds(100, 100, 698, 449);
		this.frmMenuInicial.getContentPane().setLayout(null);
		this.frmMenuInicial.setResizable(false);
		this.frmMenuInicial.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frmMenuInicial.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente encerrar o programa?", null,
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});

		//Configura o Label titulo
		this.lblTituloInicial.setFont(new Font("Tahoma", Font.BOLD, 20));
		this.lblTituloInicial.setBounds(255, 24, 192, 59);
		this.frmMenuInicial.getContentPane().add(lblTituloInicial);

		//Configura o Botão Produto
		this.btnProduto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.btnProduto.setBounds(200, 120, 274, 47);
		this.frmMenuInicial.getContentPane().add(btnProduto);

		//Configura o Botão Cliente
		this.btnCliente.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.btnCliente.setBounds(200, 193, 274, 47);
		this.frmMenuInicial.getContentPane().add(btnCliente);

		//Configura o Botão Compra
		this.btnCompra.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.btnCompra.setBounds(201, 262, 274, 47);
		this.frmMenuInicial.getContentPane().add(btnCompra);

		//Permite que a JFrame fique centralizada e visível
		this.frmMenuInicial.setLocationRelativeTo(null);
		this.frmMenuInicial.setVisible(true);
	}

	//Tema-estilo do Netbeans
	public static void alterarEstiloGUI() {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
			System.err.println(ex);
		}
	}
	
	public static void main(String[] args) {
		//O LOGIN DO SISTEMA É:
		//login
		//login
		
		//Altera o estilo da GUI
		alterarEstiloGUI();

		//Inicia a aplicação através do Construtor
		TelaMenuInicial menu = new TelaMenuInicial();

		//Carrega os dados aleatórios no sistema
		CarregamentoInicialDeDadosAleatorios.carregamentoInicial();
		
		//Direciona os eventos dos botões
		menu.getBtnProduto().addActionListener(menu);
		menu.getBtnCliente().addActionListener(menu);
		menu.getBtnCompra().addActionListener(menu);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Armazena o botão escolhido
		JButton botao = (JButton) e.getSource();
		
		//Oculta o menu inical
		this.getFrmMenuInicial().dispose();
		
		//Inicia os eventos sobre o botão de Produto
		if (botao == this.getBtnProduto()) {
			new TelaMenuProduto(this.getFrmMenuInicial());
		}
		
		
		//Inicia os eventos sobre o botão Cliente
		if (botao == this.getBtnCliente()) {
			new TelaMenuCliente(this.getFrmMenuInicial());
		}
		
		//Inicia os eventos sobre o botão Compra
		if (botao == this.getBtnCompra()) {
			
		}
	}
	
	//Métodos acessores
	public JFrame getFrmMenuInicial() {
		return this.frmMenuInicial;
	}
	public JLabel getLblTituloInicial() {
		return this.lblTituloInicial;
	}
	public JButton getBtnProduto() {
		return this.btnProduto;
	}
	public JButton getBtnCliente() {
		return this.btnCliente;
	}
	public JButton getBtnCompra() {
		return this.btnCompra;
	}
}