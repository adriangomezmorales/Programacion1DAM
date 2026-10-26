/*12. Tablero de ajedrez
Alterna * y # tanto por filas como por columnas. Puedes estudiar la paridad de fila + columna.
Ejemplo de entrada: 6 filas, 8 columnas
Salida esperada:
*#*#*#*#
#*#*#*#*
*#*#*#*#
#*#*#*#*
*#*#*#*#
#*#*#*#*

*/
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {
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
				if((i+1+j)%2!=0) {
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
