package fempa.mayorymenortresnumeros;

import java.util.Scanner;

public class MayorYMenor3Numeros2 {
	
	/* SOLUCIÓN PROPIA */
	/*public static void main(String[] args) {
		float A, B, C;
		Scanner teclado = new Scanner(System.in);

		System.out.println("MAYOR Y MENOR DE 3 NÚMEROS");
		System.out.print("Introduzca el primer número: ");
		A = teclado.nextFloat();
		System.out.print("Introduzca el segundo número: ");
		B = teclado.nextFloat();
		System.out.print("Introduzca el tercer número: ");
		C = teclado.nextFloat();
		
		// Mayor
		if (A >= B && A >= C) {
			System.out.println("El mayor es A: " + A);
		} else if ( B >= A && B >= C) {
			System.out.println("El mayor es B: " + B);
		} else  {
			System.out.println("El mayor es C: " + C);
		}
		
		// Menor
		if (A <= B && A <= C) {
			System.out.println("El menor es A: " + A);
		} else if ( B <= A && B <= C) {
			System.out.println("El menor es B: " + B);
		} else  {
			System.out.println("El menor es C: " + C);
		}

		teclado.close();
	}*/

	/* SOLUCIÓN PROPIA 2 */
	/* Añade obtener el valor de el del medio*/
	public static void main(String[] args) {
		int A, B, C;
		int mayor, medio, menor;
		Scanner teclado = new Scanner(System.in);

		System.out.println("MAYOR Y MENOR DE 3 NÚMEROS");
		System.out.print("Introduzca el primer número: ");
		A = teclado.nextInt();
		System.out.print("Introduzca el segundo número: ");
		B = teclado.nextInt();
		System.out.print("Introduzca el tercer número: ");
		C = teclado.nextInt();
		
		// Mayor
		if (A >= B && A >= C) {
			mayor = A;
		} else if ( B >= A && B >= C) {
			mayor = B;
		} else  {
			mayor = C;
		}
		System.out.println("El mayor es A: " + mayor);
		
		// Menor
		if (A <= B && A <= C) {
			menor = A;
		} else if ( B <= A && B <= C) {
			menor = B;
		} else  {
			menor = C;
		}
		System.out.println("El menor es C: " + menor);
		
		// Medio
		/*if (A != mayor && A != menor) {
			medio = A;
		} else if (B != mayor && B != menor)  {
			medio = B;
		} else {
			medio = C;
		}
		System.out.println("El medio es C: " + medio);*/
		
		// Si A es 7, B es 5 y C es 6
		// Sabiendo que el mayor es 7, menor es 5
		// Calcule el mediano sin usar condiciones:
		int sumaTresNumeros = A+B+C;
		medio = sumaTresNumeros - menor - mayor;
		System.out.println("El medio es: " + medio);		
		
		System.out.println("Si introducimos " + A + " " + B + " " + C);
		System.out.println("Salida esperada: " + mayor + " - " + medio + " - " + menor);
		System.out.println("El menor es " + menor + ", mayor " + mayor + ", el de en medio " + medio);

		teclado.close();
	}
	
	/* SOLUCIÓN PROFESOR */
	/* Añade obtener el valor de el del medio*/
	/*public static void main(String[] args) {
		double A, B, C;
		double mayor, mediano, menor;
		Scanner teclado = new Scanner(System.in);

		System.out.println("MAYOR Y MENOR DE 3 NÚMEROS");
		System.out.println("Programa de cálculo de mayor y menor.");
		
		System.out.print("Introduzca el primer número: ");
		A = teclado.nextInt();
		System.out.print("Introduzca el segundo número: ");
		B = teclado.nextInt();
		System.out.print("Introduzca el tercer número: ");
		C = teclado.nextInt();
		
		//if (A == B || B == C || A == C) {
		//	System.out.println("Algunos números son iguales, por favor introduzca otros diferentes.");
		//} else {
			if (A >= B) {
				if (A >= C) {
					mayor = A;
					if (B >= C) {
						mediano = B;
						menor = C;
					} else {
						mediano = C;
						menor = B;
					}
				} else {
					mayor = C;
					mediano = A;
					menor = B;
				}
			} else {
				if (B >= C) {
					mayor = B;
					if (A >= C) {
						mediano = A;
						menor = C;
					} else {
						mediano = C;
						menor = A;
					}
				} else {
					mayor = C;
					mediano = B;
					menor = A;
				}
			}
			
			// Si son iguales no los muestra:
			if (A == B && B == C && A == C) {
				System.out.println("Todos los números son iguales.");
			}
			if (menor!=mediano) {
				System.out.print(menor + " - " + mediano);
			} else {
				System.out.print(menor);
			}
			if (mayor != mediano) {
				System.out.print(" - " + mayor);
			}
			System.out.print("\n");
			
			System.out.println(menor + " - " + mediano + " - " + mayor);
			
			
		//}
		
		teclado.close();
	}*/

}
