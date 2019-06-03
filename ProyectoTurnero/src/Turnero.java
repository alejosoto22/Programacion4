import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Turnero extends JFrame {

	private JPanel contentPane;
	private JButton btnTurno;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Turnero frame = new Turnero();
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
	public Turnero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			btnTurno = new JButton("TURNO");
			btnTurno.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
				}
			});
			btnTurno.setBounds(172, 11, 89, 23);
			contentPane.add(btnTurno);
		}
		{
			textArea = new JTextArea();
			textArea.setBounds(10, 79, 414, 172);
			contentPane.add(textArea);
		}
	}

}
