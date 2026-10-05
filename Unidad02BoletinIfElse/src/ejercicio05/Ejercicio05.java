/*Pedir los coeficientes de una ecuación de segundo grado y
 *  mostrar sus soluciones reales. Si no existen, habrá que indicarlo. 
 *  Hay que tener en cuenta que las soluciones de una ecuación de segundo grado
 * 
ax2 + bx + c = 0
se calculan de la siguiente forma:
*/

package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Indica un número A: ");
		Double a = sc.nextDouble();
		
		System.out.print("\nIndica un número B: ");
		Double b = sc.nextDouble();
		
		
		System.out.print("\nIndica un número C: ");
		Double c = sc.nextDouble();
		
		System.out.println("\nLa ecuación es "+a+"x^2 + "+b+"x + "+c+" = 0");
		Double solution1 = null;
		Double solution2 = null;

		if (b*b-4*a*c >= 0) {
			solution1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
			solution2= (-b-Math.sqrt(b*b-4*a*c))/(2*a);
			System.out.println("Hay dos soluciones: \nSolución 1: "+solution1+"\nSolución 2: "+solution2);

//		} else if(b*b-4*a*c == 0) {
//			System.out.println("Hay una solución");
		} else {
			System.out.println("No hay solución real");
		}
		
		sc.close();
	}
}
