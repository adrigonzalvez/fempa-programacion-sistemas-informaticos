package fempa.bucles;

import java.util.Scanner;

public class Factorial {

	/* Calcula el factorial de un n�mero.
	 * Pide un n�mero y calcula su factorial.
	 * Utiliza como num�rico el tipo "double".
	 * */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double num, factorial;
		String strFactorial;
		
		System.out.println("FACTORIAL DE UN N�MERO");
		System.out.print("N�mero: ");
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
			strFactorial = strFactorial.substring(0, strFactorial.lastIndexOf(" x "));	// Elimina el �ltimo " x "
			strFactorial += " = " + factorial;
			System.out.print(strFactorial);
		}
		
		teclado.close();
	}
	
}
