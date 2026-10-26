/*18. Reto: reloj de arena
Une una pirámide invertida con otra creciente, 
evitando duplicar la fila más estrecha.
Ejemplo de entrada: N = 4
Salida esperada:
*******
 *****
  ***
   *
  ***
 *****
*******
*/
package ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce N: ");
		Integer n = sc.nextInt();
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n * 2 -1; j++) {
				if(i>j) {
					System.out.print(" ");
				}else if (j>i){
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}
}
