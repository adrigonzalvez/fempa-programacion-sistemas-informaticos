package fempa.herencia;

import java.util.Scanner;

public class Herencia {

	/* SOLUCIÓN PROPIA */
	/*public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float herencia, herenciaHijoMayor, herenciaHijoMenor;
		int numHijosMayores, numHijosMenores;
		
		System.out.println("REPARTO DE HERENCIA:");
		System.out.println("Calcula el reparto de la herencia (80% mayores de edad y 20% menores de edad).");
		
		System.out.print("Introduzca dinero a repartir: ");
		herencia = teclado.nextFloat();
		
		System.out.print("Introduzca cantidad de hijos mayores de edad: ");
		numHijosMayores = teclado.nextInt();
		
		System.out.print("Introduzca cantidad de hijos menores de edad: ");
		numHijosMenores = teclado.nextInt();

		if (numHijosMayores != 0 && numHijosMenores != 0) {
			herenciaHijoMayor = herencia * 0.8f / numHijosMayores;
			herenciaHijoMenor = herencia * 0.2f / numHijosMenores;
		} else if (numHijosMayores == 0 && numHijosMenores != 0) {
			herenciaHijoMayor = 0;
			herenciaHijoMenor = herencia / numHijosMenores;
		} else if (numHijosMenores == 0 && numHijosMayores != 0) {
			herenciaHijoMenor = 0;
			herenciaHijoMayor = herencia / numHijosMayores;
		} else {
			herenciaHijoMayor = 0;
			herenciaHijoMenor = 0;
		}
		
		//System.out.println("A los hijos mayores les corresponde " + herenciaHijoMayor + " y a los menores " + herenciaHijoMenor);
		//System.out.println("A los hijos mayores les corresponde " + String.format("%.2f", herenciaHijoMayor) + " y a los menores " + String.format("%.2f", herenciaHijoMenor));
		System.out.printf("A los hijos mayores les corresponde %.2f€ y a los menores %.2f€", herenciaHijoMayor, herenciaHijoMenor);
		
		teclado.close();
	}*/

	
	/* SOLUCIÓN PROFESOR */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float herencia, herenciaHijoMayor, herenciaHijoMenor;
		int numHijosMayores, numHijosMenores;
		
		System.out.println("REPARTO DE HERENCIA:");
		System.out.println("Calcula el reparto de la herencia (80% mayores de edad y 20% menores de edad).");
		
		System.out.print("Introduzca dinero a repartir: ");
		herencia = teclado.nextFloat();
		
		System.out.print("Introduzca cantidad de hijos mayores de edad: ");
		numHijosMayores = teclado.nextInt();
		
		System.out.print("Introduzca cantidad de hijos menores de edad: ");
		numHijosMenores = teclado.nextInt();
		
		herenciaHijoMayor = herencia * 0.8f;
		herenciaHijoMenor = herencia * 0.2f;

		if (numHijosMayores != 0 && numHijosMenores != 0) {
			herenciaHijoMayor = herenciaHijoMayor / numHijosMayores;
			herenciaHijoMenor = herenciaHijoMenor / numHijosMenores;
		} else if (numHijosMenores == 0 && numHijosMayores != 0) {
			herenciaHijoMayor += herenciaHijoMenor;
			herenciaHijoMayor = herenciaHijoMayor / numHijosMayores;
			herenciaHijoMenor = 0;
		} else if (numHijosMayores == 0 && numHijosMenores != 0) {
			herenciaHijoMenor += herenciaHijoMayor;
			herenciaHijoMenor = herenciaHijoMenor / numHijosMenores;
			herenciaHijoMayor = 0;
		} else {
			herenciaHijoMayor = 0;
			herenciaHijoMenor = 0;
		}
		
		//System.out.println("A los hijos mayores les corresponde " + herenciaHijoMayor + " y a los menores " + herenciaHijoMenor);
		//System.out.println("A los hijos mayores les corresponde " + String.format("%.2f", herenciaHijoMayor) + " y a los menores " + String.format("%.2f", herenciaHijoMenor));
		System.out.printf("A los hijos mayores les corresponde %.2f€ y a los menores %.2f€", herenciaHijoMayor, herenciaHijoMenor);
		
		// %f, %.2f Números con decimales (float, double)
		// %c Caracteres (char)
		// %d Números enteros (int, long, short)
		// %s Cadenas de texto (String)
		
		teclado.close();
	}
}
