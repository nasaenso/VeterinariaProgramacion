package Veterinaria_IBC_20240906;

public class Serpiente extends Salvaje {
	private final static String nombreEspecie = "Ophidia";
	String venenosa;

	
	public Serpiente(int edad, String venenosa, Tamanios tamanio, Habitat habitat) {
		super(nombreEspecie, edad, tamanio, habitat);
		this.venenosa = venenosa;
	}
	
	public static String getNombreEspecie() {
		return nombreEspecie;
	}

	@Override
	public String toString() {
		return super.toString() + " " +venenosa;
	}

	@Override
	public String sonido(){
		return "SssS";
	}

	protected String getVenenosa() {
		return this.venenosa;
	}
}

