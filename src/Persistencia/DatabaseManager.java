package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
	private static Connection databaseConnection;

	private static String CONNECTION_STRING = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String USUARIO = "PROYECTO";
	private static String CLAVE = "PROYECTO";

	static {
		databaseConnection = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			try {
				databaseConnection = DriverManager.getConnection(CONNECTION_STRING, USUARIO, CLAVE);

				System.out.println("Conexión creada con éxito, es posible acceder a la base  datos");

			} catch (SQLException e) {
				System.out.println("No logramos insranciar una conexión");
				e.printStackTrace();

			}

		} catch (ClassNotFoundException e) {
			System.out.println("No tienes el driver en tu build-path");
			e.printStackTrace();

		}
	}
	
	public static Connection getConnection() {
		
		return databaseConnection;
		
		
	}
	


}
