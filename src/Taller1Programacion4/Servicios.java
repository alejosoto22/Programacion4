package Taller1Programacion4;

public class Servicios {
	
	private NodoServicios cabezaServicio = null;
	private NodoServicios colaServicio = null;
	private int tamañoServicio = 0;
	
	public Servicios() {
	}
	
	public NodoServicios getCabezaServicio() {
		return cabezaServicio;
	}
	public void setCabezaServicio(NodoServicios cabezaServicio) {
		this.cabezaServicio = cabezaServicio;
	}
	public NodoServicios getColaServicio() {
		return colaServicio;
	}
	public void setColaServicio(NodoServicios colaServicio) {
		this.colaServicio = colaServicio;
	}
	public int getTamañoServicio() {
		return tamañoServicio;
	}
	public void setTamañoServicio(int tamañoServicio) {
		this.tamañoServicio = tamañoServicio;
	}
	
}
