package fempa.bucles1_5;

import java.util.Scanner;

public class Bucles1_5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		while (true) {
			int opcion = menu(teclado);
			if (opcion == 0) {
				System.out.println("Hasta la próxima!");
				break;
			}
			lanzaEjercicio(teclado, opcion);
		}
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
		System.out.println("1) Ejercicio 1");
		System.out.println("2) Ejercicio 2");
		System.out.println("3) Ejercicio 3");
		System.out.println("4) Ejercicio 4");
		System.out.println("5) Ejercicio 5");
		System.out.println("0) Salir");
		opcion = pideNumero(teclado, "Introduce una opción: ");
			
		return opcion;
	}
	
	public static void lanzaEjercicio(Scanner teclado, int opc) {
		switch (opc) {
			case 1:
				ejercicio1(teclado);
				break;
			case 2:
				ejercicio2(teclado);
				break;
			case 3:
				ejercicio3(teclado);
				break;
			case 4:
				ejercicio4(teclado);
				break;
			case 5:
				ejercicio5(teclado);
				break;
			default:
				System.out.println("Opción no válida.");		
		}
		System.out.println("");
	}
	
	/**
	 * Ejercicio1:
	 * Programa que muestre en pantalla un cuadrado sólido de asteriscos.
	 * La longitud del lado del cuadrado se lee por teclado.
	 * 
	 * Ejemplo: Si leemos 5 de lado obtendremos
	 *  	* * * * *
	 *  	* * * * *
	 *  	* * * * *
	 *  	* * * * *
	 *  	* * * * *
	 */
	public static void ejercicio1(Scanner teclado) {
		int lado;
		
		System.out.println("\nEJERCICIO 1:");
		lado = pideNumero(teclado, "Introduce el lado del cuadrado: ");
		
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}
	
	/**
	 * Ejercicio2:
	 * Programa que muestre un rectángulo sólido formado un caracter que se lee por teclado.
	 * Se leerá la base y la altura del rectángulo y el caracter de relleno.
	 * 
	 * Ejemplo: para 3 filas (altura), 7 columnas (base) y el caracter de relleno 'k':
	 * 		kkkkkkk
	 * 		kkkkkkk
	 * 		kkkkkkk
	 */
	public static void ejercicio2(Scanner teclado) {
		int base, altura;
		char caracter;
		
		System.out.println("\nEJERCICIO 2:");
		base = pideNumero(teclado, "Introduce la base: ");
		altura = pideNumero(teclado, "Introduce la altura: ");
		caracter = pideCaracter(teclado, "Introduce el caracter de relleno: ");
		
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				System.out.print(" " + caracter + " ");
			}
			System.out.println("");
		}
	}
	
	/**
	 * Ejercicio3:
	 * Programa que muestre la siguiente figura.
	 * El número de filas se introduce por teclado.
	 * Ejemplo: Para 4 filas
	 * 		*
	 * 		* *
	 * 		* * *
	 * 		* * * *
	 */
	public static void ejercicio3(Scanner teclado) {
		int filas;
		
		System.out.println("\nEJERCICIO 3:");
		filas = pideNumero(teclado, "Introduce el número de filas: ");
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}
	
	/**
	 * Ejercicio4:
	 * Programa que muestre estas 3 figuras, cada una a continuación de la otra.
	 * El número de filas para cada figura se leerá por teclado.
	 * El número de columnas es igual al número de filas.
	 * Para las figuras 2 y 3, el número de filas debe ser impar.
	 * 
	 * Ejemplo:
	 * Figura 1			Figura 2		Figura 3
	 * 1 * * * *		* * 1 * *		* * * * *
	 * * 1 * * *		* * 1 * *		* * * * *
	 * * * 1 * *		* * 1 * *		1 1 1 1 1
	 * * * * 1 *		* * 1 * *		* * * * *
	 * * * * * 1		* * 1 * *		* * * * *
	 */
	public static void ejercicio4(Scanner teclado) {
		int filas;
		
		System.out.println("\nEJERCICIO 4:");
		filas = pideNumero(teclado, "Introduce el número de filas: ");
		
		ejercicio4_1(filas);
		
		// Si es impar:
		if (filas%2 != 0) {
			ejercicio4_2(filas);
			ejercicio4_3(filas);
		}	
	}
	
	public static void ejercicio4_1(int filas) {
		// Figura 1:
		System.out.println("");
		System.out.println("Figura 1:");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < filas; j++) {
				if (i == j) {	// Si la fila == columna -> Diagonal
					System.out.print(" 1 ");
				} else {
					System.out.print(" * ");
				}
			}
			System.out.println("");
		}
	}
	
	public static void ejercicio4_2(int filas) {
		// Figura 2:
		System.out.println("");
		System.out.println("Figura 2:");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < filas; j++) {
				if (filas % 2 != 0 && filas / 2 == j) {
					// Si las filas son impar y está en la mitad de las columnas (j):
					System.out.print(" 1 ");
				} else {
					System.out.print(" * ");
				}
			}
			System.out.println("");
		}
	}
	
	public static void ejercicio4_3(int filas) {
		// Figura 3:
		System.out.println("");
		System.out.println("Figura 3:");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < filas; j++) {
				if (filas % 2 != 0 && filas / 2 == i) {
					// Si las filas son impar y está en la mitad de las filas (i):
					System.out.print(" 1 ");
				} else {
					System.out.print(" * ");
				}
			}
			System.out.println("");
		}
	}
	
	/**
	 * Ejercicio5:
	 * Programa que muestre la siguiente figura.
	 * El número de filas se lee por teclado.
	 * 
	 * Ejemplo: Para 4 filas
	 * 		1 2 3 4
	 * 		5 6 7 8
	 * 		9 0 1 2
	 * 		3 4 5 6
	 * 
	 */
	public static void ejercicio5(Scanner teclado) {
		int filas, cont;
		String numeros = "1234567890";
		
		System.out.println("\nEJERCICIO 5:");
		filas = pideNumero(teclado, "Introduce el número de filas: ");
		
		cont = 0;
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < filas; j++) {
				System.out.print(" " + numeros.charAt(cont) + " ");
				cont++;
				if (cont == numeros.length()) {
					cont = 0;
				}
			}
			System.out.println("");
		}
		
		// Mismo ejercicio realizandolo con el módulo de 10 (cont%10):
		System.out.println("");
		cont = 1;
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < filas; j++) {
				//System.out.print(" " + (cont++%10) + " ");
				System.out.print(" " + (cont%10) + " ");
				cont++;
			}
			System.out.println("");
		}
	}

}
