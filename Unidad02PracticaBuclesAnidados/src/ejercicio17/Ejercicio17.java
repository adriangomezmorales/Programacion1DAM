/*17. Triángulo de números
En la fila i muestra los números desde 1 hasta i, sin espacios entre ellos.
Ejemplo de entrada: N = 5
Salida esperada:
1
12
123
1234
12345

*/
package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dame la altura: ");
		Integer altura = sc.nextInt();
		System.out.println();
		


        for (int i = 0; i < altura; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
		sc.close();
	}
}
