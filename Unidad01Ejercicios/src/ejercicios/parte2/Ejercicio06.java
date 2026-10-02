/*Solicita al usuario tres distancias:
La primera, medida en milímetros.
La segunda, medida en centímetros.
La última, medida en metros.
Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en centímetros).
*/
package ejercicios.parte2;

import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce los mm: ");
		Integer mm = sc.nextInt();
		
		System.out.print("\nIntroduce los cm: ");
		Integer cm = sc.nextInt();
		
		System.out.print("\nIntroduce los M: ");
		Integer mtrs = sc.nextInt();
		
		System.out.println("\nEn total has indicado "+((mm/100)+cm+(mtrs*100))+" cm.");
		
		sc.close();
	}
}
