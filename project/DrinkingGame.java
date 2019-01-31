package project;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

public class DrinkingGame extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public static boolean isWorked = false;
	public static int n = 0;
	
	public DrinkingGame() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(DrinkingGame.class.getResource("../images/º≥∏Ì.png")));
		lblNewLabel.setBounds(0, 0, 1280, 720);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				btnNewButton.setVisible(false);
				lblNewLabel.setVisible(false);
				
				screen();
			}
		});
		btnNewButton.setIcon(new ImageIcon(DrinkingGame.class.getResource("../images/¥Ÿ¿Ω.PNG")));
		btnNewButton.setBounds(997, 544, 147, 68);
		add(btnNewButton);
	
	}
	
	
	public void screen()
	{
		JLabel lbla = new JLabel("\uAD50\uC218A");
		lbla.setIcon(new ImageIcon(screen1.class.getResource("../images/choice_A.png")));
		lbla.setHorizontalAlignment(SwingConstants.CENTER);
		lbla.setBounds(63, 227, 275, 266);
		add(lbla);
		
		JLabel lblb = new JLabel("\uAD50\uC218B");
		lblb.setIcon(new ImageIcon(screen1.class.getResource("../images/choice_B.png")));
		lblb.setHorizontalAlignment(SwingConstants.CENTER);
		lblb.setBounds(463, 227, 275, 266);
		add(lblb);
		
		JLabel lblc = new JLabel("\uAD50\uC218C");
		lblc.setIcon(new ImageIcon(screen1.class.getResource("../images/choice_C.png")));
		lblc.setHorizontalAlignment(SwingConstants.CENTER);
		lblc.setBounds(828, 239, 275, 266);
		add(lblc);
		
		JLabel label = new JLabel("\uAD50\uC218\uC120\uD0DD");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(321, 100, 553, 93);
		label.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.PLAIN, 40));
		add(label);
		
		JButton btnNewButton = new JButton("A");
		JButton btnB = new JButton("B");
		JButton btnC = new JButton("C");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setVisible(false);
				n = 1;
				isWorked = true;
			}
				
		});
		btnNewButton.setBounds(119, 528, 160, 48);
		add(btnNewButton);
		
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
				setVisible(false);
				n = 2;
				isWorked = true;
			}
		});
		btnB.setBounds(521, 528, 160, 48);
		add(btnB);
		
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				n = 3;
				isWorked = true;
			}
		});
		btnC.setBounds(905, 528, 160, 48);
		add(btnC);
		
		
	}
	
	
}