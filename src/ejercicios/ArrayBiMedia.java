package ejercicios;
import java.util.Scanner;

public class ArrayBiMedia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [][] arrayBi = new int [5][5];
		
		for(int posFila = 0; posFila < arrayBi.length; posFila++) {
			System.out.println("Elementos de la fila " + (posFila+1) + ":");
			for(int posColum = 0; posColum < arrayBi[posFila].length; posColum++) {
				System.out.println("Columna " + (posColum+1) + " introduce el valor: ");
				arrayBi[posFila] [posColum] = sc.nextInt();
				}
		}

		for(int posFila = 0; posFila < arrayBi.length; posFila++) {
			System.out.println("Media de la fila " + (posFila+1) + ":");
			int media = 0;
			int posColum;
			for(posColum = 0; posColum < arrayBi[posFila].length; posColum++) {
				media = media + arrayBi[posFila][posColum];
			}
			media = media/arrayBi[posColum-1].length;
			System.out.println(media);
		}
		
		sc.close();
	}

}
