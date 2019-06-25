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
	
	@Column(name = "ColmNombre")
	private String nombre;
	
	@Id
	@Column(name = "ColmId")
	private int id;
	
	@Column(name = "ColmServicio")
	private String servicio;
	
	@Column(name = "ColmPrioridad")
	private int prioridad;
	
	private String servicioAsesor1;
	private String servicioAsesor2;
	private String servicioAsesor3;
	private boolean estadoAsesor;
			
	public Persona() {
		super();
	}

	public Persona(String nombre, int id) {

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
	
	public String getServicioAsesor1() {
		return servicioAsesor1;
	}

	public void setServicioAsesor1(String servicioAsesor1) {
		this.servicioAsesor1 = servicioAsesor1;
	}

	public String getServicioAsesor2() {
		return servicioAsesor2;
	}

	public void setServicioAsesor2(String servicioAsesor2) {
		this.servicioAsesor2 = servicioAsesor2;
	}

	public String getServicioAsesor3() {
		return servicioAsesor3;
	}

	public void setServicioAsesor3(String servicioAsesor3) {
		this.servicioAsesor3 = servicioAsesor3;
	}

	public boolean isEstadoAsesor() {
		return estadoAsesor;
	}

	public void setEstadoAsesor(boolean estadoAsesor) {
		this.estadoAsesor = estadoAsesor;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", id=" + id + "]";
	}
		

}
