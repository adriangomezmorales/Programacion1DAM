/*14. Rectángulo dividido en dos zonas horizontales
La mitad superior se dibuja con * y la inferior con #. Usa un número par de filas.
Ejemplo de entrada: 6 filas, 8 columnas
Salida esperada:
********
********
********
########
########
########

*/
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
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
				if(altura/2>i) {
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
