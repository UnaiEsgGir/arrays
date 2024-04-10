package practica1;
import java.util.Scanner;

public class MatrizUnitaria {

	/*
	 * Un programa que dibuja todo ceros menos la diagonal, que son unos.
	 * Autor: Unai Esgueva Gironda
	 * Fecha: 27/02/2024
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario las dimensiones de la matriz o array.
		System.out.println("¿De que tamaño quieres la matriz?");
		int num = sc.nextInt();
		
		// Creamos el array, que es bi-dimensional.
		int [] [] arrayBi = new int [num][num];
		
		// Si la posición de la fila y la de la columna es la misma (es la diagonal) le da el valor de 1.
		for(int posFila = 0; posFila < arrayBi.length; posFila++) {
			for(int posColum = 0; posColum < arrayBi[posFila].length; posColum++) {
				if(posFila==posColum) {
					arrayBi[posFila][posColum] = 1;
				}
			}
		}
		
		// Mostramos el resultado por consola.
		for(int posFila = 0; posFila < arrayBi.length; posFila++) {
			System.out.println(" ");
			for(int posColum = 0; posColum < arrayBi[posFila].length; posColum++) {
				System.out.print(arrayBi[posFila][posColum] + " "); // Muestra el valor de la posición.
			}
		}
		
		sc.close();
	}

}
