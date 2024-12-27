package Veterinaria_IBC_20240906;

public class Gato extends Mascota {
	private final static String nombreEspecie = "Felis catus";
		
	private String color;

	public static String getNombreEspecie() {
		return nombreEspecie;
	}
	
	public Gato( String nombre, int edad, String color, Tamanios tamanio) {
		super(nombreEspecie, edad, nombre, tamanio);
		this.color = color;
	}
	
	@Override
	public String sonido() {
		return "Miau";
	}

	public String getColor() {
		return this.color;
	}

	@Override
	public String toString() {
		return super.toString() + " " + color;

	}
}
