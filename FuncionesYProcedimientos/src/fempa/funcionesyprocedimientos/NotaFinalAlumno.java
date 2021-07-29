package fempa.funcionesyprocedimientos;

import java.util.Scanner;

public class NotaFinalAlumno {
	
	/* 
	 * 3. Se debe implementar una función llamada CalcularNotaFinal que permita calcular
	 * y devolver la nota final de la evaluación de un alumno.
	 * Esta función recibirá dos números, las notas de los dos exámenes parciales.
	 * Si ha suspendido alguno de los dos exámenes, la nota devuelta es la del examen suspendido.
	 * En caso de tener ambos aprobados, debe calcular la media de las notas de los exámenes.
	 * Las notas de los exámenes parciales son números que pueden tener decimales,
	 * mientras que la nota final será un número entero.
	 * */
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float nota1, nota2;
		int notaFinal;
		
		presentacionPrograma();
		nota1 = pedirFloatUsuario(teclado, "Introduce la Nota 1: ");
		nota2 = pedirFloatUsuario(teclado, "Introduce la Nota 2: ");
		
		notaFinal = calcularNotaFinal(nota1, nota2);
		
		muestraTextoPorConsola("La nota final es: " + notaFinal);
		
		teclado.close();
	}
	
	public static void presentacionPrograma() {
		muestraTextoPorConsola("CÁLCULO DE LA NOTA FINAL.\n");
	}
	
	public static void muestraTextoPorConsola(String cadena) {
		System.out.print(cadena);
	}
	
	public static float pedirFloatUsuario(Scanner teclado, String texto) {
		muestraTextoPorConsola(texto);
		return teclado.nextFloat();
	}
	
	public static int calcularNotaFinal(float nota1, float nota2) {
		int notaFinal;
		
		/*if (nota1 >= 5 && nota2 >= 5) {
			// Aprobado ambos
			notaFinal = (int) Math.round((nota1 + nota2) / 2);
		} else if (nota1 < 5 && nota2 >= 5){
			// Suspenso nota1
			notaFinal = (int) nota1;
		} else if (nota2 < 5 && nota1 >=5) {
			// Suspenso nota2
			notaFinal = (int) nota2;
		} else {
			// Suspenso ambas notas
			if (nota1 < nota2) {
				notaFinal = (int) nota1;
			} else {
				notaFinal = (int) nota2;
			}
		}*/
		
		if (nota1 < 5) {				// Primer parcial suspenso
			notaFinal = (int) nota1;	// Se queda con la parte entera: 4,8 = 4
		} else if (nota2 < 5) {			// Segundo parcial suspeonso
			notaFinal = (int) nota2;	// Se queda con la parte entera: 4,8 = 4
		} else {
			notaFinal = (int) Math.round((nota1 + nota2) / 2);	// Redondeamos: 4,8 = 5
		}
 		
		return notaFinal;
	}
	
	
	
	
	
}
