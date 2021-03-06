package fempa.conversoreurosbitcoins;

import java.util.Scanner;

public class ConversorEurosBitcoins {

	/* SOLUCI?N PROPIA */
	/*public static void main(String[] args) {
		System.out.println("CONVERSOR EUROS A BITCOINS");
		System.out.println("\t1) EUROS A BITCOINS");
		System.out.println("\t2) BITCOINS A EUROS");
		System.out.print("Seleccione una opci?n: ");
		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();
		double euros, bitcoins;
		
		switch (opcion) {
			case 1:
				System.out.print("Introduzca los Euros a convertir: ");
				euros = sc.nextDouble();
				bitcoins = euros * 0.000035;
				System.out.println(euros + " ? * 0,000035 = " + bitcoins + " Bitcoins.");
				break;
			case 2:
				System.out.print("Introduzca los Bitcoints a convertir: ");
				bitcoins = sc.nextDouble();
				euros = bitcoins * 28910.44;
				System.out.println(bitcoins + " Bitcoins * 28910,44 = " + euros + " euros.");
				break;
			default:
				System.out.println("Debe introducir una opci?n v?lida.");
				break;
		}
		
		sc.close();
	}*/
	
	/* SOLUCI?N PROFESOR */
	public static void main(String[] args) {
		
		// Declarar variable cantidad de euros: float 7 decimales, double 14-15 decimales
		float euros; // cantidad_euros, cantidadDeEuros
		//float cantidad_de_euros; // espacios cambiados por _
		//float cantidadDeEuros; // CamelCase
		
		// Mostrar mensaje: "Introduce la cantidad de euros"
		System.out.print("Introduce la cantidad de euros: ");
		
		// Leer del teclado cantidad de euros
		Scanner teclado = new Scanner(System.in);
		euros = teclado.nextFloat();
		
		// Declarar variable cantidad de bitcoins
		double bitcoins;
		
		// Cantidad de bitcoins es cantidad de euros por 0.000035
		//bitcoins = euros * 0.000035; // Double
		//bitcoins = euros * 0.000035f; // Float
		bitcoins = euros * (float)0.000035; // Float
		
		// Mostrar la cantidad de bitcoins
		//System.out.println(euros + "? son " + bitcoins + " Bitcoins");
		System.out.printf("%.2f", euros);
		System.out.print("? son ");
		System.out.print(Math.round(bitcoins*100.0)/100.0);
		System.out.println(" Bitcoins");
		// 1000,00? son 0,035 Bitcoins
		
		teclado.close();

	}

}
