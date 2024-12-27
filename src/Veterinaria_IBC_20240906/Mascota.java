package Veterinaria_IBC_20240906;

abstract public class Mascota extends Animal{
	private String nombre; 
	
	public Mascota(String especie, int edad, String nombre, Tamanios tamanio) {
		super(especie, edad, tamanio);
		this.nombre = nombre;
	}

	abstract public String sonido();

	public String getNombre() {
		return this.nombre;
	}
	
	@Override
	public String toString() {
		return super.toString()  + " " + nombre;
	}

}
