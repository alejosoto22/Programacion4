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
import Modelo.Turnero;
import Modelo.Turno;
import Vista.InterfazVista;
import Vista.VistaTurnero;

public class Controlador implements ActionListener {
//	private static EntityManager manager;
//	private static EntityManagerFactory emf;

//	private VistaTurnero vistaTurnero;
	private VistaTurnero vistaTurno;// = new VistaTurnero();
	private Turno modeloTurno;// = new Turno();
	private Metodos metodo;
//	private ArrayList<Turno> listaTurnos = new ArrayList<Turno>();
//	private Controlador control = new Controlador();
	
	public Controlador(VistaTurnero vista, Turno modeloTurno) {

		this.vistaTurno = vista;
		this.modeloTurno = modeloTurno;

	}
	
	public void actionPerformed(ActionEvent evento) {
	//	Controlador control = new Controlador();
		String nombreTurno = vistaTurno.getNombrePersona();
		int idTurno = vistaTurno.getIdPersona();
		String servicioTurno = vistaTurno.getServicioPersona();
		int prioridadTurno = vistaTurno.getPrioridadPersona();
		
		modeloTurno.crearTurno(nombreTurno, idTurno, servicioTurno, prioridadTurno);
	//	metodo.crearTurno(nombreTurno, idTurno, servicioTurno, prioridadTurno);
	//	control.crearTurno(nombreTurno, idTurno, servicioTurno, prioridadTurno);
	//	vistaTurnero.setControlador(control);
		/*
		 * manager.getTransaction().begin();
		 * manager.persist(modeloTurnero.getListaTurnos().get(modeloTurnero.
		 * getListaTurnos().size())); manager.getTransaction().commit();
		 */
//	System.out.println(modeloTurnero.getListaTurnos().get(modeloTurnero.getListaTurnos().size()).toString());

	}
	
	
	
/*	public Controlador getControl() {
		return control;
	}

	public void setControl(Controlador control) {
		this.control = control;
	}*/

/*	public void crearTurno(String nombre, int id, String servicio, int prioridad) {
		Turno turno = new Turno();
		turno.getCliente().setNombre(nombre);
		turno.getCliente().setId(id);
		turno.getServicio().setServicio(servicio);
		turno.getPrioridad().setPrioridad(prioridad);
		this.listaTurnos.add(turno);
		this.listaTurnos.get(this.listaTurnos.size() - 1).setTurno(this.listaTurnos.size());
	}

	public void setModeloTurno(Turno modeloTurno) {
		this.modeloTurno = modeloTurno;
		
	}

	public void setVista(VistaTurnero vistaTurno) {
		this.vistaTurno = vistaTurno;
		
	}
*/
	
	

}
