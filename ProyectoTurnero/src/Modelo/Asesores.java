package Modelo;

public class Asesores {
	
	private NodoAsesores cabezaAsesor = null;
	private NodoAsesores colaAsesor = null;
	private int tamañoAsesor = 0;
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
	public int getTamañoAsesor() {
		return tamañoAsesor;
	}
	public void setTamañoAsesor(int tamañoAsesor) {
		this.tamañoAsesor = tamañoAsesor;
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
		this.tamañoAsesor = this.tamañoAsesor + 1;
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
		this.tamañoAsesor = this.tamañoAsesor + 1;
	}
	
}
