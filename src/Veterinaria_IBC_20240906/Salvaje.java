package Veterinaria_IBC_20240906;

abstract public class Salvaje extends Animal {
	private Habitat habitat; 
	
	public Salvaje(String especie, int edad, Tamanios tamanio, Habitat habitat) {
		super(especie, edad, tamanio);
		this.habitat = habitat;
	}

	abstract public String sonido();

	@Override
	public String toString() {
		return super.toString() + habitat;
	}

}