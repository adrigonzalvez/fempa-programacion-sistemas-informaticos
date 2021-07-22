package fempa.bucles;

import java.util.Random;
import java.util.Scanner;

public class Adivino {

	/* ADIVINO
	 * El ordenador piensa un n�mero entre 10 y 200.
	 * Va pidiendo n�meros hasta que el usuario acierte el que ha pensado.
	 * Cada vez que se introduce un n�mero, el ordenador nos da una pista
	 * diciendo si el n�mero es mayor o menor.
	 * Al final, muestra el n�mero de intentos.
	 * 
	 *  */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random rand = new Random();
		int aleatorio =  rand.nextInt(200 - 10 + 1) + 10; //rand.nextInt(max - min + 1) + min
		//int aleatorio = (int)(Math.random() * 191) + 10; // (int)(Math.random() * 200 - 10 + 1) + 10
		int num, intentos;
		
		System.out.println("ADIVINA EL N�MERO SECRETO ENTRE 10 Y 200");
		//System.out.println("N�mero secreto: " + aleatorio);
		
		intentos = 0;
		do {
			System.out.print("\nDime un n�mero: ");
			num = teclado.nextInt();
			
			if (num > aleatorio) {
				System.out.println("Lo siento, el n�mero secreto es MENOR que " + num);
			} else if (num < aleatorio) {
				System.out.println("Lo siento, el n�mero secreto es MAYOR que " + num);
			}
			
			intentos++;
		} while(num != aleatorio);
		
		System.out.println("�Enhorabuena! El n�mero secreto era " + aleatorio);
		System.out.println("N�mero de intentos: " + intentos);
		
		teclado.close();
	}
	
	

}
