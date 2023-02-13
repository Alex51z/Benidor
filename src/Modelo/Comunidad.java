package Modelo;

public class Comunidad {

	private String nombre;
	private int rango_1_9;
	private int rango_10_17;
	private int rango_18_25;
	private int rango_26_40;
	private int rango_41_65;
	private int rango_Mas_65;
	private long habitantes;
	
	public Comunidad(String nombre, int rango_1_9, int rango_10_17, int rango_18_25, int rango_26_40, int rango_41_65,
			int rango_Mas_65, long habitantes) {
		super();
		this.nombre = nombre;
		this.rango_1_9 = rango_1_9;
		this.rango_10_17 = rango_10_17;
		this.rango_18_25 = rango_18_25;
		this.rango_26_40 = rango_26_40;
		this.rango_41_65 = rango_41_65;
		this.rango_Mas_65 = rango_Mas_65;
		this.habitantes = habitantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRango_1_9() {
		return rango_1_9;
	}

	public void setRango_1_9(int rango_1_9) {
		this.rango_1_9 = rango_1_9;
	}

	public int getRango_10_17() {
		return rango_10_17;
	}

	public void setRango_10_17(int rango_10_17) {
		this.rango_10_17 = rango_10_17;
	}

	public int getRango_18_25() {
		return rango_18_25;
	}

	public void setRango_18_25(int rango_18_25) {
		this.rango_18_25 = rango_18_25;
	}

	public int getRango_26_40() {
		return rango_26_40;
	}

	public void setRango_26_40(int rango_26_40) {
		this.rango_26_40 = rango_26_40;
	}

	public int getRango_41_65() {
		return rango_41_65;
	}

	public void setRango_41_65(int rango_41_65) {
		this.rango_41_65 = rango_41_65;
	}

	public int getRango_Mas_65() {
		return rango_Mas_65;
	}

	public void setRango_Mas_65(int rango_Mas_65) {
		this.rango_Mas_65 = rango_Mas_65;
	}

	public long getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(long habitantes) {
		this.habitantes = habitantes;
	}

	@Override
	public String toString() {
		return "Comunidades [nombre=" + nombre + ", rango_1_9=" + rango_1_9 + ", rango_10_17=" + rango_10_17
				+ ", rango_18_25=" + rango_18_25 + ", rango_26_40=" + rango_26_40 + ", rango_41_65=" + rango_41_65
				+ ", rango_Mas_65=" + rango_Mas_65 + ", habitantes=" + habitantes + "]";
	}
	
}
