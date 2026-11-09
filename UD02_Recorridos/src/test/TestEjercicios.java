package test;

import java.util.ArrayList;
import java.util.List;

import ejercicios.Ejercicios;

public class TestEjercicios {
	public static void main(String[] args) {

		List<Integer> lista1al20 = new ArrayList<>();

		for (int i = 1; i <= 20; i++) {
			lista1al20.add(i);
		}

		List<Double> lista1al20Double = new ArrayList<>();

		for (double i = 1.0; i <= 20; i++) {
			lista1al20Double.add(i+(i/4));
		}

		
		System.out.println("### TEST DE CONTADORES ###");
		System.out.println(Ejercicios.cuentaParesDeLos20PrimerosNumeros());
		System.out.println(Ejercicios.cuentaParesHasta(20));
		System.out.println(Ejercicios.cuentaParesHastaDesde(1, 20));
		System.out.println(Ejercicios.cuentaParesLista(lista1al20));
		System.out.println(Ejercicios.cuentaPrimosLista(lista1al20));

		System.out.println("\n### TEST DE SUMA ###");
		System.out.println(Ejercicios.sumaListaDeReales(lista1al20Double));
		System.out.println(Ejercicios.sumaListaMayorIgualQue(lista1al20Double, 5.));
		
		System.out.println("\n### TEST DE BÚSQUEDA ###");
		System.out.println(Ejercicios.listaTienePrimos(lista1al20));
		System.out.println(Ejercicios.sumaPrimosListaEsPrimo(List.of(4,7,3,8,3)));
		System.out.println(Ejercicios.todaListaPrima(List.of(4,7,3,8,3)));
		System.out.println(Ejercicios.todaListaPrima(List.of(3,7,3,19,3)));
		System.out.println(Ejercicios.esCrecienteLista(lista1al20));
		System.out.println(Ejercicios.esCrecienteLista(List.of(3,7,3,19,3)));
		System.out.println(Ejercicios.sumaEntrePrimosEnLista(List.of(3,8,2,4,2)));

		

	}
}
