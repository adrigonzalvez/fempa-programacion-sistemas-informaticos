package jueves.numeroaleatorio;

import java.util.Random;

public class NumeroAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("N�mero aleatorio entre 1 y 10: ");
		Random rand = new Random();
		int num = rand.nextInt(10) + 1;
		System.out.println(num);
		
	}

}
