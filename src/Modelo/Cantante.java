package Modelo;

public class Cantante {

	private String dni;
	private String nombre;
	private String apellidos;
	private long telefono;
	private String nombreCancion;
	private long puntos;
	
	public Cantante(String dni, String nombre, String apellidos, long telefono, String nombreCancion) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.nombreCancion = nombreCancion;
		this.puntos= 0;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getNombreCancion() {
		return nombreCancion;
	}

	public void setNombreCancion(String nombreCancion) {
		this.nombreCancion = nombreCancion;
	}
	
	public long getPuntos() {
		return puntos;
	}

	public void setPuntos(long puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "Cantante [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", nombreCancion=" + nombreCancion + "]";
	}
}
