package Logica;


public class Administrador extends Usuario{
	private String documento;
	private String domicilio;
	private String telefono;
	private Formulario formulario ;
	private Ciudad ciudad ;
	
	public void descargarDatos() {
		
	}


	public String getDocumento() {
		return documento;
	}


	public String getDomicilio() {
		return domicilio;
	}
public String getTelefono() {
		return telefono;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}
public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setInstituto(String domicilio) {
		this.domicilio = domicilio;
	}


public Formulario getFormulario() {
		return this.formulario;
	}


	public void setDocumento(Formulario formulario) {
		this.formulario = formulario;
	}
public Ciudad getCiudad() {
		return this.ciudad;
	}


	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	
	
}
