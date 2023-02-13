package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import Modelo.Cantante;
import Modelo.Comunidad;
import Modelo.Ganador_Comunidad;
import Modelo.Ganador_Nacional;
import Modelo.Ganador_Rangos;
import Modelo.PorcentanjeVotantes;
import Modelo.Votantes_PorComunidad;
import Vista.Vista;

public class Controlador implements ActionListener{

	Vista vista= new Vista();
	List<Comunidad> listaComunidades= new ArrayList<Comunidad>();
	List<Cantante> listaCantantes= new ArrayList<Cantante>();
	List<PorcentanjeVotantes> listaPorcentajes= new ArrayList<PorcentanjeVotantes>();
	List<Cantante> cantantesRango= new ArrayList<Cantante>();
	List<Cantante> cantantesComunidad= new ArrayList<Cantante>();
	List<Cantante> cantantesNacional= new ArrayList<Cantante>();
	List<Votantes_PorComunidad> votantes= new ArrayList<Votantes_PorComunidad>();
	List<Ganador_Nacional> nacional= new ArrayList<Ganador_Nacional>();
	List<Ganador_Rangos> rangos= new ArrayList<Ganador_Rangos>();
	List<Ganador_Comunidad> comunidades= new ArrayList<>();
	Connection connection= null;
	int totalVotantes= 0;
	
