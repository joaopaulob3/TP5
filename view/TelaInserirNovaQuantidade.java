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

import model.*;

public class TelaInserirNovaQuantidade implements ActionListener {
	//Atributos
	private JFrame frmQuantidade = new JFrame("Dados");
	private JLabel lblTitulo = new JLabel("Informe a nova quantidade:");
	private JTextField txtCampoResposta = new JTextField();
	private JButton btnCadastrar = new JButton("Cadastrar");
	private JButton btnCancelar = new JButton("Cancelar");
	private Produto produto;
	private int opcao;
	private JFrame frmAlteracaoEstoque;
	private JFrame telaListagem;
	
	//Construtor
	public TelaInserirNovaQuantidade(Produto produto, int opcao, JFrame frmAlteracaoEstoque, JFrame telaListagem) {
		this.produto = produto;
		this.opcao = opcao;
		this.frmAlteracaoEstoque = frmAlteracaoEstoque;
		this.telaListagem = telaListagem;
		this.frmQuantidade.setBounds(100, 100, 427, 265);
		this.frmQuantidade.setResizable(false);
		this.frmQuantidade.getContentPane().setLayout(null);
		this.frmQuantidade.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frmQuantidade.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente encerrar o programa?", null,
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (resposta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
	
		this.lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		this.lblTitulo.setBounds(44, 58, 202, 30);
		this.frmQuantidade.getContentPane().add(lblTitulo);
		
		this.txtCampoResposta.setBounds(44, 99, 336, 30);
		this.frmQuantidade.getContentPane().add(txtCampoResposta);
		this.txtCampoResposta.setColumns(10);
	
		this.btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.btnCadastrar.setBounds(44, 144, 142, 35);
		this.frmQuantidade.getContentPane().add(btnCadastrar);
		
		this.btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		this.btnCancelar.setBounds(238, 144, 142, 35);
		this.frmQuantidade.getContentPane().add(btnCancelar);
		
		this.getBtnCadastrar().addActionListener(this);
		this.getBtnCancelar().addActionListener(this);
		
		this.frmQuantidade.setLocationRelativeTo(null);
		this.frmQuantidade.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Armazena o botão escolhido
		JButton botao = (JButton) e.getSource();
		
		//Oculta a janela
		this.getFrmQuantidade().dispose();
		
		//Inicia os eventos sobre o botão cadastrar
		if (botao == this.getBtnCadastrar()) {
			
			//Armazena o número digitado pelo usuário já convertido
			int quantidade = Integer.valueOf(this.getTxtCampoResposta().getText()).intValue();
			
			switch (this.getOpcao()) {
			//Altera a quantidade de perfume
			case 1:
				Perfumaria perfume = (Perfumaria) this.getProduto();
				perfume.setQuantidadeProduto(quantidade);
				JOptionPane.showMessageDialog(null, "Quantidade alterada com sucesso!", "", JOptionPane.INFORMATION_MESSAGE);
				break;
			//Altera a quantidade de hidratante
			case 2:
				Hidratante hidratante = (Hidratante) this.getProduto();
				hidratante.setQuantidadeProduto(quantidade);
				JOptionPane.showMessageDialog(null, "Quantidade alterada com sucesso!", "", JOptionPane.INFORMATION_MESSAGE);
				break;
			//Altera a quantidade de protetor solar
			case 3:
				ProtetorSolar protetor = (ProtetorSolar) this.getProduto();
				protetor.setQuantidadeProduto(quantidade);
				JOptionPane.showMessageDialog(null, "Quantidade alterada com sucesso!", "", JOptionPane.INFORMATION_MESSAGE);
				break;
			//Altera a quantidade de shampoo
			case 4:
				Shampoo shampoo = (Shampoo) this.getProduto();
				shampoo.setQuantidadeProduto(quantidade);
				JOptionPane.showMessageDialog(null, "Quantidade alterada com sucesso!", "", JOptionPane.INFORMATION_MESSAGE);
				break;
			//Altera a quantidade de condicionador
			case 5:
				Condicionador condicionador = (Condicionador) this.getProduto();
				condicionador.setQuantidadeProduto(quantidade);
				JOptionPane.showMessageDialog(null, "Quantidade alterada com sucesso!", "", JOptionPane.INFORMATION_MESSAGE);
				break;
			//Altera a quantidade de sabonete líquido
			case 6:
				SaboneteLiquido sabonete = (SaboneteLiquido) this.getProduto();
				sabonete.setQuantidadeProduto(quantidade);
				JOptionPane.showMessageDialog(null, "Quantidade alterada com sucesso!", "", JOptionPane.INFORMATION_MESSAGE);
				break;
			}

			this.getTelaListagem().dispose();
			this.getFrmAlteracaoEstoque().setLocationRelativeTo(null);
			this.getFrmAlteracaoEstoque().setVisible(true);
		}
	
		
		//Inicia os eventos sobre o botão cancelar
		if (botao == this.getBtnCancelar()) {
			this.getTelaListagem().dispose();
			this.getFrmAlteracaoEstoque().setLocationRelativeTo(null);
			this.getFrmAlteracaoEstoque().setVisible(true);
		}
		
	}

	public JFrame getFrmQuantidade() {
		return this.frmQuantidade;
	}

	public JLabel getLblTitulo() {
		return this.lblTitulo;
	}

	public JTextField getTxtCampoResposta() {
		return this.txtCampoResposta;
	}

	public JButton getBtnCadastrar() {
		return this.btnCadastrar;
	}

	public JButton getBtnCancelar() {
		return this.btnCancelar;
	}
	
	public Produto getProduto() {
		return this.produto;
	}
	
	public int getOpcao() {
		return this.opcao;
	}
	
	public JFrame getFrmAlteracaoEstoque() {
		return this.frmAlteracaoEstoque;
	}
	
	public JFrame getTelaListagem() {
		return this.telaListagem;
	}
}
