package fempa.funcionesyprocedimientos;

import java.util.Scanner;

public class Maximo2Numeros {
	
	/*
	 * 6. Crear una funci�n que tome dos par�metros num�ricos y calcule el m�ximo de los dos n�meros.
	 * Crear una nueva funci�n con el mismo nombre, que tome tres par�metros, y calcule el m�ximo 
	 * de los tres n�meros (sobrecarga). Esta segunda funci�n debe hacer uso de la primera.
	 */
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3, maximo;
		
		presentacionPrograma();
		num1 = pedirIntUsuario(teclado, "N�mero 1: ");
		num2 = pedirIntUsuario(teclado, "N�mero 2: ");
		num3 = pedirIntUsuario(teclado, "N�mero 3: ");
		
		maximo = obtenerMaximo(num1, num2, num3);
		
		muestraTextoPorConsola("El n�mero m�ximo es: " + maximo);
		
		teclado.close();
	}
	
	public static void presentacionPrograma() {
		muestraTextoPorConsola("M�XIMO DE 3 N�MEROS\n");
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
