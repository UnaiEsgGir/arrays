package actividad11;
import java.util.Scanner;

public class Ejercicio2 {

	/*
	 * Clase que nos permite ver si una frase es palíndroma o no.
	 * Autor: Unai Esgueva Gironda
	 * Fecha: 05/03/2024
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Pedimos la frase/palabra al usuario.
		System.out.println("Dime una frase:");
		String texto = sc.next();
		
		if(esPalindromo(texto)) {
			System.out.println("Tu frase es palíndroma, se lee igual por el principio que por el final.");
		}
		else {
			System.out.println("Tu frase no es palíndroma.");
		}
		
		
		sc.close();
	}

	// Método que devuelves si es verdadero o falso que la frase es palíndroma.
	private static boolean esPalindromo(String texto) {
		// Creamos la misma palbra pero del reves.
		StringBuilder otxet = new StringBuilder();
		for(int i = texto.length() - 1; i > -1; i--) {
			otxet.append(texto.charAt(i));
		}

		// Si la palabra y la palabra del reves son iguales devolvemos true.
		if(texto.equals(otxet.toString())) {
			return true;
		}
		
		else {
			return false;
		}
	}

}
