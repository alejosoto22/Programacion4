package Modelo;

public class NodoPuestosAtencion {
	private NodoPuestosAtencion anteriorPuesto;
	private NodoPuestosAtencion siguientePuesto;
	private int cosecutivoPuesto = 0;
	private NodoAsesores datoPuesto;
	private boolean estadoPuesto;
	
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
	
	public NodoAsesores getDatoPuesto() {
		return datoPuesto;
	}
	public void setDatoPuesto(NodoAsesores datoPuesto) {
		this.datoPuesto = datoPuesto;
	}
	public boolean isEstadoPuesto() {
		return estadoPuesto;
	}
	public void setEstadoPuesto(boolean estadoPuesto) {
		this.estadoPuesto = estadoPuesto;
	}
		

}
