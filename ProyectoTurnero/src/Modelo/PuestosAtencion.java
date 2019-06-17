package Modelo;

public class PuestosAtencion {
	// Clase donde se atiende a las personas.
	
	private NodoPuestosAtencion cabezaPuesto;
	private NodoPuestosAtencion colaPuesto;
	private int tamañoPuestos;
	private PuestosAtencion listaPuestos;
	
		
	public NodoPuestosAtencion getCabezaPuesto() {
		return cabezaPuesto;
	}
	public void setCabezaPuesto(NodoPuestosAtencion cabezaPuesto) {
		this.cabezaPuesto = cabezaPuesto;
	}
	public NodoPuestosAtencion getColaPuesto() {
		return colaPuesto;
	}
	public void setColaPuesto(NodoPuestosAtencion colaPuesto) {
		this.colaPuesto = colaPuesto;
	}
	public int getTamañoPuestos() {
		return tamañoPuestos;
	}
	public void setTamañoPuestos(int tamañoPuestos) {
		this.tamañoPuestos = tamañoPuestos;
	}
	public PuestosAtencion getListaPuestos() {
		return listaPuestos;
	}
	public void setListaPuestos(PuestosAtencion listaPuestos) {
		this.listaPuestos = listaPuestos;
	}
		

}
