package fempa.mayorymenortresnumeros;

import java.util.Scanner;

public class MayorYMenor3Numeros3 {
	
	/* SOLUCI�N PROPIA */
	/* 
	 * Calcular menor, mayor y mediano usando solo 4 ifs,
	 * sin else y una sola comprobaci� por if */
	public static void main(String[] args) {
		int A, B, C;
		int mayor, medio, menor;
		Scanner teclado = new Scanner(System.in);

		System.out.println("MAYOR Y MENOR DE 3 N�MEROS");
		System.out.print("Introduzca el primer n�mero: ");
		A = teclado.nextInt();
		System.out.print("Introduzca el segundo n�mero: ");
		B = teclado.nextInt();
		System.out.print("Introduzca el tercer n�mero: ");
		C = teclado.nextInt();
		
		

		teclado.close();
	}
	
	