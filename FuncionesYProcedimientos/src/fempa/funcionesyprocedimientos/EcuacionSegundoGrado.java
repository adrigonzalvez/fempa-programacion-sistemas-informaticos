package fempa.funcionesyprocedimientos;

import java.util.Scanner;

public class EcuacionSegundoGrado {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double a, b, c, x1=0, x2=0;
		
		presentacionPrograma();
		
		a = pedirDoubleUsuario(teclado, "Introduzca número a: ");
		b = pedirDoubleUsuario(teclado, "Introduzca número b: ");
		c = pedirDoubleUsuario(teclado, "Introduzca número c: ");
		
		muestraEcuacionSegundo(a, b, c);
		
		//calculoX1X2(a, b, c);
		x1 = calculoX1(a, b, c);
		x2 = calculoX2(a, b, c);
		
		muestraTextoPorConsola("Solución: " + x1 + " y " + x2);
		
		teclado.close();
	}
	
	public static void presentacionPrograma() {
		muestraTextoPorConsola("Programa para resolver ecuaciones de segundo grado:\n");
		muestraTextoPorConsola("ax^2 + bx + c = 0\n");
	}
	
	public static void muestraTextoPorConsola(String cadena) {
		System.out.print(cadena);
	}
	
	public static void muestraEcuacionSegundo(double numeroA, double numeroB, double numeroC) {
		muestraTextoPorConsola("\n" + numeroA + "x^2 + " + numeroB + "x + " + numeroC + " = 0\n");
	}
	
	/*public static void calculoX1X2(double a, double b, double c) {
		double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
		double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
		
		muestraTextoPorConsola("Solución: " + x1 + " y " + x2);
	}*/
	
	public static double calculoX1(double a, double b, double c) {
		double Nx1;
		Nx1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
		
		return Nx1;
	}
	
	public static double calculoX2(double a, double b, double c) {
		double Nx2;
		Nx2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a);
		
		return Nx2;
	}
	
	public static double pedirDoubleUsuario(Scanner teclado, String texto) {
		double numeroUsuario;
		muestraTextoPorConsola(texto);
		numeroUsuario = teclado.nextDouble();
		
		return numeroUsuario;
	}
	
	
}
