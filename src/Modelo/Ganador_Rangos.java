package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Ganador_Rangos {

	private String rango;
	private List<Cantante> cantantes;
	
	public Ganador_Rangos(String rango, List<Cantante> cantantes) {
		super();
		this.rango = rango;
		this.cantantes = cantantes;
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public List<Cantante> getCantantes() {
		if (cantantes== null) {
			cantantes= new ArrayList<Cantante>();
		}
		return cantantes;
	}

	public void setCantantes(List<Cantante> cantantes) {
		this.cantantes = cantantes;
	}
		
}
