package Persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Logica.Usuario;



public class DAOLogin {
	private static final String LOGIN = "SELECT * FROM USUARIO WHERE mail=? AND contraseña=?";
	
	public static Usuario Login(String mail, String clve) {
		
		try {
			PreparedStatement statement = DatabaseManager.getConnection().prepareStatement(LOGIN);
			statement.setString(1,mail);
			statement.setString(2,clve);
			
			
			ResultSet resultado = statement.executeQuery();
			Usuario u = new Usuario();
			while(resultado.next()) {
				
				u.setRol(resultado.getInt("ROL"));
				u.setNombreUsuario(resultado.getString("NombreUsuario"));
			}
			return u;
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	
	
	
	
}
