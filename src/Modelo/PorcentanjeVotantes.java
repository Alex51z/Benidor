package Modelo;

public class PorcentanjeVotantes {

	private String rango;
	private Double porcentaje;
	
	public PorcentanjeVotantes(String rango, Double porcentaje) {
		super();
		this.rango = rango;
		this.porcentaje = porcentaje;
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public Double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(Double porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Override
	public String toString() {
		return "PorcentanjeVotantes [rango=" + rango + ", porcentaje=" + porcentaje + "]";
	}
}
