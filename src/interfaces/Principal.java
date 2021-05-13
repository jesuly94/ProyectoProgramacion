package interfaces;
import bbdd.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import beans.*;
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
import java.awt.TextField;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.TextListener;
import java.awt.event.TextEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conexion.Conectar();
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
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 583, 415);
		contentPane.add(panel);
		panel.setLayout(null);
		this.setLocationRelativeTo(null);
		
		
		JButton btnRegister = new JButton("Sign Up");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnRegister.setForeground(Color.BLACK);
		btnRegister.setBackground(SystemColor.activeCaption);
		btnRegister.setBounds(242, 308, 103, 33);
		panel.add(btnRegister);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("CONTRASE\u00D1A");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Roboto", Font.BOLD, 12));
		lblNewLabel_1_1_1.setBackground(SystemColor.activeCaption);
		lblNewLabel_1_1_1.setBounds(118, 181, 90, 28);
		panel.add(lblNewLabel_1_1_1);
		
		//LIBRERIA PARA VER BIEN IMG
		//rsscalelabel.RSScaleLabel.setScaleLabel(fondo, "/imagenes/tothemoon.jpg");
		
		//FIN LIBRERIA
		
		JLabel lblNewLabel_1_1 = new JLabel("USER");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Roboto", Font.BOLD, 12));
		lblNewLabel_1_1.setBackground(SystemColor.activeCaption);
		lblNewLabel_1_1.setBounds(118, 119, 90, 28);
		panel.add(lblNewLabel_1_1);
		JButton btnNewButton = new JButton("Sign In");
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
		btnNewButton.setBounds(242, 249, 103, 33);
		panel.add(btnNewButton);
		this.setLocationRelativeTo(null);
		
		TextField textField_4 = new TextField();
		textField_4.addTextListener(new TextListener() {
			public void textValueChanged(TextEvent e) {
				String user = textField_4.getText();
				
			}
		});
		textField_4.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_4.setBounds(214, 119, 162, 28);
		panel.add(textField_4);
		
		TextField textField_4_1 = new TextField();
		textField_4_1.addTextListener(new TextListener() {
			public void textValueChanged(TextEvent e) {
				String password = textField_4_1.getText(); 
			}
		});
		textField_4_1.setFont(new Font("Roboto", Font.PLAIN, 12));
		textField_4_1.setBounds(214, 181, 162, 28);
		panel.add(textField_4_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/imagenes/tothemoon.jpg")));
		lblNewLabel.setLabelFor(panel);
		lblNewLabel.setBounds(0, 0, 583, 415);
		panel.add(lblNewLabel);
		
	
	}
}
// Principal() --> es el frame principal donde empezariamos a editar
//Panel --> seria el panel donde estaria el boton y donde hemos puesto la imagen para empezar el programa una vez demos click a Start.