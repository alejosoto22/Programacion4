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

public class VistaAsesores extends JFrame implements InterfazVista{

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtIdentificacin;
	private JTextField txtEstado;
	Asesores listaAsesores = new Asesores();
	String nombreAsesor;
	/**
	 * Launch the application.
	 */
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
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listaAsesores.crearAsesor(txtNombre.getText(), Integer.parseInt(txtIdentificacin.getText()), Boolean.parseBoolean(txtEstado.getText()));
				System.out.println("Actualmente la lista tiene " + listaAsesores.getTamaņoAsesor() + " asesores.");
			}
		});
		btnRegistrar.setBounds(169, 194, 89, 23);
		contentPane.add(btnRegistrar);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(195, 72, 89, 20);
		contentPane.add(txtNombre);
		
		txtIdentificacin = new JTextField();
		txtIdentificacin.setColumns(10);
		txtIdentificacin.setBounds(195, 103, 89, 20);
		contentPane.add(txtIdentificacin);
		
		txtEstado = new JTextField();
		txtEstado.setColumns(10);
		txtEstado.setBounds(195, 134, 89, 20);
		contentPane.add(txtEstado);
		
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
	}

	public void setControlador(Controlador controlAsesor) {
		// TODO Auto-generated method stub
				
	}

	public void arranca() {
		// TODO Auto-generated method stub
		
	}

	public String getNombreAsesor() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getIdAsesor() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean getEstadoAsesor() {
		// TODO Auto-generated method stub
		return false;
	}

	public void escribeAsesor(String s) {
		// TODO Auto-generated method stub
		
	}
	

}
