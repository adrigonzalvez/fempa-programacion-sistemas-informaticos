package fempa.bucles;


public class Primo2 {


	public static void main(String[] args) {
		int x = 1, y = 1;
		
		
		boolean esPrimo = true;
		x = 3;
		while (x <= 17 ) {
			y = 2;
			esPrimo = true;
			while (y < x) {
				if (x % y == 0) {
					esPrimo = false;
				}
				y++;
			}
			if (esPrimo) {
				System.out.println(x + " es primo");
			} else {
				System.out.println(x + " no es primo");
			}
			x++;
		}

	}

}
