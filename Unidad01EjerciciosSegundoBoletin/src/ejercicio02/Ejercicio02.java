/*	Diseña un(a aplicación que pida una cantidad entera de segundos 
 * y la convierta en horas, minutos y segundos. 
 * Para realizar la descomposición utiliza los operadores / y %.
 */
package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce los segundos: ");
        Integer segundos = sc.nextInt();

        Integer horas = segundos / 3600;
        Integer minutos = (segundos % 3600) / 60;
        Integer segundosRestantes = segundos % 60;

        System.out.println(
            "\nEn " + segundos + " segundos hay " +
            horas + " hora(s), " +
            minutos + " minuto(s) y " +
            segundosRestantes + " segundo(s)"
        );

        sc.close();
	}
}
