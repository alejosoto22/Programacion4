package Modelo;

import java.util.ArrayList;

public class Metodos {
	
	private ArrayList<Turno> listaTurnos = new ArrayList<Turno>();
	
/*	public void crearTurno(String nombre, int id, String Servicio, int prioridad) {
		Persona cliente = new Persona(nombre, id);
		
	}*/
	
	public void crearTurno(String nombre, int id, String servicio, int prioridad) {
		Turno turno = new Turno();
		turno.getCliente().setNombre(nombre);
		turno.getCliente().setId(id);
		turno.getServicio().setServicio(servicio);
		turno.getPrioridad().setPrioridad(prioridad);
		this.listaTurnos.add(turno);
		System.out.println("la lista tiene " + this.listaTurnos.size());
		this.listaTurnos.get(this.listaTurnos.size() - 1).setTurno(this.listaTurnos.size());
	}

}
