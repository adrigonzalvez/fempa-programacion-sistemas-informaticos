package fempa.teoremapitagoras;

import java.util.Scanner;

public class TeoremaPitagoras {

	/* SOLUCI?N PROPIA */
	/*public static void main(String[] args) {
		long ini, fin;
		
		
		double cateto1, cateto2, hipotenusa;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce el valor del cateto 1: ");
		cateto1 = teclado.nextDouble();
		
		System.out.print("Introduce el valor del cateto 2: ");
		cateto2 = teclado.nextDouble();
		
		ini = System.currentTimeMillis();
		hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
		//hipotenusa = Math.hypot(cateto1, cateto2);	
		fin = System.currentTimeMillis();
		
		System.out.println("La hipotenusa es: " + hipotenusa);
		
		teclado.close();
		
		System.out.println("Inicio: " + (long)ini);
		System.out.println("Inicio: " + (long)fin);
		System.out.println("Tiempo total: " + (long)(fin - ini));
	}*/
	
	/* SOLUCI?N PROFESOR */
	public static void main(String[] args) {
		float cateto1, cateto2, hipotenusa;
		
		System.out.println("En este programa vamos a calcular el valor de la hipotenusa seg?n el Teorema de Pit?goras.");
		
		// Mostrar: "Introduce el valor del cateto 1":
		System.out.print("Introduce el valor del cateto 1: ");
		
		// Leer del teclado el valor del cateto 1:
		Scanner teclado = new Scanner(System.in);
		cateto1 = teclado.nextFloat();
		
		// Mostrar: "Introduce el valor del cateto 2:"
		System.out.print("Introduce el valor del cateto 2: ");
		
		// Leer del teclado el valor del cateto 2:
		cateto2 = teclado.nextFloat();
		
		long inicioT = System.currentTimeMillis();
		
		// Calcular valor de la hipotenusa:
		hipotenusa = (float) Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		//hipotenusa = (float) Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
		//hipotenusa = (float)Math.hypot(cateto1, cateto2);
		
		long finalT = System.currentTimeMillis();
		
		long tiempo = finalT - inicioT;
		
		// Mostrar el valor de la hipotenusa;
		System.out.print("La hipotenusa es: " + hipotenusa);
		System.out.println(" (" + tiempo + " ms usando Math.hypot)");
		
		teclado.close();
}

}
