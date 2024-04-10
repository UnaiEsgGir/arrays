package practica3;

public class Empleado {

	/*
	 * Clase para guardar los empleados.
	 * Autor: Unai Esgueva Gironda 
	 * Fecha: 12/03/2024
	 */
	
	// Declaramos las variables.
	protected String nombre;
	protected double sueldo;
	
	
	// Constructores.
	public Empleado() {
		super();
	}

	public Empleado(String nombre, double sueldo) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	// Método get para obtener el nombre de los empleados.
	public String getNombre() {
		return nombre;
	}
	
}
