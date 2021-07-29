package fempa.funcionesyprocedimientos;

import java.util.Scanner;

public class DivisibleAyB {
	
	/*
	 * 4. Se debe implementar un procedimiento que al recibir dos números A y B,
	 * muestre los números entre 1 y 100 (ambos incluidos) que sean divisibles 
	 * entre A y B a la vez. 
	 * */
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		
		presentacionPrograma();
		
		num1 = pedirIntUsuario(teclado, "Introduzca el número A: ");
		num2 = pedirIntUsuario(teclado, "Introduzca el número B: ");
		
		muestraDivisiblesAyB(num1, num2);
		
		teclado.close();
	}
	
	public static void presentacionPrograma() {
		muestraTextoPorConsola("NUMEROS DEL 1 AL 100 DIVISIBLES ENTRE A Y B.\n");
	}
	
	public static void muestraTextoPorConsola(String cadena) {
		System.out.print(cadena);
	}
	
	public static int pedirIntUsuario(Scanner teclado, String texto) {
		int numeroUsuario;
		muestraTextoPorConsola(texto);
		numeroUsuario = teclado.nextInt();
		
		return numeroUsuario;
	}
	
	public static void muestraDivisiblesAyB(int n1, int n2) {
		muestraTextoPorConsola("Números divisibles entre " + n1 + " y " + n2 + ": ");
		for (int i = 1; i <= 100; i++) {
			if (i % n1 == 0 && i % n2 == 0) {
				muestraTextoPorConsola(i + " ");
			}
		}
		
		
	}
	
	
	
	
	
}
