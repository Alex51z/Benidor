package Modelo;

import java.util.List;

public class Ganador_Nacional {

	private List<Cantante> cantantes;
	
	public Ganador_Nacional(List<Cantante> cantantes) {
		super();
		this.cantantes = cantantes;
	}

	public List<Cantante> getCantantes() {
		return cantantes;
	}

	public void setCantantes(List<Cantante> cantantes) {
		this.cantantes = cantantes;
	}
	
	
	
}
