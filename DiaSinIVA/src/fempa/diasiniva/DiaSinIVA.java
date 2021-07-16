package fempa.diasiniva;

import java.util.Scanner;

public class DiaSinIVA {

	public static void main(String[] args) {
		float pvp, iva, pvpBruto, ahorro;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Programa para calcular precios en el Día sin IVA de MediaMarkt");
		System.out.print("Introduzca el PVP: ");
		pvp = teclado.nextFloat();
		System.out.print("Introduzca el IVA (0-100): ");
		iva = teclado.nextFloat();
		
		pvpBruto = pvp / (1+iva/100);
		ahorro = pvp - pvpBruto;
		
		System.out.printf("El precio a pagar serían %.2f€, te has ahorrado %.2f€", pvpBruto, ahorro);
		teclado.close();
	}

}
