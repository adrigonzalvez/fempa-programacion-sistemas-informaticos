package fempa.solicitadatosusuario;

import java.util.Scanner;

public class SolicitaDatosUsuario {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce tu Nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.print("Introduce tus Apellidos: ");
		String apellidos = teclado.nextLine();
		
		System.out.print("Introduce tu Edad: ");
		/* FORMA1: Leer entero y hacer un nextLine() para leer el caracter final \n */
		//int edad = teclado.nextInt();
		//teclado.nextLine(); // Es necesario porque nextInt() no lee el último caracter de fin de línea.
							// De esta forma leemos el /n del final.
		/* FORMA 2: Leemos String y lo convertimos a entero */
		//String edadString = teclado.nextLine();
		//int edad = Integer.parseInt(edadString);
		int edad = Integer.parseInt(teclado.nextLine());
		
		/* Integer, Double, Character, Float, ...
		 * Wrappers o clases envoltorio
		 * Usado para convertir el texto al tipo de datos
		 * 
		 * */
		
		System.out.print("Introduce tu DNI/NIE: ");
		String dni = teclado.nextLine();
		
		System.out.print("Introduce tu Email: ");
		String email = teclado.nextLine();
		
		System.out.print("Introduce tu Ciudad: ");
		String ciudad = teclado.nextLine();
		
		System.out.print("Introduce tu Código Postal: ");
		String cp = teclado.nextLine();
		
		System.out.print("Introduce tu Teléfono fijo: ");
		String telf = teclado.nextLine();
		
		System.out.println("\nNombre: " + nombre + " " + apellidos);
		System.out.println("Edad: " + edad);
		System.out.println("DNI: " + dni);
		System.out.println("Email: " + email);
		System.out.println("Ciudad: " + ciudad);
		System.out.println("Código Postal: " + cp);
		System.out.println("Teléfono: " + telf);
		
		teclado.close();
	}

}
