package actividad11;

public class Ejercicio6ProfesorMain {

	/*
	 * Clase ejecutable en la que probamos los métodos de la clase profesor.
	 * Autor: Unai Esgueva Gironda
	 * Fecha: 05/03/2024
	 */
	
	public static void main(String[] args) {
		
		// Creamos una instancia de la clase profesor.
		Ejercicio6Profesor profesor = new Ejercicio6Profesor();
		
		// Llamamos al método, pasándole los módulos que imparte.
		System.out.println("Módulos del profesor:" + profesor.numeroModulosImpartidos("fol", "programación"));
		System.out.println("Módulos del profesor:" + profesor.numeroModulosImpartidos("fol", "programación","entornos"," bases"));
		System.out.println("Módulos del profesor:" + profesor.numeroModulosImpartidos("entornos"," fo"," programación"," bases", "sistemas"));
		System.out.println("Módulos del profesor:" + profesor.numeroModulosImpartidos("fol"));
		System.out.println("Módulos del profesor:" + profesor.numeroModulosImpartidos("fol", "lenguajedemarcas" ,"sistemas"));
		System.out.println("Módulos del profesor:" + profesor.numeroModulosImpartidos("a" ,"a" ,"a", "a", "a", "a", "a", "a", "a"));
		System.out.println("Módulos del profesor:" + profesor.numeroModulosImpartidos("fol", "programación", "entornos", "bases", "lenguajedemarcas", "sistemas"));
		System.out.println("Módulos del profesor:" + profesor.numeroModulosImpartidos(null));
	}

}
