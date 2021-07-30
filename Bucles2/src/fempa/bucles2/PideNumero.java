package fempa.bucles2;

import java.util.Scanner;

public class PideNumero {

	public static int pideNumero(String texto) {
		Scanner teclado = new Scanner(System.in);
		System.out.print(texto);
		int opcion;
		try {
			opcion = teclado.nextInt();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
			opcion = 0;
		}
		
		return opcion;
	}
	
	public static void imprimeMenu() {
		System.out.println("****************");
		System.out.println("***   MEN�   ***");
		System.out.println("****************");
		System.out.println("1.- Ejercicio");
		System.out.println("0.- Salir");
		
	}
	
	public static void main(String[] args) {
		int opc;
		
		// Men� termina pulsando 0
		do {
		imprimeMenu();
		opc = pideNumero("Introduce opci�n: ");
			
		} while (opc != 0);
	}

}
