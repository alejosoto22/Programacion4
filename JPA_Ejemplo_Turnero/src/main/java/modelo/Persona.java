package modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONA")
public class Persona implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Id
	@Column(name = "IDENTIFICACION")
	private int id;
	
	@Column(name = "SERVICIO")
	private String servicio;
	
	@Column(name = "PRIORIDAD")
	private int prioridad;
	
	public Persona() {
		
	}

	public Persona(String nombre, int id, String servicio, int prioridad) {
		this.nombre = nombre;
		this.id = id;
		this.servicio = servicio;
		this.prioridad = prioridad;
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
