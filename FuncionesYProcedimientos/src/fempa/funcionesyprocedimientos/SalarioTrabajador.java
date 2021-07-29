package fempa.funcionesyprocedimientos;

import java.util.Scanner;

public class SalarioTrabajador {
	
	/*
	 * 2. Escribir una función SALARIO que calcule los salarios de un trabajador para un número
	 * dado de horas trabajadas y el dinero por hora. Las horas trabajadas que superen las 40h
	 * semanales, se pagarán como extras a 1.5 veces el salario normal.
	 *  
	 * Ejemplos:
	 * 	Horas trabajadas	Precio de hora trabajada	Resultado
	 * 		40					10						400
	 * 		20					15						300
	 * 		50					20						1100
	 * 		10					50						500
	 * */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int horas;
		double precio, salario;
		
		presentacionPrograma();
		
		horas = pedirIntUsuario(teclado, "Número de horas trabajadas: ");
		precio = pedirDoubleUsuario(teclado, "Precio por hora: ");
		
		salario = salario(horas, precio);
		
		muestraTextoPorConsola("Salario: " + salario + "€");
		
		teclado.close();
	}
	
	public static void presentacionPrograma() {
		muestraTextoPorConsola("CALCULO DEL SALARIO DE UN TRABAJADOR\n");
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
	
	public static double pedirDoubleUsuario(Scanner teclado, String texto) {
		double numeroUsuario;
		muestraTextoPorConsola(texto);
		numeroUsuario = teclado.nextDouble();
		
		return numeroUsuario;
	}
	
	public static double salario(double horasTrabajadas, double precioHora) {
		double salario;
		if (horasTrabajadas > 0 && horasTrabajadas <= 40) {
			salario = horasTrabajadas * precioHora;
		} else if (horasTrabajadas > 40) {
			salario = 40d * precioHora + (horasTrabajadas - 40d) * 1.5 * precioHora;
		} else {
			salario = 0;
		}
		
		return salario;
	}
	
	
	
	
	
	
}
