/*Utiliza la clase Random para generar y mostrar tres valores: 
 * un número entero aleatorio entre 1 y 100, un número real
 * aleatorio y un valor booleano aleatorio (true o false).
 */

package ejercicio07;

import java.util.Random;

public class Ejercicio07 {

    public static void main(String[] args) {

        Random random = new Random();

        Integer entero = random.nextInt(100) + 1;
        Double real = random.nextDouble();
        Boolean booleano = random.nextBoolean();

        System.out.println("Número entero: " + entero);
        System.out.println("Número real: " + real);
        System.out.println("Booleano: " + booleano);
    }
}