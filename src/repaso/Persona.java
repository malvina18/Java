package Ejemplos_Iterator;

public class Persona {
	private String nombre;
	private String apellidos;
	private int edad;
	
	Persona(String nom, String ap, int ed)
	{
		setNombre(nom);
		setApellidos(ap);
		setEdad(ed);
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
