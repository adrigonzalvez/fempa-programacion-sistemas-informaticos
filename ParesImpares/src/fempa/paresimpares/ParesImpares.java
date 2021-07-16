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
	 * */

	public static void main(String[] args) {
		int num, contPares = 0, contImpares = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("NUMEROS PARES E IMPARES");
		System.out.print("Introduzca un número: ");
		num = teclado.nextInt();
		if (num % 2 == 0) {
			contPares++;
			System.out.println(num + " -> es par");
		} else {
			contImpares++;
			System.out.println(num + " -> es impar");
		}
		
		System.out.print("Introduzca un número: ");
		num = teclado.nextInt();
		if (num % 2 == 0) {
			contPares++;
			System.out.println(num + " -> es par");
		} else {
			contImpares++;
			System.out.println(num + " -> es impar");
		}
		
		System.out.print("Introduzca un número: ");
		num = teclado.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + " -> es par");
			contPares++;
		} else {
			contImpares++;
			System.out.println(num + " -> es impar");
		}
		
		System.out.print("Introduzca un número: ");
		num = teclado.nextInt();
		if (num % 2 == 0) {
			contPares++;
			System.out.println(num + " -> es par");
		} else {
			contImpares++;
			System.out.println(num + " -> es impar");
		}
		
		System.out.print("Introduzca un número: ");
		num = teclado.nextInt();
		if (num % 2 == 0) {
			contPares++;
			System.out.println(num + " -> es par");
		} else {
			contImpares++;
			System.out.println(num + " -> es impar");
		}
		
		System.out.println("Has introducido " + contPares + " pares y " + contImpares + " impares.");
		
		
		teclado.close();
	}

}
