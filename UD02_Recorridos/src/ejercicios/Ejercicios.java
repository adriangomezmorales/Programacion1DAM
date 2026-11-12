package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utiles.Util;

public class Ejercicios {
	// #### CONTADOR ####

	// De los 20 primeros números cuántos son pares

	public static Integer cuentaParesDeLos20PrimerosNumeros() {
		Integer contador = 0;

		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				contador += 1;
			}
		}

		return contador;
	}

	// Método que diga cuantos pares hay hasta X pasado como parámetro
	public static Integer cuentaParesHasta(Integer ultimo) {
		Integer contador = 0;
		for (int i = 1; i <= ultimo; i++) {
			if (i % 2 == 0) {
				contador++;
			}
		}
		return contador;
	}

	// Método que diga cuantos pares hay hasta X desde Y
	public static Integer cuentaParesHastaDesde(Integer primero, Integer ultimo) {
		Integer contador = 0;
		if (primero < ultimo) {
			for (int i = primero; i <= ultimo; i++) {
				if (i % 2 == 0) {
					contador++;
				}
			}
		}
		return contador;
	}

	// Método que cuente cuantos pares tiene una lista como parametro
	public static Integer cuentaParesLista(List<Integer> lista) {
		Integer contador = 0;
		for (Integer i : lista) {
			if (i % 2 == 0) {
				contador++;
			}
		}
		return contador;

	}

	// Método que cuente cuantos primos tiene una lista como parametro
	public static Integer cuentaPrimosLista(List<Integer> lista) {
		Integer contador = 0;
		for (Integer i : lista) {
			if (Util.esPrimo(i)) {
				contador++;
			}
		}
		return contador;

	}

	// #### SUMA ####

	public static Double sumaListaDeReales(List<Double> lista) {
		Double suma = 0.0;
		for (Double element : lista) {
			suma += element;
		}
		return suma;
	}

	public static Double sumaListaMayorIgualQue(List<Double> lista, Double minimo) {
		Double suma = 0.0;
		for (Double element : lista) {
			if (element >= minimo) {
				suma += element;
			}
		}
		return suma;
	}

	// #### BUSQUEDA ####

	public static Boolean listaTienePrimos(List<Integer> lista) {
		Boolean tienePrimo = false;
		for (Integer element : lista) {
			if (Util.esPrimo(element)) {
				tienePrimo = true;
				break;
			}
		}
		return tienePrimo;
	}

	public static Boolean sumaPrimosListaEsPrimo(List<Integer> lista) {
		Boolean sumaPrima = false;
		Integer suma = 0;
		for (Integer element : lista) {
			if (Util.esPrimo(element)) {
				suma += element;
			}
		}
		if (Util.esPrimo(suma)) {
			sumaPrima = true;
		}
		return sumaPrima;
	}

	public static Boolean todaListaPrima(List<Integer> lista) {
		Boolean resultado = true;
		for (Integer integer : lista) {
			if (!Util.esPrimo(integer)) {
				resultado = false;
				break;
			}
		}
		return resultado;
	}

	public static Boolean esCrecienteLista(List<Integer> lista) {
		Boolean resultado = true;
		for (int i = 0; i < lista.size() - 1; i++) {
			if (lista.get(i) > lista.get(i + 1)) {
				resultado = false;
				break;
			}
		}
		return resultado;
	}

	public static Integer sumaEntrePrimosEnLista(List<Integer> lista) {
		Integer suma = 0;
		for (int i = 1; i < lista.size() - 1; i++) {
			Integer antes = lista.get(i - 1);
			Integer despues = lista.get(i + 1);
			if (Util.esPrimo(antes) && Util.esPrimo(despues)) {
				suma += lista.get(i);
			}
		}
		return suma;
	}

	public static List<Integer> seleccionarPrimosLista(List<Integer> lista) {
		List<Integer> devolver = new ArrayList<>();
		for (Integer integer : lista) {
			if (Util.esPrimo(integer)) {
				devolver.add(integer);
			}
		}
		return devolver;
	}

	// ##### MAXIMO Y MINIMO ####
	public static Integer maximoMinimoLista(List<Integer> lista, Boolean maximo) {
		
		List<Integer> copia = new ArrayList<>(lista);
		Collections.sort(copia);
		
		Integer res = -1;
		if (maximo) {
			res = copia.getLast();
		} else {
			res = copia.getFirst();
		}

		return res;
	}
}
