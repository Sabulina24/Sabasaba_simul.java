package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TryNotToSleep extends JPanel{
	
	public static boolean isWorked = false;
	
	private static final long serialVersionUID = 1L;

	public TryNotToSleep() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(getClass().getClassLoader().getResource("\uBCBC\uB77D\uCE58\uAE30\uC124\uBA85.PNG")));
		lblNewLabel.setBounds(0, 0, 1280, 720);
		add(lblNewLabel);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setVisible(false);
				isWorked = true;
			}
		});
		btnNewButton.setIcon(new ImageIcon(getClass().getClassLoader().getResource("\uB2E4\uC74C.PNG")));
		btnNewButton.setBounds(920, 516, 171, 84);
		add(btnNewButton);
	}
}
