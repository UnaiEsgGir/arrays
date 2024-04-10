package practica1;
import java.util.Scanner;

public class Notas {

	/*
	 * Programa que guarda las notas de 5 alumnos y muestra su último 10.
	 * Autor: Unai Esgueva Gironda
	 * Fecha: 27/02/2024
	 */
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		// Creamos un array bi-dimensional que guarda 5 alumnos con 3 módulos cada uno.
		float [] [] notas = new float [5] [3];
		
		// Mediante dos bucles for anidados pedimos las notas de los alumnos.
		for(int posFila = 0; posFila < notas.length; posFila++) {
			System.out.println("- Notas del alumno " + (posFila+1) + " -");
			for(int posColum = 0; posColum < notas[posFila].length; posColum++) {
				System.out.println("Nota del módulo " + (posColum+1) + ":");
				notas[posFila][posColum] = sc.nextFloat();
			}
		}
		
		// Mostramos el último 10 de los alumnos
		for(int posFila = 0; posFila < notas.length; posFila++) {
			boolean encontrado = false;
			int mod = 0;
			for(int posColum = 0; posColum < notas[posFila].length; posColum++) {
				if(notas[posFila][posColum] == 10) { // Si encuentra un diez guarda su posición y encontrado es verdadero.
					mod = posColum+1; // Se guarda la posición del último 10.
					encontrado = true;
				}			
			}
			if(encontrado) {
				System.out.println("El alumno " + (posFila+1) + " ha sacado un 10 en el módulo " + mod);
			}
		}
			
		sc.close();
	}

}
