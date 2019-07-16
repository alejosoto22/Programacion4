package Modelo;

import java.util.ArrayList;



public class Turno extends Persona {
		
	public ArrayList<Turno> listaTurnos = new ArrayList<Turno>();
	public ArrayList<Turno> listaServicios = new ArrayList<Turno>();
	private int turno = 0;
	private int prioridad;
	private String servicio;
	public Servicio servi;
	
	private String servicioLista;
	private int contador = 0;
	private int contadorAtender = 0;
		
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
		this.listaTurnos.add(this.contador, new Turno(nombre, id, servicio, prioridad));
		this.listaTurnos.get(this.contador).setTurno(this.contador + 1);
		this.contador = this.contador + 1;
	//	if(this.listaServicios.get(0) == this.listaTurnos)
		System.out.println("la lista tiene " + this.contador + " turnos.");
		System.out.println("El turno creado es el " + this.listaTurnos.get(this.contador - 1).getTurno());
		System.out.println("Se ha creado el turno de " + this.listaTurnos.get(this.contador - 1).getNombre());
	
	}
	
	public void atender() {
		System.out.println("Se ha atendido al cliente " + this.listaTurnos.get(this.contadorAtender).getNombre());
		this.listaTurnos.remove(this.contadorAtender);
		System.out.println("la lista tiene " + this.listaTurnos.size() + " turnos.");
	
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

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
}
