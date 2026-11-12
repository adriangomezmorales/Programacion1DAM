package test;

import java.util.ArrayList;
import java.util.List;

import tipos.Genero;
import tipos.Persona;

public class TestPersona {
	public static void main(String[] args) {
		Persona persona1 = new Persona("Adrian", 24, 90., Genero.HOMBRE);
		Persona persona2 = new Persona("Manuela", 26, 73.4, Genero.MUJER);

		System.out.println(persona1.getNombre());
		
		System.out.println(persona2.getNombre());

		persona1.setNombre("Paco");
		
		System.out.println(persona1.getNombre());
		
		List<Persona> personas = new ArrayList<>();
		personas.add(persona1);
		personas.add(persona2);
		System.out.println(personas);
		System.out.println(filtrarPorGenero(personas, Genero.HOMBRE));
	}
	      
	public static List<Persona> filtrarPorGenero(List<Persona> lista, Genero genero){
		List<Persona> res = new ArrayList<>();
		for (Persona persona : lista) {
			if(persona.getGenero() == genero ) {
				res.add(persona);
			}
		}
		return res;
	}
}
