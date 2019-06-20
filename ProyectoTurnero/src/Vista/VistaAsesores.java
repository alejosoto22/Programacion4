package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class VistaAsesores extends JFrame implements InterfazVista{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

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
		
		JButton btnCrearAsesor = new JButton("Crear Asesor");
		btnCrearAsesor.setBounds(174, 186, 95, 23);
		contentPane.add(btnCrearAsesor);
		
		JLabel lblRegistrarAsesor = new JLabel("REGISTRAR ASESOR");
		lblRegistrarAsesor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRegistrarAsesor.setBounds(157, 29, 112, 15);
		contentPane.add(lblRegistrarAsesor);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre.setBounds(86, 76, 47, 15);
		contentPane.add(lblNombre);
		
		JLabel lblIdentificacin = new JLabel("Identificaci\u00F3n:");
		lblIdentificacin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIdentificacin.setBounds(86, 102, 76, 15);
		contentPane.add(lblIdentificacin);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEstado.setBounds(86, 128, 47, 15);
		contentPane.add(lblEstado);
		
		textField = new JTextField();
		textField.setBounds(174, 74, 128, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(174, 100, 128, 20);
		contentPane.add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(174, 126, 47, 20);
		contentPane.add(comboBox);
	}

	@Override
	public void setControlador(Controlador controlAsesor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void arranca() {
		// TODO Auto-generated method stub
		
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
	public void escribeAsesor(String s) {
		// TODO Auto-generated method stub
		
	}
}
