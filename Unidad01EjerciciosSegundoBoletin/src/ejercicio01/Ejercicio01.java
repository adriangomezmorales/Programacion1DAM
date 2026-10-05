/*1.	Escribe un programa que solicite al usuario la base y la altura 
 * de un rectángulo (pueden contener decimales). Debe calcular y mostrar su perímetro y su área.
 */

package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce la base del rectángulo: ");
		Double base = sc.nextDouble();
		
		System.out.print("\nIntroduce la altura del rectángulo: ");
		Double altura = sc.nextDouble();
		
		Double perimetro = base+base+altura+altura ;
		
		Double area =base*altura;
		
		System.out.println("\nEl perimetro del rectángulo es "+perimetro+" y el área del rectángulo es "+area);
		
		sc.close();
	}
}