	public Controlador(Vista frame) {
		vista= frame;
		this.vista.btnComenzar.addActionListener(this);
		this.vista.btnVotar.addActionListener(this);
		this.vista.btnVotacionesComunidad.addActionListener(this);
		this.vista.btnVotacionesNacionales.addActionListener(this);
		this.vista.btnVotacionesRango.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		try {
			System.out.println("Siempre se Ejecuta");
			if(e.getSource()== vista.btnComenzar) {
				Controlador helper= new Controlador(vista);

				connection= connectionByProperties();
				System.out.println("Conexion");
				listaComunidades= helper.sacarComunidades(connection);
				listaCantantes= helper.sacarCantantes(connection);
				listaPorcentajes= helper.sacarPorcentajes(connection);
				cargarLables();
				cantantesRango= listaCantantes;
				cantantesComunidad= listaCantantes;
				cantantesNacional= listaCantantes;
				
				this.vista.jPInicio.setVisible(false);
				this.vista.jPCantantes.setVisible(true);
				cargarInfor();
				
				SacarVotantes hilo= new SacarVotantes(listaComunidades, listaPorcentajes);
				hilo.start();
				votantes= hilo.getVotantes();
				hilo.join();
				helper.insertarVotantes(connection);
				System.out.println(comunidades.get(0).getCantantes().get(0).getNombre());

				System.out.println("Boton iniciar aplicación");
			}
			
			if (e.getSource()== vista.btnVotar) {
				for (int i= 0; i<votantes.size(); i++) {
					for (int r= 0; r<votantes.get(i).getVotantes_18_25(); r++) {
						Votar votar= new Votar("Rango_18_25");
						votar.start();
						votar.join();
						String cantante= votar.getCantante();
						asignarVoto(cantante, votantes.get(i).getNombre(), "Rango_18_25");
					}
					for (int r= 0; r<votantes.get(i).getVotantes_26_40(); r++) {
						Votar votar= new Votar("Rango_26_40");
						votar.start();
						votar.join();
						String cantante= votar.getCantante();
						asignarVoto(cantante, votantes.get(i).getNombre(), "Rango_26_40");
					}
					for (int r= 0; r<votantes.get(i).getVotantes_41_65(); r++) {
						Votar votar= new Votar("Rango_41_65");
						votar.start();
						votar.join();
						String cantante= votar.getCantante();
						asignarVoto(cantante, votantes.get(i).getNombre(), "Rango_41_65");
					}
					for (int r= 0; r<votantes.get(i).getVotantes_Mas_65(); r++) {
						Votar votar= new Votar("Rango_Mas_65");
						votar.start();
						votar.join();
						String cantante= votar.getCantante();
						asignarVoto(cantante, votantes.get(i).getNombre(), "Rango_Mas_65");
					}
				}
				System.out.println("Boton comenzar votaciones");
				System.out.println(comunidades.get(0).getCantantes().get(0).getNombre());
				
				this.vista.btnVotacionesComunidad.setVisible(true);
				this.vista.btnVotacionesNacionales.setVisible(true);
				this.vista.btnVotacionesRango.setVisible(true);
				this.vista.btnVotar.setVisible(false);
			}
			
			if (e.getSource()== vista.btnVotacionesComunidad) {
				System.out.println("Boton ver votaciones Comunidad");
				System.out.println(comunidades.get(0).getCantantes().get(0).getNombre());
			}
			
			if (e.getSource()== vista.btnVotacionesNacionales) {
				
			}
			
			if (e.getSource()== vista.btnVotacionesRango) {
				
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}finally {
			try {
				disconect(connection);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	private void asignarVoto(String cantante, String comunidad, String rango) {
		//Nivel nacional
		for (int i= 0; i< nacional.size(); i++) {
			for (int r= 0; r< nacional.get(i).getCantantes().size(); r++) {
				if (nacional.get(i).getCantantes().get(r).getNombre().equals(cantante)) {
					nacional.get(i).getCantantes().get(r).setPuntos((nacional.get(i).getCantantes().get(r).getPuntos()+1));
				}
			}
		}
		//Rangos
		for (int i= 0; i<rangos.size(); i++) {
			if (rangos.get(i).getRango().equals(rango)) {
				for (int r= 0; r<rangos.get(i).getCantantes().size(); r++) {
					if (rangos.get(i).getCantantes().get(r).getNombre().equals(cantante)) {
						//System.out.println(rangos.get(i).getCantantes().get(r).getNombre());
						rangos.get(i).getCantantes().get(r).setPuntos((rangos.get(i).getCantantes().get(r).getPuntos()+1));
					}
				}
			}
		}
		//System.out.println(rangos.get(0).getCantantes().get(0).getNombre());
		
		//Comunidad
		for (int i= 0; i<comunidades.size(); i++) {
			if (comunidades.get(i).getComunidad().equals(comunidad)) {
				for (int r= 0; r<comunidades.get(i).getCantantes().size(); r++) {
					if (comunidades.get(i).getCantantes().get(r).getNombre().equals(cantante)) {
						comunidades.get(i).getCantantes().get(r).setPuntos((comunidades.get(i).getCantantes().get(r).getPuntos()+1));
					}
				}
			}
		}
		
	}

	private void cargarInfor() {
		nacional.add(new Ganador_Nacional(cantantesNacional));
		rangos.add(new Ganador_Rangos("Rango_18_25", cantantesRango));
		rangos.add(new Ganador_Rangos("Rango_26_40", cantantesRango));
		rangos.add(new Ganador_Rangos("Rango_41_65", cantantesRango));
		rangos.add(new Ganador_Rangos("Rango_Mas_65", cantantesRango));
		comunidades.add(new Ganador_Comunidad("Andalucia", cantantesComunidad));
		comunidades.add(new Ganador_Comunidad("Aragon", cantantesComunidad));
		comunidades.add(new Ganador_Comunidad("Asturias", cantantesComunidad));
		comunidades.add(new Ganador_Comunidad("Baleares", cantantesComunidad));
		comunidades.add(new Ganador_Comunidad("Canarias", cantantesComunidad));
		comunidades.add(new Ganador_Comunidad("Cantabria", cantantesComunidad));
		comunidades.add(new Ganador_Comunidad("Castilla La Mancha", cantantesComunidad));
		comunidades.add(new Ganador_Comunidad("Castilla y Leon", cantantesComunidad));
		comunidades.add(new Ganador_Comunidad("Catalunia", cantantesComunidad));
		comunidades.add(new Ganador_Comunidad("Comunidad Valenciana", cantantesComunidad));
		comunidades.add(new Ganador_Comunidad("Extremadura", cantantesComunidad));
		comunidades.add(new Ganador_Comunidad("Galicia", cantantesComunidad));
		comunidades.add(new Ganador_Comunidad("Madrid", cantantesComunidad));
		comunidades.add(new Ganador_Comunidad("Murcia", cantantesComunidad));
		comunidades.add(new Ganador_Comunidad("Navarra", cantantesComunidad));
		comunidades.add(new Ganador_Comunidad("Pais Vasco", cantantesComunidad));
		comunidades.add(new Ganador_Comunidad("La Rioja", cantantesComunidad));
		comunidades.add(new Ganador_Comunidad("Ceuta", cantantesComunidad));
		comunidades.add(new Ganador_Comunidad("Melilla", cantantesComunidad));
	}

	private void cargarLables() {
		this.vista.lblCNombre1.setText(listaCantantes.get(0).getNombre());
		this.vista.lblCNombre2.setText(listaCantantes.get(1).getNombre());
		this.vista.lblCNombre3.setText(listaCantantes.get(2).getNombre());
		this.vista.lblCNombre4.setText(listaCantantes.get(3).getNombre());
		this.vista.lblCNombre5.setText(listaCantantes.get(4).getNombre());
		this.vista.lblCNombre6.setText(listaCantantes.get(5).getNombre());
		this.vista.lblCNombre7.setText(listaCantantes.get(6).getNombre());
		this.vista.lblCNombre8.setText(listaCantantes.get(7).getNombre());
		this.vista.lblCNombre9.setText(listaCantantes.get(8).getNombre());
		this.vista.lblCNombre10.setText(listaCantantes.get(9).getNombre());
		
		this.vista.lblCApellido1.setText(listaCantantes.get(0).getApellidos());
		this.vista.lblCApellido2.setText(listaCantantes.get(1).getApellidos());
		this.vista.lblCApellido3.setText(listaCantantes.get(2).getApellidos());
		this.vista.lblCApellido4.setText(listaCantantes.get(3).getApellidos());
		this.vista.lblCApellido5.setText(listaCantantes.get(4).getApellidos());
		this.vista.lblCApellido6.setText(listaCantantes.get(5).getApellidos());
		this.vista.lblCApellido7.setText(listaCantantes.get(6).getApellidos());
		this.vista.lblCApellido8.setText(listaCantantes.get(7).getApellidos());
		this.vista.lblCApellido9.setText(listaCantantes.get(8).getApellidos());
		this.vista.lblCApellido10.setText(listaCantantes.get(9).getApellidos());
		
		this.vista.lblCCancion1.setText(listaCantantes.get(0).getNombreCancion());
		this.vista.lblCCancion2.setText(listaCantantes.get(1).getNombreCancion());
		this.vista.lblCCancion3.setText(listaCantantes.get(2).getNombreCancion());
		this.vista.lblCCancion4.setText(listaCantantes.get(3).getNombreCancion());
		this.vista.lblCCancion5.setText(listaCantantes.get(4).getNombreCancion());
		this.vista.lblCCancion6.setText(listaCantantes.get(5).getNombreCancion());
		this.vista.lblCCancion7.setText(listaCantantes.get(6).getNombreCancion());
		this.vista.lblCCancion8.setText(listaCantantes.get(7).getNombreCancion());
		this.vista.lblCCancion9.setText(listaCantantes.get(8).getNombreCancion());
		this.vista.lblCCancion10.setText(listaCantantes.get(9).getNombreCancion());
		
	}

	public Connection connectionByProperties() throws Exception {
		Connection connection= null;
		try {
			Properties configuracion= new Properties();
			configuracion.load(new FileReader("src\\Persistencias\\database.properties"));
			String driver= configuracion.getProperty("database.driver");
			String url= configuracion.getProperty("database.url");
			String user= configuracion.getProperty("database.user");
			String password= configuracion.getProperty("database.password");
			Class.forName(driver);
			connection= DriverManager.getConnection(url, user, password);
			connection.setAutoCommit(false);
		}catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return connection;
	}
	
	public void disconect(Connection connection) throws Exception {
		try {
			if (null!= connection) {
				connection.close();
				connection= null;
			}
		}catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public List<Comunidad> sacarComunidades(Connection connection) {
	    List<Comunidad> comunidades = new ArrayList<Comunidad>();
	    try {
	    	 String query = "SELECT * FROM PORCENTAJES_RANGOEDAD";
	    	 PreparedStatement preparedStatement = connection.prepareStatement(query);
	    	 ResultSet resultSet = preparedStatement.executeQuery();
	    	 while (resultSet.next()) {
	    		 String nombreComunidad = resultSet.getString("NOMBRE_COMUNIDAD");
	    	     int rango1_9 = resultSet.getInt("RANGO_1_9");
	    	     int rango10_17 = resultSet.getInt("RANGO_10_17");
	    	     int rango18_25 = resultSet.getInt("RANGO_18_25");
	    	     int rango26_40 = resultSet.getInt("RANGO_26_40");
	    	     int rango41_65 = resultSet.getInt("RANGO_41_65");
	    	     int rangoMas66 = resultSet.getInt("RANGO_MAS_66");
	    	     int totalHabitantes = resultSet.getInt("TOTAL_HABITANTES");
	    	     Comunidad comunidad = new Comunidad(nombreComunidad, rango1_9, rango10_17, rango18_25, rango26_40, rango41_65, rangoMas66, totalHabitantes);
	    	     comunidades.add(comunidad);
	    	    }
	    }catch (Exception e) {
	    	e.printStackTrace();
	    }
	    return comunidades;
	}
	
	public  List<Cantante> sacarCantantes(Connection connection) {
        List<Cantante> cantantes = new ArrayList<>();
        try {
        	String sql = "SELECT * FROM CANTANTES";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String dni = resultSet.getString("DNI");
                String nombre = resultSet.getString("NOMBRE");
                String apellidos = resultSet.getString("APELLIDOS");
                long telefono = resultSet.getInt("TELEFONO");
                String nombreCancion = resultSet.getString("NOMBRE_CANCION");
                Cantante cantante = new Cantante(dni, nombre, apellidos, telefono, nombreCancion);
                cantantes.add(cantante);
            }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
        return cantantes;
    }
	
	public List<PorcentanjeVotantes> sacarPorcentajes(Connection connection) {
	    List<PorcentanjeVotantes> porcentajesVotacionRango = new ArrayList<>();
	    try {
	        String sql = "SELECT * FROM PORCENTAJE_VOTACION_RANGO";
	        PreparedStatement statement = connection.prepareStatement(sql);
	        ResultSet resultSet = statement.executeQuery();
	        while (resultSet.next()) {
	            String rango = resultSet.getString("RANGO");
	            double porcentaje = resultSet.getDouble("PORCENTAJE");
	            PorcentanjeVotantes pvr = new PorcentanjeVotantes(rango, porcentaje);
	            porcentajesVotacionRango.add(pvr);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return porcentajesVotacionRango;
	}
	
	public void insertarVotantes(Connection connection) throws SQLException {
	    String sql = "INSERT INTO COMUNIDAD_RANGOS (nombre, votantes_1_9, votantes_10_17, votantes_18_25, votantes_26_40, votantes_41_65, votantes_Mas_65) VALUES (?,?,?,?,?,?,?)";
	    
	    try (PreparedStatement statement = connection.prepareStatement(sql)) {
	        for (Votantes_PorComunidad comunidad : votantes) {
	            statement.setString(1, comunidad.getNombre());
	            statement.setInt(2, comunidad.getVotantes_1_9());
	            statement.setInt(3, comunidad.getVotantes_10_17());
	            statement.setInt(4, comunidad.getVotantes_18_25());
	            statement.setInt(5, comunidad.getVotantes_26_40());
	            statement.setInt(6, comunidad.getVotantes_41_65());
	            statement.setInt(7, comunidad.getVotantes_Mas_65());
	            
	            statement.addBatch();
	        }
	        
	        statement.executeBatch();
	        connection.commit();
	    } catch (SQLException ex) {
	        connection.rollback();
	        throw ex;
	    }
	}
}
