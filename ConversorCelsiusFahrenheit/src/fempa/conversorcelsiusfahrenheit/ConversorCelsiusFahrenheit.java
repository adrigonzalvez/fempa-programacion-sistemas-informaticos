package fempa.conversorcelsiusfahrenheit;

import java.util.Scanner;

public class ConversorCelsiusFahrenheit {

	public static void main(String[] args) {
		System.out.println("CONVERSOR CELSIUS / FAHRENHEIT");
		System.out.println("\t1) CELSIUS A FAHRENHEIT");
		System.out.println("\t2) FAHRENHEIT A CELSIUS");
		System.out.print("Seleccione una opci?n: ");
		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();
		double celsius, fahrenheit;
		
		switch (opcion) {
			case 1:
				System.out.print("Introduzca los grados Celsius a convertir: ");
				celsius = sc.nextDouble();
				fahrenheit = 9/5f*celsius + 32;	// Ojo con la divisi?n entre enteros.
				System.out.println("Resultado: " + fahrenheit + " ?F");
				break;
			case 2:
				System.out.print("Introduzca los grados Fahrenheit a convertir: ");
				fahrenheit = sc.nextDouble();
				celsius = 5/9f*(fahrenheit - 32);	// Ojo con la divisi?n entre enteros.
				System.out.println("Resultado: " + celsius + " ?C");
				break;
			default:
				System.out.println("Debe introducir una opci?n v?lida.");
				break;
		}
		
		sc.close();
	}

}
