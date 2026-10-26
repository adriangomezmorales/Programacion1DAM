/*09. Rombo
Combina una pirámide de N niveles con una pirámide invertida sin repetir la fila central.
Ejemplo de entrada: N = 4
Salida esperada:
   *
  ***
 *****
*******
 *****
  ***
   *

*/
package ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame la altura: ");
		Integer altura = sc.nextInt();
		for (int i = 0; i < altura * 2 -1; i++) {
			for (int j = 0; j < altura *2 -1; j++) {
				if(j>altura-i+1 || i==altura ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}
}
