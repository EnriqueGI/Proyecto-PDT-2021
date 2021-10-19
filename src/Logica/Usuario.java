package Logica;

public class Usuario {
	private String nombre;
	private String apellido;
	private String mail;

	private String contraseña;
	private int rol;
	private TipoUsuario tipo;
	
	public void descargarDatos() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getRol() {
		return rol;
	}

	public void setRol(int rol) {
		this.rol = rol;
	}

	public String getMail() {
		return mail;
	}

	

	public String getContraseña() {
		return contraseña;
	}

	public TipoUsuario getTipo() {
		return tipo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}
	
	
}
