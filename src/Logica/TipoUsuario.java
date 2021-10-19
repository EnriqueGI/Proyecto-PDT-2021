package Logica;

public enum TipoUsuario {
	ADMINISTRADOR("Administrador",1), INVESTIGADOR("Investigador",2),
	AFICIONADO("Aficionado",3);
	
	private String nombre;
	private int numero;
	
	private TipoUsuario(String nombre, int numero) {
		this.numero = numero;
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getNumero() {
		return numero;
	}
}
