package Turnero;

public class Asesores {
	
	private NodoAsesores cabezaAsesor = null;
	private NodoAsesores colaAsesor = null;
	private int tamañoAsesor = 0;
	
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
	
}
