/*16. Figura con dos diagonales
Dibuja un cuadrado con # en las dos diagonales y puntos (.) en el resto.
Ejemplo de entrada: N = 7
Salida esperada:
#.....#
.#...#.
..#.#..
...#...
..#.#..
.#...#.
#.....#

*/
package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame la altura: ");
		Integer altura = sc.nextInt();
		System.out.println();
		

		
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < altura; j++) {
				if(i == j ||  j == altura-i - 1) {
					System.out.print("#");
				}else {
					System.out.print(".");

				}
				
			}
			System.out.println();
		}
		sc.close();
	}
}
