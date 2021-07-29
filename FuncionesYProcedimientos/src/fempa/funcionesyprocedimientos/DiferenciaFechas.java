package fempa.funcionesyprocedimientos;

import java.util.Scanner;

public class DiferenciaFechas {
	
	/*
	 * 7. Escribir una función (CalcularSec) a la que se pasan las horas, minutos y segundos de dos
	 * instantes diferentes y debe devolver la diferencia en segundos entre ambos instantes.
	 * Escribir una función (CalcularMin) a la que se pasan las horas y minutos de dos instantes
	 *  diferentes y debe devolver la diferencia en minutos entre ambos instantes. 
	 *
	 */
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int hora1, min1, seg1;
		int hora2, min2, seg2;
		int difSegundos, difMinutos;
		
		
		presentacionPrograma();
		
		hora1 = pedirIntUsuario(teclado, "Hora 1: ");
		min1 = pedirIntUsuario(teclado, "Minutos 1: ");
		seg1 = pedirIntUsuario(teclado, "Segundos 1: ");
		
		System.out.println("");
		
		hora2 = pedirIntUsuario(teclado, "Hora 2: ");
		min2 = pedirIntUsuario(teclado, "Minutos 2: ");
		seg2 = pedirIntUsuario(teclado, "Segundos 2: ");
		
		difSegundos = calcularSec(hora1, min1, seg1, hora2, min2, seg2);
		difMinutos = calcularMin(hora1, min1, seg1, hora2, min2, seg2);
		
		muestraTextoPorConsola("Diferencia en segundos: " + difSegundos + "\n");
		muestraTextoPorConsola("Diferencia en minutos: " + difMinutos + "\n");
		
		teclado.close();
	}
	
	public static void presentacionPrograma() {
		muestraTextoPorConsola("DIFERENCIA ENTRE 2 FECHAS EN SEGUNDOS.\n");
	}
	
	public static void muestraTextoPorConsola(String cadena) {
		System.out.print(cadena);
	}
	
	public static int pedirIntUsuario(Scanner teclado, String texto) {
		muestraTextoPorConsola(texto);
		return teclado.nextInt();
	}
	
	public static int calcularSec(int hora1, int minutos1, int segundos1, int hora2, int minutos2, int segundos2) {
		int segsHora1, segsHora2; 
		segsHora1 = hora1*60*60 + minutos1*60 + segundos1;
		segsHora2 = hora2*60*60 + minutos2*60 + segundos2;
		
		return Math.abs(segsHora1 - segsHora2);
	}
	
	public static int calcularMin(int hora1, int minutos1, int segundos1, int hora2, int minutos2, int segundos2) {
		return calcularSec(hora1, minutos1, segundos1, hora2, minutos2, segundos2) / 60;
	}
	
	
	
	
	
}
