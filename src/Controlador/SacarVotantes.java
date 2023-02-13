package Controlador;

import java.util.ArrayList;
import java.util.List;

import Modelo.Comunidad;
import Modelo.PorcentanjeVotantes;
import Modelo.Votantes_PorComunidad;

public class SacarVotantes extends Thread{

	private List<Comunidad> comunidades;
	private List<PorcentanjeVotantes> porcentajes;
	private List<Votantes_PorComunidad> votantes= new ArrayList<Votantes_PorComunidad>();
	
	public SacarVotantes(List<Comunidad> comunidades, List<PorcentanjeVotantes> porcentajes) {
		super();
		this.comunidades = comunidades;
		this.porcentajes = porcentajes;
	}
	
	public void run() {
		
		for (int i= 0; i<comunidades.size(); i++) {
			long habitantes= comunidades.get(i).getHabitantes();
			int votantes_1_9 = (int) (Math.round(habitantes * (comunidades.get(i).getRango_1_9() / 100.0)) * (porcentajes.get(0).getPorcentaje() / 100.0));			
			int votantes_10_17 = (int) (Math.round(habitantes * (comunidades.get(i).getRango_10_17() / 100.0)) * (porcentajes.get(0).getPorcentaje() / 100.0));
			int votantes_18_25 = (int) (Math.round(habitantes * (comunidades.get(i).getRango_18_25() / 100.0)) * (porcentajes.get(0).getPorcentaje() / 100.0));
			int votantes_26_40 = (int) (Math.round(habitantes * (comunidades.get(i).getRango_26_40() / 100.0)) * (porcentajes.get(0).getPorcentaje() / 100.0));
			int votantes_41_65 = (int) (Math.round(habitantes * (comunidades.get(i).getRango_41_65() / 100.0)) * (porcentajes.get(0).getPorcentaje() / 100.0));
			int votantes_Mas_65 = (int) (Math.round(habitantes * (comunidades.get(i).getRango_Mas_65() / 100.0)) * (porcentajes.get(0).getPorcentaje() / 100.0));	
			Votantes_PorComunidad votante= new Votantes_PorComunidad(comunidades.get(i).getNombre(), votantes_1_9, votantes_10_17, votantes_18_25, votantes_26_40, votantes_41_65, votantes_Mas_65);
			votantes.add(votante);
		}
	}
	
	public List<Votantes_PorComunidad> getVotantes() {
		return votantes;
	}
}
