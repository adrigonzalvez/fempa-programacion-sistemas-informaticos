package fempa.bucles;

import java.util.Scanner;

public class FraseLetraALetra {

	/* Introduce una frase y muéstrala letra a letra.
	 * Usa charAt() y length()
	 * */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		int cont;
		
		System.out.print("Introduzca una frase: ");
		frase = teclado.nextLine();
		
		cont = 0;
		while (cont < frase.length()) {
			System.out.println(frase.charAt(cont));
			cont++;
		}
		
		teclado.close();
	}

}
