package Logica;

public class Usuario {
	private String nombre;
	private String apellido;
	private String mail;

	private String contrase�a;
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

	

	public String getContrase�a() {
		return contrase�a;
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

	

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}
	
	
}
