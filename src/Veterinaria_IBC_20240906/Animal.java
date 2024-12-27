package Veterinaria_IBC_20240906;

abstract public class Animal {
	private String especie;
	private int edad;
	private Tamanios tamanio;
	
	public Animal(String especie, int edad, Tamanios tamanio) {
		this.especie = especie;
		this.edad = edad;
		this.tamanio = tamanio;
	}
	
	abstract public String sonido();
	
	@Override
	public String toString() {
		return edad + " " + tamanio.toString().substring(0,3);
	}
}
