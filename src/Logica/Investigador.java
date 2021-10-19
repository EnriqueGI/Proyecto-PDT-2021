package Logica;
import java.util.LinkedList;

public class Investigador extends Usuario{
	private String documento;
	private String domicilio;
	private Ciudad ciudad;
	private LinkedList<Formulario> formulario;
	private  EstacionesDeMedicion estacion;
	
	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	private String telefono;

	
	
	public Investigador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LinkedList<Formulario> getFormulario() {
		return formulario;
	}

	public void setFormulario(LinkedList<Formulario> formulario) {
		this.formulario = formulario;
	}

	public EstacionesDeMedicion getEstacion() {
		return estacion;
	}

	public void setEstacion(EstacionesDeMedicion estacion) {
		this.estacion = estacion;
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

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}




	









}
