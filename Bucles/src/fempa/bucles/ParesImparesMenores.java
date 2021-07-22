package fempa.bucles;

import java.util.Scanner;

public class ParesImparesMenores {

	/* Escribe un programa que pida un n�mero entero por teclado.
	 * Si es par: saca todos los n�meros impares positivos menores que �l.
	 * Si es impar: saca todos los n�meros pares positivos menores que �l.
	 * */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		String tipo;
		
		System.out.println("PARES E IMPARES MENORES DE UN N�MERO");
		System.out.print("Introduce un n�mero: ");
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
