/*11. Rectángulo con columnas alternas
Cada columna alterna entre * y #, independientemente de la fila.
Ejemplo de entrada: 4 filas, 8 columnas
Salida esperada:
*#*#*#*#
*#*#*#*#
*#*#*#*#
*#*#*#*#

*/
package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame la altura: ");
		Integer altura = sc.nextInt();
		System.out.println();
		
		System.out.print("Dame la columna: ");
		Integer columna = sc.nextInt();
		System.out.println();
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < columna; j++) {
				if((j+1)%2!=0) {
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
