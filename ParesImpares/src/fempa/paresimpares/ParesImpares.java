package fempa.paresimpares;

import java.util.Scanner;

public class ParesImpares {
	
	/*
	 * Realiza un programa que pida 5 n�meros y muestre cu�ntos de ellos son pares o impares.
	 * (Para calcular el resto de la divisi�n, en lugar de usar a%b, emplea Math.floorMod(a, b) )
	 * 
	 * Ejemplo de ejecuci�n:
	 * Introduzca un n�mero: 4
	 * Introduzca un n�mero: 7
	 * Introduzca un n�mero: 9
	 * Introduzca un n�mero: 2
	 * Introduzca un n�mero: 3
	 * Has introducido 2 n�meros pares
	 * Has introducido 3 n�meros impares
	 * */

	public static void main(String[] args) {
		int num, contPares = 0, contImpares = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("NUMEROS PARES E IMPARES");
		System.out.print("Introduzca un n�mero: ");
		num = teclado.nextInt();
		if (num % 2 == 0) {
			contPares++;
			System.out.println(num + " -> es par");
		} else {
			contImpares++;
			System.out.println(num + " -> es impar");
		}
		
		System.out.print("Introduzca un n�mero: ");
		num = teclado.nextInt();
		if (num % 2 == 0) {
			contPares++;
			System.out.println(num + " -> es par");
		} else {
			contImpares++;
			System.out.println(num + " -> es impar");
		}
		
		System.out.print("Introduzca un n�mero: ");
		num = teclado.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + " -> es par");
			contPares++;
		} else {
			contImpares++;
			System.out.println(num + " -> es impar");
		}
		
		System.out.print("Introduzca un n�mero: ");
		num = teclado.nextInt();
		if (num % 2 == 0) {
			contPares++;
			System.out.println(num + " -> es par");
		} else {
			contImpares++;
			System.out.println(num + " -> es impar");
		}
		
		System.out.print("Introduzca un n�mero: ");
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
