package Veterinaria_IBC_20240906;

public class Logica {
	Datos misDatos = new Datos();
	
	public void registrarPerro(String raza, int edad, String nombre, Tamanios tamanio) {
		misDatos.registrarPerro(raza,edad,nombre,tamanio);
	}

	public void registrarGato(String color, int edad, String nombre, Tamanios tamanio) {
		misDatos.registrarGato(color,edad,nombre,tamanio);		
	}
	public void registrarSerpiente(int edad, String venenosa, Tamanios tamanio, Habitat habitat) {
		misDatos.registrarSerpiente(edad, venenosa, tamanio, habitat);		
	}
	

	public String listaPacientes() {
		// pedir a Datos el listado de los pacientes
		return misDatos.listaPacientes();
	}
	
}
