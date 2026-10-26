/*RETO FINAL
Elige dos figuras y haz que el usuario pueda repetir su ejecución mediante un menú hasta seleccionar «Salir».
Comprueba que las dimensiones introducidas sean positivas.

*/
package reto;

import java.util.Scanner;

public class Reto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce altura: ");
		Integer altura = sc.nextInt();
		Integer opcion = 0;
		do {
			System.out.print("Introduce una opcion 1 cuadrado macizo, 2 cuadrado vacío, 3 salir");
			 opcion = sc.nextInt();

			if(opcion==1) {
				for (int i = 1; i <=altura; i++) {
					for(int j = 1; j<=altura; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}else if(opcion==2) {
				for (int i = 1; i <= altura; i++) {
					for (int j = 1; j <= altura; j++) {
						if (i == 1 || i == altura || j == 1 || j == altura) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
			}else if(opcion==3) {
				break;
			}
		}while(opcion!=3);
		
	}
}
