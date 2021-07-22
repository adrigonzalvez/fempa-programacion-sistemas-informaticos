package fempa.mayorymenortresnumeros;

import java.util.Scanner;

public class MayorYMenor3Numeros {
	
	public static void main(String[] args) {
		float A, B, C;
		Scanner teclado = new Scanner(System.in);

		System.out.println("MAYOR Y MENOR DE 3 NÚMEROS");
		System.out.print("Introduzca el primer número: ");
		A = teclado.nextFloat();
		System.out.print("Introduzca el primer número: ");
		B = teclado.nextFloat();
		System.out.print("Introduzca el primer número: ");
		C = teclado.nextFloat();
		
		// Mayor
		if (A >= B && A >= C) {
			System.out.println("El mayor es A: " + A);
		} else if ( B >= A && B >= C) {
			System.out.println("El mayor es B: " + B);
		} else  {
			System.out.println("El mayor es C: " + C);
		}
		
		// Menor
		if (A <= B && A <= C) {
			System.out.println("El menor es A: " + A);
		} else if ( B <= A && B <= C) {
			System.out.println("El menor es B: " + B);
		} else  {
			System.out.println("El menor es C: " + C);
		}

		teclado.close();
	}


}
