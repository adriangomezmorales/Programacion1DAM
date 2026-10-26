/*13. Rectángulo dividido en dos zonas verticales
En la mitad izquierda imprime * y en la derecha #. Para este ejercicio usa un número par de columnas.
Ejemplo de entrada: 4 filas, 8 columnas
Salida esperada:
****####
****####
****####
****####

*/
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
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
				if(columna/2>j) {
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
