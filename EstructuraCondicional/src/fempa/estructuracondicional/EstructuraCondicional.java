package fempa.estructuracondicional;

public class EstructuraCondicional {

	public static void main(String[] args) {
		int a = 9, b = 3;
		//boolean mayorA = a > b;
		
		if (a > b)
		{
			System.out.println("A es el n?mero mayor");
			System.out.println("B es el menor");
		}
		else if (a == b) // 2 iguales al comparar
		{
			System.out.println("A y B son iguales");
			System.out.println("B y A son iguales");
		}
		else if (a < b)
		{
			System.out.println("B es el n?mero mayor");
		}
			
		System.out.println("FIN");
		
		
		
		if ((a>=1 && a<5) || (b==0) ) {
			int resultado = a/b;
		}
		
		if (!(a>=1 && a<5)) {
			
		}
		
		boolean aMayorB = a>b;
		
		String cadena  = "Hola";
		if (cadena == "Hola") {
			System.out.println("Cadena es Hola");
		} else {
			System.out.println("Cadena no es Hola");
		}
		
		/* COMPARAR CADENAS */
		// http://chuwiki.chuidiang.org/index.php?title=Comparar_cadenas_de_texto
		
		String cadena1 = "Hola2";
		String cadena2 = "Hola";
		if (cadena1 == cadena2) {
			System.out.println("Cadenas iguales.");
		} else {
			System.out.println("Cadenas no iguales.");
		}
		
		if (cadena1.equals(cadena2)) {
			System.out.println("Cadenas iguales.");
		}
		if (cadena1.equalsIgnoreCase(cadena2)) {
			System.out.println("Cadenas iguales ignorando may?sculas y min?sculas.");
		}
		if (!cadena1.equalsIgnoreCase(cadena2)) {
			System.out.println("Cadenas distintas ignorando may?sculas y min?sculas.");
		}
		
		
	}

}
