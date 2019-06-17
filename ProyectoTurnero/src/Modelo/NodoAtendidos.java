package Modelo;

public class NodoAtendidos {
	
	private int consecutivoAtendido = 0;
	private NodoAtendidos anteriorAtendido;
	private NodoAtendidos siguienteAtendido;
	private NodoAsesores filaDeAtendidos;
	private Persona asesorAtendidos;
	private Turnero atendidos;
	
	public NodoAtendidos(String nombreAsesor, int idAsesor) {
		this.asesorAtendidos = new Persona(nombreAsesor, idAsesor);
	}
	
	public int getConsecutivoAtendido() {
		return consecutivoAtendido;
	}
	public void setConsecutivoAtendido(int consecutivoAtendido) {
		this.consecutivoAtendido = consecutivoAtendido;
	}
	public NodoAtendidos getAnteriorAtendido() {
		return anteriorAtendido;
	}
	public void setAnteriorAtendido(NodoAtendidos anteriorAtendido) {
		this.anteriorAtendido = anteriorAtendido;
	}
	public NodoAtendidos getSiguienteAtendido() {
		return siguienteAtendido;
	}
	public void setSiguienteAtendido(NodoAtendidos siguienteAtendido) {
		this.siguienteAtendido = siguienteAtendido;
	}
	public NodoAsesores getFilaDeAtendidos() {
		return filaDeAtendidos;
	}
	public void setFilaDeAtendidos(NodoAsesores filaDeAtendidos) {
		this.filaDeAtendidos = filaDeAtendidos;
	}

	public Persona getAsesorAtendidos() {
		return asesorAtendidos;
	}

	public void setAsesorAtendidos(Persona asesorAtendidos) {
		this.asesorAtendidos = asesorAtendidos;
	}

	public Turnero getAtendidos() {
		return atendidos;
	}

	public void setAtendidos(Turnero atendidos) {
		this.atendidos = atendidos;
	}
	
}
