package fempa.bucles;

public class BuclesAnidados {

	public static void main(String[] args) {
		int x = 0, y = 0;
		
		while (x < 20 ) {
			while (y < 5) {
				System.out.print("( " + x + " , " + y + " )");
				y++;
			}
			System.out.println("");
			x++;
			y=0;
		}
	}

}
