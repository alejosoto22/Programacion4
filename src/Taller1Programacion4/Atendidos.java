package Taller1Programacion4;

public class Atendidos {
	
	private NodoAtendidos cabezaAtendido = null;
	private NodoAtendidos colaAtendido = null;
	private int tamañoAtendido = 0;
	
	public Atendidos() {
	}
	
	public NodoAtendidos getCabezaAtendido() {
		return cabezaAtendido;
	}
	public void setCabezaAtendido(NodoAtendidos cabezaAtendido) {
		this.cabezaAtendido = cabezaAtendido;
	}
	public NodoAtendidos getColaAtendido() {
		return colaAtendido;
	}
	public void setColaAtendido(NodoAtendidos colaAtendido) {
		this.colaAtendido = colaAtendido;
	}
	public int getTamañoAtendido() {
		return tamañoAtendido;
	}
	public void setTamañoAtendido(int tamañoAtendido) {
		this.tamañoAtendido = tamañoAtendido;
	}
	
}
