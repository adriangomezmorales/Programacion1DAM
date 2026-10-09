package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
		sc.close();
	}
}
