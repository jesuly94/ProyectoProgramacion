package interfaces;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import bbdd.Conexion;

public class Principal extends JFrame {

	private JFrame contentPane;

	String user;
	String password;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conexion.Conectar();
					new Principal();
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
		contentPane = new JFrame();
		contentPane.setBounds(100, 100, 589, 443);
		contentPane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.getContentPane().setLayout(null);
		contentPane.setVisible(true);
		contentPane.setResizable(false);
		contentPane.setTitle("Crypto Converter V2");
		contentPane.setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/imagenes/change icon.png")));
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		// Aqui se crea el panel Frame principal donde vamos a meter el panel con la
		// accion de empezar el programa.
		
		//creamos las variables para los campos 
		TextField userfield = new TextField();

		user = userfield.getText();
		
		JPasswordField passwordfield = new JPasswordField();
		
		password = passwordfield.getText();

		JLabel lblNewLabel_1_1_1 = new JLabel("CONTRASE\u00D1A");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Roboto", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBackground(SystemColor.activeCaption);
		lblNewLabel_1_1_1.setBounds(118, 181, 90, 28);
		contentPane.getContentPane().add(lblNewLabel_1_1_1);

		// LIBRERIA PARA VER BIEN IMG
		// rsscalelabel.RSScaleLabel.setScaleLabel(fondo, "/imagenes/tothemoon.jpg");

		// FIN LIBRERIA
		
		
		
		//aqui creamos los campos para recoger usuario y contraseña y aqui le metmos la funcion de login para que cuando le demos al boton logee
		
		JLabel lblNewLabel_1_1 = new JLabel("USER");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Roboto", Font.BOLD, 12));
		lblNewLabel_1_1.setBackground(SystemColor.activeCaption);
		lblNewLabel_1_1.setBounds(118, 119, 90, 28);
		contentPane.getContentPane().add(lblNewLabel_1_1);
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login(userfield, passwordfield, contentPane);
			}
		});
		btnNewButton.setSelectedIcon(new ImageIcon(Principal.class.getResource("/imagenes/converter icon.png"))); // aqui
																													// asignamos
																													// a
																													// las
																													// etiquetas
																													// las
																													// imagenes
																													// que
																													// queremos.
		btnNewButton.setBackground(SystemColor.activeCaption);
		btnNewButton.setIcon(null);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(242, 249, 103, 33);
		contentPane.getContentPane().add(btnNewButton);
		this.setLocationRelativeTo(null);

		
		

		userfield.setFont(new Font("Roboto", Font.PLAIN, 12));
		userfield.setBounds(214, 119, 162, 28);
		contentPane.getContentPane().add(userfield);

				
		
		passwordfield.setFont(new Font("Roboto", Font.PLAIN, 12));
		passwordfield.setBounds(214, 181, 162, 28);
		contentPane.getContentPane().add(passwordfield);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/tothemoon.jpg")));
		lblNewLabel.setLabelFor(contentPane);
		lblNewLabel.setBounds(0, 0, 583, 415);
		contentPane.getContentPane().add(lblNewLabel);

	}
	
	//funcion para logearse y decir que si no es correcta da error
	private void login(TextField user, JPasswordField password, JFrame cont) {
		
		
		
		try {
			String username = user.getText();
			String passwd = password.getText();
			String query = "SELECT USER,PASSWORD FROM BILLETERA WHERE USER='"+username+ "' AND PASSWORD='" + passwd+"'";
			Conexion.EjecutarSentencia(query);
			
			if(Conexion.EjecutarSentencia(query).next()) {
				cont.setVisible(false);
				new Converter();
			}else{
				JOptionPane.showMessageDialog(null, "Contraseña Erronea", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}




}

// Principal() --> es el frame principal donde empezariamos a editar
//Panel --> seria el panel donde estarian los botones para login y crear usuario