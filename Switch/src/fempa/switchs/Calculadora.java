package fempa.switchs;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double num1, num2;
		char operacion;
		
		
		System.out.println("CALCULADORA");
		System.out.print("Número 1: ");
		num1 = teclado.nextDouble();
		
		System.out.print("Número 2: ");
		num2 = teclado.nextDouble();
		teclado.nextLine();
		
		System.out.print("Operación (+ - * /): ");
		operacion = teclado.nextLine().charAt(0);
		
		switch (operacion) {
			case '+':
				System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
				break;
			case '-':
				System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
				break;
			case '*':
				System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
				break;
			case '/':
				System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
				break;
			default:
				System.out.println("No ha introducido una operación válida.");
		}
		
		teclado.close();
	}

}
