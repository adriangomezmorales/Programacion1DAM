/*08. Pirámide invertida
Ejemplo de entrada: N = 5
Salida esperada:
*********
 *******
  *****
   ***
    *

*/
package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame la altura: ");
		Integer altura = sc.nextInt();
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < 2 * altura - 1; j++) {
				if (j >= i && j < 2 * altura - 1 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
