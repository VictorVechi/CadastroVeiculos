package com.br.view.git;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class MainMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTabbedPane tabbedPane;
	private JPanel home;
	private JPanel registro;
	private JPanel info;
	private JLabel lblDesenvolvimento;
	private JLabel lblApp;
	private JLabel lblBuild;
	private JLabel lblUi;
	private JLabel lblContato;
	private JLabel lblContatoDiscord;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setBackground(Color.BLACK);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 355, 230);
		setLocationRelativeTo(null);
		setTitle("Veículos");
		getContentPane().setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(Color.DARK_GRAY);
		tabbedPane.setBackground(Color.BLACK);
		tabbedPane.setBounds(0, 0, 349, 201);
		getContentPane().add(tabbedPane);
		
		home = new JPanel();
		home.setBackground(Color.WHITE);
		home.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		tabbedPane.addTab("Home", null, home, null);
		home.setLayout(null);
		
		JButton btnCaminhao = new JButton("Caminhão");
		btnCaminhao.setBackground(Color.BLACK);
		btnCaminhao.setForeground(Color.WHITE);
		btnCaminhao.setBounds(124, 76, 100, 23);
		home.add(btnCaminhao);
		btnCaminhao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Botão da página de cadastro para caminhões
				CaminhaoWindow viewCaminhao = new CaminhaoWindow();
				viewCaminhao.setVisible(true);
				dispose();
			}
		});
		btnCaminhao.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnCarro = new JButton("Carro");
		btnCarro.setBackground(Color.BLACK);
		btnCarro.setForeground(Color.WHITE);
		btnCarro.setBounds(124, 42, 100, 23);
		home.add(btnCarro);
		btnCarro.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblSelecioneTipo = new JLabel("Selecione o tipo de veículo");
		lblSelecioneTipo.setForeground(Color.BLACK);
		lblSelecioneTipo.setBounds(92, 11, 175, 20);
		home.add(lblSelecioneTipo);
		lblSelecioneTipo.setFont(new Font("Serif", Font.BOLD, 15));
		lblSelecioneTipo.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnMotocicleta = new JButton("Motocicleta");
		btnMotocicleta.setBackground(Color.BLACK);
		btnMotocicleta.setForeground(Color.WHITE);
		btnMotocicleta.setBounds(124, 110, 100, 23);
		home.add(btnMotocicleta);
		btnMotocicleta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Botão da página de cadastro para motos
				MotocicletaWindow motoView = new MotocicletaWindow();
				motoView.setVisible(true);
				dispose();
			}
		});
		btnMotocicleta.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCarro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Botão da página de cadastro para carros
				CarroWindow viewCarro = new CarroWindow();
				viewCarro.setVisible(true);
				dispose();
			}
		});
		
		registro = new JPanel();
		registro.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		tabbedPane.addTab("Arquivos", null, registro, null);
		registro.setLayout(new GridLayout(1, 0, 0, 0));
		
		lblDesenvolvimento = new JLabel("Área em Desenvolvimento");
		lblDesenvolvimento.setForeground(Color.BLACK);
		lblDesenvolvimento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDesenvolvimento.setHorizontalAlignment(SwingConstants.CENTER);
		registro.add(lblDesenvolvimento);
		
		info = new JPanel();
		info.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		tabbedPane.addTab("Informações", null, info, null);
		info.setLayout(null);
		
		lblApp = new JLabel("Aplicativo em Desenvolvimento");
		lblApp.setBounds(3, 3, 338, 14);
		lblApp.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblApp.setForeground(Color.BLACK);
		lblApp.setHorizontalAlignment(SwingConstants.CENTER);
		info.add(lblApp);
		
		lblBuild = new JLabel("Versão do Build: 1.0");
		lblBuild.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBuild.setBounds(13, 28, 130, 14);
		info.add(lblBuild);
		
		lblUi = new JLabel("Versão da UI: 1.0");
		lblUi.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUi.setBounds(13, 53, 130, 14);
		info.add(lblUi);
		
		lblContato = new JLabel("Contato para feedback: Victorhvechi@gmail.com");
		lblContato.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblContato.setBounds(13, 78, 273, 14);
		info.add(lblContato);
		
		lblContatoDiscord = new JLabel("Contato Discord: ");
		lblContatoDiscord.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblContatoDiscord.setBounds(13, 103, 130, 14);
		info.add(lblContatoDiscord);
		
		lblNewLabel = new JLabel("©Victor Vechi");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(3, 148, 338, 14);
		info.add(lblNewLabel);
	}
}
