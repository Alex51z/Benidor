package Modelo;

import java.util.List;

public class Ganador_Comunidad {

	private String comunidad;
	private List<Cantante> cantantes;
	
	public Ganador_Comunidad(String comunidad, List<Cantante> cantantes) {
		super();
		this.comunidad = comunidad;
		this.cantantes = cantantes;
	}

	public String getComunidad() {
		return comunidad;
	}

	public void setComunidad(String comunidad) {
		this.comunidad = comunidad;
	}

	public List<Cantante> getCantantes() {
		return cantantes;
	}

	public void setCantantes(List<Cantante> cantantes) {
		this.cantantes = cantantes;
	}
	
}
