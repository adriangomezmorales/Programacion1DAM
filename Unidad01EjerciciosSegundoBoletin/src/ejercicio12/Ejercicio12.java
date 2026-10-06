/*12.	Pide al usuario su edad y utiliza el operador ternario 
 * para calcular el precio de una entrada: 
 * 6,50 € si es menor de 18 años y 9,50 € en caso contrario. 
 * Muestra el precio correspondiente.
 */

package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Indica tu edad: ");
		Integer age = sc.nextInt();
		
		Double price = age>=18 ? 9.5 : 6.5;
		
		System.out.println("\nEl precio es de "+price+"€");
		
		sc.close();
	}
}
