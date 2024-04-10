package practica3;
import javax.swing.JOptionPane;

public class Ejercicio1 {

	/*
	 * Clase que muestra los elementos de un array bidimensional.
	 * Autor: Unai Esgueva Gironda 
	 * Fecha: 12/03/2024
	 */
	
	public static void main(String[] args) {
		
		// Creamos el array de dos dimensiones.
		int [] [] numeros = {{23,45,11,2},{67,2},{1,2,3,4,5,6}};
		
		// Mostramos los valores.
		JOptionPane.showMessageDialog(null, 
				mostrar(numeros),
				"Mensaje",
				JOptionPane.INFORMATION_MESSAGE
				);
		
	}

	// Método que devuelve un String con todos los valores.
	private static String mostrar(int[][] numeros) {
		String datos ="";
		for(int posFila = 0; posFila < numeros.length; posFila++) {
			datos = datos + "Los elementos de la fila " + (posFila+1) + " son:" + "\n";
			for(int posColum = 0; posColum < numeros[posFila].length; posColum++) {
				datos = datos + "Columna " + (posColum+1) + " valor " + numeros[posFila] [posColum] + "\n";
			}
		}
		return datos;
	}

}
