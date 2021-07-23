package fempa.bucles;

import java.util.Scanner;

public class Primo1 {

	/* Quiero que pida un número
	 * Muestre / imprima desde ese número -1 hasta 1
	 * 
	 * Ej: Introduce un número: 7
	 * Salida: 6 5 4 3 2 1
   	 * */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, aux, resto;
		
		System.out.println("PRIMOS");
		System.out.print("Introduce un número: ");
		num = teclado.nextInt();
		aux = num - 1;
		boolean esPrimo = true;
		
		while (aux > 1) {
			resto = num % aux;
			if (resto == 0) {
				esPrimo = false;
			}
			System.out.println("Número: " + aux + " su resto: " + resto);
			aux--;
		}
		
		if (esPrimo) {
			System.out.println("El número " + num + " es primo.");
		} else {
			System.out.println("El número " + num + " no es primo.");
		}

		teclado.close();
	}

}
