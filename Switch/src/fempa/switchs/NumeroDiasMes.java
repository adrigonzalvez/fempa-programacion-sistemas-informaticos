package fempa.switchs;

import java.util.Scanner;

public class NumeroDiasMes {

	/*
	 * Pedir por teclado:
	 *  - Un mes del a�o (1 - 12)
	 *  - Un a�o. Ej. 2026 o 1954 o 1243
	 *  
	 *  Salida: N�mero de d�as de ese mes,
	 *  teniendo en cuenta que febrero (2), puede tener 28 o 29 d�as
	 * */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int mes, anyo;
		
		System.out.print("Dime un mes del a�o (1-12): ");
		mes = teclado.nextInt();
		
		System.out.print("Dime un a�o: ");
		anyo = teclado.nextInt();
		
		switch (mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				// 31 d�as
				System.out.println("El mes " + mes + " del a�o " + anyo + " tiene 31 d�as.");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				// 30 d�as
				System.out.println("El mes " + mes + " del a�o " + anyo + " tiene 30 d�as.");
				break;
			case 2:
				//febrero 
				// calcular bisiesto
				if ((anyo % 4 == 0 && anyo % 100 != 0) || (anyo % 400 == 0)) {
					// Bisiesto: 29 d�as
					System.out.println("El mes " + mes + " del a�o " + anyo + " tiene 29 d�as.");
				} else {
					// No bisiesto: 28 d�as
					System.out.println("El mes " + mes + " del a�o " + anyo + " tiene 28 d�as.");
				}
				break;
			default:
				System.out.println("No ha introducido un n�mero de mes v�lido.");	
		}
		
		
		
		teclado.close();
	}

}
