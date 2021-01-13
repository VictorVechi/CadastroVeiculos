package com.br.view.git;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private JPanel painelInicio;
	private JPanel painelArquivos;
	private JPanel painelInfo;
	private JLabel lblTitulo;
	private JLabel lblinfo;
	private JLabel lblinfo2;
	private JLabel lblinfo3;
	private JButton btnCarro;
	private JButton btnCaminhao;
	private JButton btnMoto;

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
		setTitle("Veículos");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 240);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 354, 211);
		contentPane.add(tabbedPane);
		
		painelInicio = new JPanel();
		tabbedPane.addTab("Início", null, painelInicio, null);
		painelInicio.setLayout(null);
		
		lblTitulo = new JLabel("Selecione o tipo de veículo");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 11, 349, 14);
		painelInicio.add(lblTitulo);
		
		lblinfo = new JLabel("Veículos cadastrados estarão");
		lblinfo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblinfo.setBounds(159, 44, 180, 14);
		painelInicio.add(lblinfo);
		
		lblinfo2 = new JLabel("disponíveis para visualização");
		lblinfo2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblinfo2.setBounds(159, 79, 164, 14);
		painelInicio.add(lblinfo2);
		
		lblinfo3 = new JLabel("na aba \"Arquivos\"");
		lblinfo3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblinfo3.setBounds(159, 115, 164, 14);
		painelInicio.add(lblinfo3);
		
		btnCarro = new JButton("Carro");
		btnCarro.addActionListener(this);
		btnCarro.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCarro.setBounds(10, 40, 99, 23);
		painelInicio.add(btnCarro);
		
		btnCaminhao = new JButton("Caminhão");
		btnCaminhao.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCaminhao.setBounds(10, 75, 99, 23);
		painelInicio.add(btnCaminhao);
		
		btnMoto = new JButton("Motocicleta");
		btnMoto.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMoto.setBounds(10, 111, 99, 23);
		painelInicio.add(btnMoto);
		
		painelArquivos = new JPanel();
		tabbedPane.addTab("Arquivos", null, painelArquivos, null);
		painelArquivos.setLayout(null);
		
		painelInfo = new JPanel();
		tabbedPane.addTab("Informações", null, painelInfo, null);
		painelInfo.setLayout(null);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCarro) {
			do_btnCarro_actionPerformed(e);
		}
	}
	protected void do_btnCarro_actionPerformed(ActionEvent e) {
		CarroWindow carro = new CarroWindow();
		carro.setVisible(true);
		dispose();
	}
}
