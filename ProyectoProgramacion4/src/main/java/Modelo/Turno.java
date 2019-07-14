package Modelo;

import java.util.ArrayList;

import Controlador.Controlador;

public class Turno extends Persona {
	
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Turno> listaTurnos = new ArrayList<Turno>();
	private int turno = 0;
	private int prioridad;
	private String servicio;
	private String servicioLista;
	
	public Turno() {
		super();
	}

	public Turno(String nombre, int id, String servicio, int prioridad) {
		super.setNombre(nombre);
		super.setId(id);
		this.servicio = servicio;
		this.prioridad = prioridad;
	}
	
	public void crearTurno(String nombre, int id, String servicio, int prioridad) {

		this.listaTurnos.add(new Turno(nombre, id, servicio, prioridad));
		System.out.println("la lista tiene " + this.listaTurnos.size() + " turnos.");
		this.turno = this.turno + 1;
		System.out.println("El turno creado es el " + this.turno);
		System.out.println("Se ha creado el turno de " + this.listaTurnos.get(this.listaTurnos.size() - 1).getNombre() + " y su Id es " + this.listaTurnos.get(this.listaTurnos.size() - 1).getId());
	}

	public ArrayList<Turno> getListaTurnos() {
		return listaTurnos;
	}

	public void setListaTurnos(ArrayList<Turno> listaTurnos) {
		this.listaTurnos = listaTurnos;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	public String getServicioLista() {
		return servicioLista;
	}

	public void setServicioLista(String servicioLista) {
		this.servicioLista = servicioLista;
	}
	
}
