package Taller1Programacion4;

public class Asesores {
	
	private NodoAsesores cabezaAsesor = null;
	private NodoAsesores colaAsesor = null;
	private int tamaņoAsesor = 0;
	
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
	
}
