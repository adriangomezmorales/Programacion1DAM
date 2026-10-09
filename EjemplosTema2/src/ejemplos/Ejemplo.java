package ejemplos;

import java.util.Scanner;

public class Ejemplo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer pin = 1111;
		
		Integer pinUser = sc.nextInt();
		Boolean isBlocked = false;
		//ESTO NO FUNCIONARÁ PORQUE Integer SON OBJETOS, HABRIA QUE USAR TIPOS PRIMITIVOS O .equals()
		if(pin!=pinUser) {
			 pinUser = sc.nextInt();
			if(pin!=pinUser) {
				 pinUser = sc.nextInt();
				if(pin!=pinUser) {
					isBlocked = true;
				}
			}
		}
		
		System.out.println("Puedes ver el tlf: "+!isBlocked);
		sc.close();
	}
}
