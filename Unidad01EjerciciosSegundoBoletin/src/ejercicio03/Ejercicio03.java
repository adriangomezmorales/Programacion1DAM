/*Una tienda aplica un descuento fijo del 15% y, 
 * posteriormente, un IVA del 21%. Declara ambos
 *  porcentajes como constantes. Pide el precio 
 *  inicial al usuario, calcula el precio final 
 *  y muéstralo redondeado a dos cifras decimales 
 *  utilizando Math.round().
 */
package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final Double DESCUENTO = 0.15;
		final Double IVA = 0.21;
		System.out.print("Indica el precio: ");
		Double precio = sc.nextDouble();
		
		Double precioFinal = Math.round((precio - (precio * DESCUENTO) + (precio * IVA)) * 100.0) / 100.0;

		System.out.println("\nEl precio final de " +precio+ " es "+precioFinal);
		sc.close();
	}
}
