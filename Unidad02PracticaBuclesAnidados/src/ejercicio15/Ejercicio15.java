/*15. Figura con diagonal principal
Dibuja un cuadrado de N×N en el que la diagonal principal sea # y el resto *.
Ejemplo de entrada: N = 5
Salida esperada:
#****
*#***
**#**
***#*
****#

*/
package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame la altura: ");
		Integer altura = sc.nextInt();
		System.out.println();
		

		
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < altura; j++) {
				if(i!=j) {
					System.out.print("*");
				}else {
					System.out.print("#");

				}
				
			}
			System.out.println();
		}
		sc.close();
	}
}
