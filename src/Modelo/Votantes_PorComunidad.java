package Modelo;

public class Votantes_PorComunidad {

	private String nombre;
	private int votantes_1_9;
	private int votantes_10_17;
	private int votantes_18_25;
	private int votantes_26_40;
	private int votantes_41_65;
	private int votantes_Mas_65;
	
	public Votantes_PorComunidad(String nombre, int votantes_1_9, int votantes_10_17, int votantes_18_25,
			int votantes_26_40, int votantes_41_65, int votantes_Mas_65) {
		super();
		this.nombre = nombre;
		this.votantes_1_9 = votantes_1_9;
		this.votantes_10_17 = votantes_10_17;
		this.votantes_18_25 = votantes_18_25;
		this.votantes_26_40 = votantes_26_40;
		this.votantes_41_65 = votantes_41_65;
		this.votantes_Mas_65 = votantes_Mas_65;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVotantes_1_9() {
		return votantes_1_9;
	}

	public void setVotantes_1_9(int votantes_1_9) {
		if (votantes_1_9== 0) {
			this.votantes_1_9= 3;
		}else {
			this.votantes_1_9 = votantes_1_9;
		}
	}

	public int getVotantes_10_17() {
		return votantes_10_17;
	}

	public void setVotantes_10_17(int votantes_10_17) {
		if (votantes_10_17== 0) {
			this.votantes_10_17= 3;
		}else {
			this.votantes_10_17 = votantes_10_17;
		}
	}

	public int getVotantes_18_25() {
		return votantes_18_25;
	}

	public void setVotantes_18_25(int votantes_18_25) {
		if (votantes_18_25== 0) {
			this.votantes_18_25= 3;
		}else {
			this.votantes_18_25 = votantes_18_25;
		}
	}

	public int getVotantes_26_40() {
		return votantes_26_40;
	}

	public void setVotantes_26_40(int votantes_26_40) {
		if (votantes_26_40== 0) {
			this.votantes_26_40= 3;
		}else {
			this.votantes_26_40 = votantes_26_40;
		}
	}

	public int getVotantes_41_65() {
		return votantes_41_65;
	}

	public void setVotantes_41_65(int votantes_41_65) {
		if (votantes_41_65== 0) {
			this.votantes_41_65= 3;
		}else {
			this.votantes_41_65 = votantes_41_65;
		}
	}

	public int getVotantes_Mas_65() {
		return votantes_Mas_65;
	}

	public void setVotantes_Mas_65(int votantes_Mas_65) {
		if (votantes_Mas_65== 0) {
			this.votantes_Mas_65= 3;
		}else {
			this.votantes_Mas_65 = votantes_Mas_65;
		}
	}
	
	
}
