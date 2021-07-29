package fempa.funcionesyprocedimientos;

import java.util.Scanner;

public class Maximo2Numeros {
	
	/*
	 * 6. Crear una función que tome dos parámetros numéricos y calcule el máximo de los dos números.
	 * Crear una nueva función con el mismo nombre, que tome tres parámetros, y calcule el máximo 
	 * de los tres números (sobrecarga). Esta segunda función debe hacer uso de la primera.
	 */
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3, maximo;
		
		presentacionPrograma();
		num1 = pedirIntUsuario(teclado, "Número 1: ");
		num2 = pedirIntUsuario(teclado, "Número 2: ");
		num3 = pedirIntUsuario(teclado, "Número 3: ");
		
		maximo = obtenerMaximo(num1, num2, num3);
		
		muestraTextoPorConsola("El número máximo es: " + maximo);
		
		teclado.close();
	}
	
	public static void presentacionPrograma() {
		muestraTextoPorConsola("MÁXIMO DE 3 NÚMEROS\n");
	}
	
	public static void muestraTextoPorConsola(String cadena) {
		System.out.print(cadena);
	}
	
	public static int pedirIntUsuario(Scanner teclado, String texto) {
		muestraTextoPorConsola(texto);
		return teclado.nextInt();
	}
	
	public static int obtenerMaximo(int num1, int num2) {
		int maximo;
		
		if (num1 > num2) {
			maximo = num1;
		} else {
			maximo = num2;
		}
		
		return maximo;
	}
	
	public static int obtenerMaximo(int num1, int num2, int num3) {
		return obtenerMaximo(obtenerMaximo(num1, num2), num3);
	}
	
	
	
	
	
}
