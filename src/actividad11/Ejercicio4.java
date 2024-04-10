package actividad11;
import java.util.StringTokenizer;

public class Ejercicio4 {

	/*
	 * Clase que nos permite ver cuantas edades tiene una cadena.
	 * Autor: Unai Esgueva Gironda
	 * Fecha: 05/03/2024
	 */
	
	public static void main(String[] args) {
		
		String edades = "20-18-25-40-17-33-22-19-18";
		
		// Creamos un nuevo tokenizer, le pasamos la cadena y el - para que tenga la referencia de por donde separ las palabras
		StringTokenizer tokens = new StringTokenizer(edades, "-");
		
		// Mostramos cuantos tokens hay.
		System.out.print("Hay " + tokens.countTokens() + " edades, que son: ");
		
		// Los mostramos mientras siga habiendo mas.
		while(tokens.hasMoreTokens()) {
			System.out.print(tokens.nextToken() + " ");
		}
		
	}

}
