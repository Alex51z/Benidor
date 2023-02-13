package Controlador;

public class Votar extends Thread{

	private String rango;
	private int valor;
	private String cantante;
	
	public Votar(String rango) {
		this.rango = rango;
	}

	public void run() {
		votaciones();
	}

	public String getCantante() {
		return cantante;
	}

	private void votaciones() {
		valor= (int)(0+Math.random()*101);
		 if (rango.equals("Rango_18_25")) {
		      if (valor >= 0 && valor <= 7) {
		        cantante= "Joel";
		      } else if (valor >= 8 && valor <= 10) {
		        cantante= "Victoria";
		      } else if (valor >= 11 && valor <= 23) {
		        cantante= "Thiago";
		      } else if (valor >= 24 && valor <= 30) {
		        cantante= "Sarah";
		      } else if (valor >= 31 && valor <= 37) {
		        cantante= "Elton";
		      } else if (valor >= 38 && valor <= 51) {
		        cantante= "Amie";
		      } else if (valor >= 52 && valor <= 61) {
		        cantante= "Nahid";
		      } else if (valor >= 62 && valor <= 88) {
		        cantante= "Marc";
		      } else if (valor >= 89 && valor <= 95) {
		        cantante= "Alba";
		      } else if (valor >= 96 && valor <= 100) {
		        cantante= "Julio";
		      }
		    }else if (rango.equals("Rango_26_40")) {
		    	 if (valor >= 0 && valor <= 14) {
				        cantante= "Joel";
				      } else if (valor >= 15 && valor <= 20) {
				        cantante= "Victoria";
				      } else if (valor >= 21 && valor <= 33) {
				        cantante= "Thiago";
				      } else if (valor >= 34 && valor <= 40) {
				        cantante= "Sarah";
				      } else if (valor >= 41 && valor <= 46) {
				        cantante= "Elton";
				      } else if (valor >= 47 && valor <= 58) {
				        cantante= "Amie";
				      } else if (valor >= 59 && valor <= 65) {
				        cantante= "Nahid";
				      } else if (valor >= 66 && valor <= 81) {
				        cantante= "Marc";
				      } else if (valor >= 82 && valor <= 90) {
				        cantante= "Alba";
				      } else if (valor >= 91 && valor <= 100) {
				        cantante= "Julio";
				      }
		    }else if (rango.equals("Rango_41_65")) {
		    	 if (valor >= 0 && valor <= 5) {
				        cantante= "Joel";
				      } else if (valor >= 6 && valor <= 15) {
				        cantante= "Victoria";
				      } else if (valor >= 16 && valor <= 27) {
				        cantante= "Thiago";
				      } else if (valor >= 28 && valor <= 33) {
				        cantante= "Sarah";
				      } else if (valor >= 34 && valor <= 40) {
				        cantante= "Elton";
				      } else if (valor >= 41 && valor <= 54) {
				        cantante= "Amie";
				      } else if (valor >= 55 && valor <= 61) {
				        cantante= "Nahid";
				      } else if (valor >= 62 && valor <= 71) {
				        cantante= "Marc";
				      } else if (valor >= 72 && valor <= 88) {
				        cantante= "Alba";
				      } else if (valor >= 89 && valor <= 100) {
				        cantante= "Julio";
				      }
		    }else {
		    	if (valor >= 0 && valor <= 3) {
			        cantante= "Joel";
			      } else if (valor >= 4 && valor <= 20) {
			        cantante= "Victoria";
			      } else if (valor >= 21 && valor <= 25) {
			        cantante= "Thiago";
			      } else if (valor >= 26 && valor <= 37) {
			        cantante= "Sarah";
			      } else if (valor >= 38 && valor <= 49) {
			        cantante= "Elton";
			      } else if (valor >= 50 && valor <= 58) {
			        cantante= "Amie";
			      } else if (valor >= 59 && valor <= 65) {
			        cantante= "Nahid";
			      } else if (valor >= 66 && valor <= 76) {
			        cantante= "Marc";
			      } else if (valor >= 77 && valor <= 91) {
			        cantante= "Alba";
			      } else if (valor >= 92 && valor <= 100) {
			        cantante= "Julio";
			      }
		    }
	}
	
	
}
