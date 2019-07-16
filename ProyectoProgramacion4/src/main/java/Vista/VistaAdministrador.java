package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import Controlador.ControladorAdmin;
import Modelo.Servicio;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class VistaAdministrador extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	public JTextField textNombreServ;
	public JTextField textNombreAses;
	public JTextField textNombrePuest;
	public JTextField textIdAses;
	public JButton btnCrearServicio;
	public JComboBox<String> comboBoxServi1;
	public JComboBox<String> comboBoxServi2;
	public JComboBox<String> comboBoxServi3;
	public JComboBox<String> comboBoxEstadoAses;
	public JButton btnCrearAsesor;
	public JComboBox<String> comboBoxPuestoAsesor;
	public JButton btnCrearPuesto;
	public JComboBox<String> comboBoxPuesto;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaAdministrador frame = new VistaAdministrador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaAdministrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ADMINISTRADOR");
		setBounds(100, 100, 666, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBounds(29, 35, 700, 345);

		JLabel lblAdministrador = new JLabel("ADMINISTRADOR");
		lblAdministrador.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAdministrador.setBounds(275, 11, 107, 17);
		contentPane.add(lblAdministrador);

		JLabel lblCrearServicio = new JLabel("CREAR SERVICIO");
		lblCrearServicio.setBounds(36, 39, 99, 14);
		contentPane.add(lblCrearServicio);

		JLabel lblCrearAsesor = new JLabel("CREAR ASESOR");
		lblCrearAsesor.setBounds(278, 39, 107, 14);
		contentPane.add(lblCrearAsesor);

		JLabel lblCrearPuestosDe = new JLabel("CREAR PUESTOS DE ATENCI\u00D3N");
		lblCrearPuestosDe.setBounds(474, 39, 180, 14);
		contentPane.add(lblCrearPuestosDe);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 113, 48, 14);
		contentPane.add(lblNombre);

		JLabel label = new JLabel("Nombre:");
		label.setBounds(243, 79, 48, 14);
		contentPane.add(label);

		JLabel label_1 = new JLabel("Nombre:");
		label_1.setBounds(485, 82, 48, 14);
		contentPane.add(label_1);

		textNombreServ = new JTextField();
		textNombreServ.setBounds(59, 110, 86, 20);
		contentPane.add(textNombreServ);
		textNombreServ.setColumns(10);

		textNombreAses = new JTextField();
		textNombreAses.setBounds(300, 76, 86, 20);
		contentPane.add(textNombreAses);
		textNombreAses.setColumns(10);

		textNombrePuest = new JTextField();
		textNombrePuest.setBounds(534, 79, 86, 20);
		contentPane.add(textNombrePuest);
		textNombrePuest.setColumns(10);

		JLabel lblIdAsesor = new JLabel("Id Asesor:");
		lblIdAsesor.setBounds(243, 107, 57, 14);
		contentPane.add(lblIdAsesor);

		textIdAses = new JTextField();
		textIdAses.setColumns(10);
		textIdAses.setBounds(310, 104, 76, 20);
		contentPane.add(textIdAses);

		comboBoxPuesto = new JComboBox();
		comboBoxPuesto.setModel(new DefaultComboBoxModel(new String[] { "Disponible", "No Disponible" }));
		comboBoxPuesto.setBounds(534, 113, 86, 20);
		contentPane.add(comboBoxPuesto);

		JLabel lblEsta = new JLabel("Estado:");
		lblEsta.setBounds(485, 116, 48, 14);
		contentPane.add(lblEsta);

		comboBoxServi1 = new JComboBox();
		comboBoxServi1.setModel(new DefaultComboBoxModel(new String[] { "null" }));
		comboBoxServi1.setBounds(310, 129, 76, 20);
		contentPane.add(comboBoxServi1);

		JLabel lblServicio = new JLabel("Servicio 1:");
		lblServicio.setBounds(243, 135, 69, 14);
		contentPane.add(lblServicio);

		JLabel lblServicio_1 = new JLabel("Servicio 2:");
		lblServicio_1.setBounds(243, 163, 69, 14);
		contentPane.add(lblServicio_1);

		comboBoxServi2 = new JComboBox();
		comboBoxServi2.setModel(new DefaultComboBoxModel(new String[] { "null" }));
		comboBoxServi2.setBounds(310, 157, 76, 20);
		contentPane.add(comboBoxServi2);

		JLabel lblServicio_2 = new JLabel("Servicio 3:");
		lblServicio_2.setBounds(243, 191, 69, 14);
		contentPane.add(lblServicio_2);

		comboBoxServi3 = new JComboBox();
		comboBoxServi3.setModel(new DefaultComboBoxModel(new String[] { "null" }));
		comboBoxServi3.setBounds(310, 185, 76, 20);
		contentPane.add(comboBoxServi3);

		btnCrearServicio = new JButton("Crear Servicio");
		btnCrearServicio.setBounds(20, 163, 115, 23);
		contentPane.add(btnCrearServicio);

		JLabel labelEstadoAses = new JLabel("Estado:");
		labelEstadoAses.setBounds(243, 216, 69, 14);
		contentPane.add(labelEstadoAses);

		comboBoxEstadoAses = new JComboBox();
		comboBoxEstadoAses.setModel(new DefaultComboBoxModel(new String[] { "Activo", "Inactivo" }));
		comboBoxEstadoAses.setBounds(310, 213, 76, 20);
		contentPane.add(comboBoxEstadoAses);

		btnCrearAsesor = new JButton("Crear Asesor");
		btnCrearAsesor.setBounds(275, 247, 124, 23);
		contentPane.add(btnCrearAsesor);

		JLabel lblAsesor = new JLabel("Asesor:");
		lblAsesor.setBounds(485, 147, 69, 14);
		contentPane.add(lblAsesor);

		comboBoxPuestoAsesor = new JComboBox();
		comboBoxPuestoAsesor.setModel(new DefaultComboBoxModel(new String[] {"null"}));
		comboBoxPuestoAsesor.setBounds(534, 144, 86, 20);
		contentPane.add(comboBoxPuestoAsesor);

		btnCrearPuesto = new JButton("Crear Puesto");
		btnCrearPuesto.setBounds(509, 187, 111, 23);
		contentPane.add(btnCrearPuesto);

	}

	public void setControladorAdministrador(ControladorAdmin control) {
		btnCrearServicio.addActionListener(control);
		btnCrearServicio.setActionCommand("servicio");
	}

	public void setControladorAsesores(ControladorAdmin control) {
		btnCrearAsesor.addActionListener(control);
		btnCrearAsesor.setActionCommand("asesor");
	}

	public void setControladorPuestos(ControladorAdmin control) {
		btnCrearPuesto.addActionListener(control);
		btnCrearPuesto.setActionCommand("puesto");
	}

	public void arranca() {
		pack();// coloca los componentes
		setLocationRelativeTo(null);// centra la ventana en la pantalla
		setVisible(true);// visualiza la ventana
	}

	public String getNombreServicio() {
		return textNombreServ.getText();
	}

	public String getNombreAsesor() {
		return textNombreAses.getText();
	}

	public int getIdAsesor() {
		return Integer.parseInt(textIdAses.getText());
	}

	public String getAsesServi1() {
		return comboBoxServi1.toString();
	}

	public String getAsesServi2() {
		return comboBoxServi2.toString();
	}

	public String getAsesServi3() {
		return comboBoxServi3.toString();
	}

	public boolean getAsesEstado() {
		if (comboBoxEstadoAses.toString() == "Inactivo") {
			return false;
		} else {
			return true;
		}
	}

	public String getNombrePuesto() {
		return textNombrePuest.getText();
	}

	public boolean getEstadoPuesto() {
		if (comboBoxPuesto.toString() == "No Disponible") {
			return false;
		} else {
			return true;
		}
	}
	public String getNombreAsesorPuesto() {
		return comboBoxPuestoAsesor.toString();
	}


}
