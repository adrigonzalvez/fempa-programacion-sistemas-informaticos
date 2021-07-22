package fempa.mayorymenortresnumeros;

import java.util.Scanner;

public class MayorYMenor3Numeros3 {
	
	/* SOLUCIÓN PROPIA */
	/* 
	 * Calcular menor, mayor y mediano usando solo 4 ifs,
	 * sin else y una sola comprobació por if */
	public static void main(String[] args) {
		int A, B, C;
		int mayor, medio, menor;
		Scanner teclado = new Scanner(System.in);

		System.out.println("MAYOR Y MENOR DE 3 NÚMEROS");
		System.out.print("Introduzca el primer número: ");
		A = teclado.nextInt();
		System.out.print("Introduzca el segundo número: ");
		B = teclado.nextInt();
		System.out.print("Introduzca el tercer número: ");
		C = teclado.nextInt();
		
		

		teclado.close();
	}
	
	