package conversiones_de_tipo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroMasAlto {
	
	static Scanner sc = new Scanner(System.in);

	/*
	 * Clase para buscar el número mas alto de cada columna de un array bidimensional.
	 * Autor: Unai Esgueva Gironda
	 * Fecha: 10/03/2024
	 */
	
	
	public static void main(String[] args) {
		
		// Creamos el array.
		int [] [] numeros = new int [7] [5]; // [filas] [columnas]
		
		pedirValores(numeros);
		
		valorMaximo(numeros);
		
		
	}

	// Método para buscar el número mas alto de cada columna.
	private static void valorMaximo(int[][] numeros) {
		for(int posColum = 0; posColum < numeros[0].length; posColum++) {
			int max = numeros[0][posColum]; // El máximo por defecto es el número de esa columna de la primera fila.
			int Fila = 0;
			for(int posFila = 0; posFila < numeros.length; posFila++) {
				if(numeros[posFila][posColum] >= max) { // Si el número es mas alto que el máximo pasa a ser el máximo, o si es igual (asi guarda el de la última posición).
					max = numeros[posFila][posColum];
					Fila = posFila;
				}
			}
			System.out.println("El numero más alto de la columna " + (posColum+1) + " es " + max + " y está en la fila " + (Fila+1));
		}
	}

	// Método para pedir al usuario que meta los valores.
	private static void pedirValores(int[][] numeros) {
		for(int posColum = 0; posColum < numeros[0].length; posColum++) {
			System.out.println("- Columna " + (posColum+1) + " -");
			for(int posFila = 0; posFila < numeros.length; posFila++) {
				System.out.println("Fila " + (posFila+1) + ":");
				validarValores(numeros, posColum, posFila); // Comprobamos que el dato es correcto.
			}
		}
	}

	// Método que comprueba que el número sea un entero.
	private static void validarValores(int[][] numeros, int posColum, int posFila) {
		boolean valido = false;
		do {
			try {
				numeros[posFila][posColum] = sc.nextInt();
				valido = true;
			}
			catch(InputMismatchException e) {
				sc.nextLine();
				System.out.println("Debes introducir un número entero.");
			}
		}while(!valido);
	}

}
