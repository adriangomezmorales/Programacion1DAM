/*Escribe un programa que solicite un número real y
 * muestre su valor absoluto y su raíz cuadrada
 * utilizando métodos de la clase Math.
 * Prueba el programa con diferentes valores positivos.
 */
package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero real: ");
		Double num = sc.nextDouble();
		Double valor = Math.abs(num);
		Double raizCuadrada = Math.sqrt(num);
		System.out.println("Valor absoluto: " + valor);
		System.out.println("Raiz cuadrada: " + raizCuadrada);
		sc.close();
	}
}
