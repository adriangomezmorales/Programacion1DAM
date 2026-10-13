/*01. Rectángulo macizo
Pide filas y columnas. Dibuja un rectángulo de asteriscos.
Ejemplo de entrada: 4 filas, 7 columnas
Salida esperada:
*******
*******
*******
*******
*/
package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce columnas: ");
		Integer columnas = sc.nextInt();
		
		System.out.print("\nIntroduce filas: ");
		Integer filas = sc.nextInt();
		
		
		for (int i = 1; i <=filas; i++) {
			for(int j = 1; j<=columnas; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
