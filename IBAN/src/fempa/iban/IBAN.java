package fempa.iban;

import java.math.BigInteger;
import java.util.Scanner;

public class IBAN {
	
	/*
	 * CÁLCULO DEL IBAN de una cuenta bancaria
	 * 
	 * [ES 2d(Código control)] Cuenta (20 dígitos): 4d (Cuenta) 4d (Oficina) 2d (Código Control) 10d (Número de cuenta)
	 * ES00 0182 0003 23 1234567890
	 * 
	 * PASOS:
	 * 	1. Capturar cadena (String) y comprobar que hay 20 números: Long.parseLong(cadena);
	 * 
	 * */

	/*public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cuenta, ibanAux;
		double numIban;
		int dcIban;
		
		System.out.println("CÁLCULO DEL DC del IBAN");
		System.out.print("Introduce el Número de Cuenta Corriente (CCC): ");
		cuenta = teclado.nextLine();
		if (cuenta.length() != 20)  {
			System.out.println("Debe introducir un número de cuenta válido (20 dígitos).");
		} else {
			ibanAux = cuenta + "142800"; //ES00 = 14 28 00
			numIban = Double.parseDouble(ibanAux);
			dcIban = (int) (numIban % 97d);
			dcIban = 98 - dcIban;
			
			String aux = "0" + dcIban;
			int largo = aux.length();
			String codigo = "" + aux.charAt(largo-2) + aux.charAt(largo-1);
					
					
			//if (dcIban < 10) dcIban *= 10;
			System.out.println("ES"+ (dcIban < 10 ? "0"+dcIban : dcIban) + cuenta);
		}		
		teclado.close();
	}*/
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cuenta;
		BigInteger numIban, DCIban;
		int intDCIban;
		
		System.out.println("CÁLCULO DEL DC del IBAN");
		System.out.print("Introduce el Número de Cuenta Corriente (CCC): ");
		cuenta = teclado.nextLine();
		
		if (cuenta.length() != 20)  {
			System.out.println("Debe introducir un número de cuenta válido (20 dígitos).");
		} else {
			numIban = new BigInteger(cuenta + "142800"); //ES00 = 14 28 00
			DCIban = numIban.mod(new BigInteger("97"));
			intDCIban = 98 - DCIban.intValue();
			
			/*String aux = "0" + DCIban;
			int largo = aux.length();
			String codigo = "" + aux.charAt(largo-2) + aux.charAt(largo-1);*/
					
			System.out.println("ES"+ (intDCIban < 10 ? "0"+intDCIban : intDCIban) + cuenta);
		}		
		teclado.close();
	}

}
