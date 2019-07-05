package Modelo;

import java.util.ArrayList;

import Controlador.Controlador;

public class Turno extends Persona{
	
	private int turno;
	private ArrayList<Turno> listaTurnos = new ArrayList<Turno>();
	private Persona cliente;
	private Prioridad prioridad;
	private Servicio servicio;
//	private Controlador control = new Controlador();
	
	public Turno() {
		super();
	}

	public Turno(int turno) {
		super();
		this.turno = turno;
	}
	
	public void crearTurno(String nombre, int id, String servicio, int prioridad) {
		Turno turno = new Turno();
		turno.setNombre(nombre);
		turno.setId(id);
	//	turno.getServicio().setServicio(servicio);
	//	turno.getPrioridad().setPrioridad(prioridad);
		this.listaTurnos.add(turno);
		System.out.println("la lista tiene " + this.listaTurnos.size() + " turnos.");
		this.listaTurnos.get(this.listaTurnos.size() - 1).setTurno(this.listaTurnos.size());
		System.out.println("El turno creado es el " + this.listaTurnos.get(this.listaTurnos.size() - 1).getTurno());
		System.out.println("Se ha creado el turno de " + this.listaTurnos.get(this.listaTurnos.size() - 1).getNombre() + " y su Id es " + this.listaTurnos.get(this.listaTurnos.size() - 1).getId());
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}
	
	public ArrayList<Turno> getListaTurnos() {
		return listaTurnos;
	}

	public void setListaTurnos(ArrayList<Turno> listaTurnos) {
		this.listaTurnos = listaTurnos;
	}

	public Persona getCliente() {
		return cliente;
	}

	public void setCliente(Persona cliente) {
		this.cliente = cliente;
	}

	public Prioridad getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Prioridad prioridad) {
		this.prioridad = prioridad;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	
/*	public void setControlador(Controlador control) {
		this.control = control;
		
	}
	*/
}
