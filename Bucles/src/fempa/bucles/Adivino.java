package fempa.bucles;

import java.util.Random;
import java.util.Scanner;

public class Adivino {

	/* ADIVINO
	 * El ordenador piensa un número entre 10 y 200.
	 * Va pidiendo números hasta que el usuario acierte el que ha pensado.
	 * Cada vez que se introduce un número, el ordenador nos da una pista
	 * diciendo si el número es mayor o menor.
	 * Al final, muestra el número de intentos.
	 * 
	 *  */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random rand = new Random();
		int aleatorio =  rand.nextInt(200 - 10 + 1) + 10; //rand.nextInt(max - min + 1) + min
		//int aleatorio = (int)(Math.random() * 191) + 10; // (int)(Math.random() * 200 - 10 + 1) + 10
		int num, intentos;
		
		System.out.println("ADIVINA EL NÚMERO SECRETO ENTRE 10 Y 200");
		//System.out.println("Número secreto: " + aleatorio);
		
		intentos = 0;
		do {
			System.out.print("\nDime un número: ");
			num = teclado.nextInt();
			
			if (num > aleatorio) {
				System.out.println("Lo siento, el número secreto es MENOR que " + num);
			} else if (num < aleatorio) {
				System.out.println("Lo siento, el número secreto es MAYOR que " + num);
			}
			
			intentos++;
		} while(num != aleatorio);
		
		System.out.println("¡Enhorabuena! El número secreto era " + aleatorio);
		System.out.println("Número de intentos: " + intentos);
		
		teclado.close();
	}
	
	

}
