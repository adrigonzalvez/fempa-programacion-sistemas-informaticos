package fempa.bucles;

public class Bucles {

	public static void main(String[] args) {
		
		
		// WHILE
		int a = 0;
		while (a < 10) {
			System.out.println("Valor1: " + a);
			//a = a + 1;
			//a += 1;
			//a++;
			a += 3;
		}
		
		
		// DO-WHILE
		a = 4;
		do {
			System.out.println("Valor2: " + a);
			a++;
		} while (a < 3);
		

	}

}
