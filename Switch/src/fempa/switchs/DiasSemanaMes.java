package fempa.switchs;

import java.util.Scanner;

public class DiasSemanaMes {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		// SEMANA:
		System.out.print("Introduce el número del día de la semana: ");
		int diaSemana = teclado.nextInt();
		
		switch(diaSemana) {
			case 1:
				System.out.println("Lunes.");
				break;
			case 2:
				System.out.println("Martes.");
				break;
			case 3:
				System.out.println("Miércoles.");
				break;
			case 4:
				System.out.println("Jueves.");
				break;
			case 5:
				System.out.println("Viernes.");
				break;
			case 6:
				System.out.println("Sábado.");
				break;
			case 7:
				System.out.println("Domingo.");
				break;
			default:
				System.out.println("No es un día de la semana.");
		}
		
		switch (diaSemana) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Es laborable.");
				break;
			case 6:
			case 7:
				System.out.println("No es laborable.");
				break;
			default:
				System.out.println("No es un día de la semana.");
		}
		
		
		// MES
		System.out.print("Introduce el número del mes: ");
		int diaMes = teclado.nextInt();
		
		switch(diaMes) {
		case 1:
			System.out.println("Enero.");
			break;
		case 2:
			System.out.println("Febrero.");
			break;
		case 3:
			System.out.println("Marzo.");
			break;
		case 4:
			System.out.println("Abril.");
			break;
		case 5:
			System.out.println("Mayo.");
			break;
		case 6:
			System.out.println("Junio.");
			break;
		case 7:
			System.out.println("Julio.");
			break;
		case 8:
			System.out.println("Agosto.");
			break;
		case 9:
			System.out.println("Septiembre.");
			break;
		case 10:
			System.out.println("Octubre.");
			break;
		case 11:
			System.out.println("Noviembre.");
			break;
		case 12:
			System.out.println("Diciembre.");
			break;
		default:
			System.out.println("No es un número de mes válido.");
	}
	
	switch (diaMes) {
		case 1:
		case 2:
		case 3:
			System.out.println("Primer trimestre.");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("Segundo trimestre.");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("Tercer trimestre.");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("Cuarto trimestre.");
			break;
		default:
			System.out.println("No es un número de mes válido.");
	
	}
		
		teclado.close();
	}

}
