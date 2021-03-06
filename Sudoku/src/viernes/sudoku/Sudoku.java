package viernes.sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Sudoku {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		int[][] sudoku = new int[9][9];
		int[] row = new int[9];
		Random rand = new Random();
		int num;
		
		for (int i=0; i<row.length; i++) {
			num = rand.nextInt(numeros.size());	// Genera el n?mero aleatorio a partir del tama?o del ArrayList.
			row[i] = numeros.get(num);			// Obtiene el n?mero a partir de la posici?n
			numeros.remove(num);				// Borra el n?mero del ArrayList
		}
		printRow(row);

	}
	
	// Muestra la matriz multidimensional:
	/*private static void printMatrix(int[][] arr) {
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
	}*/
	
	private static void printRow(int[] row) {
		for (int i=0; i<row.length; i++) {
			System.out.print(row[i] + " ");
		}
	}

}
