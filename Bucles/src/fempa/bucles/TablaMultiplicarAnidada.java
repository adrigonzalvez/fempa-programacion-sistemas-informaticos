package fempa.bucles;

public class TablaMultiplicarAnidada {

	/*
	 * Tabla de multiplicar del 1 al 6
	 * */
	public static void main(String[] args) {
		int x = 1, y = 1;
		
		// Tabla de Multiplicar:
		while (x <= 10 ) {
			y=1;
			while (y <= 10) {
				System.out.print(x + " x " + y + " = " + (x*y) + " | ");
				y++;
			}
			System.out.println("");
			x++;
		}
		
		
		x= 1;
		y = 1;
		// Triángulo asteriscos:
		while (x <= 7) {
			y=0;
			while (y < x) {
				//System.out.print(" ( " + x + " , " + y + " ) ");
				System.out.print("*");
				y++;
			}
			System.out.println("");
			x++;
		}
		
	}

}
