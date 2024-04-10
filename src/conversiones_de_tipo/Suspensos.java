package conversiones_de_tipo;

import java.util.Scanner;

public class Suspensos {

	static Scanner sc = new Scanner(System.in);
	
	/*
	 * Clase que nos dice cuantos alumnos han suspendido al menos 1 módulo.
	 * Autor: Unai Esgueva Gironda
	 * Fecha: 10/03/2024
	 */
	
	
	public static void main(String[] args) {
		
		// Creamos un array con las notas de 5 alumnos en 3 módulos diferentes.
		float [] [] notas = new float [5] [3];
		int suspensos = 0;
		
			
		pedirNotas(notas);
		
		suspensos = buscarSuspensos(notas, suspensos);
		
		// Le mostramos al usuario cuantos alumnos han suspendido algun módulo.
		System.out.println("Han suspendido algun módulo " + suspensos + " alumnos.");
		
	}

	// Método que busca cuantos alumnos tienen alguna asignatura suspensa.
	private static int buscarSuspensos(float[][] notas, int suspensos) {
		for(int posFila = 0; posFila < notas.length; posFila++) {
			boolean suspenso = false;
			for(int posColum = 0; posColum < notas[posFila].length && suspenso == false; posColum++) {
				if(notas[posFila][posColum] < 5) {
					suspensos++;
					suspenso = true; // Cuando encuentra un suspenso deja de buscar mas suspensos de ese alumno.
				}
			}
		}
		return suspensos;
	}

	// Método para introducir las notas de los alumnos.
	private static void pedirNotas(float[][] notas) {
		// Mediante dos bucles for anidados pedimos las notas de los alumnos.
		for(int posFila = 0; posFila < notas.length; posFila++) {
			System.out.println("- Notas del alumno " + (posFila+1) + " -");
			for(int posColum = 0; posColum < notas[posFila].length; posColum++) {
				System.out.println("Nota del módulo " + (posColum+1) + ":");
				notas[posFila][posColum] = sc.nextFloat();
			}
		}
	}

}
