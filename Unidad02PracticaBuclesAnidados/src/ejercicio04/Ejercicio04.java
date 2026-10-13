/*04. Triángulo rectángulo: ángulo arriba a la izquierda
La primera fila tiene N asteriscos y cada fila siguiente uno menos.
Ejemplo de entrada: N = 5
Salida esperada:
*****
****
***
**
*

*/
package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {
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
