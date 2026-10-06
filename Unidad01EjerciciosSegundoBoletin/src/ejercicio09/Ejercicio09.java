/* Un depósito contiene una cantidad de litros de agua 
 * y se quiere llenar botellas de una capacidad determinada.
 * Solicita ambos valores y calcula cuántas botellas completas 
 * pueden llenarse utilizando Math.floor().
 */
package ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce litros de agua: ");
		Double litrosAgua = sc.nextDouble();
		System.out.print("\nIntroduce capacidad de botellas en litros: ");
		Double litrosPorBotella = sc.nextDouble();

		
		System.out.println("\nCon "+litrosAgua+" litros de agua, puedes llenar "+
							((int)Math.floor(litrosAgua/litrosPorBotella))+" botella(s)");
		
		sc.close();
	}
}
