package Modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TablaAsesores")
public class NodoAsesores implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Persona asesor;
	private int consecutivoAsesor = 0;
	private NodoAsesores anteriorAsesor;
	private NodoAsesores siguienteAsesor;
	private Turnero datoAsesor;
	
	@Column(name = "ColmNombreAsesor")
	private String nombreAsesor;
	
	@Id
	@Column(name = "ColmIdAsesor")
	private int idAsesor;
	
	@Column(name = "ColmEstadoAsesor")
	private boolean estadoAsesor;
		
	public NodoAsesores() {
		super();
	}

	public NodoAsesores(String nombreAsesor, int idAsesor, boolean estadoAsesor) {
		this.asesor = new Persona(nombreAsesor, idAsesor);
		this.asesor.setEstadoAsesor(estadoAsesor);
	//	this.asesor.setServicioAsesor1(primerServicio);
	//	this.asesor.setServicioAsesor2(segundoServicio);
	//	this.asesor.setServicioAsesor3(tercerServicio);
		
	 }
	
	public Turnero getDatoAsesor() {
		return datoAsesor;
	}

	public void setDatoAsesor(Turnero datoAsesor) {
		this.datoAsesor = datoAsesor;
	}
	
	public Persona getAsesor() {
		return asesor;
	}

	public void setAsesor(Persona asesor) {
		this.asesor = asesor;
	}

	public int getConsecutivoAsesor() {
		return consecutivoAsesor;
	}
	public void setConsecutivoAsesor(int consecutivoAsesor) {
		this.consecutivoAsesor = consecutivoAsesor;
	}
	public NodoAsesores getAnteriorAsesor() {
		return anteriorAsesor;
	}
	public void setAnteriorAsesor(NodoAsesores anteriorAsesor) {
		this.anteriorAsesor = anteriorAsesor;
	}
	public NodoAsesores getSiguienteAsesor() {
		return siguienteAsesor;
	}
	public void setSiguienteAsesor(NodoAsesores siguienteAsesor) {
		this.siguienteAsesor = siguienteAsesor;
	}
	
	
}
