package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JProgressBar;
import javax.swing.JFormattedTextField;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Font;
import java.awt.event.TextListener;
import java.awt.event.TextEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Converter extends JFrame {

	private JPanel contentPane;
	Label label_2;
	Label label_1;
	Label label;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the frame.
	 */
	// Esta el la interfaz del convertidor, donde se cogerian los datos de la clase calculadora y se añaden los precios de las monedas actualizados
	public Converter() {
		setResizable(false);
		setTitle("Crypto Converter V1");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Converter.class.getResource("/imagenes/change icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	//como en la interfaz anterior ya nos crearia el frame principal donde añadimos todo el contenido.	
		JLabel lblNewLabel_4 = new JLabel("Cantidad");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER); //Etiqueta para saber la cantidad a convertir
		lblNewLabel_4.setBounds(376, 292, 60, 28);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel(""); /* !!! Añadir imagen por otro metodo !!! */
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(Converter.class.getResource("/imagenes/bitcoin icon.png")));//etiqueta donde añadimos imagenes de la moneda
		lblNewLabel.setBounds(10, 38, 126, 106);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Converter.class.getResource("/imagenes/dogecoin.png")));//etiqueta donde añadimos imagenes de la moneda
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 155, 126, 106);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon(Converter.class.getResource("/imagenes/ethereum icon.png")));//etiqueta donde añadimos imagenes de la moneda
		lblNewLabel_2.setBounds(10, 272, 126, 106);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setIcon(new ImageIcon(Converter.class.getResource("/imagenes/arrow.png")));//etiqueta para decir donde se va a convertir
		lblNewLabel_3.setBounds(257, 38, 109, 106);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(Converter.class.getResource("/imagenes/arrow.png")));//etiqueta para decir donde se va a convertir
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBounds(257, 155, 109, 106);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setIcon(new ImageIcon(Converter.class.getResource("/imagenes/arrow.png")));//etiqueta para decir donde se va a convertir
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setBounds(257, 272, 109, 106);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("Precio");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);// Aqui iria añadida la clase calculadora para saber el precio de la moneda y actualizarse automaticamente
		lblNewLabel_4_1.setBounds(376, 331, 60, 28);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Cantidad");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER); //Etiqueta para saber la cantidad a convertir
		lblNewLabel_4_2.setBounds(376, 55, 60, 28);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Cantidad");
		lblNewLabel_4_3.setHorizontalAlignment(SwingConstants.CENTER); //Etiqueta para saber la cantidad a convertir
		lblNewLabel_4_3.setBounds(376, 170, 60, 28);
		contentPane.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Precio");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER); // Aqui iria añadida la clase calculadora para saber el precio de la moneda y actualizarse automaticamente
		lblNewLabel_4_1_1.setBounds(376, 209, 60, 28);
		contentPane.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Precio");
		lblNewLabel_4_1_2.setHorizontalAlignment(SwingConstants.CENTER);// Aqui iria añadida la clase calculadora para saber el precio de la moneda y actualizarse automaticamente
		lblNewLabel_4_1_2.setBounds(376, 94, 60, 28);
		contentPane.add(lblNewLabel_4_1_2);
		
		TextField textField = new TextField();
		textField.addTextListener(new TextListener() {
			public void textValueChanged(TextEvent e) {
				String texto= textField.getText();
				if(!isDouble(texto)) return;
				double jb = Double.parseDouble(texto);
				label.setText(jb*1550+" ");
			}
		});
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != '.')) {
			         e.consume();  // ignore event
			     }
			}
		});
		
		textField.setFont(new Font("Calibri", Font.BOLD, 14));
		textField.setBounds(437, 292, 126, 28);
		contentPane.add(textField);
		
		TextField textField_2 = new TextField();
		textField_2.addTextListener(new TextListener() {
			public void textValueChanged(TextEvent e) {
				String texto= textField_2.getText();
				if(!isDouble(texto)) return;
				double jb = Double.parseDouble(texto);
				label_1.setText(jb*0.05+" ");
			}
		});
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
			      if ( ((c < '0') || (c > '9')) && (c != '.')) {
			         e.consume();  // ignore event
			     }
			}
		});
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.requestFocus();
			}
		});
		textField_2.setFont(new Font("Calibri", Font.BOLD, 14));
		textField_2.setBounds(442, 170, 126, 28);
		contentPane.add(textField_2);
		
		TextField textField_4 = new TextField();
		textField_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.requestFocus();
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
				label_2.setText(db*49106+"");
			}
		});
		textField_4.setFont(new Font("Calibri", Font.BOLD, 14));// en los textfield es donde pondriamos la cantidad de monedas para su conversion
		textField_4.setBounds(442, 55, 126, 28);
		contentPane.add(textField_4);
		
		label = new Label("");
		label.setBounds(437, 331, 126, 28);
		contentPane.add(label);
		
		label_1 = new Label("");
		label_1.setBounds(442, 209, 126, 28);
		contentPane.add(label_1);
		
		label_2 = new Label("");
		label_2.setBounds(442, 94, 126, 28);
		contentPane.add(label_2);
		
		Label label_3 = new Label("$49,106");
		label_3.setFont(new Font("Calibri", Font.BOLD, 14)); // Aqui en los result es donde iria la api conectada para indicarnos el precio de la moneda
		label_3.setAlignment(Label.CENTER);					 //tambien podriamos añadirlos manualmente para poder hacer las conversiones
		label_3.setBounds(142, 76, 109, 28);
		contentPane.add(label_3);
		
		Label label_3_1 = new Label("$0,05");
		label_3_1.setFont(new Font("Calibri", Font.BOLD, 14));
		label_3_1.setAlignment(Label.CENTER);
		label_3_1.setBounds(142, 193, 109, 28);
		contentPane.add(label_3_1);
		
		Label label_3_2 = new Label("$1,550");
		label_3_2.setFont(new Font("Calibri", Font.BOLD, 14));
		label_3_2.setAlignment(Label.CENTER);
		label_3_2.setBounds(142, 313, 109, 28);
		contentPane.add(label_3_2);
		
		JLabel FONDO = new JLabel("");
		FONDO.setHorizontalAlignment(SwingConstants.CENTER);
		FONDO.setIcon(new ImageIcon(Converter.class.getResource("/imagenes/tothemoon.jpg")));
		FONDO.setBounds(0, 0, 583, 415);
		contentPane.add(FONDO);
	}
	
	 boolean isDouble(String str) {
	        try {
	            Double.parseDouble(str);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	}
}
