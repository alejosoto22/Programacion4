package Turnero;

public class PuestosAtencion {
	// Clase donde se atiende a las personas.
	
	private NodoPuestosAtencion cabezaPuesto;
	private NodoPuestosAtencion colaPuesto;
	private int tama�oPuestos;
	private String estadoPuesto;
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
	public int getTama�oPuestos() {
		return tama�oPuestos;
	}
	public void setTama�oPuestos(int tama�oPuestos) {
		this.tama�oPuestos = tama�oPuestos;
	}
	public String getEstadoPuesto() {
		return estadoPuesto;
	}
	public void setEstadoPuesto(String estadoPuesto) {
		this.estadoPuesto = estadoPuesto;
	}
	

}
