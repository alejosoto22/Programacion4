package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;
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

	private JPanel contentPane;
	public JTextField textNombreServ;
	public JTextField textNombreAses;
	public JTextField textNombrePuest;
	public JTextField textIdAses;
	public JButton btnCrearServicio;
	public JComboBox<String> comboBoxServi1;
	public JComboBox<String> comboBoxServi2;
	public JComboBox<String> comboBoxServi3;
//	Servicio modeloServicio = new Servicio();
	/**
	 * Launch the application.
	 */
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
		setBounds(100, 100, 697, 331);
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
		lblCrearServicio.setBounds(30, 69, 99, 14);
		contentPane.add(lblCrearServicio);
		
		JLabel lblCrearAsesor = new JLabel("CREAR ASESOR");
		lblCrearAsesor.setBounds(272, 69, 107, 14);
		contentPane.add(lblCrearAsesor);
		
		JLabel lblCrearPuestosDe = new JLabel("CREAR PUESTOS DE ATENCI\u00D3N");
		lblCrearPuestosDe.setBounds(485, 69, 180, 14);
		contentPane.add(lblCrearPuestosDe);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 113, 48, 14);
		contentPane.add(lblNombre);
		
		JLabel label = new JLabel("Nombre:");
		label.setBounds(246, 113, 48, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Nombre:");
		label_1.setBounds(485, 116, 48, 14);
		contentPane.add(label_1);
		
		textNombreServ = new JTextField();
		textNombreServ.setBounds(59, 110, 86, 20);
		contentPane.add(textNombreServ);
		textNombreServ.setColumns(10);
		
		textNombreAses = new JTextField();
		textNombreAses.setBounds(303, 110, 86, 20);
		contentPane.add(textNombreAses);
		textNombreAses.setColumns(10);
		
		textNombrePuest = new JTextField();
		textNombrePuest.setBounds(534, 113, 86, 20);
		contentPane.add(textNombrePuest);
		textNombrePuest.setColumns(10);
		
		JLabel lblIdAsesor = new JLabel("Id Asesor:");
		lblIdAsesor.setBounds(246, 141, 57, 14);
		contentPane.add(lblIdAsesor);
		
		textIdAses = new JTextField();
		textIdAses.setColumns(10);
		textIdAses.setBounds(313, 138, 76, 20);
		contentPane.add(textIdAses);
		
		JComboBox comboBoxPuesto = new JComboBox();
		comboBoxPuesto.setBounds(534, 153, 86, 20);
		contentPane.add(comboBoxPuesto);
		
		JLabel lblEsta = new JLabel("Estado:");
		lblEsta.setBounds(485, 156, 48, 14);
		contentPane.add(lblEsta);
		
		comboBoxServi1 = new JComboBox();
		comboBoxServi1.setModel(new DefaultComboBoxModel(new String[] {"null"}));
		comboBoxServi1.setBounds(313, 163, 76, 20);
		contentPane.add(comboBoxServi1);
		
		JLabel lblServicio = new JLabel("Servicio 1:");
		lblServicio.setBounds(246, 169, 69, 14);
		contentPane.add(lblServicio);
		
		JLabel lblServicio_1 = new JLabel("Servicio 2:");
		lblServicio_1.setBounds(246, 197, 69, 14);
		contentPane.add(lblServicio_1);
		
		comboBoxServi2 = new JComboBox();
		comboBoxServi2.setModel(new DefaultComboBoxModel(new String[] {"null"}));
		comboBoxServi2.setBounds(313, 191, 76, 20);
		contentPane.add(comboBoxServi2);
		
		JLabel lblServicio_2 = new JLabel("Servicio 3:");
		lblServicio_2.setBounds(246, 225, 69, 14);
		contentPane.add(lblServicio_2);
		
		comboBoxServi3 = new JComboBox();
		comboBoxServi3.setModel(new DefaultComboBoxModel(new String[] {"null"}));
		comboBoxServi3.setBounds(313, 219, 76, 20);
		contentPane.add(comboBoxServi3);
		
		btnCrearServicio = new JButton("Crear Servicio");
		btnCrearServicio.setBounds(30, 164, 115, 23);
		contentPane.add(btnCrearServicio);
		
		JLabel labelEstadoAses = new JLabel("Estado:");
		labelEstadoAses.setBounds(246, 250, 69, 14);
		contentPane.add(labelEstadoAses);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"true", "false"}));
		comboBox.setBounds(313, 247, 76, 20);
		contentPane.add(comboBox);
	}
	
	public void setControladorAdministrador(ControladorAdmin control2) {
		btnCrearServicio.addActionListener(control2);
	//	comboBoxServi1.addItem(textIdAses.getText());
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
	public String getIdAsesor() {
		return textIdAses.getText();
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
}
