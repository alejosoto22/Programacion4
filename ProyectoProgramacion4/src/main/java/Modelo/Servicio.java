package Modelo;

import java.util.ArrayList;

import Vista.VistaAdministrador;

public class Servicio extends Turno{
	
	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private int contador = 0;
//	private int posicionTurno = 0;
//	private int posicionServicio = 0;
	private ArrayList<ArrayList<Turno>> listaServicios = new ArrayList<ArrayList<Turno>>();
//	private ArrayList<Servicio> listaServi = new ArrayList<Servicio>();
	public Turno turno = new Turno();
	
	public Servicio() {
		super();
	}
	
	public Servicio(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void crearServicio(String nombre) {
		Turno turno = new Turno();
		turno.setNombre(nombre);
		turno.setTurno(1);
		ArrayList<Turno> listaTurno = new ArrayList<Turno>();
		listaTurno.add(0, turno);
		listaTurno.get(0).setNombre(nombre);
				
		this.listaServicios.add(contador, listaTurno);;
		this.contador = this.contador + 1;
		System.out.println("la lista tiene " + this.listaServicios.size() + " servicios.");
		System.out.println("El servicio " + this.contador + " tiene el nombre " + nombre);
	}
	
/*	public void crearServicio(String nombre) {
		Servicio servicio = new Servicio(nombre);
		this.listaServi.add(contador, servicio);
		System.out.println("la lista tiene " + this.listaServi.size() + " servicios.");
//		vistaAdmin.comboBoxServi1.addItem(nombre);
		this.contador = this.contador + 1;
	}*/
	
/*	public void ordenarTurnos(ArrayList<Turno> listaTurnos) {
		if(turno != null) {
			if(turno.getListaTurnos().get(this.posicionTurno).getServicio() == this.listaServi.get(this.posicionServicio).getNombre()) {
				this.listaServi.get(this.posicionServicio).setId(id);
				this.listaServi.get(this.posicionServicio)
			}
		}
	}
*/
	/*	public void crearServicio(String nombreServicio) {
	Persona cliente = new Persona();
	cliente.setNombre(nombreServicio);
	ArrayList<Persona> datoServicio = new ArrayList();
	datoServicio.add(cliente);
//	if(this.listaServicios.get(contador).get(0) ==)
//	this.listaServicios.get(contador).add(datoServicio.add(e);
}*/
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
	public ArrayList<ArrayList<Turno>> getListaServicios() {
		return listaServicios;
	}

	public void setListaServicios(ArrayList<ArrayList<Turno>> listaServicios) {
		this.listaServicios = listaServicios;
	}
/*
	public ArrayList<Servicio> getListaServi() {
		return listaServi;
	}

	public void setListaServi(ArrayList<Servicio> listaServi) {
		this.listaServi = listaServi;
	}*/
	
}
