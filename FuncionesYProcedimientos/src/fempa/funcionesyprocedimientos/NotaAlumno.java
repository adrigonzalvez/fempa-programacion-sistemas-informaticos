package fempa.funcionesyprocedimientos;

import java.util.Scanner;

public class NotaAlumno {
	
	/*
	 * 1. Crea una función llamada ObtenerNombreNota que recibirá un número y debe devolver:
	 *    Suspenso, aprobado, notable o sobresaliente.
	 * */
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int notaAlumno;
		String notaTexto = "";
		
		presentacionPrograma();
		notaAlumno = pedirIntUsuario(teclado, "Introduce tu nota: ");
		notaTexto = obtenerNombreNota(notaAlumno);
		
		muestraTextoPorConsola("Tu nota es " + notaTexto);
		
		teclado.close();
	}
	
	public static void presentacionPrograma() {
		muestraTextoPorConsola("Transforma tu nota numérica a texto.\n");
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
	
	public static String obtenerNombreNota(int nota) {
		String notaTexto = "";
		
		/*
		if (nota < 5) {
			// Suspenso
			notaTexto = "Suspenso";
		} else if (nota < 6) {
			// Aprobado
			notaTexto = "Aprobado";
		} else if (nota < 7) {
			// Bien
			notaTexto = "Bien";
		} else if (nota < 9) {
			// Notable
			notaTexto = "Notable";
		} else if (nota <= 10) {
			// Sobresaliente
			notaTexto = "Sobresaliente";
		} else {
			notaTexto = "ERROR";
		}
		*/
		
		switch (nota) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				notaTexto = "Suspenso";
				break;
			case 5:
				notaTexto = "Aprobado";
				break;
			case 6:
				notaTexto = "Bien";
				break;
			case 7:
			case 8:
				notaTexto = "Notable";
				break;
			case 9:
			case 10:
				notaTexto = "Sobresaliente";
				break;
			default:
				notaTexto = "Error: Nota fuera de rango.";
		}
		
		return notaTexto;
	}
	
	
	
	
	
}
