package Logica;

import java.util.LinkedList;

public class EstacionesDeMedicion {
	private int idEstacion;
	private String nombre;
	private int ciudad;
	private String latitud;
	private String longitud;
	private String calidadAgua;
	private int humedadRelativa;
	private LinkedList<Investigador> investigador;
	private LinkedList<Aficionado> aficionado;
	
	public EstacionesDeMedicion() {
		super();
		// TODO Auto-generated constructor stub
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

	public int getIdEstacion() {
		return idEstacion;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCiudad() {
		return ciudad;
	}

	public String getLatitud() {
		return latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public String getCalidadAgua() {
		return calidadAgua;
	}

	public int getHumedadRelativa() {
		return humedadRelativa;
	}

	public void setIdEstacion(int idEstacion) {
		this.idEstacion = idEstacion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCiudad(int ciudad) {
		this.ciudad = ciudad;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public void setCalidadAgua(String calidadAgua) {
		this.calidadAgua = calidadAgua;
	}

	public void setHumedadRelativa(int humedadRelativa) {
		this.humedadRelativa = humedadRelativa;
	}
	
	
}
