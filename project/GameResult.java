package project;

import java.awt.Cursor;
import java.awt.Font;
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
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameResult extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;

	private int result_A = Feeling.get_pf1();
	private int result_B = Feeling.get_pf2();
	private int result_C = Feeling.get_pf3();
	
	BufferedImage background;
	URL url_1 =getClass().getClassLoader().getResource("게임결과.jpg");
	
	JButton endBtn = new JButton(new ImageIcon(getClass().getClassLoader().getResource("end button.png")));
	JButton score_Aplus_teacherA = new JButton(new ImageIcon(getClass().getClassLoader().getResource("score_A+.png")));
	JButton score_Aplus_teacherB = new JButton(new ImageIcon(getClass().getClassLoader().getResource("score_A+.png")));
	JButton score_Aplus_teacherC = new JButton(new ImageIcon(getClass().getClassLoader().getResource("score_A+.png")));
	JButton score_A_teacherA = new JButton(new ImageIcon(getClass().getClassLoader().getResource("score_A.png")));
	JButton score_A_teacherB = new JButton(new ImageIcon(getClass().getClassLoader().getResource("score_A.png")));
	JButton score_A_teacherC = new JButton(new ImageIcon(getClass().getClassLoader().getResource("score_A.png")));
	JButton score_B_teacherA = new JButton(new ImageIcon(getClass().getClassLoader().getResource("score_B.png")));
	JButton score_B_teacherB = new JButton(new ImageIcon(getClass().getClassLoader().getResource("score_B.png")));
	JButton score_B_teacherC = new JButton(new ImageIcon(getClass().getClassLoader().getResource("score_B.png")));
	JButton score_C_teacherA = new JButton(new ImageIcon(getClass().getClassLoader().getResource("score_C.png")));
	JButton score_C_teacherB = new JButton(new ImageIcon(getClass().getClassLoader().getResource("score_C.png")));
	JButton score_C_teacherC = new JButton(new ImageIcon(getClass().getClassLoader().getResource("score_C.png")));
	JButton score_D_teacherA = new JButton(new ImageIcon(getClass().getClassLoader().getResource("score_D.png")));
	JButton score_D_teacherB = new JButton(new ImageIcon(getClass().getClassLoader().getResource("score_D.png")));
	JButton score_D_teacherC = new JButton(new ImageIcon(getClass().getClassLoader().getResource("score_D.png")));
	JButton score_F_teacherA = new JButton(new ImageIcon(getClass().getClassLoader().getResource("score_F.png")));
	JButton score_F_teacherB = new JButton(new ImageIcon(getClass().getClassLoader().getResource("score_F.png")));
	JButton score_F_teacherC = new JButton(new ImageIcon(getClass().getClassLoader().getResource("score_F.png")));
	
	private ImageIcon endBtnEnteredImage = new ImageIcon(getClass().getClassLoader().getResource("end button2.png"));
	private ImageIcon endBtnBasicImage = new ImageIcon(getClass().getClassLoader().getResource("end button.png"));
	
	JLabel title = new JLabel(SimulStart.name + "님의 시험결과");
	
	public GameResult() {
		try {
			background = ImageIO.read(url_1);
		} catch (IOException e) {}
		
		super.setLayout(null);
		
		title.setBounds(30, 40, 1200, 100);
		title.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		super.add(title);
		
		endBtn.setBounds(1000,600,250,73);
		endBtn.setBorderPainted(false);
		endBtn.setContentAreaFilled(false);
		endBtn.setFocusPainted(false);
		
		super.add(endBtn);
		endBtn.addActionListener(this);
		endBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				endBtn.setIcon(endBtnEnteredImage);
				endBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				endBtn.setIcon(endBtnBasicImage);
				endBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		
		// 호감도 10 - A+ / 호감도 9 - A / 호감도 7-8 - B / 호감도 5-6 - C / 호감도 3-4 - D / 호감도 0-2 - F
		
		// 과목A
		if(result_A == 10) {
			score_Aplus_teacherA.setBounds(120,360,200,200);
			score_Aplus_teacherA.setBorderPainted(false);
			score_Aplus_teacherA.setContentAreaFilled(false);
			score_Aplus_teacherA.setFocusPainted(false);
			super.add(score_Aplus_teacherA);
		}
		else if(result_A == 9) {
			score_A_teacherA.setBounds(120,360,200,200);
			score_A_teacherA.setBorderPainted(false);
			score_A_teacherA.setContentAreaFilled(false);
			score_A_teacherA.setFocusPainted(false);
			super.add(score_A_teacherA);
		}
		else if(result_A >= 7) {
			score_B_teacherA.setBounds(120,360,200,200);
			score_B_teacherA.setBorderPainted(false);
			score_B_teacherA.setContentAreaFilled(false);
			score_B_teacherA.setFocusPainted(false);
			super.add(score_B_teacherA);
		}
		else if(result_A >= 5) {
			score_C_teacherA.setBounds(120,360,200,200);
			score_C_teacherA.setBorderPainted(false);
			score_C_teacherA.setContentAreaFilled(false);
			score_C_teacherA.setFocusPainted(false);
			super.add(score_C_teacherA);
		}
		else if(result_A >= 3) {
			score_D_teacherA.setBounds(120,360,200,200);
			score_D_teacherA.setBorderPainted(false);
			score_D_teacherA.setContentAreaFilled(false);
			score_D_teacherA.setFocusPainted(false);
			super.add(score_D_teacherA);
		} else {
			score_F_teacherA.setBounds(120,360,200,200);
			score_F_teacherA.setBorderPainted(false);
			score_F_teacherA.setContentAreaFilled(false);
			score_F_teacherA.setFocusPainted(false);
			super.add(score_F_teacherA);
		}
		
		// 과목B
		if(result_B == 10) {
			score_Aplus_teacherB.setBounds(560,320,200,200);
			score_Aplus_teacherB.setBorderPainted(false);
			score_Aplus_teacherB.setContentAreaFilled(false);
			score_Aplus_teacherB.setFocusPainted(false);
			super.add(score_Aplus_teacherB);
		}
		else if(result_B == 9) {
			score_A_teacherB.setBounds(560,320,200,200);
			score_A_teacherB.setBorderPainted(false);
			score_A_teacherB.setContentAreaFilled(false);
			score_A_teacherB.setFocusPainted(false);
			super.add(score_A_teacherB);
		}
		else if(result_B >= 7) {
			score_B_teacherB.setBounds(560,320,200,200);
			score_B_teacherB.setBorderPainted(false);
			score_B_teacherB.setContentAreaFilled(false);
			score_B_teacherB.setFocusPainted(false);
			super.add(score_B_teacherB);
		}
		else if(result_B >= 5) {
			score_C_teacherB.setBounds(560,320,200,200);
			score_C_teacherB.setBorderPainted(false);
			score_C_teacherB.setContentAreaFilled(false);
			score_C_teacherB.setFocusPainted(false);
			super.add(score_C_teacherB);
		}
		else if(result_B >= 3) {
			score_D_teacherB.setBounds(560,320,200,200);
			score_D_teacherB.setBorderPainted(false);
			score_D_teacherB.setContentAreaFilled(false);
			score_D_teacherB.setFocusPainted(false);
			super.add(score_D_teacherB);
		} else {
			score_F_teacherB.setBounds(560,320,200,200);
			score_F_teacherB.setBorderPainted(false);
			score_F_teacherB.setContentAreaFilled(false);
			score_F_teacherB.setFocusPainted(false);
			super.add(score_F_teacherB);
		}
		
		// 과목C
		if(result_C == 10) {
			score_Aplus_teacherC.setBounds(1000,360,200,200);
			score_Aplus_teacherC.setBorderPainted(false);
			score_Aplus_teacherC.setContentAreaFilled(false);
			score_Aplus_teacherC.setFocusPainted(false);
			super.add(score_Aplus_teacherC);
		}
		else if(result_C == 9) {
			score_A_teacherC.setBounds(1000,360,200,200);
			score_A_teacherC.setBorderPainted(false);
			score_A_teacherC.setContentAreaFilled(false);
			score_A_teacherC.setFocusPainted(false);
			super.add(score_A_teacherC);
		}
		else if(result_C >= 7) {
			score_B_teacherC.setBounds(1000,360,200,200);
			score_B_teacherC.setBorderPainted(false);
			score_B_teacherC.setContentAreaFilled(false);
			score_B_teacherC.setFocusPainted(false);
			super.add(score_B_teacherC);
		}
		else if(result_C >= 5) {
			score_C_teacherC.setBounds(1000,360,200,200);
			score_C_teacherC.setBorderPainted(false);
			score_C_teacherC.setContentAreaFilled(false);
			score_C_teacherC.setFocusPainted(false);
			super.add(score_C_teacherC);
		}
		else if(result_C >= 3) {
			score_D_teacherC.setBounds(1000,360,200,200);
			score_D_teacherC.setBorderPainted(false);
			score_D_teacherC.setContentAreaFilled(false);
			score_D_teacherC.setFocusPainted(false);
			super.add(score_D_teacherC);
		} else {
			score_F_teacherC.setBounds(1000,360,200,200);
			score_F_teacherC.setBorderPainted(false);
			score_F_teacherC.setContentAreaFilled(false);
			score_F_teacherC.setFocusPainted(false);
			super.add(score_F_teacherC);
		}
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(background, 0, 0, null);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == endBtn) {
			try {
				Thread.sleep(1000);
			}catch (InterruptedException ex) {ex.printStackTrace();}

			System.exit(0);
		}
	}
}
