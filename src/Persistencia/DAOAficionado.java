package Persistencia;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import Logica.Aficionado;

public class DAOAficionado {
	private static final String INSERT_AFICIONADO= "INSERT INTO AFICIONADO"
			+ "(MAIL,OCUPACION) "
			+ "VALUES(?,?)";
	
	public static boolean Cargargar(Aficionado datos) {
		
		try {
			PreparedStatement statement = DatabaseManager.getConnection().prepareStatement(INSERT_AFICIONADO);
			
			statement.setString(1, datos.getMail());
			statement.setString(2, datos.getOcupacion());
			
			
			

			int filasIngresadas = statement.executeUpdate();

			System.out.println("Se insentaron: " + filasIngresadas + " filas");
			return filasIngresadas >0;
			
			
			
		} catch (SQLException e) {
		
			e.printStackTrace();
			return false;
		}
	}
}
