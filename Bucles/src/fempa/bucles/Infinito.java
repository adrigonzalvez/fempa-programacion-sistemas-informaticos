package fempa.bucles;

public class Infinito {

	public static void main(String[] args) {
		
		int x = 1;
		while (true) {
			x += 1;
			System.out.println(x);
			
			if (x > 100000 ) {
				break;
			}
		}

	}

}
