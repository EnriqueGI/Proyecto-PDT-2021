package Presentacion;


import java.awt.EventQueue;

import Logica.Usuario;
import Persistencia.DAOLogin;




public class Principal {

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
		
		//  Login
		
		public static Usuario Login(String mail, String clave) {
			return DAOLogin.Login(mail, clave);
		}
		

	}


