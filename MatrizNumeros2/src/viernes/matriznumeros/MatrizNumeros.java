package viernes.matriznumeros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MatrizNumeros {

	public static void main(String[] args) {
		//int[] numeros = {1,2,3,4,5,6,7,8,9};	// En Java no son mutables
		ArrayList<Integer> numeros = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		int[][] matrix = new int[3][3];
		Random rand = new Random();
		int num;
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				num = rand.nextInt(numeros.size());	// Genera el número aleatorio a partir del tamaño del ArrayList.
				matrix[i][j] = numeros.get(num);	// Obtiene el número a partir de la posición
				numeros.remove(num);				// Borra el número del ArrayList
			}
		}
		printMatrix(matrix);
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
	
}
