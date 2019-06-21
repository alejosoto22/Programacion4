package Modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TablaPuestoAtencion")
public class NodoPuestosAtencion implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private NodoPuestosAtencion anteriorPuesto;
	private NodoPuestosAtencion siguientePuesto;
	private int cosecutivoPuesto = 0;
	private NodoAsesores datoPuesto;
	private boolean estadoPuesto;
	
	@Id
	@Column(name = "ColmPuestoAtencion")
	private int puestoAtencion;
	
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
	public int getPuestoAtencion() {
		return puestoAtencion;
	}
	public void setPuestoAtencion(int puestoAtencion) {
		this.puestoAtencion = puestoAtencion;
	}
		

}
