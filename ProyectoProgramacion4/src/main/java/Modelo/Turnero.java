package Modelo;

import java.util.ArrayList;



public class Turnero {
	private String nombreTurnero;
	private ArrayList<Persona> listaTurnos = new ArrayList();
	private Persona cliente = new Persona();	
	public Turnero() {
		super();
	}
/*	public void crearTurno(String nombre, int id, String servicio, int prioridad) {
		Persona cliente = new Persona(nombre, id);
		cliente.setServicio(servicio);
		cliente.setPrioridad(prioridad);
		this.listaTurnos.add(cliente);
		this.cliente = new Persona(nombre, id);
		this.cliente.setServicio(servicio);
		this.cliente.setPrioridad(prioridad);
		System.out.println("Se a creado el turno " + nombre);
		System.out.println("La lista tiene " + this.listaTurnos.size() + " turnos.");
	}*/
	
	public void OrdenarPorServicios(ArrayList lista) {
		
	}
	
	public String getNombreTurnero() {
		return nombreTurnero;
	}
	public void setNombreTurnero(String nombreTurnero) {
		this.nombreTurnero = nombreTurnero;
	}
	public ArrayList<Persona> getListaTurnos() {
		return listaTurnos;
	}
	public void setListaTurnos(ArrayList<Persona> listaTurnos) {
		this.listaTurnos = listaTurnos;
	}
	public Persona getCliente() {
		return cliente;
	}
	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}
	
}
