package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Asesor;
import Modelo.PuestoAtencion;
import Modelo.Servicio;
import Modelo.Turno;
import Vista.VistaAdministrador;
import Vista.VistaAtender;
import Vista.VistaTurno;

public class ControladorAdmin implements ActionListener{
	
	public VistaAdministrador vistaAdministrador;
	public VistaTurno vistaTurno = new VistaTurno();
	public VistaAtender vistaAsesor = new VistaAtender();
	
	public Servicio modeloServicio;
	public Asesor modeloAsesor;
	public PuestoAtencion modeloPuesto;
	public Turno modeloTurno;
	
	public ControladorAdmin(VistaAdministrador vistaAdministrador, VistaTurno vistaTurno, VistaAtender vistaAsesor, Servicio modeloServicio, Asesor modeloAsesor, PuestoAtencion modeloPuesto, Turno modeloTurno) {
		this.vistaAdministrador = vistaAdministrador;
		this.modeloServicio = modeloServicio;
		this.modeloAsesor = modeloAsesor;
		this.modeloPuesto = modeloPuesto;
		this.vistaTurno = vistaTurno;
		this.modeloTurno = modeloTurno;
	}
	
	public void actionPerformed(ActionEvent evento) {
			if(evento.getActionCommand().equals("servicio")) {
			String nombreServicio = vistaAdministrador.getNombreServicio();

			modeloServicio.crearServicio(nombreServicio);
			vistaAdministrador.comboBoxServi1.addItem(vistaAdministrador.textNombreServ.getText());
			vistaAdministrador.comboBoxServi2.addItem(vistaAdministrador.textNombreServ.getText());
			vistaAdministrador.comboBoxServi3.addItem(vistaAdministrador.textNombreServ.getText());
			vistaTurno.comboBoxServiTurno.addItem(vistaAdministrador.textNombreServ.getText());;
		//	vistaTurno.llenarServicio(vistaAdministrador.textNombreServ.getText());//.comboBoxServiTurno.addItem(vistaAdministrador.textNombreServ.getText());
			
		//	modeloServicio.insertarTurno();
		//	modeloServicio.imprimirTurnos();
			
			} if(evento.getActionCommand().equals("asesor")) {
				String nombreAsesor = vistaAdministrador.getNombreAsesor();
				int idAsesor = vistaAdministrador.getIdAsesor();
				String servicio1 = vistaAdministrador.getAsesServi1();
				String servicio2 = vistaAdministrador.getAsesServi2();
				String servicio3 = vistaAdministrador.getAsesServi3();
				boolean estado = vistaAdministrador.getAsesEstado();
				modeloAsesor.crearAsesor(nombreAsesor, idAsesor, servicio1, servicio2, servicio3, estado);
				vistaAdministrador.comboBoxPuestoAsesor.addItem(vistaAdministrador.textNombreAses.getText());
				
			} if(evento.getActionCommand().equals("puesto")){
				String nombrePuesto = vistaAdministrador.getNombrePuesto();
				String nombreAsesor = vistaAdministrador.getNombreAsesorPuesto();
				boolean estadoPuesto = vistaAdministrador.getEstadoPuesto();
				modeloPuesto.crearPuesto(nombrePuesto, nombreAsesor, estadoPuesto);
			} if(evento.getActionCommand().equals("turno")) {
				
			} if(evento.getActionCommand().equals("turno")) {
				String nombre = vistaTurno.getNombrePersona();
				int id = vistaTurno.getIdPersona();
				String servicio = vistaTurno.getServiTurno();
				int prioridad = vistaTurno.getPrioridadPersona();
				modeloTurno.crearTurno(nombre, id, servicio, prioridad);
			} if(evento.getActionCommand().equals("siguiente")) {
				modeloTurno.atender();
			}
	
		}

}
