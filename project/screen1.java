package project;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class screen1 extends JPanel{

	private static final long serialVersionUID = 1L;

	public screen1() {
		setLayout(null);
		
		JLabel label = new JLabel("\uAD50\uC218\uC120\uD0DD");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(321, 100, 553, 93);
		label.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
		add(label);
		
		JButton btnNewButton = new JButton("A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainFrame f=new MainFrame();
				
				f.getContentPane().add(new profA());
				f.setVisible(true);
			}
				
		});
		btnNewButton.setBounds(119, 528, 160, 48);
		add(btnNewButton);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainFrame f=new MainFrame();
				
				f.getContentPane().add(new profB());
				f.setVisible(true);
			}
		});
		btnB.setBounds(521, 528, 160, 48);
		add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainFrame f=new MainFrame();
				
				f.getContentPane().add(new profC());
				f.setVisible(true);
			}
		});
		btnC.setBounds(905, 528, 160, 48);
		add(btnC);
		
		JLabel lbla = new JLabel("\uAD50\uC218A");
		lbla.setIcon(new ImageIcon(getClass().getClassLoader().getResource("choice_A.png")));
		lbla.setHorizontalAlignment(SwingConstants.CENTER);
		lbla.setBounds(63, 227, 275, 266);
		add(lbla);
		
		JLabel lblb = new JLabel("\uAD50\uC218B");
		lblb.setIcon(new ImageIcon(getClass().getClassLoader().getResource("choice_B.png")));
		lblb.setHorizontalAlignment(SwingConstants.CENTER);
		lblb.setBounds(463, 227, 275, 266);
		add(lblb);
		
		JLabel lblc = new JLabel("\uAD50\uC218C");
		lblc.setIcon(new ImageIcon(getClass().getClassLoader().getResource("choice_C.png")));
		lblc.setHorizontalAlignment(SwingConstants.CENTER);
		lblc.setBounds(828, 239, 275, 266);
		add(lblc);

	}
}
