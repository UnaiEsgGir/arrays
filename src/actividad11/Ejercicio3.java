package actividad11;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	/*
	 * Clase que nos genera una contraseña aleatoria.
	 * Autor: Unai Esgueva Gironda
	 * Fecha: 05/03/2024
	 */
	
	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		// Cadena que contiene los carácteres apartir de los que vamos a generar la contraseña.
		String caracteres = "abcdefghijklmnopqrstuvwxyz0123456789";
		
		// Pedimos una longitud máxima y mínima de la contraseña.
		System.out.println("-= Contraseñas =-");
		System.out.println("Dime una longitud mínima.");
		int min = sc.nextInt();
		System.out.println("Dime una longitud máxima.");
		int max = sc.nextInt();
		
		int longitud = rd.nextInt(max-min+1) + min; // Generamos una longitud aleatoria. Le sumamos el minimo para que no sea de mas de corta. El +1 porque sino no incluye al maximo.
		
		// Con el StringBuilder creamos una cadena y la vamos añadiendo los nuevos carácteres.
		StringBuilder contraseña = new StringBuilder();
		for(int i = 0; i < longitud; i++) { // Se generan carácteres aleatorios hasta llegar a la longitud deseada.
			int pos = rd.nextInt(caracteres.length());
			contraseña.append(caracteres.charAt(pos));
		}
		
		// Le mostramos la contraseña aleatoria al usuario.
		System.out.println("Tu contraseña es: " + contraseña);
		sc.close();
	}

}
