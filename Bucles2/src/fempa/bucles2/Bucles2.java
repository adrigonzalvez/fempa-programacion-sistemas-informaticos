package fempa.bucles2;

public class Bucles2 {

	public static void main(String[] args) {
		int a,b,c,d,x,y,z;
		
		a = 1;
		a = a + 1;
		a += 1;
		
		System.out.println(a);
		
		b = 1;
		b = b + 1;	// Suma 1 a b
		b += 1;	// Suma 1 a b
		b++;	// Suma 1 a b
		++b;	// Suma 1 a b
		
		System.out.println("b = " + b);
		
		// b = 5
		x = b++;	// x = 5 y b = 6
		y = ++b;	// b = 7 e y = 7
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		c = 5;
		c--;	// c = 4
		z = c--;	// z = 4 y c = 3
		d = --c;	// c = 2 y d = 2		
		
		System.out.println("\n");
		
		for (x = 1; x <= 7; x++) {
			System.out.print(x + " ");
		}
		System.out.println("\n");
		
		for (x = 1; x <= 7; ++x) {
			System.out.print(x + " ");
		}
		System.out.println("\n");
		
		for (x = 0; x <= 13; x++) {
			System.out.println(x + " -> " + (x % 10));
		}
		System.out.println();
		
		for (x = 0, y = 0; x <= 10; x++, y += 2) {
			System.out.println(x + " = " + x + ", y = " + y);
		}
		System.out.println();
		
		for (x = 0, y = 0; x <= 10 && y <= 10; x++, y += 2) {
			System.out.println(x + " = " + x + ", y = " + y);
		}
		System.out.println();
		
		for (x = 0, y = 10; x <= 10 ; x++, y--) {
			System.out.println(x + " = " + x + ", y = " + y);
		}
		System.out.println();
	}

}
