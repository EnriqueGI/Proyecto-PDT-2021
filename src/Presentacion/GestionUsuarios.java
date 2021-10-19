package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Aficionado;
import Persistencia.DAOAficionado;
import Persistencia.DAOUsuario;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Panel;

public class GestionUsuarios extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBoxRol;
	private JTextArea textOcupacion;
	private JLabel lblOcupacion;
	private JButton btnCiudad;
	private JTextArea textTelefono ;
	private JTextArea textDomicilio ;
	private JTextArea textDocumento ;
	private JLabel lblCiudad;
	
	private JLabel lblTelefono;
	private JLabel lblDomicilio;
	private JLabel lblDocumento; 
	
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
		
		comboBoxRol = new JComboBox();
		comboBoxRol.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				if(comboBoxRol.getSelectedItem().toString() =="Aficionado") {
					textOcupacion.setVisible(true);
					lblOcupacion.setVisible(true);
				
					   
					   textDomicilio.setVisible(false);
					   lblDomicilio.setVisible(false);
					   lblTelefono.setVisible(false);
					   textTelefono.setVisible(false);
					   btnCiudad.setVisible(false);
					   lblCiudad.setVisible(false);
					textDocumento.setVisible(false);

					
					
				}else if(comboBoxRol.getSelectedItem().toString() =="Administrador" || comboBoxRol.getSelectedItem().toString() =="Investigador"  ) {
						
					lblOcupacion.setVisible(true);
					   textOcupacion.setVisible(true);
					   textOcupacion.setVisible(true);
					   textDomicilio.setVisible(true);
					   lblDomicilio.setVisible(true);
					   lblTelefono.setVisible(true);
					   textTelefono.setVisible(true);
					   btnCiudad.setVisible(true);
					   lblCiudad.setVisible(true);
					textDocumento.setVisible(true);

					
					
					}
				else {
					textOcupacion.setVisible(false);
					lblOcupacion.setVisible(false);
				}
					
				
				
				
				
			}
		});
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
		btnCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBoxRol.getSelectedItem().toString() =="Aficionado") {
					
					Aficionado a = new Aficionado();
					a.setNombre(textNombre.getText());
					a.setApellido(textApellido.getText());
					a.setMail(textMail.getText());
					a.setContraseña(textContraseña.getText());
					a.setRol(1);
					a.setOcupacion(textOcupacion.getText());
					DAOUsuario.Cargargar(a);
					DAOAficionado.Cargargar(a);
				}
				
				
				
			}
		});
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
		
		JPanel panelAficionado = new JPanel();
		panelAficionado.setBounds(64, 247, 455, 171);
		contentPane.add(panelAficionado);
		panelAficionado.setLayout(null);
		
	    lblDocumento = new JLabel("Documento");
		lblDocumento.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		lblDocumento.setBounds(10, 29, 93, 14);
		panelAficionado.add(lblDocumento);
		lblDocumento.setVisible(false);
		
	textDocumento = new JTextArea();
		textDocumento.setBounds(103, 25, 131, 18);
		panelAficionado.add(textDocumento);
		
		textOcupacion = new JTextArea();
		textOcupacion.setBounds(103, 25, 131, 22);
		panelAficionado.add(textOcupacion);
		
		
		 textDomicilio = new JTextArea();
		 textDomicilio.setBounds(103, 58, 131, 18);
		 panelAficionado.add(textDomicilio);
		 
		 textTelefono = new JTextArea();
		 textTelefono.setBounds(103, 83, 131, 18);
		 panelAficionado.add(textTelefono);
		 
		 btnCiudad = new JButton("Ciudad");
		 btnCiudad.setBounds(103, 112, 131, 23);
		 panelAficionado.add(btnCiudad);
		 
		  lblCiudad = new JLabel("Ciudad");
		  lblCiudad.setBounds(10, 111, 93, 14);
		  panelAficionado.add(lblCiudad);
		  lblCiudad.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		  
		  lblTelefono = new JLabel("Tel\u00E9fono");
		  lblTelefono.setBounds(10, 83, 93, 14);
		  panelAficionado.add(lblTelefono);
		  lblTelefono.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		  
		   lblDomicilio = new JLabel("Domicilio");
		   lblDomicilio.setBounds(10, 58, 93, 14);
		   panelAficionado.add(lblDomicilio);
		   lblDomicilio.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		   
		   lblOcupacion = new JLabel("Ocupaci\u00F3n");
		   lblOcupacion.setBounds(10, 29, 79, 14);
		   panelAficionado.add(lblOcupacion);
		   lblOcupacion.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		   lblOcupacion.setVisible(false);
		   
		   lblDomicilio.setVisible(false);
		  lblTelefono.setVisible(false);
		  lblCiudad.setVisible(false);
		 btnCiudad.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 	}
		 });
		 btnCiudad.setVisible(false);
		 textTelefono.setVisible(false);
		 textDomicilio.setVisible(false);
		textOcupacion.setVisible(false);
		textOcupacion.setVisible(false);
		textDocumento.setVisible(false);

	    
	}
	public void cargarCombo() {
		
		comboBoxRol.addItem("Administrador");
		comboBoxRol.addItem("Investigador");
		comboBoxRol.addItem("Aficionado");
		
	}
}
