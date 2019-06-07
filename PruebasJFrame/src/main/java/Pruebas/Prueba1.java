package Pruebas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Prueba1 extends JFrame {

	private JPanel contentPane;
	private JButton btnMostrar;
	private JTextArea textArea;
	private JLabel lblIngreseNombre;
	private JLabel lblIngreseId;
	private JTextField txtNombre;
	private JTextField txtId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba1 frame = new Prueba1();
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
	public Prueba1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			btnMostrar = new JButton("Mostrar");
			btnMostrar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
		// 1.			String mensaje = "Mi primer impresión";
		// 1.			textArea.append(mensaje + "\n");
					String nombre = txtNombre.getText();
					int id = Integer.parseInt(txtId.getText());
					textArea.append("El nombre es: " + nombre + "\n" + " y su identificación es " + id + "." + "\n");
				}
			});
			btnMostrar.setBounds(306, 33, 89, 23);
			contentPane.add(btnMostrar);
		}
		{
			textArea = new JTextArea();
			textArea.setBounds(36, 158, 359, 76);
			contentPane.add(textArea);
		}
		{
			lblIngreseNombre = new JLabel("Ingrese Nombre:");
			lblIngreseNombre.setBounds(23, 37, 96, 14);
			contentPane.add(lblIngreseNombre);
		}
		{
			lblIngreseId = new JLabel("Ingrese Id:");
			lblIngreseId.setBounds(23, 62, 81, 14);
			contentPane.add(lblIngreseId);
		}
		{
			txtNombre = new JTextField();
			txtNombre.setBounds(129, 34, 129, 20);
			contentPane.add(txtNombre);
			txtNombre.setColumns(10);
		}
		{
			txtId = new JTextField();
			txtId.setBounds(129, 59, 69, 20);
			contentPane.add(txtId);
			txtId.setColumns(10);
		}
	}

}
