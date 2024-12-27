package Veterinaria_IBC_20240906;

import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {
		
		ArrayList<Mascota> misMascotas = new ArrayList<>();
		
		misMascotas.add(new Perro("Fifi",1,"Salchicha",Tamanios.CHICO));
		misMascotas.add(new Gato("Bestia",3,"gris",Tamanios.MEDIANO));
		
		for (Mascota masc : misMascotas) {
			System.out.println(masc.getNombre()+" hace "+masc.sonido());			
		}
	}

}
