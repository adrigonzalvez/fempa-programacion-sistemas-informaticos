package fempa.bucles;

import java.util.Scanner;

public class ParesImparesBucleFor {

	/* Pedir un número n que sea mayor de 2.
	 * Comprobar el dato.
	 * Pedir los n números e indicar cuantos son positivos, cuantos son negativos, cuantos pares y cuantos impares.
	 * */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cant, numero;
		int contPositivos=0, contNegativos=0, contCeros=0, contPares=0, contImpares=0;
		
		System.out.println("POSITIVOS, NEGATIVOS, PARES E IMPARES");
		System.out.print("¿Cuántos números quieres introducir? ");
		cant = teclado.nextInt();
		if (cant > 0) {
			
			for (int i = 0; i < cant; i++) {
				System.out.print("Introduce un número: ");
				numero = teclado.nextInt();
				
				// Positivos, negativos y ceros:
				if (numero > 0) {
					contPositivos++;
				} else if (numero < 0) {
					contNegativos++;
				} else {
					contCeros++;
				}
				
				// Pares o impares:
				if (numero % 2 == 0) {
					contPares++;
				} else {
					contImpares++;
				}
			}
			System.out.println("Has intruducido " + contPositivos + " positivos, " + contNegativos + " negativos y " + contCeros + " ceros.");
			System.out.println("De los cuales, " + contPares + " son pares y " + contImpares + " son impares.");
			
		} else {
			System.out.println("Debes introducir un número mayor que 0.");
		}
		
		
		teclado.close();
	}
	

}
