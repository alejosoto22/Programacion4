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
import javax.swing.JButton;

public class VistaServicios extends JFrame implements InterfazVista{

	private JPanel contentPane;
	private JTextField textNombreServicio;
	JButton btnCrearServicio;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaServicios frame = new VistaServicios();
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
	public VistaServicios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCrearServicio = new JLabel("Crear Servicio");
		lblCrearServicio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCrearServicio.setBounds(173, 32, 98, 17);
		contentPane.add(lblCrearServicio);
		
		JLabel labelNombre = new JLabel("Nombre:");
		labelNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelNombre.setBounds(107, 98, 75, 17);
		contentPane.add(labelNombre);
		
		textNombreServicio = new JTextField();
		textNombreServicio.setColumns(10);
		textNombreServicio.setBounds(208, 98, 89, 20);
		contentPane.add(textNombreServicio);
		
		btnCrearServicio = new JButton("Crear Servicio");
		btnCrearServicio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCrearServicio.setBounds(173, 174, 109, 23);
		contentPane.add(btnCrearServicio);
	}

	@Override
	public void setControlador(Controlador control) {
		btnCrearServicio.addActionListener(control);
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getIdAsesor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getEstadoAsesor() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getNombreServicio() {
		// TODO Auto-generated method stub
		return textNombreServicio.getText();
	}
}
