package fempa.ecuacionsegundogrado;

import java.util.Scanner;

public class EcuacionSegundoGrado {

	public static void main(String[] args) {
		double a,b,c, x1, x2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Programa para resolver ecuaciones de segundo grado:");
		System.out.println("ax^2 + bx + c = 0");
		
		System.out.print("\nIntroduzca a: ");
		a = teclado.nextDouble();
		System.out.print("Introduzca b: ");
		b = teclado.nextDouble();
		System.out.print("Introduzca c: ");
		c = teclado.nextDouble();
		
		System.out.println("\n" + a + "x^2 + " + b + "x + " + c + " = 0");
		
		x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
		x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
		
		System.out.println("Soluci?n: " + x1 + " y " + x2);
		
		teclado.close();
	}

}
