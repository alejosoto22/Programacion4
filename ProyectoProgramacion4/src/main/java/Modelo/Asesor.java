package Modelo;

import java.util.ArrayList;

public class Asesor{
		
	private String nombreAsesor;
	private int idAsesor;
	private String servicio1;
	private String servicio2;
	private String servicio3;
	private boolean estado;
	private int contador = 0;
	private ArrayList<Asesor> listaAsesores = new ArrayList<Asesor>();
	
	public Asesor() {
		super();
	}

	public Asesor(String nombreAsesor, int idAsesor, String servicio1, String servicio2, String servicio3, boolean estado) {
		super();
		this.nombreAsesor = nombreAsesor;
		this.idAsesor = idAsesor;
		this.servicio1 = servicio1;
		this.servicio1 = servicio2;
		this.servicio1 = servicio3;
		this.estado = estado;
	}
	
	public void crearAsesor(String nombreAsesor, int idAsesor, String servicio1, String servicio2, String servicio3, boolean estado) {
		Asesor asesor = new Asesor(nombreAsesor, idAsesor, servicio1, servicio2, servicio3, estado);
		this.listaAsesores.add(this.contador, asesor);
		System.out.println("la lista tiene " + this.listaAsesores.size() + " asesores.");
		System.out.println("Se ha creado el asesor " + this.listaAsesores.get(this.contador).getNombreAsesor());
		
		this.contador = this.contador + 1;
	}

	public String getNombreAsesor() {
		return nombreAsesor;
	}

	public void setNombreAsesor(String nombreAsesor) {
		this.nombreAsesor = nombreAsesor;
	}

	public int getIdAsesor() {
		return idAsesor;
	}

	public void setIdAsesor(int idAsesor) {
		this.idAsesor = idAsesor;
	}

	public String getServicio1() {
		return servicio1;
	}

	public void setServicio1(String servicio1) {
		this.servicio1 = servicio1;
	}

	public String getServicio2() {
		return servicio2;
	}

	public void setServicio2(String servicio2) {
		this.servicio2 = servicio2;
	}

	public String getServicio3() {
		return servicio3;
	}

	public void setServicio3(String servicio3) {
		this.servicio3 = servicio3;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public ArrayList<Asesor> getListaAsesores() {
		return listaAsesores;
	}

	public void setListaAsesores(ArrayList<Asesor> listaAsesores) {
		this.listaAsesores = listaAsesores;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
}
