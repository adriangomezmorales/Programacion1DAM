/*10. Rectángulo con filas alternas
Las filas impares muestran * y las pares #.
Ejemplo de entrada: 5 filas, 8 columnas
Salida esperada:
********
########
********
########
********

*/
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
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
				if((i+1)%2!=0) {
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
