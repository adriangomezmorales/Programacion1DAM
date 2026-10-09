package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		System.out.print("Indica un numero: ");

		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		
		Integer cont = 0;
		
		for (int i = 1; i <= n; i++) {
			if(i%3==0) {
				
				cont++;
			}
			
		}
		
		System.out.println(cont);
		sc.close();
	}
}
