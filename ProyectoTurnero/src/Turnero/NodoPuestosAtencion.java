package Turnero;

public class NodoPuestosAtencion {
	private NodoPuestosAtencion anteriorPuesto;
	private NodoPuestosAtencion siguientePuesto;
	private int cosecutivoPuesto = 0;
	private NodoAsesores asesor;
	
	public NodoPuestosAtencion() {
	
	}
	public NodoPuestosAtencion getAnteriorPuesto() {
		return anteriorPuesto;
	}
	public void setAnteriorPuesto(NodoPuestosAtencion anteriorPuesto) {
		this.anteriorPuesto = anteriorPuesto;
	}
	public NodoPuestosAtencion getSiguientePuesto() {
		return siguientePuesto;
	}
	public void setSiguientePuesto(NodoPuestosAtencion siguientePuesto) {
		this.siguientePuesto = siguientePuesto;
	}
	public int getCosecutivoPuesto() {
		return cosecutivoPuesto;
	}
	public void setCosecutivoPuesto(int cosecutivoPuesto) {
		this.cosecutivoPuesto = cosecutivoPuesto;
	}
	public NodoAsesores getAsesor() {
		return asesor;
	}
	public void setAsesor(NodoAsesores asesor) {
		this.asesor = asesor;
	}
	
	

}
