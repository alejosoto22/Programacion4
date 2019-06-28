package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Vista extends JFrame {

	private JPanel contentPane;
	private JTextField textNombreServicio;
	private JButton btnCrearServicio;
	JPanel panel1, panel2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
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
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(387, 365);
	//	setTitle
		setBounds(100, 100, 448, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Crear Servicio");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(152, 20, 98, 17);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Nombre:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(105, 45, 75, 17);
		contentPane.add(label_1);
		
		textNombreServicio = new JTextField();
		textNombreServicio.setColumns(10);
		textNombreServicio.setBounds(171, 45, 116, 20);
		contentPane.add(textNombreServicio);
		
		btnCrearServicio = new JButton("Crear Servicio");
		btnCrearServicio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCrearServicio.setBounds(152, 76, 109, 23);
		contentPane.add(btnCrearServicio);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 110, 412, 177);
		contentPane.add(textArea);
		
//		panel1 = new JPanel();
//		panel1.setBackground(null);
//		panel1.setBounds(x, y, width, height);
		
	//	private voidiniciarComponentes() {
			
	//	}
	}
}
