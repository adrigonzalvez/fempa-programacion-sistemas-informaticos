package jueves.numeroaleatorio2;

import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio2 {

	public static void main(String[] args) {
		// Intentos y si est? por encima o debajo
		
		// Calcula el n?mero aleatorio a adivinar
		int numAleat = numRandom(1, 10);
		
		// Crea objeto scanner para capturar la entrada de teclado
		Scanner scan = new Scanner(System.in);
		
		// Variable que controla si el usuario ha acertado el n?mero secreto.
		boolean acierto = false;
		int cont = 1;
		
		// Inicio del juego:
		do {
			System.out.println("\nINTENTO " + cont + ":");
			System.out.print("Introduce un n?mero del 1 al 10: ");
			boolean repetir = false;
			int numUsuario = 0;
			do {
				try {
				//do {
					//boolean leidoOk = false;
					// Lee el n?mero introducido por el usuario:
					numUsuario =  scan.nextInt();
					repetir = false;

					// Compara el resultado:
					if (numUsuario == numAleat) {
						System.out.println("\n?Ha acertado!");
						System.out.println("El n?mero secreto era " + numAleat + ".");
						System.out.println("N?mero de intentos: " + cont);
						acierto = true;
					} else if (numAleat > numUsuario) {
						System.out.println("\nEl n?mero secreto es MAYOR que " + numUsuario);
						acierto = false;
						cont++;
					} else {
						System.out.println("\nEl n?mero secreto es MENOR que " + numUsuario);
						acierto = false;
						cont++;
					}
					
					
				} catch(Exception e) {
					repetir = true;
					scan.nextLine();	// Avanza la linea
				}
			} while (repetir);
			
			

		} while (!acierto);
		
		// Cierra el scanner
		scan.close();
	}
	
	private static int numRandom(int min, int max) {
		Random rand = new Random();
		return rand.nextInt(max - min + 1) + min;
	}

}
