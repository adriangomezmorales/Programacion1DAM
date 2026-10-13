/*02. Rectángulo hueco
Dibuja solo el contorno. Las posiciones interiores son espacios.
Ejemplo de entrada: 4 filas, 7 columnas
Salida esperada:
*******
*     *
*     *
*******
*/
package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce columnas: ");
		Integer columnas = sc.nextInt();

		System.out.print("\nIntroduce filas: ");
		Integer filas = sc.nextInt();

		for (int i = 1; i <= filas; i++) {
			for (int j = 1; j <= columnas; j++) {
				if (i == 1 || i == filas || j == 1 || j == columnas) {
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
