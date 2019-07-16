package Modelo;

import java.util.ArrayList;

public class PuestoAtencion extends Asesor{
	
	private String nombrePuesto;
	private String asesor;
	private int contador = 0;
	private ArrayList<Asesor> listaPuestos = new ArrayList<Asesor>();
	
	public PuestoAtencion() {
		super();
	}
	public PuestoAtencion(String nombrePuesto) {
		super();
		this.nombrePuesto = nombrePuesto;
	}
	
	public void crearPuesto(String nombrePuesto, String nombreAsesor, boolean estado) {	// El identificador del asesor para insertarlo dentro de listaPuesto
		Asesor asesor = new Asesor();													// está en cada nodo de listaPuesto en el asesor temporal creado cuando
		asesor.setNombreAsesor(nombreAsesor);											// se creó el puesto.
		this.listaPuestos.add(this.contador, asesor);
		this.listaPuestos.get(this.contador).setNombrePuesto(nombrePuesto);
		this.listaPuestos.get(this.contador).setEstadoPuesto(estado);
		this.contador = this.contador + 1;
		System.out.println("La lista tiene " + this.contador + " puestos.");
		System.out.println("Se ha creado el puesto " + asesor.getNombrePuesto());
	}
	
	public String getNombrePuesto() {
		return nombrePuesto;
	}
	public void setNombrePuesto(String nombrePuesto) {
		this.nombrePuesto = nombrePuesto;
	}
	public String getAsesor() {
		return asesor;
	}
	public void setAsesor(String asesor) {
		this.asesor = asesor;
	}
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}
	public ArrayList<Asesor> getListaPuestos() {
		return listaPuestos;
	}
	public void setListaPuestos(ArrayList<Asesor> listaPuestos) {
		this.listaPuestos = listaPuestos;
	}
	
}
