package Logica;
import java.util.Date;
import java.util.LinkedList;


import java.time.LocalDate;

public class Formulario {
	private int id;
	private Date fecha_hora;
	private String ubicacion;
	private String nombreVariable;
	private String metodoMedicion;
	private String comentarios;
	private LinkedList<Investigador> investigador;
	private LinkedList<Aficionado> aficionado;
	private LinkedList<Administrador> administrador;
	public Formulario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getId() {
		return id;
	}

	public LinkedList<Investigador> getInvestigador() {
		return investigador;
	}


	public void setInvestigador(LinkedList<Investigador> investigador) {
		this.investigador = investigador;
	}


	public LinkedList<Aficionado> getAficionado() {
		return aficionado;
	}


	public void setAficionado(LinkedList<Aficionado> aficionado) {
		this.aficionado = aficionado;
	}


	public LinkedList<Administrador> getAdministrador() {
		return administrador;
	}


	public void setAdministrador(LinkedList<Administrador> administrador) {
		this.administrador = administrador;
	}


	public Date getFecha_hora() {
		return fecha_hora;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public String getNombreVariable() {
		return nombreVariable;
	}

	public String getMetodoMedicion() {
		return metodoMedicion;
	}

	public String getComentarios() {
		return comentarios;
	}

	

	public void setId(int id) {
		this.id = id;
	}

	public void setFecha_hora(Date fecha_hora) {
		this.fecha_hora = fecha_hora;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public void setNombreVariable(String nombreVariable) {
		this.nombreVariable = nombreVariable;
	}

	public void setMetodoMedicion(String metodoMedicion) {
		this.metodoMedicion = metodoMedicion;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	


	public String crearCasillaS() {
		String retorno = "";
		
		return retorno;
	}
	public int crearCasillaI() {
		int retorno = 0;
		
		return retorno;
	}
	public double crearCasillaD() {
		double retorno = 0;
		
		return retorno;
	}
	public boolean crearCasillaB() {
		boolean retorno = false;
		
		return retorno;
	}
	public LocalDate crearCasillaLD() {
		LocalDate retorno = LocalDate.now();
		
		return retorno;
	}
	public void modificarCasilla() {
		
	}
	public void eliminarCasilla() {
		
	}
	public void listarFormulario() {
		
	}
}
