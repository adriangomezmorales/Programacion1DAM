package listas;

import java.util.List;
import java.util.ArrayList;


public class Listas {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		System.out.println(lista);
		
		//Agregar cosas a la lista:
		System.out.println("Metemos datos en la lista: ");
		lista.add(1);
		lista.add(11);
		lista.add(145);
		lista.add(18);
		System.out.println(lista);
		System.out.println("La suma es: ");
		System.out.println(hacerSuma(lista));
		System.out.println("La lista tiene un tamaño de "+lista.size());
		System.out.println("La primera posicion tiene de valor "+lista.get(0));
	}
	public static Integer hacerSuma(List<Integer> lis) {
		Integer suma=0;
		for (Integer integer : lis) {
			suma+=integer;
		}
		return suma;
	}
}

