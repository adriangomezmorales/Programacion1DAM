/*Diseñar una aplicación que solicite al usuario un número e indique si es par o impar.
*/
package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		Integer num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}
		sc.close();
	}
}
