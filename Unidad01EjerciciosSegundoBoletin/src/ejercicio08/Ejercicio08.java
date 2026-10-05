/*Una empresa guarda productos en cajas con una capacidad determinada. 
 * Pide al usuario el número de productos y la capacidad de cada caja. 
 * Calcula cuántas cajas son necesarias para guardar todos los productos 
 * utilizando Math.ceil(). El resultado final debe mostrarse como un número entero.
 */
package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el número de productos: ");
		Integer products = sc.nextInt();
		
		System.out.print("\nIntroduce la capacidad de las cajas: ");
		Integer boxCapacity = sc.nextInt();
		
		System.out.println("\nNecesitas " + (int) Math.ceil((double) products / boxCapacity)
        + " cajas para los " + products + " productos");		
		
		sc.close();
	}
}
