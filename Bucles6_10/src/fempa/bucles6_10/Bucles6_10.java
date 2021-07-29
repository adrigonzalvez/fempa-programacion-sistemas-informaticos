package fempa.bucles6_10;

import java.util.Scanner;

public class Bucles6_10 {

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
		System.out.println("1) Ejercicio 6");
		System.out.println("2) Ejercicio 7");
		System.out.println("3) Ejercicio 8");
		System.out.println("4) Ejercicio 9");
		System.out.println("5) Ejercicio 10");
		System.out.println("0) Salir");
		opcion = pideNumero(teclado, "Introduce una opción: ");

		return opcion;
	}

	public static void lanzaEjercicio(Scanner teclado, int opc) {
		switch (opc) {
		case 1:
			ejercicio6(teclado);
			break;
		case 2:
			ejercicio7(teclado);
			break;
		case 3:
			ejercicio8(teclado);
			break;
		case 4:
			ejercicio9(teclado);
			break;
		case 5:
			ejercicio10(teclado);
			break;
		default:
			System.out.println("Opción no válida.");		
		}
		System.out.println("");
	}

	/**
	 * Ejercicio6:
	 * Programa que muestra la siguiente figura.
	 * El número de filas se lee por teclado.
	 * 
	 * Ejemplo: Para 5 filas
	 * 		1
	 * 		2 3
	 * 		4 5 6
	 * 		7 8 9 0
	 * 		1 2 3 4 5
	 * 
	 * @param teclado
	 */
	public static void ejercicio6(Scanner teclado) {
		int filas, cont;
		String numeros = "1234567890";

		System.out.println("\nEJERCICIO 6:");
		filas = pideNumero(teclado, "Introduce el número de filas: ");

		cont = 0;
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" " + numeros.charAt(cont) + " ");
				cont++;
				if (cont == numeros.length()) {
					cont = 0;
				}
			}
			System.out.println("");
		}
	}

	/**
	 * Ejercicio7:
	 * Programa que muestra la siguiente figura.
	 * El número de filas se lee por teclado.
	 * 
	 * Ejemplo: Para 5 filas
	 * 		1 2 3 4 5
	 * 		6 7 8 9
	 * 		0 1 2 
	 * 		3 4
	 * 		5
	 *  
	 * @param teclado
	 */
	public static void ejercicio7(Scanner teclado) {
		int filas, cont;
		String numeros = "1234567890";

		System.out.println("\nEJERCICIO 7:");
		filas = pideNumero(teclado, "Introduce el número de filas: ");

		cont = 0;
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < filas - i; j++) {
				System.out.print(" " + numeros.charAt(cont) + " ");
				cont++;
				if (cont == numeros.length()) {
					cont = 0;
				}
			}
			System.out.println("");
		}
	}

	/**
	 * Ejercicio8:
	 * Programa que muestre las siguientes figuras una a continuación
	 * de la otra a partir de un valor inicial que se lee por teclado.
	 * El número de filas también se lee por teclado.
	 * 
	 * Ejemplo: Para 4 filas con valor inicial 5
	 * 	  Figura 1:		Figura 2:
	 * 		5				5
	 * 		4 3				7 9
	 * 		2 1 0			1 3 5
	 * 		9 8 7 6			7 9 1 3
	 * @param teclado
	 */
	public static void ejercicio8(Scanner teclado) {
		int filas, valorInicial, cont;
		String numeros = "1234567890";

		System.out.println("\nEJERCICIO 8:");
		filas = pideNumero(teclado, "Introduce el número de filas: ");
		valorInicial = pideNumero(teclado, "Introduce el valor inicial: ");

		// Figura 1:
		System.out.println("");
		System.out.println("Figura 1:");
		cont = valorInicial;
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" " + numeros.charAt(numeros.length() - (cont+1)) + " ");
				cont++;
				if (cont == numeros.length()) {
					cont = 0;
				}
			}
			System.out.println("");
		}
		
		// Figura 2:
		System.out.println("");
		System.out.println("Figura 2:");
		cont = valorInicial - 1;	// Restamos 1 porque no empieza por 0.
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" " + numeros.charAt(cont) + " ");
				cont += 2;	// Incrementamos en 2.
				if (cont >= numeros.length()) {	// >= si queremos quitar el 0
					if (cont%2 == 0) {	// Si es par, reinicializa el contador a 0
						cont = 0;
					} else {
						cont = 1;	// Si es impar, reinicializa el contador a 1
					}
				}
			}
			System.out.println("");
		}
	}

	/**
	 * Ejercicio9:
	 * Programa que muestra un rectángulo hecho con asteriscos.
	 * La base y la altura se leen por teclado.
	 * 
	 * Ejemplo: Para base 10 y altura 3
	 * 		**********
	 * 		*        *
	 * 		**********
	 * @param teclado
	 */
	public static void ejercicio9(Scanner teclado) {
		int base, altura;
		
		System.out.println("\nEJERCICIO 9:");
		base = pideNumero(teclado, "Introduce la base: ");
		altura = pideNumero(teclado, "Introduce la altura: ");

		
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				
				if ((i == 0 || i == altura - 1)) {
					// Primera y última fila:
					System.out.print("*");
				} else if (j == 0 || j == base - 1) {
					// Filas intermedias, primera y última columna
					System.out.print("*");
				} else {
					// Resto de columnas:
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

	/**
	 * Ejercicio10:
	 * Programa que muestre la siguiente figura de 8 filas y 8 columnas.
	 * 
	 * 		B N B N B N B N
	 * 		N B N B N B N B
	 * 		B N B N B N B N
	 * 		N B N B N B N B
	 * 		B N B N B N B N
	 * 		N B N B N B N B
	 * 		B N B N B N B N
	 * 		N B N B N B N B
	 * 
	 * @param teclado
	 */
	public static void ejercicio10(Scanner teclado) {
		System.out.println("\nEJERCICIO 10:");
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				// Fila PAR:
				if (i % 2 == 0) {
					// Columna PAR:
					if (j % 2 == 0) {
						System.out.print(" B ");
					// Columna IMPAR:
					} else {
						System.out.print(" N ");
					}
				// Fila IMPAR:
				} else {
					// Columna PAR:
					if (j % 2 == 0) {
						System.out.print(" N ");
						// Columna IMPAR:
					} else {
						System.out.print(" B ");
					}
				}
			}
			System.out.println("");
		}
	}



}
