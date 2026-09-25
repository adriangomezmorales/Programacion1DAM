/*Crear una aplicación que calcule la media aritmética 
 * de dos notas enteras. Hay que tener en cuenta que la 
 * nota media puede tener decimales.
 */
package ejercicios.parte1;

import java.util.Scanner;

public class Ejercicio04 {
	public static void main(String[] args) {
		
		System.out.print("Indica una nota: ");
		Scanner sc = new Scanner(System.in);
		
		Integer primeraNota = sc.nextInt();
		
		Double primeraNotaDouble = (double)primeraNota; //Esto convierte de Integer a double
		
		System.out.print("\nIndica otra nota: ");
		Integer segundaNota = sc.nextInt();
		Double segundaNotaDouble = (double)segundaNota;
		Double notaMedia = (primeraNotaDouble+segundaNotaDouble)/2;
		
		System.out.println("\nLa nota de media de "+primeraNota+" y "+segundaNota+" es "+notaMedia);
		sc.close();

	}

}
