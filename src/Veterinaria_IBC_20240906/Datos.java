package Veterinaria_IBC_20240906;

import java.util.ArrayList;

public class Datos {
	ArrayList<Animal> pacientes = new ArrayList<>();
	
	public void registrarPerro(String raza, int edad, String nombre, Tamanios tamanio) {
		Perro auxPerro = new Perro(nombre, edad, raza, tamanio);
		pacientes.add(auxPerro);
	}

	public void registrarGato(String color, int edad, String nombre, Tamanios tamanio) {
		Gato auxGato = new Gato(nombre, edad, color, tamanio);
		pacientes.add(auxGato);
	}
	
	public void registrarSerpiente(int edad, String venenosa, Tamanios tamanio, Habitat habitat) {
		Serpiente auxSerpiente = new Serpiente(edad, venenosa, tamanio, habitat);
		pacientes.add(auxSerpiente);
	}

	public String listaPacientes() {
		// empezar con un listado vac�o
		String listado="";
		
		// recorrer la lista 
		for (Animal masc : pacientes){
			// agregar datos del paciente al listado
			listado = listado + masc.toString() +"\n";
		}
		// verificar si hay datos en la lista
		if (listado.length() == 0) listado = "-- No hay pacientes --";
		
		return listado;
	}

	
}
