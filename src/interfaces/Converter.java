package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bbdd.Conexion;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JProgressBar;
import javax.swing.JFormattedTextField;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Font;
import java.awt.event.TextListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.TextEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class Converter extends JFrame {

	private JFrame contentPane;
	Label label_2;
	private JTextField nombreusuario;
	private JTextField doge;
	private JTextField ethereum;
	private JTextField btc;
	private JTextField bnb;
	private JTextField cardano;
	/**
	 * Launch the application.
	 * 
	 * 
	 * //public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Converter frame = new Converter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	 */
	
	
	

	/**
	 * Create the frame.
	 */
	// Esta el la interfaz del convertidor, donde se cogerian los datos de la clase calculadora y se añaden los precios de las monedas actualizados
	
	
	public Converter() {
		inicialize();
	}
	
	//iniciamos la interfaz una ve nos logeamos
	public void inicialize() {
		contentPane = new JFrame();
		contentPane.setBounds(100, 100, 589, 443);
		contentPane.repaint();
		contentPane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.getContentPane().setLayout(null);
		contentPane.setVisible(true);
		contentPane.setResizable(false);
		contentPane.setTitle("Crypto Converter V2");
		contentPane.setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/imagenes/change icon.png")));
		
		JLabel dogi = new JLabel("");
		dogi.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
				try {
					String query = "SELECT DOGE FROM BILLETERA WHERE USER='jesus'";
					Conexion.EjecutarSentencia(query).next();
					doge.setText(query);
					} catch (Exception f) {
					System.out.println(f.getMessage());
				}
			}
		});
		dogi.setBounds(94, 146, 110, 28);
		contentPane.getContentPane().add(dogi);
		
		cardano = new JTextField();
		cardano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sentencia = "SELECT cardano FROM BILLETERA;";
				try {
					Conexion.EjecutarSentencia(sentencia).next();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		cardano.setHorizontalAlignment(SwingConstants.CENTER);									//aqui creamos las acciones para los botones
		cardano.setText("45");
		cardano.setEditable(false);
		cardano.setColumns(10);
		cardano.setBounds(376, 254, 109, 28);
		contentPane.getContentPane().add(cardano);
		
		bnb = new JTextField();
		bnb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sentencia = "SELECT bnb FROM BILLETERA;";
				try {
					Conexion.EjecutarSentencia(sentencia).next();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		bnb.setHorizontalAlignment(SwingConstants.CENTER);
		bnb.setText("0.4");
		bnb.setEditable(false);
		bnb.setColumns(10);
		bnb.setBounds(376, 139, 109, 28);
		contentPane.getContentPane().add(bnb);
		
		btc = new JTextField();
		btc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sentencia = "SELECT bitcoin FROM BILLETERA;";
				try {
					Conexion.EjecutarSentencia(sentencia).next();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btc.setText("0.005");
		btc.setHorizontalAlignment(SwingConstants.CENTER);
		btc.setEditable(false);
		btc.setColumns(10);
		btc.setBounds(95, 286, 109, 28);
		contentPane.getContentPane().add(btc);
		
		ethereum = new JTextField();
		ethereum.setText("0.3");
		ethereum.setHorizontalAlignment(SwingConstants.CENTER);
		ethereum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sentencia = "SELECT ethereum FROM BILLETERA;";							//recojemos las select para que nos muestre los resultados
				try {
					Conexion.EjecutarSentencia(sentencia).next();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		ethereum.setEditable(false);
		ethereum.setColumns(10);
		ethereum.setBounds(95, 199, 109, 28);
		contentPane.getContentPane().add(ethereum);
		
		doge = new JTextField();
		doge.setHorizontalAlignment(SwingConstants.CENTER);
		doge.setText("500");
		doge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sentencia = "SELECT DOGE FROM BILLETERA;";
				try {
					Conexion.EjecutarSentencia(sentencia).next();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		doge.setEditable(false);
		doge.setColumns(10);
		doge.setBounds(95, 116, 109, 28);
		contentPane.getContentPane().add(doge);
		
		nombreusuario = new JTextField();
		nombreusuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sentencia = "SELECT user FROM BILLETERA;";
				try {
					Conexion.EjecutarSentencia(sentencia).next();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		nombreusuario.setText("jesus");
		nombreusuario.setHorizontalAlignment(SwingConstants.CENTER);
		nombreusuario.setEditable(false);
		nombreusuario.setBounds(10, 42, 109, 28);
		contentPane.getContentPane().add(nombreusuario);
		nombreusuario.setColumns(10);
		//aqui ponemos las imagenes a cada label
		JLabel billetera = new JLabel("");
		billetera.setVerticalAlignment(SwingConstants.TOP);
		billetera.setIcon(new ImageIcon(Converter.class.getResource("/imagenes/billetera.png")));
		billetera.setBounds(386, -47, 263, 180);
		contentPane.getContentPane().add(billetera);
		
		JLabel imagendoge_1 = new JLabel("");
		imagendoge_1.setHorizontalAlignment(SwingConstants.CENTER);
		imagendoge_1.setIcon(new ImageIcon(Converter.class.getResource("/imagenes/binance.png")));
		imagendoge_1.setBounds(268, 116, 79, 72);
		contentPane.getContentPane().add(imagendoge_1);
		
		JLabel imagencardano = new JLabel("");
		imagencardano.setIcon(new ImageIcon(Converter.class.getResource("/imagenes/cardano.png")));
		imagencardano.setBounds(268, 235, 79, 72);
		contentPane.getContentPane().add(imagencardano);
		
		JLabel imagenbtc = new JLabel("");
		imagenbtc.setHorizontalAlignment(SwingConstants.CENTER);
		imagenbtc.setIcon(new ImageIcon(Converter.class.getResource("/imagenes/btc.png")));
		imagenbtc.setBounds(10, 262, 79, 72);
		contentPane.getContentPane().add(imagenbtc);
		
		JLabel imagenethereum = new JLabel("");
		imagenethereum.setHorizontalAlignment(SwingConstants.CENTER);
		imagenethereum.setIcon(new ImageIcon(Converter.class.getResource("/imagenes/ethereum.png")));
		imagenethereum.setBounds(10, 179, 79, 72);
		contentPane.getContentPane().add(imagenethereum);
		
		JLabel imagendoge = new JLabel("");
		imagendoge.setHorizontalAlignment(SwingConstants.CENTER);
		imagendoge.setIcon(new ImageIcon(Converter.class.getResource("/imagenes/doge.png")));
		imagendoge.setBounds(10, 95, 79, 72);
		contentPane.getContentPane().add(imagendoge);
		
		JLabel FONDO = new JLabel("");
		FONDO.setIcon(new ImageIcon(Converter.class.getResource("/imagenes/simple-gray-background.jpg")));
		FONDO.setBackground(Color.LIGHT_GRAY);
		FONDO.setHorizontalAlignment(SwingConstants.TRAILING);
		FONDO.setBounds(0, 0, 583, 415);
		contentPane.getContentPane().add(FONDO);
		
		JLabel lblNewLabel_4_2 = new JLabel("Cantidad");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER); //Etiqueta para saber la cantidad a convertir
		lblNewLabel_4_2.setBounds(376, 55, 60, 28);
		contentPane.getContentPane().add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Precio");
		lblNewLabel_4_1_2.setHorizontalAlignment(SwingConstants.CENTER);// Aqui iria añadida la clase calculadora para saber el precio de la moneda y actualizarse automaticamente
		lblNewLabel_4_1_2.setBounds(376, 94, 60, 28);
		contentPane.getContentPane().add(lblNewLabel_4_1_2);
		
		//esto esta oculto porque no tengo convertidor para pasar a dolares implementado
		TextField textField_4 = new TextField();
		textField_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != '.')) {
			         e.consume();  // ignore event
			     }
			}
		});
		textField_4.addTextListener(new TextListener() {
			public void textValueChanged(TextEvent e) {
				String text= textField_4.getText();
				if(!isDouble(text)) return;
				double db = Double.parseDouble(text);
				label_2.setText(db*5+"");
			}
		});
		textField_4.setFont(new Font("Calibri", Font.BOLD, 14));// en los textfield es donde pondriamos la cantidad de monedas para su conversion
		textField_4.setBounds(442, 55, 126, 28);
		contentPane.getContentPane().add(textField_4);
		
		label_2 = new Label("");
		label_2.setBounds(442, 94, 126, 28);
		contentPane.getContentPane().add(label_2);
	}
	//funcion para solo escribir numeros en ve de letras
	 boolean isDouble(String str) {
	        try {
	            Double.parseDouble(str);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	}
}
