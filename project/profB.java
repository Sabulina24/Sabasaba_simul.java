package project;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class profB extends JPanel {
	
	public static boolean isWorked = false;
	
	private static final long serialVersionUID = 1L;
	private JLabel lblNewLabel = new JLabel("\uBC30\uACBD");
	
	
	public profB() {
		
		
		setLayout(null);
		
		final JButton button_1 = new JButton("\uB2E4\uC74C\uC73C\uB85C");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					//결과 화면으로 넘어간다.
					setVisible(false);
					isWorked = true;
				}
			});
			
		button_1.setBounds(533, 411, 260, 93);
		add(button_1);
		button_1.setVisible(false);
		
		final JLabel lblNewLabel_2 = new JLabel(".");
		lblNewLabel_2.setBounds(0, 0, 64, 24);
		add(lblNewLabel_2);
		final JLabel lblNewLabel_1 = new JLabel("");
		
		
		lblNewLabel_1.setBounds(1100, 165, 96, 93);
		add(lblNewLabel_1);
		
		final JLabel label_2 = new JLabel("");
		
		label_2.setBounds(130, 165, 96, 93);
		add(label_2);
		
		final JButton button_2 = new JButton("\uB0B4\uB824\uB193\uAE30");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblNewLabel.setIcon(new ImageIcon(getClass().getClassLoader().getResource("\uC220\uC790\uB9AC(\uC548\uB9C8\uC2EC)_B.jpg")));
			}
		});
		button_2.setBounds(533, 557, 260, 93);
		add(button_2);
		
		final JButton btnNewButton = new JButton("\uB9C8\uC2E0\uB2E4");
		
		final JButton button = new JButton("\uC548\uB9C8\uC2E0\uB2E4");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DrinkingAlgorithm.Mood-=(1+(int)(Math.random()*4)); 
				int Meter=DrinkingAlgorithm.DrunkMeter;
				boolean a=false;
				
				Meter=DrinkingAlgorithm.Drink(a);
				
				
				if(Meter<5){
					lblNewLabel_1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("0-5.png")));
				}
				else if(Meter>=5&&Meter<10){
					lblNewLabel_1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("5-10.png")));
				}
				else if(Meter>=10&&Meter<15){
					lblNewLabel_1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("10-15.png")));
				}
				else if(Meter>=15&&Meter<20){
					lblNewLabel_1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("19.png")));
				}
				if(DrinkingAlgorithm.Mood<3)
					label_2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("19.png")));
						
				else if(DrinkingAlgorithm.Mood>=3&&DrinkingAlgorithm.Mood<6)
						
					label_2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("10-15.png")));
					
				else if(DrinkingAlgorithm.Mood>=6&&DrinkingAlgorithm.Mood<=9)
						
					label_2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("5-10.png")));
					
				else if(DrinkingAlgorithm.Mood>=10)
					label_2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("0-5.png")));
				
				if(Meter<5&&DrinkingAlgorithm.Mood>=10) {
					lblNewLabel_2.setBounds(0, 0, 1280, 720);
					lblNewLabel_2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("win1.png")));
					Feeling.pf2_UP(); //교수 b호감도 상승
					btnNewButton.setVisible(false);
					button_2.setVisible(false);
					button.setVisible(false);
					button_1.setVisible(true);
				}
			}
		});
		button.setBounds(846, 557, 260, 93);
		add(button);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				DrinkingAlgorithm.Mood+=(int)(1+(Math.random()*2));
				int Meter=DrinkingAlgorithm.DrunkMeter;
				boolean a=true;
				
				Meter=DrinkingAlgorithm.Drink(a);
				
				if(Meter<5){
					lblNewLabel.setIcon(new ImageIcon(getClass().getClassLoader().getResource("\uC220\uC790\uB9AC(\uB9C8\uC2EC)_B.jpg")));
					lblNewLabel_1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("0-5.png")));
							
					add(btnNewButton);
					
				}
				else if(Meter>=5&&Meter<10){
					lblNewLabel.setIcon(new ImageIcon(getClass().getClassLoader().getResource("\uC220\uC790\uB9AC(\uB9C8\uC2EC)_B.jpg")));	
					lblNewLabel_1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("5-10.png")));
				}
				else if(Meter>=10&&Meter<15){
					lblNewLabel.setIcon(new ImageIcon(getClass().getClassLoader().getResource("\uC220\uC790\uB9AC(\uB9C8\uC2EC)_B.jpg")));
					lblNewLabel_1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("10-15.png")));
				}
				else if(Meter>=15&&Meter<20){
					lblNewLabel.setIcon(new ImageIcon(getClass().getClassLoader().getResource("\uC220\uC790\uB9AC(\uB9C8\uC2EC)_B.jpg")));	
					lblNewLabel_1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("19.png")));
				}
				else if(Meter>=20){
					lblNewLabel_2.setBounds(0, 0, 1280, 720);
					lblNewLabel_2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("lose1.png")));//지는 화면
					Feeling.pf2_DOWN(); //교수 b호감도 감소
					btnNewButton.setVisible(false); //마시기 버튼 안보이게한다
					button.setVisible(false); //안마시기 버튼 안보이게한다
					button_2.setVisible(false); //내리기 버튼 안보이게한다
					
					button_1.setVisible(true); //결과화면으로 넘어가는 버튼 보이게한다
				}
				
			if(DrinkingAlgorithm.Mood<3)
				label_2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("19.png")));
					
			else if(DrinkingAlgorithm.Mood>=3&&DrinkingAlgorithm.Mood<6)
					
				label_2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("10-15.png")));
				
			else if(DrinkingAlgorithm.Mood>=6&&DrinkingAlgorithm.Mood<=9)
					
				label_2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("5-10.png")));
				
			else if(DrinkingAlgorithm.Mood>=10)
				label_2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("0-5.png")));
			
			if(Meter<5&&DrinkingAlgorithm.Mood>=10) {
				lblNewLabel_2.setBounds(0, 0, 1280, 720);
				lblNewLabel_2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("win1.png")));
				Feeling.pf2_UP(); //교수 b호감도 상승
				btnNewButton.setVisible(false); //마시기 버튼 안보이게한다
				button.setVisible(false); //안마시기 버튼 안보이게한다
				button_2.setVisible(false); //내리기 버튼 안보이게한다
				
				button_1.setVisible(true); //결과화면으로 넘어가는 버튼 보이게한다
				}
			}
		});
		
		btnNewButton.setBounds(212, 557, 260, 93);
		add(btnNewButton);
		
		
		
		
		final JButton btnNewButton_1 = new JButton("\uC219\uCDE8\uD574\uC18C\uC74C\uB8CC");
		btnNewButton_1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("\uD5DB\uAC1C\uC218_2.jpg")));
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				boolean a=false;
				
				DrinkingAlgorithm.HangoverCure=true;
				DrinkingAlgorithm.DrunkMeter=DrinkingAlgorithm.Drink(a);
				
			if(DrinkingAlgorithm.DrunkMeter>=0&&DrinkingAlgorithm.DrunkMeter<5) 
					lblNewLabel_1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("0-5.png")));
					
		
			else if(DrinkingAlgorithm.DrunkMeter>=5&&DrinkingAlgorithm.DrunkMeter<10)
			
					lblNewLabel_1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("5-10.png")));
			
			else if(DrinkingAlgorithm.DrunkMeter>=10&&DrinkingAlgorithm.DrunkMeter<15) 
				lblNewLabel_1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("10-15.png")));
					
			
			else if(DrinkingAlgorithm.DrunkMeter>=15&&DrinkingAlgorithm.DrunkMeter<20) 
				lblNewLabel_1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("19.png")));
			
			btnNewButton_1.setVisible(false);
			}
			
		});
		btnNewButton_1.setBounds(1064, 10, 187, 145);
		add(btnNewButton_1);
		
		JLabel label = new JLabel("\uCDE8\uAE30");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(1055, 253, 213, 55);
		add(label);
		
		JLabel label_1 = new JLabel("\uAD50\uC218\uB2D8 \uAE30\uBD84");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(78, 253, 213, 55);
		add(label_1);
		
		lblNewLabel.setIcon(new ImageIcon(getClass().getClassLoader().getResource("\uC220\uC790\uB9AC(\uC548\uB9C8\uC2EC)_B.jpg")));
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 1280, 720);
		add(lblNewLabel);

	}
}
