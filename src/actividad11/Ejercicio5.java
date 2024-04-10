package actividad11;
import java.util.Scanner;

public class Ejercicio5 {

	/*
	 * Clase que nos permite añadir alumnos a una lista.
	 * Autor: Unai Esgueva Gironda
	 * Fecha: 05/03/2024
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder lista = new StringBuilder();
		
		// bucle para añadir alumnos.
		int opcion = 0;
		do {
			System.out.println("Pulsa 1 para añadir otro alumno, o pulsa 0 para salir.");
			opcion = sc.nextInt();
			
			switch(opcion) {
				case 0: // Al salir le mostramos la lista con todos los nombres de los alumnos.
					System.out.println(lista);
					break;
				case 1: // Le pedimos el nombre del nuevo alumno y lo añadimos al final de la lista.
					System.out.println("Dime el nombre del alumno:");
					lista.append(sc.next() + " ");
					break;
				default:
					System.out.println("Opción no válida.");
			}
		} while(opcion != 0);

		
		sc.close();
	}

}
