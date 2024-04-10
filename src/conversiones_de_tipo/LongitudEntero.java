package conversiones_de_tipo;

import java.util.Scanner;

public class LongitudEntero {

	/*
	 * Clase que nos dice la cantidad de dígitos que tiene un número.
	 * Autor: Unai Esgueva Gironda
	 * Fecha: 10/03/2024
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Pedimos un número.
		System.out.println("Dime un número entero:");
		int num = sc.nextInt();
		
		// Lo pasamos a String.
		String cadena = String.valueOf(num);
		
		// Le decimos los dígitos de su número.
		System.out.println("Tu número tiene " + cadena.length() + " dígitos.");
		
		sc.close();
	}

}
