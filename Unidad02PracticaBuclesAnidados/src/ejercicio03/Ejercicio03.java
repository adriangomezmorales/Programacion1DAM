/*03. Triángulo rectángulo: ángulo abajo a la izquierda
Pide la altura N y construye un triángulo creciente alineado a la izquierda.
Ejemplo de entrada: N = 5
Salida esperada:
*
**
***
****
*****
*/
package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce la altura: ");
		Integer altura = sc.nextInt();
		
		for (int i =  1; i <= altura; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
		
	}
}
