package Taller1Programacion4;

public class NodoServicios {
	
	private int consecutivoServicio = 0;
	private NodoServicios anteriorServicio;
	private NodoServicios siguienteServicio;
	private Turnero datoServicio;
	
	public NodoServicios() {
		
	}
	
/*	public NodoServicios(NodoTurnero nodo) {
		this.datoServicio = new Turnero(nodo);
	}*/

	public int getConsecutivoServicio() {
		return consecutivoServicio;
	}
	public void setConsecutivoServicio(int consecutivoServicio) {
		this.consecutivoServicio = consecutivoServicio;
	}
	public NodoServicios getAnteriorServicio() {
		return anteriorServicio;
	}
	public void setAnteriorServicio(NodoServicios anteriorServicio) {
		this.anteriorServicio = anteriorServicio;
	}
	public NodoServicios getSiguienteServicio() {
		return siguienteServicio;
	}
	public void setSiguienteServicio(NodoServicios siguienteServicio) {
		this.siguienteServicio = siguienteServicio;
	}

	public Turnero getDatoServicio() {
		return datoServicio;
	}

	public void setDatoServicio(Turnero datoServicio) {
		this.datoServicio = datoServicio;
	}
		
}
