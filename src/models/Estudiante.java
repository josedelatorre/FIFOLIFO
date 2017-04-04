package models;

public class Estudiante {
	private String nombre;
	private String apellido;
	
	public Estudiante(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
}
