package Modelo;

public class NodoAsesores {
	
	private Persona asesor;
	private int consecutivoAsesor = 0;
	private NodoAsesores anteriorAsesor;
	private NodoAsesores siguienteAsesor;
	private NodoTurnero datoAsesor;
	
		
	public NodoAsesores() {
		
	}
	
	 public NodoAsesores(String nombreAsesor, int idAsesor, boolean estadoAsesor) {
		this.asesor = new Persona(nombreAsesor, idAsesor);
		this.asesor.setEstadoAsesor(estadoAsesor);
			
	 }
		
	public NodoTurnero getDatoAsesor() {
		return datoAsesor;
	}

	public void setDatoAsesor(NodoTurnero datoAsesor) {
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
