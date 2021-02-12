package com.br.view.git;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import com.br.classes.git.Motocicleta;

public class MotocicletaWindow extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtMarca;
	private JTextField txtModelo;
	private JTextField txtAnoFab;
	private JTextField txtChassi;
	private JTextField txtPlaca;
	private JTextField txtEixo;
	private JTextField txtCilindrada;
	private JButton btnLimpar;
	private final JPanel painelContorno = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MotocicletaWindow frame = new MotocicletaWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MotocicletaWindow() {
		setBackground(Color.WHITE);
		setResizable(false);
		setTitle("Motocicleta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 280);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setForeground(Color.BLACK);
		lblMarca.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMarca.setBounds(10, 11, 54, 14);
		contentPane.add(lblMarca);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(135, 8, 173, 20);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setForeground(Color.BLACK);
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblModelo.setBounds(10, 37, 46, 14);
		contentPane.add(lblModelo);
		
		txtModelo = new JTextField();
		txtModelo.setBounds(135, 34, 173, 20);
		contentPane.add(txtModelo);
		txtModelo.setColumns(10);
		
		JLabel lblAnoFab = new JLabel("Ano de Fabricação:");
		lblAnoFab.setForeground(Color.BLACK);
		lblAnoFab.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAnoFab.setBounds(10, 62, 115, 14);
		contentPane.add(lblAnoFab);
		
		txtAnoFab = new JTextField();
		txtAnoFab.setBounds(135, 59, 173, 20);
		contentPane.add(txtAnoFab);
		txtAnoFab.setColumns(10);
		
		JLabel lblChassi = new JLabel("Chassi:");
		lblChassi.setForeground(Color.BLACK);
		lblChassi.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblChassi.setBounds(10, 87, 46, 14);
		contentPane.add(lblChassi);
		
		txtChassi = new JTextField();
		txtChassi.setBounds(135, 84, 173, 20);
		contentPane.add(txtChassi);
		txtChassi.setColumns(10);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setForeground(Color.BLACK);
		lblPlaca.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPlaca.setBounds(10, 112, 46, 14);
		contentPane.add(lblPlaca);
		
		txtPlaca = new JTextField();
		txtPlaca.setBounds(135, 109, 173, 20);
		contentPane.add(txtPlaca);
		txtPlaca.setColumns(10);
		
		JLabel lblEixo = new JLabel("Nº de Eixos:");
		lblEixo.setForeground(Color.BLACK);
		lblEixo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEixo.setBounds(10, 137, 69, 14);
		contentPane.add(lblEixo);
		
		txtEixo = new JTextField();
		txtEixo.setBounds(135, 134, 173, 20);
		contentPane.add(txtEixo);
		txtEixo.setColumns(10);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(Color.BLACK);
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Botão de voltar para o menu
				MainMenu menu = new MainMenu();
				menu.setVisible(true);
				dispose();
			}
		});
		
		JLabel lblCilindrada = new JLabel("Cilindrada:");
		lblCilindrada.setForeground(Color.BLACK);
		lblCilindrada.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCilindrada.setBounds(10, 162, 69, 14);
		contentPane.add(lblCilindrada);
		
		txtCilindrada = new JTextField();
		txtCilindrada.setBounds(135, 159, 173, 20);
		contentPane.add(txtCilindrada);
		txtCilindrada.setColumns(10);
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnVoltar.setBounds(245, 204, 100, 23);
		contentPane.add(btnVoltar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setForeground(Color.WHITE);
		btnSalvar.setBackground(Color.GREEN);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Botão de salvar
				Motocicleta moto = new Motocicleta();
				JOptionPane.showMessageDialog(null, "Dados Salvos com sucesso");
				moto.setAnoFab(Integer.parseInt(txtAnoFab.getText()));
				moto.setEixo(Integer.parseInt(txtEixo.getText()));
				moto.setChassi(txtChassi.getText());
				moto.setMarca(txtMarca.getText());
				moto.setModelo(txtModelo.getText());
				moto.setPlaca(txtPlaca.getText());
				moto.setPotencia(txtCilindrada.getText());
			}
		});
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSalvar.setBounds(22, 204, 100, 23);
		contentPane.add(btnSalvar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(this);
		btnLimpar.setBackground(Color.RED);
		btnLimpar.setForeground(Color.WHITE);
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLimpar.setBounds(135, 204, 100, 23);
		contentPane.add(btnLimpar);
		painelContorno.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		painelContorno.setBounds(0, 0, 364, 251);
		contentPane.add(painelContorno);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnLimpar) {
			do_btnLimpar_actionPerformed(e);
		}
	}
	protected void do_btnLimpar_actionPerformed(ActionEvent e) {
		//Botão de limpar texto
		txtAnoFab.setText(" ");
		txtChassi.setText(" ");
		txtCilindrada.setText(" ");
		txtEixo.setText(" ");
		txtMarca.setText(" ");
		txtModelo.setText(" ");
		txtPlaca.setText(" ");
	}
}
