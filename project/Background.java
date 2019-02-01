package project;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Background extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;

	public static boolean isWorked = false;
	
	BufferedImage background;
	URL url_1 = getClass().getClassLoader().getResource("월요일.jpg");
	URL url_2 = getClass().getClassLoader().getResource("화요일.jpg");
	URL url_3 = getClass().getClassLoader().getResource("수요일.jpg");
	URL url_4 = getClass().getClassLoader().getResource("목요일.jpg");
	URL url_5 = getClass().getClassLoader().getResource("금요일.jpg");
	URL url_6 = getClass().getClassLoader().getResource("토요일.jpg");
	URL url_7 = getClass().getClassLoader().getResource("일요일.jpg");
	
	JButton dayStart = new JButton(new ImageIcon(getClass().getClassLoader().getResource("dayStart.png")));
	JButton subjectA_1 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("과목A.png")));
	JButton subjectA_2 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("과목A.png")));
	JButton subjectA_3 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("과목A.png")));
	JButton subjectB_1 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("과목B.png")));
	JButton subjectB_2 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("과목B.png")));
	JButton subjectB_3 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("과목B.png")));
	JButton subjectC_1 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("과목C.png")));
	JButton subjectC_2 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("과목C.png")));
	JButton subjectC_3 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("과목C.png")));
	JButton breakTime_1 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("공강.png")));
	JButton breakTime_2 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("공강.png")));
	JButton breakTime_3 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("공강.png")));
	JButton fullBreakTime = new JButton(new ImageIcon(getClass().getClassLoader().getResource("풀공강.png")));
	
	private ImageIcon dayStartEnteredImage = new ImageIcon(getClass().getClassLoader().getResource("dayStart_clk.png"));
	private ImageIcon dayStartBasicImage = new ImageIcon(getClass().getClassLoader().getResource("dayStart.png"));
	
	public Background() {
		super.setLayout(null);
		
		dayStart.setBounds(240,480,400,100);
		dayStart.setBorderPainted(false);
		dayStart.setContentAreaFilled(false);
		dayStart.setFocusPainted(false);
		dayStart.addActionListener(this);
		dayStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				dayStart.setIcon(dayStartEnteredImage);
				dayStart.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				dayStart.setIcon(dayStartBasicImage);
				dayStart.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		
		subjectA_1.setBounds(960,240,240,120);
		subjectA_1.setBorderPainted(false);
		subjectA_1.setContentAreaFilled(false);
		subjectA_1.setFocusPainted(false);
		super.add(subjectA_1);
		subjectA_1.setVisible(false);
		
		subjectA_2.setBounds(960,360,240,120);
		subjectA_2.setBorderPainted(false);
		subjectA_2.setContentAreaFilled(false);
		subjectA_2.setFocusPainted(false);
		super.add(subjectA_2);
		subjectA_2.setVisible(false);
		
		subjectA_3.setBounds(960,480,240,120);
		subjectA_3.setBorderPainted(false);
		subjectA_3.setContentAreaFilled(false);
		subjectA_3.setFocusPainted(false);
		super.add(subjectA_3);
		subjectA_3.setVisible(false);
		
		subjectB_1.setBounds(960,240,240,120);
		subjectB_1.setBorderPainted(false);
		subjectB_1.setContentAreaFilled(false);
		subjectB_1.setFocusPainted(false);
		super.add(subjectB_1);
		subjectB_1.setVisible(false);
		
		subjectB_2.setBounds(960,360,240,120);
		subjectB_2.setBorderPainted(false);
		subjectB_2.setContentAreaFilled(false);
		subjectB_2.setFocusPainted(false);
		super.add(subjectB_2);
		subjectB_2.setVisible(false);
		
		subjectB_3.setBounds(960,480,240,120);
		subjectB_3.setBorderPainted(false);
		subjectB_3.setContentAreaFilled(false);
		subjectB_3.setFocusPainted(false);
		super.add(subjectB_3);
		subjectB_3.setVisible(false);
		
		subjectC_1.setBounds(960,240,240,120);
		subjectC_1.setBorderPainted(false);
		subjectC_1.setContentAreaFilled(false);
		subjectC_1.setFocusPainted(false);
		super.add(subjectC_1);
		subjectC_1.setVisible(false);
		
		subjectC_2.setBounds(960,360,240,120);
		subjectC_2.setBorderPainted(false);
		subjectC_2.setContentAreaFilled(false);
		subjectC_2.setFocusPainted(false);
		super.add(subjectC_2);
		subjectC_2.setVisible(false);
		
		subjectC_3.setBounds(960,480,240,120);
		subjectC_3.setBorderPainted(false);
		subjectC_3.setContentAreaFilled(false);
		subjectC_3.setFocusPainted(false);
		super.add(subjectC_3);
		subjectC_3.setVisible(false);
		
		breakTime_1.setBounds(960,240,240,120);
		breakTime_1.setBorderPainted(false);
		breakTime_1.setContentAreaFilled(false);
		breakTime_1.setFocusPainted(false);
		super.add(breakTime_1);
		breakTime_1.setVisible(false);
		
		breakTime_2.setBounds(960,360,240,120);
		breakTime_2.setBorderPainted(false);
		breakTime_2.setContentAreaFilled(false);
		breakTime_2.setFocusPainted(false);
		super.add(breakTime_2);
		breakTime_2.setVisible(false);
		
		breakTime_3.setBounds(960,480,240,120);
		breakTime_3.setBorderPainted(false);
		breakTime_3.setContentAreaFilled(false);
		breakTime_3.setFocusPainted(false);
		super.add(breakTime_3);
		breakTime_3.setVisible(false);
		
		fullBreakTime.setBounds(960,240,240,360);
		fullBreakTime.setBorderPainted(false);
		fullBreakTime.setContentAreaFilled(false);
		fullBreakTime.setFocusPainted(false);
		super.add(fullBreakTime);
		fullBreakTime.setVisible(false);
	}
	
	public void getBackground(int a) {
		if(a == 0) { // 월요일
			try {
				background = ImageIO.read(url_1);
			} catch (IOException e) {}
			
			super.add(dayStart);
			repaint();
		}
		else if(a == 1) { // 화요일
			try {
				background = ImageIO.read(url_2);
			} catch (IOException e) {}
			super.add(dayStart);
			repaint();
		}
		else if(a == 2) {
			try {
				background = ImageIO.read(url_3);
			} catch (IOException e) {}
			super.add(dayStart);
			repaint();
		}
		else if(a == 3) {
			try	{
				background = ImageIO.read(url_4);
			} catch (IOException e) {}
			super.add(dayStart);
			repaint();
		}
		else if(a == 4) {
			try	{
				background = ImageIO.read(url_5);
			} catch (IOException e) {}
			super.add(dayStart);
			repaint();
		}
	}
	
	public void getFirstClass(int x) {
		if(x == 1 || x == 2 || x == 3) { // 과목 A	
			subjectA_1.setVisible(true);
		}
		else if(x == 6 || x == 7 || x == 8) { // 과목 B
			subjectB_1.setVisible(true);
		}
		else if(x == 11 || x == 12 || x == 13) { // 과목 C
			subjectC_1.setVisible(true);
		}
		else if(x == 0) { // 공강
			breakTime_1.setVisible(true);
		}
	}
	
	public void getSecondClass(int x) {
		if(x == 1 || x == 2 || x == 3) { // 과목 A
			subjectA_2.setVisible(true);
		}
		else if(x == 6 || x == 7 || x == 8) { // 과목 B
			subjectB_2.setVisible(true);
		}
		else if(x == 11 || x == 12 || x == 13) { // 과목 C
			subjectC_2.setVisible(true);
		}
		else if(x == 0) { // 공강
			breakTime_2.setVisible(true);
		}
	}
	
	public void getThirdClass(int x) {
		if(x == 1 || x == 2 || x == 3) { // 과목 A
			subjectA_3.setVisible(true);
		}
		else if(x == 6 || x == 7 || x == 8) { // 과목 B
			subjectB_3.setVisible(true);
		}
		else if(x == 11 || x == 12 || x == 13) { // 과목 C
			subjectC_3.setVisible(true);
		}
		else if(x == 0) { // 공강
			breakTime_3.setVisible(true);
		}
	}
	
	public void getHoliday() {
		fullBreakTime.setVisible(true);
	}
	
	public void getSaturday() {
		try {
			background = ImageIO.read(url_6);
		} catch (IOException e) {}
		super.add(dayStart);
		repaint();
	}
	
	public void getSunday() {
		try {
			background = ImageIO.read(url_7);
		} catch (IOException e) {}
		super.add(dayStart);
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(background, 0, 0, null);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == dayStart) {
			super.setVisible(false);
			isWorked = true;
		}
	}
}
