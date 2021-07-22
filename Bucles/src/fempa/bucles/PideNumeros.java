package fempa.bucles;

import java.util.Scanner;

public class PideNumeros {

	/* Pide números hasta que introduzcas un -1.
	 * Como salida debes mostrar la suma, la media y el número de números.
	 * */
	public static void main(String[] args) {
		float numero, suma;
		int cont;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("PIDE NÚMEROS");
		System.out.println("El programa le pedirá introducir varios números. Escriba -1 para salir.");
		
		suma = 0f;
		cont = 0;
		do {
			System.out.print("\nIntroduce un número: ");
			numero = teclado.nextFloat();
			
			if (numero != -1) {
				suma += numero;	
				cont++;
			}
			
		} while (numero != -1);
		
		// Salida y cálculos:
		System.out.println("La suma es: " + suma);
		System.out.println("la media es: " + ((float)suma / (float)cont));
		System.out.println("Hay " + cont + " números");
		
		
		teclado.close();


	}

}
