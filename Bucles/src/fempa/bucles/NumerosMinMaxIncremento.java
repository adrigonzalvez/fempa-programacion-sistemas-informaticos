package fempa.bucles;

import java.util.Scanner;

public class NumerosMinMaxIncremento {

	/* Pide minimo, máximo e incremento.
	 * Usando while, imprime todos los números en orden ascendente
	 * desde el mínimos hasta el máximo con el incremento indicado por el usuario
	 * 
	 * Ej: Mínimo: 3, Máximo: 10, Incremento: 2
	 * Salida: 3 5 7 9
	 * */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int min, max, inc, cont;
		
		System.out.println("MINO MÁXIMO E INCREMENTO");
		System.out.print("Mínimo: ");
		min = teclado.nextInt();
		System.out.print("Máximo: ");
		max = teclado.nextInt();
		System.out.print("Incremento: ");
		inc = teclado.nextInt();
		
		if (max < min) {
			System.out.println("El máximo no puede ser menor que el mínimo.");
		} else {
			cont = min;
			while (cont <= max) {
				System.out.println(cont);
				cont += inc;
			}
		}
		
		teclado.close();
	}
	
}
