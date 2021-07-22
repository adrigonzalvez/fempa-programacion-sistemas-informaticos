package fempa.bucles;

import java.util.Scanner;

public class NumerosMinMaxIncremento {

	/* Pide minimo, m�ximo e incremento.
	 * Usando while, imprime todos los n�meros en orden ascendente
	 * desde el m�nimos hasta el m�ximo con el incremento indicado por el usuario
	 * 
	 * Ej: M�nimo: 3, M�ximo: 10, Incremento: 2
	 * Salida: 3 5 7 9
	 * */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int min, max, inc, cont;
		
		System.out.println("MINO M�XIMO E INCREMENTO");
		System.out.print("M�nimo: ");
		min = teclado.nextInt();
		System.out.print("M�ximo: ");
		max = teclado.nextInt();
		System.out.print("Incremento: ");
		inc = teclado.nextInt();
		
		if (max < min) {
			System.out.println("El m�ximo no puede ser menor que el m�nimo.");
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
