package fempa.bucles;

import java.util.Scanner;

public class TablaMultiplicar2 {

	/* TABLA MULTIPLICAR 
	 * Bucles while
	 * */
	public static void main(String[] args) {
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("TABLA DE MULTIPLICAR");
		System.out.println("Programa para mostrar la tabla de multiplicar.");
		System.out.print("Dime un número: ");
		numero = teclado.nextInt();
		
		/*int cont = 20;
		while (cont >= 0) {
			System.out.println(numero + " * " + (20-cont) + " = " + (numero*(20-cont)));
			cont--;
		}*/
		
		int cont = 0;
		while (cont <= 20) {
			int resultado = numero * cont;
			System.out.println(numero + " * " + cont + " = " + resultado);
			cont++;
		}
		
		teclado.close();
	}

}
