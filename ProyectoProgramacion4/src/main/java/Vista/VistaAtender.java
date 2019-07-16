package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.ControladorAdmin;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VistaAtender extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton btnSiguiente;
	public JComboBox<String> comboBox;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaAtender frame = new VistaAtender();
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
	public VistaAtender() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 267, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAsesor = new JLabel("ATENDER");
		lblAsesor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAsesor.setBounds(94, 36, 68, 17);
		contentPane.add(lblAsesor);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(83, 172, 89, 23);
		contentPane.add(btnSiguiente);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Activo", "Inactivo"}));
		comboBox.setBounds(112, 103, 87, 20);
		contentPane.add(comboBox);
		
		JLabel lblEstadoAsesor = new JLabel("Estado Asesor:");
		lblEstadoAsesor.setBounds(21, 106, 89, 14);
		contentPane.add(lblEstadoAsesor);
	}
	public void setControladorAsesor(ControladorAdmin control) {
		btnSiguiente.addActionListener(control);
		btnSiguiente.setActionCommand("siguiente");
	}
	public void arranca() {
		pack();// coloca los componentes
		setLocationRelativeTo(null);// centra la ventana en la pantalla
		setVisible(true);// visualiza la ventana
	}
	
	public String getEstadoAtender() {
		if(comboBox.toString() == "Activo") {
			return "true";
		}else {return "false";
			}
	}
}
