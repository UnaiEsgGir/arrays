package conversiones_de_tipo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excursion {

	static Scanner sc = new Scanner(System.in);

	/*
	 * Clase para ver que alumnos son mas jóvenes en una excursión.
	 * Autor: Unai Esgueva Gironda
	 * Fecha: 10/03/2024
	 */
	
	
	public static void main(String[] args) {
		
		int num = cuantosAlumnos();
		
		// Creamos el array con la cantidad de alumnos que nos ha dicho el usuario.
		String alumnos [] [] = new String [num] [2];
		
		pedirDatos(alumnos);
		
		datosJovenes(alumnos);
	
	}

	// Método que nos muestra la información de los alumnos más jóvenes.
	private static void datosJovenes(String[][] alumnos) {
		
		// Buscamos la edad de los más jóvenes de la excursión.
		int min = Integer.parseInt(alumnos[0][1]); // Con el parseInt pasamos un String a un int.
		for(int posFila = 0; posFila < alumnos.length; posFila++) { 
			int edad = Integer.parseInt(alumnos[posFila][1]);
			if(edad < min) {
				min = edad;
			}
		}
		
		int cantidad = 0;
		for(int i = 0; i < alumnos.length; i++) {
			if(Integer.parseInt(alumnos[i][1]) == min) { // Si su edad es la mínima mostramos su información.
				System.out.println("-El alumno " + alumnos[i][0] + " con " + alumnos[i][1] + " años de edad está sentado en el asiento n" + (i+1));
				cantidad++;
			}
		}
		System.out.println("Hay " + cantidad + " alumnos con la edad de " + min + " años."); // Mostramos la cantidad de alumnos con la edad más baja.
	}

	// Método para preguntar al usuario cuantos alumnos van a la excursión.
	private static int cuantosAlumnos() {
		int num = 0;
		boolean valido = false;
		do {
			try {
				System.out.println("¿Cuantos alumnos van a la excursión? (máx. 10)");
				num = sc.nextInt();
				valido = true;
			}catch (InputMismatchException e){
				sc.nextLine();
				System.out.println("Introduce un número entero.");
			}
		}while(num > 10 || num <= 0 || !valido); // Mediante el do-while validamos la entrada de datos.
		return num;
	}

	// Método para pedir el nombre y la edad de los alumnos.
	private static void pedirDatos(String[][] alumnos) {
		for(int posFila = 0; posFila < alumnos.length; posFila++) {
			System.out.println("- Alumno " + (posFila+1) + " -");
				System.out.println("Nombre:");
				alumnos[posFila][0] = sc.next();
				System.out.println("Edad:");
				alumnos[posFila][1] = sc.next();
		}
	}

}
