package jueves.numero;

public class Numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola amigo");
		System.out.print("Saludos ");
		System.out.print("amigo");
		System.out.println("un placer");
		
		System.out.println("Ahora" + " " + "no me voy");
		
		String nombre = "Alicia";
		int edad = 33;
		double altura = 160;
		float salario = 33432.5f;
		
		System.out.println(nombre + " tiene " + edad + " a?os y mide " + altura + " gana " + salario + " ?");
		
		// N?MEROS
		int a,b;
		int c = 33;
		double s = 123.321, d;
		
		a = 7;
		b = 3;
		s = 2.5;
		
		// SUMA
		c = a + b;
		System.out.println("Suma es: " + c);
		
		// RESTA
		c = a - b;
		System.out.println("Resta es: " + c);
		
		// MULTIPLICACI?N
		c = a * b;
		System.out.println("Multiplicaci?n es: " + c);
				
		// DIVISI?N
		c = a / b;
		System.out.println("Divisi?n es: " + c);
		
		// RESTO
		c = a % b;
		System.out.println("Resto es: " + c);
		
		
		//System.out.println("Suma: " + (a + b));
		//System.out.println("Suma: " + d);
		//System.out.println(12 + 33 + " la suma");
		
		// DOUBLE
		double ad,bd,cd;
		ad=7.4;
		bd=3;
		
		c = (int)(ad * bd);
		
		cd = a + b;
		System.out.println(c);
		
		cd = (double)(a) / (double)(b);
		System.out.println(cd);
		
		
		// PRIORIDADES
		a=4;
		b=5;
		c=8;
		
		System.out.println(a + b * c); // 44
		System.out.println((a + b) * c); // 72
		System.out.println(a / b * c);	// 0
		System.out.println(a * (b + b) * c);	// 0
		
	}
	

}
