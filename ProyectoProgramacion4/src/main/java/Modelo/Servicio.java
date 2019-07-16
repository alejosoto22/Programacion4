package Modelo;

import java.util.ArrayList;

import Vista.VistaAdministrador;


public class Servicio extends Turno {

	private String nombreServicio;
	private int contador = 0;
	public ArrayList<ArrayList<Turno>> listaServicios = new ArrayList<ArrayList<Turno>>();
	public Turno turno = new Turno();
	private ArrayList<Turno> listaTurno = new ArrayList<Turno>();
	private int posicionTurno = 0;
	private int posicionServicio = 0;
			
	public Servicio() {
		super();
	}

	public Servicio(String nombre) {
		super();
		this.nombreServicio = nombre;
	}

	public void crearServicio(String nombre) {
		Turno turno = new Turno();
		turno.setServicioLista(nombre);
		this.listaTurno.add(0, turno);		// El identificador de servicio de la lista de servicios está en la posicion 0 de listaTurno (en cada nodo de listaServicio).
		this.listaServicios.add(this.contador, listaTurno);
		this.contador = this.contador + 1;
		System.out.println("la lista tiene " + this.listaServicios.size() + " servicios.");
		System.out.println("El servicio " + this.contador + " tiene el nombre " + this.listaTurno.get(0).getServicioLista());
		
	}

	public void insertarTurno() {
		if(listaTurnos.get(0).getServicio() == this.listaServicios.get(posicionServicio).get(0).getServicioLista()) {
		//	this.listaServicios.get(posicionServicio).add(this.getListaTurnos().get(posicionTurno));
			// this.getListaTurnos().get(posicionTurno).getServicio()
			
		}
		
	}
	
	public String imprimirTurnos() {
		String result = "";
		for(int i = 0; i < this.listaServicios.size(); i++) {
			for(int j = 0; j < this.listaServicios.get(i).size(); j++) {
				result = this.listaServicios.get(i).get(j).getNombre() + "-";
				
			}
		}
		return result;
	}
	
	public int getContador() {
		return contador;
	}

	public String getNombreServicio() {
		return nombreServicio;
	}

	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

/*	public ArrayList<ArrayList<Turno>> getListaServicios() {
		return listaServicios;
	}

	public void setListaServicios(ArrayList<ArrayList<Turno>> listaServicios) {
		this.listaServicios = listaServicios;
	}
*/
	public ArrayList<Turno> getListaTurno() {
		return listaTurno;
	}

	public void setListaTurno(ArrayList<Turno> listaTurno) {
		this.listaTurno = listaTurno;
	}
	
}
