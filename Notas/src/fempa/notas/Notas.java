package fempa.notas;

import java.util.Scanner;

public class Notas {
	
	/* Pedir una nota num?rica entera entre 0 y 10,
	 * y mostrar dicha nota de la forma: cero, uno, dos, tres, ...
	 * y decir si es suspenso, notable, bien o sobresaliente 
	 * 0-4 Suspenso
	 * 5 Suficiente
	 * 6 Bien
	 * 7-8 Notable
	 * 9-10 Sobresaliente
	 * */

	/* SOLUCI?N PROPIA */
	/*public static void main(String[] args) {
		int nota;
		String strNota = "", strNotaFinal = "";
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("NOTA NUM?RICA");
		System.out.print("Introduzca su nota: ");
		nota = teclado.nextInt();
		
		if (nota == 0) {
			strNota = "cero";
			strNotaFinal = "Suspenso";
		} else if (nota == 1) {
			strNota = "uno";
			strNotaFinal = "Suspenso";
			
		} else if (nota == 2) {
			strNota = "dos";
			strNotaFinal = "Suspenso";
			
		} else if (nota == 3) {
			strNota = "tres";
			strNotaFinal = "Suspenso";
			
		} else if (nota == 4) {
			strNota = "cuatro";
			strNotaFinal = "Suspenso";
			
		} else if (nota == 5) {
			strNota = "cinco";
			strNotaFinal = "Suficiente";
			
		} else if (nota == 6) {
			strNota = "seis";
			strNotaFinal = "Bien";
			
		} else if (nota == 7) {
			strNota = "siete";
			strNotaFinal = "Notable";
			
		} else if (nota == 8) {
			strNota = "ocho";
			strNotaFinal = "Notable";
			
		} else if (nota == 9) {
			strNota = "nueve";
			strNotaFinal = "Sobresaliente";
			
		} else if (nota == 10) {
			strNota = "diez";
			strNotaFinal = "Sobresaliente";
		}
		
		System.out.println("Has sacado un " + strNota + ", por lo que tienes un " + strNotaFinal);
		
		teclado.close();
	}*/
	
	/* SOLUCI?N PROFESOR */
	public static void main(String[] args) {
		
		int nota;
		String notaTexto, calificacion;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("NOTA NUM?RICA");
		System.out.print("Introduzca su nota: ");
		nota = teclado.nextInt();
		
		/*if (nota < 5) {
			System.out.print("Suspenso: ");
			if (nota == 0) {
				System.out.println("Cero");
			} else if (nota == 1) {
				System.out.println("Uno");
			} else if (nota == 2) {
				System.out.println("Dos");
			} else if (nota == 3) {
				System.out.println("Tres");
			} else if (nota == 4) {
				System.out.println("Cuatro");
			} else {
				System.out.println("Nota negativa");
			}
		} else if (nota < 6) { // nota == 5
			System.out.print("Suficiente: ");
			System.out.println("Cinco");
		} else if (nota < 7) { // nota == 6
			System.out.print("Bien: ");
			System.out.println("Seis");
		} else if (nota < 9) {
			System.out.print("Notable: ");
			if (nota == 7) {
				System.out.println("Siete");	
			} else {
				System.out.println("Ocho");	
			}
		} else {
			System.out.print("Sobresaliente: ");
			if (nota == 9) {
				System.out.println("Nueve");	
			} else {
				System.out.println("Diez");	
			}
		}*/
		
		if (nota < 5) {
			calificacion = "Suspenso";
			if (nota == 0) {
				notaTexto = "Cero";
			} else if (nota == 1) {
				notaTexto = "Uno";
			} else if (nota == 2) {
				notaTexto = "Dos";
			} else if (nota == 3) {
				notaTexto = "Tres";
			} else if (nota == 4) {
				notaTexto = "Cuatro";
			} else {
				notaTexto = "Nota negativa";
			}
		} else if (nota < 6) { // nota == 5
			calificacion = "Suficiente";
			notaTexto = "Cinco";
		} else if (nota < 7) { // nota == 6
			calificacion = "Bien";
			notaTexto = "Seis";
		} else if (nota < 9) {
			calificacion = "Notable";
			if (nota == 7) {
				notaTexto = "Siete";	
			} else {
				notaTexto = "Ocho";	
			}
		} else {
			calificacion = "Sobresaliente";
			if (nota == 9) {
				notaTexto = "Nueve";	
			} else {
				notaTexto = "Diez";	
			}
		}
		
		System.out.println("Tu nota es " + calificacion + ": " + nota + " (" + notaTexto + ")");
		
		teclado.close();
	}

}
