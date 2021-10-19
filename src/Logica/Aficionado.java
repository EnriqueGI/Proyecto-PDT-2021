package Logica;
import java.util.LinkedList;
public class Aficionado extends Usuario{
	private String ocupacion;
	
	private Formulario formulario ;
	private LinkedList<EstacionesDeMedicion> estaciones = new LinkedList<EstacionesDeMedicion>();
	

	public String getOcupacion() {
		return ocupacion;
	}



	

	public Formulario getFormulario() {
		return formulario;
	}





	public void setFormulario(Formulario formulario) {
		this.formulario = formulario;
	}





	public LinkedList<EstacionesDeMedicion> getEstaciones() {
		return estaciones;
	}





	public void setEstaciones(LinkedList<EstacionesDeMedicion> estaciones) {
		this.estaciones = estaciones;
	}





	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	



	
}
