/*Diseñar un programa que muestre la suma de los 10 primeros números impares.
*/
package ejercicio04;

public class Ejercicio04 {
	public static void main(String[] args) {

		final Integer CANTIDAD_IMPAR = 10;
		Integer contador = 1;
		Integer suma = 0;
		Integer cuentaImpar = 0;

		while (cuentaImpar < CANTIDAD_IMPAR) {
			if (contador % 2 != 0) {
				suma += contador;
				cuentaImpar++;
				System.out.println(contador);
			}
			contador++;

		}
		System.out.println(suma);
	}
}
