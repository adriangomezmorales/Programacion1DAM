package tipos;

public class Persona {
	// Atributos / campos
	private String nombre;
	private Integer edad;
	private Double peso;
	private Genero genero;

	public Persona(String nombre, Integer edad, Double peso, Genero genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.genero = genero;
	}

	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

}
