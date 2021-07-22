package fempa.paresimpares;

import java.util.Scanner;

public class ParesImpares {
	
	/*
	 * Realiza un programa que pida 5 números y muestre cuántos de ellos son pares o impares.
	 * (Para calcular el resto de la división, en lugar de usar a%b, emplea Math.floorMod(a, b) )
	 * 
	 * Ejemplo de ejecución:
	 * Introduzca un número: 4
	 * Introduzca un número: 7
	 * Introduzca un número: 9
	 * Introduzca un número: 2
	 * Introduzca un número: 3
	 * Has introducido 2 números pares
	 * Has introducido 3 números impares
	 * NUEVO: Mostrar los que son pares e impares
	 * */

	/* SOLUCION PROPIA */
	/*public static void main(String[] args) {
		int num1, num2, num3, num4, num5;
		int contadorPares = 0, contadorImpares = 0;
		String strPares = "", strImpares = "";
		Scanner teclado = new Scanner(System.in);

		System.out.println("NUMEROS PARES E IMPARES");
		System.out.print("Introduzca n1: ");
		num1 = teclado.nextInt();
		
		// if (Math.floorMod(num1, 2) == 0) {
		if (num1 % 2 == 0) {
			// El número es par
			//contadorPares = contadorPares + 1;
			//contadorPares += 1;
			contadorPares++;	// Post incremento
			//++contadorPares; // Pre incremento
			strPares += num1 + " ";
		} else {
			// El número es impar
			//contadorImpares = contadorImpares + 1;
			//contadorImpares += 1;
			contadorImpares++;	// Post incremento
			//++contadorImpares; // Pre incremento
			strImpares += num1 + " ";
		}
		
		System.out.print("Introduzca n2: ");
		num2 = teclado.nextInt();
		if (num2 % 2 == 0) {
			contadorPares++;
			strPares += num2 + " ";
		} else {
			contadorImpares++;
			strImpares += num2 + " ";
		}
		
		System.out.print("Introduzca n3: ");
		num3 = teclado.nextInt();
		if (num3 % 2 == 0) {
			contadorPares++;
			strPares += num3 + " ";
		} else {
			contadorImpares++;
			strImpares += num3 + " ";
		}
		
		System.out.print("Introduzca n4: ");
		num4 = teclado.nextInt();
		if (num4 % 2 == 0) {
			contadorPares++;
			strPares += num4 + " ";
		} else {
			contadorImpares++;
			strImpares += num4 + " ";
		}
		
		System.out.print("Introduzca n5: ");
		num5 = teclado.nextInt();
		if (num5 % 2 == 0) {
			contadorPares++;
			strPares += num5 + " ";
		} else {
			contadorImpares++;
			strImpares += num5 + " ";
		}
		
		System.out.println("Has introducido " + contadorPares + " números pares: " + strPares);
		System.out.println("Has introducido " + contadorImpares + " números impares: " + strImpares);
		
		teclado.close();
	}*/
	
	
	/* SOLUCIÓN PROFESOR */
	public static void main(String[] args) {
		int num1, num2, num3, num4, num5;
		int contadorPares = 0, contadorImpares = 0;
		String strPares = "", strImpares = "";
		boolean esParN1, esParN2, esParN3, esParN4, esParN5;
		Scanner teclado = new Scanner(System.in);

		System.out.println("NUMEROS PARES E IMPARES");
		System.out.print("Introduzca n1: ");
		num1 = teclado.nextInt();
		System.out.print("Introduzca n2: ");
		num2 = teclado.nextInt();
		System.out.print("Introduzca n3: ");
		num3 = teclado.nextInt();
		System.out.print("Introduzca n4: ");
		num4 = teclado.nextInt();
		System.out.print("Introduzca n5: ");
		num5 = teclado.nextInt();
		
		esParN1 = num1 % 2 == 0;
		esParN2 = num2 % 2 == 0;
		esParN3 = num3 % 2 == 0;
		esParN4 = num4 % 2 == 0;
		esParN5 = num5 % 2 == 0;
		
		if (esParN1) {
			contadorPares++;
			strPares += num1 + ", ";
		} else {
			contadorImpares++;
			strImpares += num1 + ", ";
		}
		if (esParN2) {
			contadorPares++;
			strPares += num2 + ", ";
		} else {
			contadorImpares++;
			strImpares += num2 + ", ";
		}
		if (esParN3) {
			contadorPares++;
			strPares += num3 + ", ";
		} else {
			contadorImpares++;
			strImpares += num3 + ", ";
		}
		if (esParN4) {
			contadorPares++;
			strPares += num4 + ", ";
		} else {
			contadorImpares++;
			strImpares += num4 + ", ";
		}
		if (esParN5) {
			contadorPares++;
			strPares += num5 + ", ";
		} else {
			contadorImpares++;
			strImpares += num5 + ", ";
		}
		
		strPares = strPares.substring(0, strPares.length() - 2);
		strImpares = strImpares.substring(0, strImpares.length() - 2);
		
		System.out.println("Has introducido " + contadorPares + " números pares: " + strPares);
		System.out.println("Has introducido " + contadorImpares + " números impares: " + strImpares);
		
		teclado.close();
	}
	
}
