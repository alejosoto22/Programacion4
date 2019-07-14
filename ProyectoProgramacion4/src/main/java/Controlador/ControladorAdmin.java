package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Asesor;
import Modelo.Servicio;
import Vista.VistaAdministrador;
import Vista.VistaTurnero;

public class ControladorAdmin implements ActionListener{
	
	public VistaAdministrador vistaAdministrador;
	public Servicio modeloServicio;
	public Asesor modeloAsesor;
	
	public ControladorAdmin(VistaAdministrador vistaAdministrador, Servicio modeloServicio, Asesor modeloAsesor) {
		this.vistaAdministrador = vistaAdministrador;
		this.modeloServicio = modeloServicio;
		this.modeloAsesor = modeloAsesor;
	}
	
	public void actionPerformed(ActionEvent evento) {
			if(evento.getActionCommand().equals("servicio")) {
			String nombreServicio = vistaAdministrador.getNombreServicio();

			modeloServicio.crearServicio(nombreServicio);
			vistaAdministrador.comboBoxServi1.addItem(vistaAdministrador.textNombreServ.getText());
			vistaAdministrador.comboBoxServi2.addItem(vistaAdministrador.textNombreServ.getText());
			vistaAdministrador.comboBoxServi3.addItem(vistaAdministrador.textNombreServ.getText());
			} if(evento.getActionCommand().equals("asesor")) {
				String nombreAsesor = vistaAdministrador.getNombreAsesor();
				int idAsesor = vistaAdministrador.getIdAsesor();
				String servicio1 = vistaAdministrador.getAsesServi1();
				String servicio2 = vistaAdministrador.getAsesServi2();
				String servicio3 = vistaAdministrador.getAsesServi3();
				boolean estado = vistaAdministrador.getAsesEstado();
				modeloAsesor.crearAsesor(nombreAsesor, idAsesor, servicio1, servicio2, servicio3, estado);
			}
	
		}

}
