/*11.	Diseña un programa que determine si una persona puede alquilar un vehículo.
 * Solicita su edad y dos valores booleanos que indiquen si posee permiso de conducir 
 * y si tiene una sanción que le impida conducir. Podrá alquilarlo si es mayor de edad,
 *  tiene permiso y no tiene dicha sanción. Muestra únicamente el resultado booleano.
 */

package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Indica tu edad: ");
		Integer age = sc.nextInt();
		Boolean isAdult = false;
		if(age>=18) {
			isAdult = true;
		}
		System.out.print("\nTienes permiso de conducir: ");
		Boolean hasLicense = sc.nextBoolean();
		System.out.print("\nTienes sanciones: ");
		Boolean hasSanctions = sc.nextBoolean();
		
		Boolean canRent = false;
		if(isAdult&&hasLicense&&!hasSanctions) {
			canRent = true;
		}
		System.out.println("\n"+canRent);

		
		sc.close();
	}
}
