/*04. Triángulo rectángulo: ángulo arriba a la izquierda
La primera fila tiene N asteriscos y cada fila siguiente uno menos.
Ejemplo de entrada: N = 5
Salida esperada:
*****
****
***
**
*

*/
package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura: ");
        int altura = sc.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (j < altura - i) {
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
