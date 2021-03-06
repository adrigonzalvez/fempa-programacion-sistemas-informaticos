package viernes.matriznumeros;

import java.util.Random;

public class MatrizNumeros {

	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		int num;
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				do {
					num = numRandom(1, 9);
				} while (containsValue(num, matrix));
				matrix[i][j] = num;
			}
		}
		
		printMatrix(matrix);
	}
	
	// Genera un n?mero aleatorio
	private static int numRandom(int min, int max) {
		Random rand = new Random();
		return rand.nextInt(max - min + 1) + min;
	}
	
	// Muestra la matriz multidimensional:
	private static void printMatrix(int[][] arr) {
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
	
	// Comprueba si la matriz multidimensional contiene o no el valor:
	private static boolean containsValue(int val, int[][] arr) {
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				if (arr[i][j] == val) {
					return true;
				}
			}
		}
		return false;
	}

}
