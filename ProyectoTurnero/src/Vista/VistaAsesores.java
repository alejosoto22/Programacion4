package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.ControladorAsesores;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Dimension;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaAsesores extends JFrame implements InterfazVista{

	private JPanel contentPane;
	private JTextField textNombreAsesor;
	private JTextField textIdAsesor;
	private JTextField textEstadoAsesor;
	private JButton btnCrearAsesor;
	private JTextField textNombreServicio;
	private JButton btnCrearServicio;
	
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
		setFont(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 259);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnCrearAsesor = new JButton("CREAR ASESOR");
		btnCrearAsesor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCrearAsesor.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCrearAsesor.setBounds(92, 148, 109, 23);
		contentPane.add(btnCrearAsesor);
		
		JLabel lblRegistrarAsesor = new JLabel("REGISTRAR ASESOR");
		lblRegistrarAsesor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRegistrarAsesor.setBounds(104, 31, 112, 15);
		contentPane.add(lblRegistrarAsesor);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre.setBounds(45, 70, 47, 15);
		contentPane.add(lblNombre);
		
		JLabel lblIdentificacion = new JLabel("Identificaci\u00F3n:");
		lblIdentificacion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIdentificacion.setBounds(45, 96, 76, 15);
		contentPane.add(lblIdentificacion);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEstado.setBounds(45, 122, 47, 15);
		contentPane.add(lblEstado);
		
		textNombreAsesor = new JTextField();
		textNombreAsesor.setBounds(133, 68, 128, 20);
		contentPane.add(textNombreAsesor);
		textNombreAsesor.setColumns(10);
		
		textIdAsesor = new JTextField();
		textIdAsesor.setColumns(10);
		textIdAsesor.setBounds(133, 94, 128, 20);
		contentPane.add(textIdAsesor);
		
		textEstadoAsesor = new JTextField();
		textEstadoAsesor.setColumns(10);
		textEstadoAsesor.setBounds(133, 120, 128, 20);
		contentPane.add(textEstadoAsesor);
		
		JLabel label = new JLabel("REGISTRAR SERVICIOS");
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(409, 31, 127, 15);
		contentPane.add(label);
		
		textNombreServicio = new JTextField();
		textNombreServicio.setColumns(10);
		textNombreServicio.setBounds(430, 83, 128, 20);
		contentPane.add(textNombreServicio);
		
		JLabel label_1 = new JLabel("Nombre:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_1.setBounds(373, 85, 47, 15);
		contentPane.add(label_1);
		
		btnCrearServicio = new JButton("CREAR SERVICIO");
		btnCrearServicio.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCrearServicio.setBounds(421, 136, 115, 21);
		contentPane.add(btnCrearServicio);
	}
	
//	public void setControlador(Controlador controlAsesor) {
//		btnCrearAsesor.addActionListener(controlAsesor);
				
//	}
	
	public void setControladorAsesor(ControladorAsesores controlAsesor) {
		btnCrearAsesor.addActionListener(controlAsesor);
		
	}
	
	public void setControladorServicio(ControladorAsesores controlServicio) {
		btnCrearServicio.addActionListener(controlServicio);
		
	}
		
	public void arranca() {
		pack();// coloca los componentes
		setLocationRelativeTo(null);// centra la ventana en la pantalla
		setVisible(true);// visualiza la ventana
				
	}
	
	public String getNombreAsesor() {
		// TODO Auto-generated method stub
		return textNombreAsesor.getText();
	}
	
	public int getIdAsesor() {
		// TODO Auto-generated method stub
		return Integer.parseInt(textIdAsesor.getText());
	}
	
	public boolean getEstadoAsesor() {
		// TODO Auto-generated method stub
		return Boolean.parseBoolean(textEstadoAsesor.getText());
	}

	
	public String getNombreServicio() {
		// TODO Auto-generated method stub
		return textNombreServicio.getText();
	}

	
}
