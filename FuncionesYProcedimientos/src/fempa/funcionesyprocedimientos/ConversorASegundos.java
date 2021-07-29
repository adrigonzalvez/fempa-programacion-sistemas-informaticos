package fempa.funcionesyprocedimientos;

import java.util.Scanner;

public class ConversorASegundos {
	
	/*
	 * 5. Escribir una función a la que se pasan como parámetro de entrada una cantidad de días, 
	 * horas, minutos y segundos. La función calculará y devolverá el número de segundos que existen
	 * en los datos de entrada. Crea un procedimiento que reciba la cantidad de segundos y te diga 
	 * la cantidad de días, horas, minutos y segundos.
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dias, horas, min, seg, totalSeg;
		
		presentacionPrograma();
		dias = pedirIntUsuario(teclado, "Dias: ");
		horas = pedirIntUsuario(teclado, "Hora: ");
		min = pedirIntUsuario(teclado, "Minutos: ");
		seg = pedirIntUsuario(teclado, "Segundos: ");
		
		totalSeg = calcularSeguntosTotales(dias, horas, min, seg);
		muestraTextoPorConsola("Total de segundos: " + totalSeg + "\n");
		
		muestraDiasHorasMinutosSegundos(totalSeg);
		
		teclado.close();
	}
	
	public static void presentacionPrograma() {
		muestraTextoPorConsola("CONVERSOR DIA, HORA, MINUTOS Y SEGUNDOS A SEGUNDOS\n");
	}
	
	public static void muestraTextoPorConsola(String cadena) {
		System.out.print(cadena);
	}
	
	public static int pedirIntUsuario(Scanner teclado, String texto) {
		muestraTextoPorConsola(texto);
		return teclado.nextInt();
	}
	
	public static int calcularSeguntosTotales(int dias, int horas, int minutos, int segundos) {
		return dias*24*60*60 + horas*60*60 + minutos*60 + segundos;
	}
	
	public static void muestraDiasHorasMinutosSegundos(int segundosTotales) {
		int dias, horas, minutos, segundos;
		int segundosRestantes = segundosTotales;
		
		int segDia = 86400;	//24*60*60;
		int segHora = 3600;	//60*60 ;
		int segMinuto = 60;
		
		dias = segundosRestantes / segDia;
		segundosRestantes %= segDia;
		
		horas = segundosRestantes / segHora;
		segundosRestantes %= segHora;
		
		minutos = segundosRestantes / segMinuto;
		segundosRestantes %= segMinuto;
		
		segundos = segundosRestantes;
		
		
		System.out.println(dias + " días, " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos." );
	}
	
	
	
	
	
}
