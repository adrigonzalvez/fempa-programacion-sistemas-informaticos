package fempa.Bucles11_15;

import java.util.Scanner;

public class Bucles11_15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion;
		do {
			opcion = menu(teclado);
			if (opcion == 0) {
				System.out.println("Hasta la próxima!");
				break;
			}
			lanzaEjercicio(teclado, opcion);
		} while (opcion != 0);
		teclado.close();
	}
	
	public static int pideNumero(Scanner teclado, String texto) {
		System.out.print(texto);
		int num = teclado.nextInt();
		return num;
	}

	public static char pideCaracter(Scanner teclado, String texto) {
		System.out.print(texto);
		char num = teclado.next().charAt(0);
		return num;
	}

	public static int menu(Scanner teclado) {
		int opcion;
		System.out.println("************************************");
		System.out.println("*** EJERCICIOS BUCLES DEL 1 AL 5 ***");
		System.out.println("************************************");
		System.out.println("1) Ejercicio 11");
		System.out.println("2) Ejercicio 12");
		System.out.println("3) Ejercicio 13");
		System.out.println("4) Ejercicio 14");
		System.out.println("5) Ejercicio 15");
		System.out.println("6) Ejercicio 23");
		System.out.println("0) Salir");
		opcion = pideNumero(teclado, "Introduce una opción: ");

		return opcion;
	}

	public static void lanzaEjercicio(Scanner teclado, int opc) {
		switch (opc) {
		case 1:
			ejercicio11(teclado);
			break;
		case 2:
			ejercicio12(teclado);
			break;
		case 3:
			ejercicio13(teclado);
			break;
		case 4:
			ejercicio14(teclado);
			break;
		case 5:
			ejercicio15(teclado);
			break;
		case 6:
			ejercicio23(teclado);
			break;
		default:
			System.out.println("Opción no válida.");		
		}
		System.out.println("");
	}
	
	/**
	 * Ejercicio11:
	 * Escribe un programa que muestre la siguiente figura.
	 * El número de filas y columnas se lee por teclado.
	 * 
	 * Ejemplo: 5 filas y 6 columnas
	 * 		* * * * * *
	 * 		  * * * * * *
	 * 		* * * * * *
	 * 		  * * * * * *
	 *      * * * * * *
	 * @param teclado
	 */
	public static void ejercicio11(Scanner teclado) {
		int filas, columnas;
		
		System.out.println("\nEJERCICIO 11:");
		filas = pideNumero(teclado, "Introduce el número de filas: ");
		columnas = pideNumero(teclado, "Introduce el número de columnas: ");
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				
				if (i % 2 != 0 && j == 0) {
					// Si es fila impar y es la primera columna:
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
		
	/**
	 * Ejercicio12:
	 * Programa que muestre la siguiente figura.
	 * El número de filas se introduce por teclado.
	 * 
	 * Ejemplo: Para 6 filas:
	 * 			*
	 * 		  * * *
	 * 		* * * * *
	 *    * * * * * * *
	 *  * * * * * * * * *
	 * @param teclado
	 */
	public static void ejercicio12(Scanner teclado) {
		int filas;
		
		System.out.println("\nEJERCICIO 12:");
		filas = pideNumero(teclado, "Introduce el número de filas: ");
		
		System.out.println();
		
		// Solución propia:
		for (int i = 0; i < filas; i++) {
			// Parte izquierda del triángulo:
			for (int j = 0; j < filas; j++) {
				if (j >= (filas - i - 1)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			// Parte derecha del triángulo:
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// Solución profesor:
		for (int f = 1; f <= filas; f++) {
			// Bucle huecos:
			for (int h = 1; h <= (filas-f); h++ ) {
				System.out.print(" ");
			}
			// Bucle estrellas:
			for (int e = 1; e <= ((f*2)-1); e++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	/**
	 * Programa que muestra el siguiente patrón de números.
	 * El número de filas se pide por teclado.
	 * 
	 * Ejemplo: Para 5 filas
	 *  1   2   3   4   5
	 *  2   4   6   8  10
	 *  3   6   9  12  15
	 *  4   8  12  16  20
	 *  5  10  15  20  25
	 * @param teclado
	 */
	public static void ejercicio13(Scanner teclado) {
		int filas;
		
		System.out.println("\nEJERCICIO 13:");
		filas = pideNumero(teclado, "Introduce el número de filas: ");
		
		System.out.println();
		int acum;
		int posFila;
		for (int i = 1; i <= filas; i++) {
			posFila = i;
			acum = 0;
			for (int j = 0; j < filas; j++) {
				acum += posFila;
				if (acum < 10) {
					// Añade un espacio si sólo tiene un dígito
					System.out.print("  " + acum + " ");
				} else {
					System.out.print(" " + acum + " ");
				}
				
			}
			System.out.println();
		}
	}
	
	/**
	 * Ejercicio14:
	 * Programa que muestre el siguiente patrón de números.
	 * El número de filas se pide por teclado.
	 * 
	 * Ejemplo: Para 4 filas
	 * 		1 2 3 4
	 *      2 3 4
	 *      3 4
	 *      4
	 * @param teclado
	 */
	public static void ejercicio14(Scanner teclado) {
		int filas;
		
		System.out.println("\nEJERCICIO 14:");
		filas = pideNumero(teclado, "Introduce el número de filas: ");
		
		int cont;
		for (int i = 1; i <= filas; i++) {
			cont = i;
			for (int j = 0; j <= (filas-i); j++) {
				System.out.print(" " + cont + " ");
				cont++;
			}
			System.out.println();
		}
		
		System.out.println();
	}
	
	/**
	 * Ejercicio15:
	 * Programa que muestra la siguiente figura.
	 * El número de filas se pide por teclado.
	 * 
	 * Ejemplo: Para 4 filas
	 * 		* *
	 * 		* * * *
	 * 		* * * * * *
	 * 		* * * * * * * *
	 * 
	 * @param teclado
	 */
	public static void ejercicio15(Scanner teclado) {
		int filas;
		
		System.out.println("\nEJERCICIO 15:");
		filas = pideNumero(teclado, "Introduce el número de filas: ");
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < (i+1)*2; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	/**
	 * Ejercicio23:
	 * Programa que muestre la figura siguiente.
	 * El número de filas se pide por teclado y debe ser impar mayor que 2.
	 * 
	 * Ejemplo: Para 7 filas
	 * 		*
	 * 		* *
	 * 		* * *
	 * 		* * * *
	 * 		* * *
	 * 		* * 
	 * 		*
	 * @param teclado
	 */
	public static void ejercicio23(Scanner teclado) {
		int filas;
		
		System.out.println("\nEJERCICIO 23:");
		filas = pideNumero(teclado, "Introduce el número de filas: ");
		
		// Comprueba si es mayor que 2 e impar:
		if (filas > 2 && filas % 2 != 0) {
			
			for (int i = 0; i < filas; i++) {
				
				// Parte superior del triángulo:
				if (i <= filas/2) {
					for (int j = 0; j < i + 1; j++) {
						System.out.print("*");
					}
				} 
				// Parte inferior del triángulo:
				else {
					for (int j = filas; j > i; j--) {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			
		} else {
			System.out.println("El número de filas debe ser mayor que 2 e impar.");
		}
		
		
	}

}
