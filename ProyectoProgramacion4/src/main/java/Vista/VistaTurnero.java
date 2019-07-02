package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class VistaTurnero extends JFrame implements InterfazVista{

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textId;
	private JTextField textServicio;
	JButton btnAceptar;
	JComboBox comboBoxPrioridad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaTurnero frame = new VistaTurnero();
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
	public VistaTurnero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelTurnero = new JLabel("TURNERO");
		labelTurnero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelTurnero.setBounds(183, 28, 98, 17);
		contentPane.add(labelTurnero);
		
		JLabel labelNombre = new JLabel("Nombre:");
		labelNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelNombre.setBounds(108, 74, 75, 17);
		contentPane.add(labelNombre);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(209, 74, 89, 20);
		contentPane.add(textNombre);
		
		JLabel labelId = new JLabel("Identificaci\u00F3n:");
		labelId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelId.setBounds(108, 108, 84, 17);
		contentPane.add(labelId);
		
		textId = new JTextField();
		textId.setColumns(10);
		textId.setBounds(209, 105, 89, 20);
		contentPane.add(textId);
		
		JLabel labelPrioridad = new JLabel("Estado:");
		labelPrioridad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelPrioridad.setBounds(108, 166, 75, 17);
		contentPane.add(labelPrioridad);
		
		comboBoxPrioridad = new JComboBox();
		comboBoxPrioridad.setModel(new DefaultComboBoxModel(new String[] {"Con Prioridad", "Sin Prioridad"}));
		comboBoxPrioridad.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBoxPrioridad.setBounds(209, 165, 118, 20);
		contentPane.add(comboBoxPrioridad);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(183, 196, 109, 23);
		contentPane.add(btnAceptar);
		
		JLabel lblServicio = new JLabel("Servicio:");
		lblServicio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblServicio.setBounds(108, 139, 84, 17);
		contentPane.add(lblServicio);
		
		textServicio = new JTextField();
		textServicio.setColumns(10);
		textServicio.setBounds(209, 136, 89, 20);
		contentPane.add(textServicio);
	}

	public void setControlador(Controlador control) {
		btnAceptar.addActionListener(control);
		
	}

	public void arranca() {
		pack();// coloca los componentes
		setLocationRelativeTo(null);// centra la ventana en la pantalla
		setVisible(true);// visualiza la ventana
		
	}

	public String getNombreTurnero() {
		return textNombre.getText();
	}

	public int getIdTurnero() {
		return Integer.parseInt(textId.getText());
	}

	public String getServicioTurnero() {
		return textServicio.getText();
	}

	public int getPrioridadTurnero() {
		if(comboBoxPrioridad.toString() == "Con Prioridad") {
			return 1;}
		else {return 0;
		}
	}
}