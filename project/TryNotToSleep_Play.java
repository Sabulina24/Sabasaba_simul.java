package project;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import javax.swing.SwingConstants;


public class TryNotToSleep_Play extends JPanel implements ActionListener{

	public static boolean isWorked = false;
	
	private static final long serialVersionUID = 1L;
	
	public int n=0;
	Timer tm= new Timer(60, this);
	int vely=4,velt=1;
	int tiredMeter=0;
	
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.black);
		
		g.fillRect(0, SleepingAlgorithm.DrousyMeter-900, 1280, 900); //À­ ´«²¨Ç®
		g.fillRect(0, 700-SleepingAlgorithm.DrousyMeter, 1280, 900); // ¹Ø ´«²¨Ç®
		g.setColor(Color.red);
		g.fillRect(308,267,tiredMeter*2,47);//ÇÇ·Îµµ
		tm.start(); //Å¸ÀÌ¸Ó,ActionListner ½ÃÀÛ
		
		}
	public void actionPerformed(ActionEvent e) {
		SleepingAlgorithm.DrousyMeter+=vely;
		tiredMeter-=velt;
		repaint();
		
	}
	
	public TryNotToSleep_Play() {
		setLayout(null);
		
		JButton btnNewButton_1 = new JButton("\uB118\uC5B4\uAC00\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				isWorked = true;
			}
		});
		
		
		btnNewButton_1.setBounds(474, 488, 239, 70);
		add(btnNewButton_1);
		btnNewButton_1.setVisible(false);
		
		
		JLabel lblNewLabel_4 = new JLabel("0");
		lblNewLabel_4.setBounds(0, 0, 1280, 720);
		add(lblNewLabel_4);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("");
		add(lblNewLabel_2);
		
		JButton button = new JButton("\uCEE4\uD53C \uB9C8\uC2DC\uAE30");
		button.setHorizontalAlignment(SwingConstants.RIGHT);
		button.setIcon(new ImageIcon(Main.class.getResource("../images/2407_48.jpg")));
		button.setVerticalAlignment(SwingConstants.BOTTOM);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SleepingAlgorithm.DrousyMeter=0;
				tiredMeter=0;
				button.setVisible(false);
			}
		});
		button.setBounds(883, 129, 289, 174);
		add(button);
		
		
		
		JButton btnNewButton = new JButton("\uC7A0 \uAE68\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				SleepingAlgorithm.DrousyMeter-=20;
				if(SleepingAlgorithm.DrousyMeter>=800||tiredMeter*2>550) {
					
					vely=100;
					SleepingAlgorithm.DrousyMeter=0;
					tiredMeter=0;
					lblNewLabel_2.setBounds(0, 0, 1280, 720);
					lblNewLabel_2.setIcon(new ImageIcon(Main.class.getResource("../images/fail.png")));
					GoodFeeling.teacher1FeelDown();
					GoodFeeling.teacher2FeelDown();
					GoodFeeling.teacher3FeelDown();
					btnNewButton.setVisible(false);
					button.setVisible(false);
					btnNewButton_1.setVisible(true);
					
				}
				
				
				else
				{tiredMeter+=20;
					n++;
				}
				if(n>=40) {
					vely=100;
					velt=100;
					lblNewLabel_4.setIcon(new ImageIcon(Main.class.getResource("../images/success.png")));
					GoodFeeling.teacher1FeelUp(); 
					GoodFeeling.teacher2FeelUp(); 
					GoodFeeling.teacher3FeelUp(); 
					
					btnNewButton.setVisible(false);
					button.setVisible(false);
					btnNewButton_1.setVisible(true);
				}
				
			}
		});
		
		btnNewButton.setBounds(435, 405, 239, 63);
		add(btnNewButton);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("^\uD53C\uB85C\uB3C4^");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(416, 324, 280, 47);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(308, 267, 510, 47);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("../images/\uBCBC\uB77D\uCE58\uAE30.jpg")));
		lblNewLabel.setBounds(0, 0, 1280, 720);
		add(lblNewLabel);

	}
}


class SleepingAlgorithm {
	public static int DrousyMeter=0;
	public boolean Coffee=false;
	
		public static int Sleep(boolean b){
			
			if(b==true)
				DrousyMeter=0;
			
			return DrousyMeter;
			
		}
}

