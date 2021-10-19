package Presentacion;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Usuario;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.SystemColor;

public class Login extends JFrame {

	private JPanel contentPane;
	JTextArea textCorreo;
	JLabel labelEstado;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setBackground(SystemColor.textInactiveText);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 733, 540);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.textInactiveText);
		contentPane.setBackground(SystemColor.textInactiveText);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//LOGIN
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.setForeground(SystemColor.window);
		btnNewButton.setBackground(SystemColor.menuText);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				labelEstado.setText("");
				Usuario u = Principal.Login(textCorreo.getText(),passwordField.getText());
				if(u.getRol()== 1) {
					
					
					labelEstado.setText("Usuario correcto");
						
                       FormAdministrador Fa = new FormAdministrador();
				
                    Fa.setVisible(true);
                	Fa.labelNombreAdmin.setText(u.getNombre());
					setVisible(false);
					
				
				}else if(u.getRol()== 2) {
					labelEstado.setText("Usuario correcto");
					FormInvestigador Fi = new FormInvestigador();
						
	                    Fi.setVisible(true);
						setVisible(false);
						
				}else if(u.getRol()== 3) {
					labelEstado.setText("Usuario correcto");
					FormAficionado Faf = new FormAficionado();
						
					Faf.setVisible(true);
						setVisible(false);
						
					
					
				}else {
					labelEstado.setText("Usuario o contraseña incorrecto");
					
				}
	
				
				
				
			}
		});
		btnNewButton.setBounds(266, 315, 153, 48);
		contentPane.add(btnNewButton);
		
        textCorreo = new JTextArea();
        textCorreo.setText("enrique@gmail.com");
        textCorreo.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textCorreo.setBounds(266, 133, 148, 29);
		contentPane.add(textCorreo);
		
		JLabel lblNewLabel = new JLabel("Correo");
		lblNewLabel.setForeground(SystemColor.inactiveCaptionBorder);
		lblNewLabel.setBackground(SystemColor.inactiveCaptionBorder);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(266, 108, 49, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setForeground(SystemColor.inactiveCaptionBorder);
		lblContrasea.setBackground(SystemColor.inactiveCaptionBorder);
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContrasea.setBounds(266, 198, 85, 14);
		contentPane.add(lblContrasea);
		
		JLabel lblBienvenido = new JLabel("Bienvenido");
		lblBienvenido.setForeground(SystemColor.inactiveCaptionBorder);
		lblBienvenido.setBackground(SystemColor.inactiveCaptionBorder);
		lblBienvenido.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 50));
		lblBienvenido.setBounds(228, 33, 374, 40);
		contentPane.add(lblBienvenido);
		
		labelEstado = new JLabel("...");
		labelEstado.setForeground(SystemColor.inactiveCaptionBorder);
		labelEstado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelEstado.setBounds(281, 263, 290, 14);
		contentPane.add(labelEstado);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(266, 223, 153, 29);
		contentPane.add(passwordField);
	}
}
