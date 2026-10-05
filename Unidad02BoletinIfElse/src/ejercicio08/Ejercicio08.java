/*Escribir un programa que pida al usuario tres números enteros,
 * y que muestre por pantalla si la suma de dos de esos números da como resultado el otro número.
 */

package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Indica un número A: ");
		Integer numA = sc.nextInt();
		
		System.out.print("\nIndica un número B: ");
		Integer numB = sc.nextInt();
		
		
		System.out.print("\nIndica un número C: ");
		Integer numC = sc.nextInt();
		
		if(numA == (numB + numC) || numB == (numA + numC) || numC == (numA + numB) ) {
			System.out.println("\nLa suma de dos número es igual al otro número");
		}else {
			System.out.println("\nLa suma de dos número NO es igual al otro número");
		}
		
		sc.close();
	}
}
