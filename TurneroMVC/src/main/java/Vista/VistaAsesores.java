package Vista;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;
import Modelo.Asesores;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;

public class VistaAsesores extends JFrame implements InterfazVista{

	private JPanel contentPane;
	private JTextField txtNombreAsesor;
	private JTextField txtIdentificacionAsesor;
	private JButton btnRegistrarAsesor;
	JComboBox comboBox;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaAsesores frame = new VistaAsesores();
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
	public VistaAsesores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnRegistrarAsesor = new JButton("RegistrarAsesor");

		btnRegistrarAsesor.setBounds(169, 194, 109, 23);
		contentPane.add(btnRegistrarAsesor);
		
		txtNombreAsesor = new JTextField();
		txtNombreAsesor.setColumns(10);
		txtNombreAsesor.setBounds(195, 72, 89, 20);
		contentPane.add(txtNombreAsesor);
		
		txtIdentificacionAsesor = new JTextField();
		txtIdentificacionAsesor.setColumns(10);
		txtIdentificacionAsesor.setBounds(195, 103, 89, 20);
		contentPane.add(txtIdentificacionAsesor);
		
		JLabel lblRegistrarAsesor = new JLabel("Registrar Asesor");
		lblRegistrarAsesor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRegistrarAsesor.setBounds(169, 26, 98, 17);
		contentPane.add(lblRegistrarAsesor);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(94, 72, 75, 17);
		contentPane.add(lblNombre);
		
		JLabel lblIdentificacin = new JLabel("Identificaci\u00F3n:");
		lblIdentificacin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdentificacin.setBounds(94, 106, 84, 17);
		contentPane.add(lblIdentificacin);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEstado.setBounds(94, 137, 75, 17);
		contentPane.add(lblEstado);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.setBounds(195, 134, 59, 20);
		contentPane.add(comboBox);
		comboBox.addItem("true");
		comboBox.addItem("false");
		
	
	}

	@Override
	public void setControlador(Controlador control) {
		btnRegistrarAsesor.addActionListener(control);
		// TODO Auto-generated method stub
				
	}

	@Override
	public void arranca() {
		
		pack();// coloca los componentes
		setLocationRelativeTo(null);// centra la ventana en la pantalla
		setVisible(true);// visualiza la ventana
	
	}

	@Override
	public String getNombreAsesor() {
		
		return txtNombreAsesor.getText();
		
	}

	@Override
	public int getIdAsesor() {
		
		return Integer.parseInt(txtIdentificacionAsesor.getText());
	}

	@Override
	public boolean getEstadoAsesor() {
		
		return Boolean.parseBoolean(comboBox.getSelectedItem().toString());
		
	}

	@Override
	public String getNombreServicio() {
		// TODO Auto-generated method stub
		return null;
	}
}
