package fempa.bucles;

import java.util.Scanner;

public class Factorial {

	/* Calcula el factorial de un número.
	 * Pide un número y calcula su factorial.
	 * Utiliza como numérico el tipo "double".
	 * */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double num, factorial;
		String strFactorial;
		
		System.out.println("FACTORIAL DE UN NÚMERO");
		System.out.print("Número: ");
		num = teclado.nextInt();
		
		factorial = 1;
		if (num == 0) {
			strFactorial = " 0! = " + factorial;
			System.out.print(strFactorial);
		} else {
			strFactorial = num + "! = ";
			while (num > 0) {
				strFactorial += num + " x ";
				factorial *= num;
				num--;
			}
			strFactorial = strFactorial.substring(0, strFactorial.lastIndexOf(" x "));	// Elimina el último " x "
			strFactorial += " = " + factorial;
			System.out.print(strFactorial);
		}
		
		teclado.close();
	}
	
}
