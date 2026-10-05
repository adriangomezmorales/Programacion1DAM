/*Pide al usuario un número real y muestra: el entero 
 * inmediatamente inferior mediante Math.floor(), 
 * el entero inmediatamente superior mediante Math.ceil() 
 * y el entero más cercano mediante Math.round().
 */

package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero real: ");
        Double num = sc.nextDouble();

        Double floor = Math.floor(num);
        Double ceil = Math.ceil(num);
        Long round = Math.round(num);

        System.out.println("\nEntero inferior: " + floor);
        System.out.println("Entero superior: " + ceil);
        System.out.println("Entero más cercano: " + round);

        sc.close();
    }
}
