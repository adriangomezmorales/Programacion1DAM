/*10.	Solicita al usuario un año. Calcula mediante una expresión booleana si el año es bisiesto. 
 * Muestra el resultado como true o false.
 */

package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nIntroduce un año: ");
		Integer year = sc.nextInt();
		
		Boolean isLeapYear = false;
		if(year%4==0||(year%400==0&&year%100!=0)) {
			isLeapYear = true;
		}
		System.out.println("\n"+isLeapYear);
		sc.close();
	}
}
