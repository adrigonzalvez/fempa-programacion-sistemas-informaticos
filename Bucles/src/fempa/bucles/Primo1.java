package fempa.bucles;

import java.util.Scanner;

public class Primo1 {

	/* Quiero que pida un n�mero
	 * Muestre / imprima desde ese n�mero -1 hasta 1
	 * 
	 * Ej: Introduce un n�mero: 7
	 * Salida: 6 5 4 3 2 1
   	 * */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, aux, resto;
		
		System.out.println("PRIMOS");
		System.out.print("Introduce un n�mero: ");
		num = teclado.nextInt();
		aux = num - 1;
		boolean esPrimo = true;
		
		while (aux > 1) {
			resto = num % aux;
			if (resto == 0) {
				esPrimo = false;
			}
			System.out.println("N�mero: " + aux + " su resto: " + resto);
			aux--;
		}
		
		if (esPrimo) {
			System.out.println("El n�mero " + num + " es primo.");
		} else {
			System.out.println("El n�mero " + num + " no es primo.");
		}

		teclado.close();
	}

}
