package fempa.bucles;

import java.util.Scanner;

public class Media10Numeros {

	/* Pide 10 n�meros y muestra la media de los n�meros positivos,
	 * la media de los negativos y la cantidad de ceros introducidos;
	 * */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, cont;
		int cantPositivos = 0, cantNegativos = 0, cantCeros = 0, sumaPositivos = 0, sumaNegativos = 0;
		
		System.out.println("N�mero positivos, negativos y ceros");
		System.out.println("Introduzca 10 n�meros.");
		
		cont = 10;
		while (cont > 0) {
			System.out.print("N�mero: ");
			numero = teclado.nextInt();
			
			if (numero > 0) {
				sumaPositivos += numero;
				cantPositivos++;
			} else if (numero < 0) {
				sumaNegativos += numero;
				cantNegativos++;
			} else {
				cantCeros++;
			}
			
			cont--;
		}
		
		if (cantPositivos > 0) {
			System.out.println("Media positivos: " + ((float)sumaPositivos/(float)cantPositivos));
		}
		if (cantNegativos > 0) {
			System.out.println("Media negativos: " + ((float)sumaNegativos/(float)cantNegativos));
		}
		System.out.println("Cantidad Ceros: " + cantCeros);
		
		teclado.close();
	}
	

}
