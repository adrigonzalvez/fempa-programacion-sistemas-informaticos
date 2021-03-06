package viernes.panelletras;

import java.util.Scanner;

public class PanelLetras {

	public static void main(String[] args) {
		String frase = "Si el grajo vuela bajo hace un frio del carajo";
		frase = frase.toUpperCase();
		boolean finJuego = false;
		Scanner sc = new Scanner(System.in);
		
		// Oculta la frase con *
		String fraseOculta = "";
		for (int i=0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				fraseOculta += " ";
			} else {
				fraseOculta += "*";
			}
		}
		
		// Muestra la frase:
		System.out.println(frase);
		System.out.println(fraseOculta);
		
		// El juego acaba cuando se hayan adivinado todas las letras:
		while(!finJuego) {
			System.out.print("\nIntroduce una letra: ");
			char letra = sc.nextLine().toUpperCase().charAt(0);
			
			// Si la frase contiene la letra introducida por el usuario:
			if (frase.contains(String.valueOf(letra))) {
				// Muestra la letra oculta en el panel:
				char[] charfraseOculta = fraseOculta.toCharArray();
				int index = 0;
				int cont = 0;
				while (frase.indexOf(letra, index) > -1) {
					index = frase.indexOf(letra, index);
					charfraseOculta[index] = letra;
					index++;
					cont++;
				}
				fraseOculta = String.valueOf(charfraseOculta);
				System.out.println("Correcto, la letra " + letra + " aparece " + cont + " veces.");
			} else {
				System.out.println("Lo siento, la letra " + letra + " no se encuentra en el panel.");
			}
			
			// Muestra la frase oculta con las letras ya adivinadas:
			System.out.println("\n"+fraseOculta);
			
			// Comprueba si es el final del juego.
			if (!fraseOculta.contains("*")) {
				finJuego = true;
			}
		}
		System.out.println("¡Enhorabuena! Has ganado.");
		sc.close();
	}

}
