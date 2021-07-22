package fempa.bucles;

import java.util.Scanner;

public class ParesImparesMenores {

	/* Escribe un programa que pida un número entero por teclado.
	 * Si es par: saca todos los números impares positivos menores que él.
	 * Si es impar: saca todos los números pares positivos menores que él.
	 * */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		String tipo;
		
		System.out.println("PARES E IMPARES MENORES DE UN NÚMERO");
		System.out.print("Introduce un número: ");
		numero = teclado.nextInt();
		
		if (numero % 2 == 0) {
			tipo = "par";
		} else {
			tipo = "impar";
		}
		
		while (numero >= 0) {
			if (tipo.equals("par")) {
				if (numero % 2 != 0) {
					System.out.println(numero + " es impar.");
				}
			} else if (tipo.equals("impar")) {
				if (numero % 2 == 0) {
					System.out.println(numero + " es par.");
				}
			}
			numero--;
		}
		
		
		teclado.close();
	}
	

}
