package Turnero;

public class Asesores {
	
	private NodoAsesores cabezaAsesor = null;
	private NodoAsesores colaAsesor = null;
	private int tama�oAsesor = 0;
	
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
	
}
