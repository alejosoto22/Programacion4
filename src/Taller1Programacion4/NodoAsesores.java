package Taller1Programacion4;

public class NodoAsesores {
	
	private int consecutivoAsesor = 0;
	private NodoAsesores anteriorAsesor;
	private NodoAsesores siguienteAsesor;
	private Servicios filaDeServicio;
	
	
	
	public NodoAsesores() {


	}
	public Servicios getFilaDeServicio() {
		return filaDeServicio;
	}
	public void setFilaDeServicio(Servicios filaDeServicio) {
		this.filaDeServicio = filaDeServicio;
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
