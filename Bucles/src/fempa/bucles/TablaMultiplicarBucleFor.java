package fempa.bucles;

import java.util.Scanner;

public class TablaMultiplicarBucleFor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("TABLA DE MULTIPLICAR");
		System.out.print("Dime que tabla quieres repasar: ");
		int tabla = teclado.nextInt();
		
		// Tabla Multiplicar Simple:
		for (int x = 1; x <= 10; x++) {
			System.out.println(tabla + " x " + x + " = " + (tabla*x));
		}
		
		System.out.println("");
		
		// Tabla Multiplicar Anidada:
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				System.out.println(x + " x " + y + " = " + (x*y));
			}
			System.out.println("");
		}
		
		teclado.close();
	}

}
