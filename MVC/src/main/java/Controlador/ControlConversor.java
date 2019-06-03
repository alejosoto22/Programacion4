package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.ConversorEurosPesetas;
import Vista.InterfazVista;

public class ControlConversor implements ActionListener {
	
	private InterfazVista vista;
	private ConversorEurosPesetas modelo;
	
	public ControlConversor(InterfazVista vista, ConversorEurosPesetas modelo) {
		this.vista = vista;
		this.modelo = modelo;
	}
	
	public void actionPerformed(ActionEvent evento) {
		double cantidad = vista.getCantidad();
		if(evento.getActionCommand().equals(InterfazVista.AEUROS)) {
			vista.escribeCambio(cantidad + " Pesetas son: " + modelo.pesetasAeuros(cantidad) + " Euros.");
		}
		else if(evento.getActionCommand().equals(InterfazVista.APESETAS)) {
			vista.escribeCambio(cantidad + " Euros son: " + modelo.eurosApesetas(cantidad) + " Pesetas.");
		}
		else vista.escribeCambio("ERROR");
	}
	}
