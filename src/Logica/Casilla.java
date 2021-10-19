package Logica;
import java.util.LinkedList;

public class Casilla {
	private String parametro;
	private String unidadMedida;
	private String descripcion;
	private String tipoInput;
	private LinkedList<Formulario> formularios;
	
	public Casilla() {
		super();
	}

	public String getParametro() {
		return parametro;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getTipoInput() {
		return tipoInput;
	}

	public LinkedList<Formulario> getFormularios() {
		return formularios;
	}

	public void setParametro(String parametro) {
		this.parametro = parametro;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setTipoInput(String tipoInput) {
		this.tipoInput = tipoInput;
	}

	public void setFormularios(LinkedList<Formulario> formularios) {
		this.formularios = formularios;
	}

	

}
