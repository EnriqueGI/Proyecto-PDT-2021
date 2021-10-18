package Presentacion;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;

public class FormAdministrador extends JFrame {

	private JPanel contentPane;
	public JLabel lebAdmin; 
	public JLabel labelNombreAdmin; 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormAdministrador frame = new FormAdministrador();
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
	public FormAdministrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lebAdmin = new JLabel("Administrador: ");
		lebAdmin.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		lebAdmin.setBounds(58, 35, 118, 31);
		contentPane.add(lebAdmin);
		
		labelNombreAdmin = new JLabel("...");
		labelNombreAdmin.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 16));
		labelNombreAdmin.setBounds(192, 43, 318, 14);
		contentPane.add(labelNombreAdmin);
		
		JButton btnNewButton = new JButton("Gesti\u00F3n de Usuarios");
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButton.setBounds(24, 112, 198, 145);
		contentPane.add(btnNewButton);
	}
}
