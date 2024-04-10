package actividad11;

import java.util.Scanner;

public class Ejercicio1 {

	/*
	 * Clase que permite usar métodos de la clase String sobre un texto dado por el usuario.
	 * Autor: Unai Esgueva Gironda
	 * Fecha: 05/03/2024
	 */
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// Le pedimos al usuario que introduzca un texto.
		System.out.println("Dime un texto:");
		String texto = sc.nextLine();
		
		// bucle que permite usar las diferentes funciones del programa.
		int opcion = 0;
		do {
			opcion = menu(); // Le mostramos el menú.
			
			switch(opcion) {
				case 0:
					System.out.println("Saliendo...");
					break;
				case 1:
					vocalesTexto(texto);
					break;
				case 2:
					palabraTexto(texto);
					break;
				case 3:
					alrevesTexto(texto);
					break;
				default:
					System.out.println("Error, opción no válida.");
			}
		}while (opcion != 0);
		
	
	}

	// Método que le da la vuelta al texto.
	private static void alrevesTexto(String texto) {
		StringBuilder otxet = new StringBuilder();
		for(int i = texto.length() - 1; i > -1; i--) { // Mediante el bucle seleccionamos el ultimo caracter del texto y lo añadimos al texto del reves.
			otxet.append(texto.charAt(i)); // Lo añadimos al final del texto del reves.
		}
		System.out.println(texto + " -=-=- " + otxet);
	}

	// Método que nos dice cuantas veces aparece una palabra en el texto.
	private static void palabraTexto(String texto) {
		System.out.println("Dime una palabra:");
		String palabra = sc.next();
		
		int veces = 0;
		int i = texto.indexOf(palabra); // Buscamos si aparece la palabra. Si aparece nos dice la posición.
		
		while(i > -1) { // Mientras que la palabra aparezca la seguimos buscando mas veces.
			veces++;
			i = texto.indexOf(palabra, i+1); // Sueguimos buscando desde la siguiente posición.
		}
		
		System.out.println("La palabra " + palabra + " aparece " + veces + " veces.");
	}

	// Método que permite contar las vocales de un texto.
	private static void vocalesTexto(String texto) {
		int vocales = 0;
		texto  = texto.toLowerCase(); // Lo pasamos a minúsculas para no tener que contemplar mayúculas y minúsculas.
		for(int i = 0; i<texto.length(); i++) {
			char letra = texto.charAt(i); // Revisamos letra a letra.
			switch(letra) {
			case 'a', 'e', 'i', 'o', 'u': // Si la letra es una vocal aumentamos el contador.
				vocales++;
			}
		}
		System.out.println("Hay " + vocales + " vocales.");
	}

	// Método que le muestra las diferentes opciones al usuario.
	private static int menu() {
		int opcion;
		System.out.println("¿Que quieres hacer con tu texto?");
		System.out.println("-= Menú =-");
		System.out.println("0 - Salir");
		System.out.println("1 - Vocales");
		System.out.println("2 - Palabra");
		System.out.println("3 - Texto al revés.");
		opcion = sc.nextInt();
		return opcion;
	}

}
