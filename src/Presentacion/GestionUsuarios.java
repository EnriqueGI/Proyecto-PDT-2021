package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;

public class GestionUsuarios extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionUsuarios frame = new GestionUsuarios();
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
	public GestionUsuarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblNewLabel.setBounds(80, 59, 79, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblApellido.setBounds(80, 92, 79, 14);
		contentPane.add(lblApellido);
		
		JLabel lblMail = new JLabel("Mail");
		lblMail.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblMail.setBounds(80, 132, 49, 14);
		contentPane.add(lblMail);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblContrasea.setBounds(80, 173, 79, 14);
		contentPane.add(lblContrasea);
		
		JComboBox comboBoxRol = new JComboBox();
		comboBoxRol.setBounds(169, 201, 131, 22);
		contentPane.add(comboBoxRol);
		
		JLabel lblRol = new JLabel("Rol");
		lblRol.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblRol.setBounds(80, 205, 65, 14);
		contentPane.add(lblRol);
		
		JTextArea textNombre = new JTextArea();
		textNombre.setBounds(169, 54, 131, 22);
		contentPane.add(textNombre);
		
		JTextArea textApellido = new JTextArea();
		textApellido.setBounds(169, 87, 131, 22);
		contentPane.add(textApellido);
		
		JTextArea textMail = new JTextArea();
		textMail.setBounds(169, 127, 131, 22);
		contentPane.add(textMail);
		
		JTextArea textContraseña = new JTextArea();
		textContraseña.setBounds(169, 168, 131, 22);
		contentPane.add(textContraseña);
		
		JButton btnCargar = new JButton("Cargar");
		btnCargar.setBounds(385, 52, 89, 30);
		contentPane.add(btnCargar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(385, 92, 89, 30);
		contentPane.add(btnBuscar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(385, 132, 89, 30);
		contentPane.add(btnEliminar);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(385, 173, 89, 30);
		contentPane.add(btnActualizar);
	}
}
