package Turnero;

public class NodoAtendidos {
	
	private int consecutivoAtendido = 0;
	private NodoAtendidos anteriorAtendido;
	private NodoAtendidos siguienteAtendido;
	private NodoAsesores filaDeAtendidos;
	
	public NodoAtendidos(NodoAsesores filaDeAtendidos) {
		this.filaDeAtendidos = filaDeAtendidos;
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
	
}
