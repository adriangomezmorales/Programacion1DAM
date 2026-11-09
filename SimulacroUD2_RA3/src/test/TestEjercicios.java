package test;

import java.util.List;

import ejercicios.Ejercicios;

public class TestEjercicios {
	public static void main(String[] args) {
		System.out.println(
				"Ejercicio 1: \n"+
				ejercicios.Ejercicios.precioEntrada(10, "SABADO", true)
				+"\n"+
				ejercicios.Ejercicios.precioEntrada(35, "LUNES", false)
				+"\n"+
				ejercicios.Ejercicios.precioEntrada(66, "VIERNES", true)
				+"\n"+
				ejercicios.Ejercicios.precioEntrada(-1, "LUNES", false)
				);
		System.out.println("\nEjercicio 2: ");
		Ejercicios.dibujarZ(4);
		ejercicios.Ejercicios.dibujarZ(1);
		ejercicios.Ejercicios.dibujarZ(0);
		ejercicios.Ejercicios.dibujarZ(5);
		
		System.out.println("\nEjercicio 3: ");
		System.out.println(Ejercicios.sumaPrimerosEspeciales(1, 10, 3));
		System.out.println(Ejercicios.sumaPrimerosEspeciales(1, 10, 5));
		System.out.println(Ejercicios.sumaPrimerosEspeciales(8, 15, 2));
		
		System.out.println("\nEjercicio 4: ");
		System.out.println(Ejercicios.factorialConSaltos(7, 2));
		System.out.println(Ejercicios.factorialConSaltos(8, 3));
		System.out.println(Ejercicios.factorialConSaltos(5, 1));
		System.out.println(Ejercicios.factorialConSaltos(0, 2));
		
		System.out.println("\nEjercicio 5: ");
		System.out.println(Ejercicios.contarPicos(List.of(2, 5, 1, 6, 3, 9, 7), 2) );
		System.out.println(Ejercicios.contarPicos(List.of(2, 5, 4, 7, 4), 3));
		System.out.println(Ejercicios.contarPicos(List.of(1, 2), 1) );

	}

}
