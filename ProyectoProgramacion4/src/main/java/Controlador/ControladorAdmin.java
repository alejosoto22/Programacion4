package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Servicio;
import Vista.VistaAdministrador;
import Vista.VistaTurnero;

public class ControladorAdmin implements ActionListener{
	
	private VistaAdministrador vistaAdministrador;
	private Servicio modeloServicio;
//	private VistaTurnero vistaTurno;
	
	public ControladorAdmin(VistaAdministrador vistaAdministrador, Servicio modeloServicio) {
		this.vistaAdministrador = vistaAdministrador;
		this.modeloServicio = modeloServicio;
	}
	
	public void actionPerformed(ActionEvent evento) {
			
			String nombreServicio = vistaAdministrador.getNombreServicio();

			modeloServicio.crearServicio(nombreServicio);
			vistaAdministrador.comboBoxServi1.addItem(vistaAdministrador.textNombreServ.getText());
			vistaAdministrador.comboBoxServi2.addItem(vistaAdministrador.textNombreServ.getText());
			vistaAdministrador.comboBoxServi3.addItem(vistaAdministrador.textNombreServ.getText());
		//	vistaTurno.comboBoxServiTurno.addItem(vistaAdministrador.textNombreServ.getText());
			
		}

}
