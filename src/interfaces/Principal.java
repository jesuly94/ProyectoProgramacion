package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Label;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import interfaces.Converter;
import rsscalelabel.RSScaleLabel;
import java.awt.TextField;
public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setResizable(false);
		setTitle("Crypto Converter V2");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/imagenes/change icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 443);
		contentPane = new JPanel(); 
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	// Aqui se crea el panel Frame principal donde vamos a meter el panel con la accion de empezar el programa.	
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 583, 415);
		contentPane.add(panel);
		panel.setLayout(null);
		this.setLocationRelativeTo(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("CONTRASE\u00D1A");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Roboto", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBackground(SystemColor.activeCaption);
		lblNewLabel_1_1_1.setBounds(166, 187, 77, 22);
		panel.add(lblNewLabel_1_1_1);
		
		//LIBRERIA PARA VER BIEN IMG
		//rsscalelabel.RSScaleLabel.setScaleLabel(fondo, "/imagenes/tothemoon.jpg");
		
		//FIN LIBRERIA
		
		JLabel lblNewLabel_1_1 = new JLabel("USUARIO");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Roboto", Font.BOLD, 12));
		lblNewLabel_1_1.setBackground(SystemColor.activeCaption);
		lblNewLabel_1_1.setBounds(166, 125, 77, 22);
		panel.add(lblNewLabel_1_1);
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				Converter a = new Converter();
				a.setLocationRelativeTo(null);
				a.setVisible(true);
				dispose(); // con esta funcion cerraria la ventana principal y deja abierta solo la de converter.
			}
		});
		btnNewButton.setSelectedIcon(new ImageIcon(Principal.class.getResource("/imagenes/converter icon.png"))); // aqui asignamos a las etiquetas las imagenes que queremos.
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setIcon(null);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(250, 252, 103, 33);
		panel.add(btnNewButton);
		this.setLocationRelativeTo(null);
		
		TextField textField_4 = new TextField();
		textField_4.setFont(new Font("Calibri", Font.BOLD, 14));
		textField_4.setBounds(265, 119, 126, 28);
		panel.add(textField_4);
		
		TextField textField_4_1 = new TextField();
		textField_4_1.setFont(new Font("Calibri", Font.BOLD, 14));
		textField_4_1.setBounds(265, 187, 126, 28);
		panel.add(textField_4_1);
		//rsscalelabel.RSScaleLabel.setScaleLabel(fondo, "/imagenes/tothemoon.jpg");
	}
}
// Principal() --> es el frame principal donde empezariamos a editar
//Panel --> seria el panel donde estaria el boton y donde hemos puesto la imagen para empezar el programa una vez demos click a Start.