package interfaces;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiVentana {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setBounds(100, 100, 589, 444);
		jf.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 573, 419);
		jf.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Press me!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola Clase!");
			}
		});
		btnNewButton.setBounds(181, 149, 234, 109);
		panel.add(btnNewButton);
		jf.setVisible(true);
		
		
		
	}
}
