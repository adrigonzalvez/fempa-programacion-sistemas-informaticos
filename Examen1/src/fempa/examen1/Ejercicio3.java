package fempa.examen1;

import java.util.Scanner;

public class Ejercicio3 {

	/* Ejercicio 3:
	 * Dado el siguiente diagrama de flujo,
	 * implementa el código en Java
	 * */
	public static void main(String[] args) {
		
		// Declarar variables
		Scanner teclado = new Scanner(System.in);
		int a, b;
		
		// Leer por teclado "a"
		System.out.print("Introduce el número a: ");
		a = teclado.nextInt();
		
		// Leer por teclado "b"
		System.out.print("Introduce el número b: ");
		b = teclado.nextInt();
		
		// Comparar si "a" es mayor o igual a "b"
		if (a>=b) {
			// Escribir "a es mayor o igual"
			System.out.println("a es mayor o igual");
		} else {
			// Escribir "b es mayor"
			System.out.println("b es mayor");
		}
		
		teclado.close();

	}

}
