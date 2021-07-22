package fempa.codigocuentacontrol;

import java.util.Scanner;

public class CodigoCuentaControl {
	
	/*
    Pide un número de cuenta de 20 dígitos
    4 dígitos entidad bancaria
    4 dígitos oficina
    2 dítos de control
    10 dígitos cuenta

    Calcula el código de control y comprueba si coincide con el que has introducido tú.
    Si coincide la cuenta es correcta y si no coincide la cuenta es erronea y muestra cual debería de ser su código de control.
	 */

	/*
	PASOS:
	1.- Pedir número de cuenta
	2.- Comprobar que son 20 caracteres
	3.- Cacular primer dígito
	4.- Calcular segundo dígito
	5.- Comprobar con el de la cuenta introducida.
	6.- Salida de cuenta correcto o incorrecta
	*/

	public static void main(String[] args) {     
        Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce tu cuenta completa 20 dígitos: ");
		String cuenta = teclado.nextLine();
		
		if (cuenta.length() != 20) {
			System.out.println("Cuenta incompleta");
		} else {
			// Código aquí
			int controlUno = 0;
			int controlDos = 0;
			
			// DÍGITO DE CONTROL UNO:
			
			// Entidad bancaria
			controlUno += Integer.parseInt(String.valueOf(cuenta.charAt(0))) * 4;
			controlUno += Integer.parseInt(String.valueOf(cuenta.charAt(1))) * 8;
			controlUno += Integer.parseInt(String.valueOf(cuenta.charAt(2))) * 5;
			controlUno += Integer.parseInt(String.valueOf(cuenta.charAt(3))) * 10;
			
			// Oficina
			controlUno += Integer.parseInt(String.valueOf(cuenta.charAt(4))) * 9;
			controlUno += Integer.parseInt(String.valueOf(cuenta.charAt(5))) * 7;
			controlUno += Integer.parseInt(String.valueOf(cuenta.charAt(6))) * 3;
			controlUno += Integer.parseInt(String.valueOf(cuenta.charAt(7))) * 6;
			
			controlUno %= 11;

			if (controlUno == 10) {
				controlUno = 1;
			} else {
				controlUno = 11 - controlUno;
			}
			
			
			// DÍGITO DE CONTROL DOS:
			
			controlDos += Integer.parseInt(String.valueOf(cuenta.charAt(10))) * 1;
			controlDos += Integer.parseInt(String.valueOf(cuenta.charAt(11))) * 2;
			controlDos += Integer.parseInt(String.valueOf(cuenta.charAt(12))) * 4;
			controlDos += Integer.parseInt(String.valueOf(cuenta.charAt(13))) * 8;
			controlDos += Integer.parseInt(String.valueOf(cuenta.charAt(14))) * 5;
			controlDos += Integer.parseInt(String.valueOf(cuenta.charAt(15))) * 10;
			controlDos += Integer.parseInt(String.valueOf(cuenta.charAt(16))) * 9;
			controlDos += Integer.parseInt(String.valueOf(cuenta.charAt(17))) * 7;
			controlDos += Integer.parseInt(String.valueOf(cuenta.charAt(18))) * 3;
			controlDos += Integer.parseInt(String.valueOf(cuenta.charAt(19))) * 6;
			
			controlDos %= 11;

			if (controlDos == 10) {
				controlDos = 1;
			} else {
				controlDos = 11 - controlDos;
			}
			
			System.out.println("DC1DC2: " + controlUno + controlDos);
            
		}

		
		
		teclado.close();
	}

}
