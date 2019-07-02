package Modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TablaPersona")
public class Persona implements Serializable{
		
	private static final long serialVersionUID = 1L;
	
	@Column(name = "ColmNombre",length = 10)
	private String nombre;
	
	@Id
	@Column(name = "ColmId",length = 3)
	private int id;
	
	@Column(name = "ColmServicio",length = 9)
	private String servicio;
	
	@Column(name = "ColmPrioridad",length = 1)
	private int prioridad;
	
	public Persona() {
		super();
	}
	public Persona(String nombre, int id) {
		super();
		this.nombre = nombre;
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", id=" + id + ", servicio=" + servicio + ", prioridad=" + prioridad + "]";
	}
	

}
