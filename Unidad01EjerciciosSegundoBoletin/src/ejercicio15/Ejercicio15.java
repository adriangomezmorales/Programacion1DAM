/*15.	Solicita tres números enteros a, b y c. Calcula y 
 * muestra el resultado de las expresiones 
 * a + b * c y (a + b) * c. 
 * Comprueba que los resultados pueden ser distintos y 
 * explica mediante un comentario en el código el motivo.
 */

package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce 3 numeros para: a + b * c   y    (a + b) * c ");
		Integer a = sc.nextInt();
		Integer b = sc.nextInt();
		Integer c = sc.nextInt();
		System.out.println("a + b * c → "+a+"+"+b+"*"+c+" = "+(a+b*c));
		System.out.println("(a + b) * c → ("+a+"+"+b+")*"+c+" = "+((a+b)*c));

		sc.close();
		
	}
}
