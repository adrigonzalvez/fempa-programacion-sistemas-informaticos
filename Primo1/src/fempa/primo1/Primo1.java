package fempa.primo1;

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
		int num;
		
		System.out.println("PRIMOS");
		System.out.print("Introduce un número: ");
		num = teclado.nextInt();
		
		while (num > 1) {
			num--;
			System.out.println(num);
		}

	}

}
