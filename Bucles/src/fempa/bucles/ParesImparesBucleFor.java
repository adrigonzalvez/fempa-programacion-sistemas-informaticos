package fempa.bucles;

import java.util.Scanner;

public class ParesImparesBucleFor {

	/* Pedir un n?mero n que sea mayor de 2.
	 * Comprobar el dato.
	 * Pedir los n n?meros e indicar cuantos son positivos, cuantos son negativos, cuantos pares y cuantos impares.
	 * */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cant, numero;
		int contPositivos=0, contNegativos=0, contCeros=0, contPares=0, contImpares=0;
		
		System.out.println("POSITIVOS, NEGATIVOS, PARES E IMPARES");
		
		// Pide un n?mero al usuario hasta que introduzca uno mayor que 2:
		boolean numeroCorrecto = false;
		do {
			System.out.print("?Cu?ntos n?meros quieres introducir? ");
			cant = teclado.nextInt();
			if (cant < 3) {
				System.out.println("Debes introducir un n?mero mayor que 2.");
			} else {
				numeroCorrecto = true;
			}
			
		} while(!numeroCorrecto);
	
		// Pode los n n?meros introducidos por el usuario:
		for (int i = 0; i < cant; i++) {
			System.out.print("Introduce n?mero " + (i+1) + ": ");
			numero = teclado.nextInt();
			
			// Positivos, negativos y ceros:
			if (numero > 0) {
				contPositivos++;
			} else if (numero < 0) {
				contNegativos++;
			} else {
				contCeros++;
			}
			
			// Pares o impares:
			if (numero % 2 == 0) {
				contPares++;
			} else {
				contImpares++;
			}
		}
		System.out.println("Has intruducido " + contPositivos + " positivos, " + contNegativos + " negativos y " + contCeros + " ceros.");
		System.out.println("De los cuales, " + contPares + " son pares y " + contImpares + " son impares.");
		
		teclado.close();
	}
	

}
