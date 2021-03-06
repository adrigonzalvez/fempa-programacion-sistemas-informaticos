package fempa.notasalumno;

import java.util.Scanner;

public class NotasAlumno {

	/*
	 * Pedir tres n?meros que corresponden a las notas de un alumno en tres ex?menes diferentes para calcular su nota final.
	 * Si ha suspendido alguno de ellos, la nota final ser? la menor de estos tres.
	 * Si ha aprobado todos, se debe calcular la media aritm?tica.
	 * 4, 7, 9 -> 4
	 * 7, 8, 6 -> 7
	 * 3, 2, 8 -> 2
	 * 
	 * */
	
	public static void main(String[] args) {
		float nota1, nota2, nota3, notaFinal;
		Scanner teclado = new Scanner(System.in);

		System.out.println("TRES NOTAS");
		System.out.print("Introduzca la primera nota: ");
		nota1 = teclado.nextFloat();
		
		System.out.print("Introduzca la segunda nota: ");
		nota2 = teclado.nextFloat();
		
		System.out.print("Introduzca la tercera nota: ");
		nota3 = teclado.nextFloat();
		
		if (nota1 >= 5 && nota2 >= 5 && nota3 >= 5) {
			notaFinal = (nota1+nota2+nota3)/3;
		} else if (nota1 <= nota2 && nota1 <= nota3) {
			notaFinal = nota1;
		} else if (nota2 <= nota1 && nota2 <= nota3) {
			notaFinal = nota2;
		} else {
			notaFinal = nota3;
		}
		
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 3: " + nota2);
		System.out.println("Nota 2: " + nota3);
		System.out.println("Nota Final: " + notaFinal);
		
		teclado.close();
	}

}
