package fempa.bucles;

import java.util.Scanner;

public class PideNumeros {

	/* Pide n�meros hasta que introduzcas un -1.
	 * Como salida debes mostrar la suma, la media y el n�mero de n�meros.
	 * */
	public static void main(String[] args) {
		float numero, suma;
		int cont;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("PIDE N�MEROS");
		System.out.println("El programa le pedir� introducir varios n�meros. Escriba -1 para salir.");
		
		suma = 0f;
		cont = 0;
		do {
			System.out.print("\nIntroduce un n�mero: ");
			numero = teclado.nextFloat();
			
			if (numero != -1) {
				suma += numero;	
				cont++;
			}
			
		} while (numero != -1);
		
		// Salida y c�lculos:
		System.out.println("La suma es: " + suma);
		System.out.println("la media es: " + ((float)suma / (float)cont));
		System.out.println("Hay " + cont + " n�meros");
		
		
		teclado.close();


	}

}
