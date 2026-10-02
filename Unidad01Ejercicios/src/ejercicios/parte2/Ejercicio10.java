/*(Acepta el reto) El cinquecento es un periodo del arte europeo 
 * (principalmente italiano) enclavado en pleno Renacimiento. 
 * Aunque su nombre esconde el número cinco, en realidad 
 * ¡pertenece al siglo XVI! Cinquecento es, abreviadamente, 
 * "años [mil] quinientos", en italiano, y es que el siglo XVI 
 * comprendió los años desde el 1501 al 1600, igual que el 
 * siglo XXI empezó en el 2001, con un 20 en sus dos primeros dígitos y no un 21.
 * Dado un año, ¿de qué siglo es?
*/
package ejercicios.parte2;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un año: ");
		
		Integer anyo = sc.nextInt();
		
		Integer siglo = (anyo/100)+1;
		
		if(anyo%100==0) {
			siglo--;
		}
		
		System.out.println("\nEl año "+anyo+" está en el siglo "+siglo);
		sc.close();
	}

}
