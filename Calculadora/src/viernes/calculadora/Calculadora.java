package viernes.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		/*
		System.out.print("Introduce el primer n�mero: ");
		int A = in.nextInt();
		
		System.out.print("Introduce el segundo n�mero: ");
		int B = in.nextInt();
		
		int C = A + B;
		
		System.out.println("La suma es: " + C);
		*/
		
		System.out.print("Introduce tu nombre: ");
		String nombre = in.nextLine();
		
		System.out.print("Introduce tu edad: ");
		int edad = in.nextInt();
		
		System.out.print("Introduce tu altura: ");
		float altura = in.nextFloat();
		
		System.out.println("Te llamas " + nombre + ", tienes " + edad + " a�os y mides " + altura + " m.");
		
		in.close();
	}

}
