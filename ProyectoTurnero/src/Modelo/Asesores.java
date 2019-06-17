package Modelo;

public class Asesores {
	
	private NodoAsesores cabezaAsesor = null;
	private NodoAsesores colaAsesor = null;
	private int tama�oAsesor = 0;
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
	public int getTama�oAsesor() {
		return tama�oAsesor;
	}
	public void setTama�oAsesor(int tama�oAsesor) {
		this.tama�oAsesor = tama�oAsesor;
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
		this.tama�oAsesor = this.tama�oAsesor + 1;
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
		this.tama�oAsesor = this.tama�oAsesor + 1;
	}
	
}
