package fempa.adivino;

import java.util.Scanner;

public class Adivino {

	/* SOLUCI?N PROPIA */
	/*public static void main(String[] args) {
		int aleatorio = (int) (Math.random() * 5) + 1; // Math.random() -> Devuelve entre 0 y 0.9999
		boolean acierto = false;
		System.out.println("N?mero: " + aleatorio);
		
		Scanner teclado = new Scanner(System.in);
		
		// INTENTO 1:
		System.out.print("Dime un n?mero: ");
		int numero = teclado.nextInt();
		
		if (aleatorio == numero) {
			acierto = true;
			System.out.println("Has acertado, enhorabuena!!");
		} else if (aleatorio > numero) {
			System.out.println("Has fallado, el n?mero secreto es MAYOR.");
		} else {
			System.out.println("Has fallado, el n?mero secreto es MENOR.");
		}
		
		if (!acierto) {
			System.out.print("Dime un n?mero: ");
			numero = teclado.nextInt();
			if (aleatorio == numero) {
				acierto = true;
				System.out.println("Has acertado, enhorabuena!!");
			} else if (aleatorio > numero) {
				System.out.println("Has fallado, el n?mero secreto es MAYOR.");
			} else {
				System.out.println("Has fallado, el n?mero secreto es MENOR.");
			}
		}
		
		if (!acierto) {
			System.out.print("Dime un n?mero: ");
			 numero = teclado.nextInt();
			if (aleatorio == numero) {
				acierto = true;
				System.out.println("Has acertado, enhorabuena!!");
			} else if (aleatorio > numero) {
				System.out.println("Has fallado, el n?mero secreto es MAYOR.");
			} else {
				System.out.println("Has fallado, el n?mero secreto es MENOR.");
			}
		}
		
		if (!acierto) { 
			System.out.println("Lo siento, se han agotado los intentos. Otra vez ser?.");
		}
		
		teclado.close();
	}*/
	
	/* SOLUCI?N PROFESOR */
	public static void main(String[] args) {
		int aleatorio = (int) (Math.random() * 5) + 1; // Math.random() -> Devuelve entre 0 y 0.9999
		System.out.println("N?mero: " + aleatorio);
		
		Scanner teclado = new Scanner(System.in);
		
		// INTENTO 1:
		System.out.print("Dime un n?mero: ");
		int numero = teclado.nextInt();
		
		if (aleatorio == numero) {
		
			System.out.println("Has acertado, enhorabuena!!");
		} else {
			if (aleatorio > numero) {
				System.out.println("Has fallado, el n?mero secreto es MAYOR.");
			} else {
				System.out.println("Has fallado, el n?mero secreto es MENOR.");
			}
			
			System.out.print("Dime un n?mero: ");
			numero = teclado.nextInt();
			if (aleatorio == numero) {
				System.out.println("Has acertado, enhorabuena!!");
			} else {
				if (aleatorio > numero) {
					System.out.println("Has fallado, el n?mero secreto es MAYOR.");
				} else {
					System.out.println("Has fallado, el n?mero secreto es MENOR.");
				}
				
				System.out.print("Dime un n?mero: ");
				numero = teclado.nextInt();
				if (aleatorio == numero) {
					System.out.println("Has acertado, enhorabuena!!");
				} else { 
					if (aleatorio > numero) {
						System.out.println("Has fallado, el n?mero secreto es MAYOR.");
					} else {
						System.out.println("Has fallado, el n?mero secreto es MENOR.");
					}
					System.out.println("Mala suerte, era el: " + aleatorio);
				}
			}
			
		}
			

		teclado.close();
	}

}
