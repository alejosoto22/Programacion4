package Modelo;

import java.io.Serializable;

public class Asesores extends NodoAsesores implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private NodoAsesores cabezaAsesor = null;
	private NodoAsesores colaAsesor = null;
	private int tamaņoAsesor = 0;
	Asesores listaAsesores;
	
	public Asesores() {
	}
	
	public NodoAsesores getCabezaAsesor() {
		return cabezaAsesor;
	}
	public void setCabezaAsesor(NodoAsesores cabezaAsesor) {
		this.cabezaAsesor = cabezaAsesor;
	}
	public NodoAsesores getColaAsesor() {
		return colaAsesor;
	}
	public void setColaAsesor(NodoAsesores colaAsesor) {
		this.colaAsesor = colaAsesor;
	}
	public int getTamaņoAsesor() {
		return tamaņoAsesor;
	}
	public void setTamaņoAsesor(int tamaņoAsesor) {
		this.tamaņoAsesor = tamaņoAsesor;
	}
	
	public Asesores getListaAsesores() {
		return listaAsesores;
	}

	public void setListaAsesores(Asesores listaAsesores) {
		this.listaAsesores = listaAsesores;
	}

/*	public void crearAsesor(String nombre, int idAsesor, boolean estado, String primerServicio, String segundoServicio, String tercerServicio) {
		NodoAsesores nuevoNodo = new NodoAsesores(nombre, idAsesor, estado, primerServicio, segundoServicio, tercerServicio);
		
		if (this.cabezaAsesor == null) {
			this.cabezaAsesor = nuevoNodo;
			this.colaAsesor = nuevoNodo;
			this.cabezaAsesor.setConsecutivoAsesor(1);
			this.colaAsesor.setConsecutivoAsesor(1);
			
		} else {this.colaAsesor.setSiguienteAsesor(nuevoNodo);
				nuevoNodo.setAnteriorAsesor(this.colaAsesor);
				this.colaAsesor = nuevoNodo;
				this.colaAsesor.setConsecutivoAsesor(this.colaAsesor.getAnteriorAsesor().getConsecutivoAsesor() + 1);
		}
		this.tamaņoAsesor = this.tamaņoAsesor + 1;
	}*/
	
	public void crearAsesor(String nombreAsesor, int idAsesor, boolean estadoAsesor) {
		NodoAsesores nuevoNodo = new NodoAsesores(nombreAsesor, idAsesor, estadoAsesor);
		
		if (this.cabezaAsesor == null) {
			this.cabezaAsesor = nuevoNodo;
			this.colaAsesor = nuevoNodo;
			this.cabezaAsesor.setConsecutivoAsesor(1);
			this.colaAsesor.setConsecutivoAsesor(1);
			
		} else {this.colaAsesor.setSiguienteAsesor(nuevoNodo);
				nuevoNodo.setAnteriorAsesor(this.colaAsesor);
				this.colaAsesor = nuevoNodo;
				this.colaAsesor.setConsecutivoAsesor(this.colaAsesor.getAnteriorAsesor().getConsecutivoAsesor() + 1);
		}
		this.tamaņoAsesor = this.tamaņoAsesor + 1;
		System.out.println("Se a creado el asesor " + nombreAsesor + " con Id " + idAsesor);
		System.out.println("El tamaņo de la lista es " + this.tamaņoAsesor);
		System.out.println("El estado del asesor es " + estadoAsesor);
	}
	
	
	
	public String listarAserores() {
		String result;
		String print = "";
		NodoAsesores tmp = this.cabezaAsesor;
		int i = 1;
		while(i <= this.tamaņoAsesor) {
			result = tmp.getAsesor().getNombre() + ". " + tmp.getAsesor().getId();
			print = print + result + " - ";
			tmp = tmp.getSiguienteAsesor();
			i = i + 1;
		}
		return print;
	}
	 
	
}
