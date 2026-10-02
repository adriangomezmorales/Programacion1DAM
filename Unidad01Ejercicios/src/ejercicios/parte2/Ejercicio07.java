/*
 * Una empresa que gestiona un parque acuático te solicita una aplicación 
 * que les ayude a calcular el importe que hay que cobrar en la taquilla
 *  por la compra de una serie de entradas (cuyo número será introducido por el usuario). 
 *  Existen dos tipos de entradas: infantiles, que cuestan 15,50€; y de adultos, que cuestan 20€. 
 *  En el caso de que el importe total sea igual o superior a 100€, 
 *  se aplicará automáticamente un bono descuento del 5%.
 * */
package ejercicios.parte2;

import java.util.Scanner;

public class Ejercicio07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número de entradas infantiles: ");
		Double infantil = 15.50 * sc.nextInt();
		
		System.out.print("\nNúmero de entradas adultas: ");
		Double adultos = 20.0 * sc.nextInt();
		
		if (infantil+adultos>=100) {
			Double total = (infantil + adultos) - ((infantil+adultos) * 0.05);
			System.out.println("\nEl total de las entradas son "+total+"€ con el 5% de descuento.");

		} else {
			Double total = infantil+adultos;
			System.out.println("\nEl total de las entradas son "+total+"€.");

		}
		sc.close();
	}
}
