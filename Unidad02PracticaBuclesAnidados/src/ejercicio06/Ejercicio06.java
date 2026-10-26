/*06. Triángulo rectángulo: ángulo arriba a la derecha
La cantidad de asteriscos disminuye mientras aumentan los espacios iniciales.
Ejemplo de entrada: N = 5
Salida esperada:
*****
 ****
  ***
   **
    *

*/
package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura: ");
        int altura = sc.nextInt();

		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < altura; j++) {
				if(j>i-1) {
					System.out.print("*");

				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

        sc.close();
    }
}
