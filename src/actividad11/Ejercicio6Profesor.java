package actividad11;

public class Ejercicio6Profesor {

	/*
	 * Autor: Unai Esgueva Gironda
	 * Fecha: 05/03/2024
	 */
	
	// Constructor por defecto.
	public Ejercicio6Profesor() {
		super();
		
	}
	
	// Método que devuelve el número de módulos que imparte un profesor.
	public int numeroModulosImpartidos(String ... cadena) {
		// Con un switch devolvemos el número de módulos que imparte.
		if(cadena == null) {
			System.out.println("No has pasado ningún módulo.");
			return 0;
		}
		else {
			switch(cadena.length) {
				case 1:
					return 1;
				case 2:
					return 2;
				case 3:
					return 3;
				case 4:
					return 4;
				case 5:
					return 5;
				case 6:
					return 6;
				default: // Si imparte 0 o mas de 6 módulos devuelve 0.
					return 0;
			}
		}
	}
	
	
}
