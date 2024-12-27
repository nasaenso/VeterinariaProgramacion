package Veterinaria_IBC_20240906;

public class Perro extends Mascota{
	private final static String nombreEspecie = "Canis familiaris";
	
	private String raza;
	
	public Perro(String nombre, int edad, String raza, Tamanios tamanio) {
		super(nombreEspecie, edad, nombre, tamanio);
		this.raza = raza;
	}
	
	public static String getNombreEspecie() {
		return nombreEspecie;
	}

	@Override
	public String toString() {
		return super.toString() + " " +raza;
	}

	@Override
	public String sonido(){
		return "Guau";
	}

	protected String getRaza() {
		return this.raza;
	}
}
