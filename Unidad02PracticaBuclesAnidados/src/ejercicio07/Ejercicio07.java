/*07. Pirámide centrada
Dibuja una pirámide de N niveles. 
Ejemplo de entrada: N = 5
Salida esperada:
    *
   ***
  *****
 *******
*********

*/
package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dame la altura: ");
		Integer altura = sc.nextInt();
		System.out.println();
		
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < 2 * altura - 1; j++) {
				if (j >= altura - 1 - i && j <= altura - 1 + i) {
					System.out.print("*");	
				}
				else {
					System.out.print(" ");
				}				
			}
			System.out.println();
		}
		
		sc.close();
	}
}
