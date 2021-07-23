package fempa.bucles;

import java.util.Random;
import java.util.Scanner;

public class TablaMultiplicarRepasarAleatorio {

	/* (Avanzado)
	 * IntroducirlLa tabla que quereis repasar y el programa os pide de forma aleatoria 5 preguntas
	 * sobre esa tabla y os dice si habeis acertado o no.
	 * 
	 * Ej: Dime una tabla para repasar: 7
	 * 7 x 3 ? 21
	 * Has acertado
	 * 
	 * 7 x 4 ? 25
	 * Has fallado.
	 * 
	 * */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random rand = new Random();
		int aleatorio, tabla, resultadoUsuario, resultado;
		
		System.out.println("REPASAR TABLAS DE MULTIPLICAR");
		System.out.print("Dime qué tabla quieres repasar: ");
		tabla = teclado.nextInt();
		if (tabla > 0) {
			for (int i = 0; i < 5; i++) {
				aleatorio = rand.nextInt(10) + 1;	// rand.nextInt(max - min + 1) + min;
				System.out.print( tabla + " x " + aleatorio + " = ");
				resultadoUsuario = teclado.nextInt();	// Lee el resultado del usuario
				resultado = tabla*aleatorio;			// Calcula el resultado real
				
				if (resultadoUsuario == resultado) {		// Si ha acertado:
					System.out.println("Has acertado.");
				} else {									// Si ha fallado:
					System.out.println("Has fallado, el resultado era " + resultado);
				}
			}
		} else {
			System.out.println("Debes introducir un número mayor que 0.");
		}

		
		
		System.out.println("");
		
		
		
		teclado.close();
	}
	

}
