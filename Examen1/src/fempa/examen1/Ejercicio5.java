package fempa.examen1;

import java.util.Scanner;

public class Ejercicio5 {

	/* Ejercicio 5:
	 * Genera el c�digo Java que cumpla los siguientes las siguientes necesidades:
	 * 	� Solicitar al usuario 2 n�meros.
	 * 	� Determinar y mostrar qu� n�mero es mayor.
	 * 	� Mostrar la diferencia entre ambos n�meros en valor absoluto (sin n�meros negativos).
	 * 	� Mostrar de menor a mayor, todos los n�meros que hay entre los n�meros introducidos por el usuario.
	 * 	  En el caso de que los n�meros introducidos por el usuario sean el mismo, no mostrar nada.
	 * 
	 * */
	
	/* SOLUCI�N PROPIA */
	/*public static void main(String[] args) {
		// Declarar variables
		Scanner teclado = new Scanner(System.in);
		int num1, num2, mayor, menor, diferencia;
			
		// Solicitar al usuario 2 n�meros:
		System.out.print("Introduce el primer n�mero: ");
		num1 = teclado.nextInt();
		
		// Leer por teclado "b"
		System.out.print("Introduce el segundo n�mero: ");
		num2 = teclado.nextInt();
		
		// Determinar y mostrar qu� n�mero es mayor:
		if (num1 > num2) {
			// num1 es mayor, num1 es menor
			mayor = num1;
			menor = num2;
			System.out.println(num1 + " > " + num2 + " -> El mayor es " + mayor + " y el menor es " + menor);
		} else if (num1 < num2){
			// num1 es menor, num2 es mayor
			mayor = num2;
			menor = num1;
			System.out.println(num2 + " > " + num1 + " -> El mayor es " + mayor + " y el menor es " + menor);
		} else {
			mayor = 0;
			menor = 0;
			System.out.println("Ambos n�meros son iguales");
		}
		
		// Mostrar la diferencia entre ambos n�meros en valor absoluto:
		diferencia = num1 - num2;
		if (diferencia < 0) {
			diferencia *= -1;
		}
		System.out.println("Diferencia: |" + num1 + " - " + num2 + "| = " + diferencia);
		
		// Mostrar de menor a mayor, todos los n�meros que hay entre los n�meros introducidos por el usuario.
		// En el caso de que los n�meros introducidos por el usuario sean el mismo, no mostrar nada.
		if (num1 != num2) {
			System.out.print("N�meros entre " + menor + " y " + mayor + ": ");
			for (int i = menor + 1; i < mayor; i++) {
				System.out.print(i + " ");
			}
		}
		
		teclado.close();
	}*/
	
	/* SOLUCI�N PROFESOR */
	public static void main(String[] args) {
		// Declarar variables
		Scanner teclado = new Scanner(System.in);
		int num1, num2, diferencia;
			
		// Solicitar al usuario 2 n�meros:
		System.out.print("Introduce el primer n�mero: ");
		num1 = teclado.nextInt();
		
		// Leer por teclado "b"
		System.out.print("Introduce el segundo n�mero: ");
		num2 = teclado.nextInt();
		
		// Determinar y mostrar qu� n�mero es mayor:
		if (num1 > num2) {
			// num1 es mayor, num1 es menor
			System.out.println("El mayor es: " + num1);
			diferencia = num1-num2;
		} else {
			// num1 es menor, num2 es mayor
			System.out.println("El mayor es: " + num2);
			diferencia = num2-num1;
		}
		
		// Opci�n 2:
		//diferencia = Math.abs(num1-num2);
		
		// Opci�n 3:
		//diferencia = num1-num2;
		//if (diferencia < 0) diferencia = diferencia * -1;
		
		System.out.println("La diferencia entre ambos n�meros es: " + diferencia);
		
		// Mostrar de menor a mayor, todos los n�meros que hay entre los n�meros introducidos por el usuario.
		// En el caso de que los n�meros introducidos por el usuario sean el mismo, no mostrar nada.
		if (num1 > num2) {
			for (int numeroActual = num2 + 1; numeroActual < num1; numeroActual++) {
				System.out.print(numeroActual + " ");
			}
		} else if (num1 < num2) {
			int numeroActual = num1 + 1;
			do {
				System.out.print(numeroActual + " ");
				numeroActual++;
			} while(numeroActual < num2);
		}
		
		teclado.close();
	}

}
