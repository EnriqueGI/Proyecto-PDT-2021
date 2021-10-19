package Persistencia;

import java.sql.PreparedStatement;
import java.sql.SQLException;



import Logica.Usuario;

public class DAOUsuario {
	private static final String INSERT_USUARIO= "INSERT INTO USUARIO"
			+ "(NOMBRE,APELLIDO,MAIL,CONTRASEÑA,ROL) "
			+ "VALUES(?,?,?,?,?)";
	
	public static boolean Cargargar(Usuario datos) {
		
		try {
			PreparedStatement statement = DatabaseManager.getConnection().prepareStatement(INSERT_USUARIO);
			
			statement.setString(1, datos.getNombre());
			statement.setString(2, datos.getApellido());
			statement.setString(3, datos.getMail());
			statement.setString(4, datos.getContraseña());
			statement.setInt(5, datos.getRol());
			
			
			

			int filasIngresadas = statement.executeUpdate();

			System.out.println("Se insentaron: " + filasIngresadas + " filas");
			return filasIngresadas >0;
			
			
			
		} catch (SQLException e) {
		
			e.printStackTrace();
			return false;
		}
	}
	
	
	
}
