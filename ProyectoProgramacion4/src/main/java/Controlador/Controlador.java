package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Modelo.Metodos;
import Modelo.Persona;
import Modelo.Servicio;
import Modelo.Turnero;
import Modelo.Turno;
import Vista.InterfazVista;
import Vista.VistaAdministrador;
import Vista.VistaTurnero;

public class Controlador implements ActionListener {

	public VistaTurnero vistaTurno;// = new VistaTurnero();
	public Turno modeloTurno;// = new Turno();
	public VistaAdministrador vistaAdmin;
	public Servicio modeloServicio;

	public Controlador(VistaTurnero vista, Turno modeloTurno) {

		this.vistaTurno = vista;
		this.modeloTurno = modeloTurno;

	}

	public void actionPerformed(ActionEvent evento) {
	
		String nombreTurno = vistaTurno.getNombrePersona();
		int idTurno = vistaTurno.getIdPersona();
		String servicioTurno = vistaTurno.getServicioPersona();
		int prioridadTurno = vistaTurno.getPrioridadPersona();
				
		modeloTurno.crearTurno(nombreTurno, idTurno, servicioTurno, prioridadTurno);
	//	vistaTurno.comboBoxServiTurno.addItem("aa");
	//	vistaTurno.comboBoxServiTurno.addItem(modeloServicio.getListaTurno().get(0).getNombre());
		
	}

}
