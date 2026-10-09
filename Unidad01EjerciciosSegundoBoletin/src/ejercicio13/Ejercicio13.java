/*13.	Pide al usuario una cantidad de dinero con decimales.
 * Mediante un cast a int obtén la cantidad de euros enteros.
 * A partir de la parte decimal, calcula también los céntimos
 * y redondéalos correctamente.
 */

package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dinero: ");
		Double dinero = sc.nextDouble();
		
		Integer euros = dinero.intValue();
		Integer cents = (int) Math.round((dinero - euros) * 100);
		
		
		if(cents>=100) {
			cents-=100;
			euros++;
		}
		
		
		System.out.println("Euros: "+euros);
		System.out.println("Cents: "+cents);

		sc.close();
		

	}
}
