package fempa.letradni;

import java.util.Scanner;

public class LetraDNI {

	public static void main(String[] args) {
		/* CALCULAR LA LETRA DEL DNI */
		int dni, resto;
		char letra;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("C�LCULO DE LA LETRA DEL DNI");
		System.out.print("Introduce los n�meros del DNI: ");
		dni = teclado.nextInt();
		
		resto = dni%23;
		//resto = Math.floorMod(dni, 23);
		
		
		if (resto == 0) {
			letra = 'T';
		} else if (resto == 1) {
			letra = 'R';
		} else if (resto == 2) {
			letra = 'W';
		} else if (resto == 3) {
			letra = 'A';
		} else if (resto == 4) {
			letra = 'G';
		} else if (resto == 5) {
			letra = 'M';
		} else if (resto == 6) {
			letra = 'Y';
		} else if (resto == 7) {
			letra = 'F';
		} else if (resto == 8) {
			letra = 'P';
		} else if (resto == 9) {
			letra = 'D';
		} else if (resto == 10) {
			letra = 'X';
		} else if (resto == 11) {
			letra = 'B';
		} else if (resto == 12) {
			letra = 'N';
		} else if (resto == 13) {
			letra = 'J';
		} else if (resto == 14) {
			letra = 'Z';
		} else if (resto == 15) {
			letra = 'S';
		} else if (resto == 16) {
			letra = 'Q';
		} else if (resto == 17) {
			letra = 'V';
		} else if (resto == 18) {
			letra = 'H';
		} else if (resto == 19) {
			letra = 'L';
		} else if (resto == 20) {
			letra = 'C';
		} else if (resto == 21) {
			letra = 'K';
		} else if (resto == 22) {
			letra = 'E';
		} else {
			letra = '_';
		}
		
		System.out.println("DNI: " + dni + String.valueOf(letra));
		
		teclado.close();
	}

}
