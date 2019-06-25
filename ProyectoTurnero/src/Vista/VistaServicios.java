package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.ControladorAsesores;
import Controlador.ControladorServicios;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaServicios extends JFrame implements InterfazVistaServicios{

	private JPanel contentPane;
	private JTextField textNombreServicio;
	private JButton btnCrearServicio;
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
		setBounds(100, 100, 348, 272);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("REGISTRAR SERVICIOS");
		label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label.setBounds(102, 48, 127, 15);
		contentPane.add(label);
		
		JLabel labelNombre = new JLabel("Nombre:");
		labelNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelNombre.setBounds(66, 102, 47, 15);
		contentPane.add(labelNombre);
		
		textNombreServicio = new JTextField();
		textNombreServicio.setColumns(10);
		textNombreServicio.setBounds(123, 100, 128, 20);
		contentPane.add(textNombreServicio);
		
		btnCrearServicio = new JButton("CREAR SERVICIO");
		btnCrearServicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCrearServicio.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCrearServicio.setBounds(114, 153, 115, 21);
		contentPane.add(btnCrearServicio);
	}
	
	public void setControladorServicio(ControladorServicios controlServicio) {
		btnCrearServicio.addActionListener(controlServicio);
		
	}
	
	public void arranca() {
		pack();// coloca los componentes
		setLocationRelativeTo(null);// centra la ventana en la pantalla
		setVisible(true);// visualiza la ventana
		
	}
	
	public String getNombreServicio() {
		// TODO Auto-generated method stub
		return textNombreServicio.getText();
	}
	


}
