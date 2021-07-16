import java.util.Scanner;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Comentario de l�nea
		/*
		 Comentario de bloque
		 */
		
		// Variables:
		// Lugar donde se almacena la informaci�n
		// 	Nombre �nico dentro del programa:
		//		- No usar palabras reservadas (public, class, static, void, int, ...)
		//		- Nombre sin espacios
		//		- No puede empezar por un n�mero
		//		- No pueden contener operadores (+ - , . * /)
		//	Tipo de variable, tipo de dato que almacena:
		//		boolean: Dos posibles valores, verdadero/falso
		// 		int: N�mero entero
		//		float: N�mero con decimales
		//		double: N�mero con decimales (doble que el float)
		//		char: una letra, caracter
		//		String: cadena de caracteres
		
		/* Declaraci�n de variables:
		 * 	Guardar espacio para almacenar un dato.
		 * 
		 * 	tipoDato nombre;
		 * 	tipoDato nombre1, nombre2;
		 * */
		
		System.out.println("Hola Mundo");
		int edad;
		int alumnosOnline, alumnosPresencial;
		

		/* Inicializaci�n de variable:
		 * 	Asignar un valor inicial.
		 * 
		 * 	nombreVariable = valor;
		 * */
		edad = 32;
		alumnosOnline = 7;
		alumnosPresencial = 6;
		
		/* Declarar e inicializar en la misma l�nea:
		 * 	
		 * 	tipoDato nombreVariable = valor;
		 * */
		int alumnosCurso = 15;
		
		System.out.print("Alumnos Online: ");
		System.out.println(alumnosOnline);
		System.out.println("Alumnos Presencial: " + alumnosPresencial);
		System.out.println("\t" + alumnosCurso);
		
		int alumnosAusentes = alumnosCurso - alumnosOnline - alumnosPresencial;
		System.out.println("Alumnos Ausentes: " + alumnosAusentes);
		
		int dobleAusentes = alumnosAusentes * 2;
		System.out.println("El doble de Alumnos Ausentes es: " + dobleAusentes);
		
		int tripleAusentes = alumnosAusentes * 3;
		
		/* 12/07/2021 */
		
		// Control+7 Comentas/descomentar c�digo seleccionado
		
		// Entrada datos
		// Pedir datos es necesario utilizar el Scanner
		// Tener una variable de tipo Scanner que se inicializa de la siguiente forma:
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un n�mero entero: ");
		int numeroUsuario = sc.nextInt();
		
		System.out.print("Introduzca otro n�mero entero: ");
		int numeroUsuario2 = sc.nextInt();
		
		String cadenaMostrar = "Has introducido: " + numeroUsuario + " y "  + numeroUsuario2;
		System.out.println(cadenaMostrar);
		
		//int suma = numeroUsuario + numeroUsuario2;
		System.out.println("La suma es: " + (numeroUsuario + numeroUsuario2));
		
		// Cierra el scanner al teclado
		sc.close();
		
	}

}
