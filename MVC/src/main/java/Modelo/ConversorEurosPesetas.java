package Modelo;

public class ConversorEurosPesetas extends ConversorEuros{
	// Adaptador de clase
	
	private ConversorEuros conversor;

	public ConversorEurosPesetas() {
		super(166.386D);
	}

	public double eurosApesetas(double cantidad) {
		return eurosAmoneda(cantidad);
	}
	
	public double pesetasAeuros(double cantidad) {
		return monedaAeuros(cantidad);
	}

}