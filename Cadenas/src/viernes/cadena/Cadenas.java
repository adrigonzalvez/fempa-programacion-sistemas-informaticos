package viernes.cadena;

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c = 'b';
		char e = 'e';
		System.out.println(c + e); // 199 porque suma los valores en ASCII
		System.out.println(String.valueOf(c) + String.valueOf(e)); // be
		System.out.println(String.valueOf(c) + e); // be
		System.out.println(Character.toString(c) + Character.toString(e)); // be
		System.out.println(Character.toString(c) + e); // be
		
		String cadena;
		cadena = "Hoy es lunes, mientes bellaco, es viernes";
		System.out.println(cadena);
		
		cadena = "Hoy es lunes, 'mientes bellaco', es viernes";
		System.out.println(cadena);
		
		//cadena = 'Hoy es lunes, mientes bellaco, es viernes'; // NO EXISTE EN JAVA, las ' ' son para caracteres
		
		System.out.println("Hola\n" + "\t" + cadena + "\nHe dicho.");
		System.out.println("Hola\n\t" + cadena + "\nHe dicho.");
		
		cadena = " El d?a de ma?ana. ";
		System.out.println("Longitud cad: " + cadena.length());
		String cad1 = cadena.trim();
		System.out.println("Longitud cad1: " + cad1.length());
		
		// Un s?lo caracter
		System.out.println(cad1.charAt(0) + cad1.charAt(3) + cad1.charAt(7) + cad1.charAt(10));	// 378 vuelve a sumar los c?digos ASCII de los caracteres
		System.out.println(Character.toString(cad1.charAt(0)) + cad1.charAt(3) + cad1.charAt(7) + cad1.charAt(10));

		// Una Sub cadena
		System.out.println(cad1.substring(7));
		System.out.println(cad1.substring(3,6));
		System.out.println(cad1.substring(10,16));
		
		// B?squeda, nos devuelve la posici?n (int)
		cadena = "El d?a de ma?ana.";
		int pos = cadena.indexOf('a');
		System.out.println("a est? en: " + pos);
		
		pos = cadena.indexOf('a', pos + 1);
		System.out.println("a est? en: " + pos);
		
		pos = cadena.indexOf('a', pos + 1);
		System.out.println("a est? en: " + pos);
		
		
		cadena = "El cielo es azul";
		boolean resultado = cadena.startsWith("El");
		System.out.println(resultado);
		
		resultado = 5 > 4;
		System.out.println("5 > 4: " + resultado);
		
		resultado = 4 >= 4;
		System.out.println("4 >= 4: " + resultado);
		
		resultado = 5 < 4;
		System.out.println("5 < 4: " + resultado);
		
		resultado = 5 <= 4;
		System.out.println("5 <= 4: " + resultado);
		
		resultado = 5 == 4;
		System.out.println("5 == 4: " + resultado);
		
		resultado = 5 != 4;
		System.out.println("5 != 4: " + resultado);
		
		resultado = (5 != 4) || (4 == 3);
		System.out.println("(5 != 4) || (4 == 3): " + resultado);
		
		resultado = (5 != 4) && (4 == 3);
		System.out.println("(5 != 4) && (4 == 3): " + resultado);
		
		cadena = "12";
		System.out.println(cadena + 20);	// 1220
		System.out.println(Integer.parseInt(cadena) + 20);	// 32
	}

}
