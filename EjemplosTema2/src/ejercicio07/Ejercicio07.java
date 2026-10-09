/*Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.
*/
package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		Integer num = sc.nextInt();
		
		Integer sumatorio = 0;
		for(int i = 1; i<=num;i++) {
			if(num%i==0) {
				sumatorio++;
			}
		}
		if(sumatorio>2||num==1) {
			System.out.println("\nEl numero NO es primo");
		}else {
			System.out.println("\nEl numero SÍ es primo");
		}
		sc.close();
	}
}
