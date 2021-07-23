package fempa.switchs;

import java.util.Scanner;

public class NumeroDiasMes {

	/*
	 * Pedir por teclado:
	 *  - Un mes del año (1 - 12)
	 *  - Un año. Ej. 2026 o 1954 o 1243
	 *  
	 *  Salida: Número de días de ese mes,
	 *  teniendo en cuenta que febrero (2), puede tener 28 o 29 días
	 * */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int mes, anyo;
		
		System.out.print("Dime un mes del año (1-12): ");
		mes = teclado.nextInt();
		
		System.out.print("Dime un año: ");
		anyo = teclado.nextInt();
		
		switch (mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				// 31 días
				System.out.println("El mes " + mes + " del año " + anyo + " tiene 31 días.");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				// 30 días
				System.out.println("El mes " + mes + " del año " + anyo + " tiene 30 días.");
				break;
			case 2:
				//febrero 
				// calcular bisiesto
				if ((anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0)) {
					// Bisiesto: 29 días
					System.out.println("El mes " + mes + " del año " + anyo + " tiene 29 días.");
				} else {
					// No bisiesto: 28 días
					System.out.println("El mes " + mes + " del año " + anyo + " tiene 28 días.");
				}
				break;
			default:
				System.out.println("No ha introducido un número de mes válido.");	
		}
		
		
		
		teclado.close();
	}

}
