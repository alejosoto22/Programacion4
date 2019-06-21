package Modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TablaCliente")
public class Cliente extends Persona implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "ColmNombreCliente")
	private String nombreCliente;
	
	@Id
	@Column(name = "ColmIdCliente")
	private int idCliente;
	
	@Column(name = "ColmServicio")
	private String servicio;
		
	@Column(name = "ColmPrioridad")
	private int prioridad;
			
	public Cliente() {
		super();
	}
	
	public Cliente(String nombreCliente, int idCliente, String servicio, int prioridad) {
		
		this.nombreCliente = nombreCliente;
		this.setNombre(nombreCliente);
		
		this.idCliente = idCliente;
		this.setId(idCliente);
		
		this.servicio = servicio;
		this.prioridad = prioridad;
	}

	public String getServicio() {
		return servicio;
	}
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}
	public int getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
}
