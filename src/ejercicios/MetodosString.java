package ejercicios;
import java.util.Scanner;

public class MetodosString {

	/*
	 * Prueba de los métodos de String.
	 * Autor: Unai Esgueva Gironda
	 * Fecha: 27/02/2024
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Comprobar si una cadena de caracteres comienza o termina con una cadena de caracteres dada.
		String nombre1 = "Unai";
		if(nombre1.startsWith("U") && nombre1.endsWith("i")) {
			System.out.println("El nombre " + nombre1 + " empieza por U y acaba por i");
		}
		
		// Suprimir espacios en blanco al principio y al final de una cadena de caracteres.
		String cadena = "             TEXTO                  ";
		System.out.println("Con espacios " + cadena + " Sin espacios " + cadena.trim());
		
		// Cambiar las letras a mayúsculas o minúsculas.
		String mayusculas = "MAYUSCULAS";
		String minusculas = "minusculas";
		System.out.println(mayusculas.toLowerCase() + " " +  minusculas.toUpperCase());
		
		// Buscar una subcadena dentro de una cadena de caracteres.
		String cadena2 = "programacion";
		if(cadena2.substring(0, 2).equals("pr")) { // buscamos PR
			System.out.println("Sale pr dentro de " + cadena2);
		}
		
		// Sustituir una subcadena por otra subcadena dada.
		String cadena3 = "el perro es un animal";
		System.out.println("Cadena antigua: " + cadena3 + " Cadena nueva: "+ cadena3.replace("perro", "gato"));
		
		// Comprobar si dos cadenas son iguales sin distinguir entre mayúsculas y minúsculas.
		String cadenaA = "hola";
		String cadenaB = "Hola";
		System.out.println(cadenaA.equalsIgnoreCase(cadenaB));
		
		// Comparar dos cadenas. (cadena1.CompareTo(cadena2) > 0) → cadena1 es superior a cadena2
		String cadenaC = "martes";
		String cadenaD = "miercoles";
		if(cadenaC.compareTo(cadenaD) > 0) {
			System.out.println("cadenaC es mayor que cadenaD");
		}
		else {
			System.out.println("cadenaD es mayor que cadenaC");
		}
		
		// Concatenar cadenas.
		String cadena4 = "Buenos ";
		System.out.println(cadena4.concat("dias"));
		
		// Pedir al usuario su nombre y apellidos en una misma cadena y devolver otra cadena con solo el nombre. Y devolver otra cadena con solo los apellidos.
		System.out.println("Dime tu nombre y apellido:");
		String nombrecompleto = sc.nextLine();
		int pos = nombrecompleto.indexOf(" ");
		System.out.println("Nombre: " + nombrecompleto.substring(0, pos));
		System.out.println("Apellido: " + nombrecompleto.substring(pos+1, nombrecompleto.length()));

		
		
		sc.close();
	}

}
