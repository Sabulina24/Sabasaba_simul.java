package project;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class B_Normal_3 extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;

	public static boolean isWorked = false;
	
	BufferedImage background;
	File file1 = new File("./src/images/캠퍼스.jpg");
	File file2 = new File("./src/images/캠퍼스_B.jpg");
	
	JButton nextBtn1 = new JButton(new ImageIcon(Main.class.getResource("../images/버튼1.png")));
	JButton nextBtn2 = new JButton(new ImageIcon(Main.class.getResource("../images/버튼1.png")));
	JButton nextBtn3 = new JButton(new ImageIcon(Main.class.getResource("../images/버튼1.png")));
	JButton nextBtn4 = new JButton(new ImageIcon(Main.class.getResource("../images/버튼1.png")));
	JButton nextBtn5 = new JButton(new ImageIcon(Main.class.getResource("../images/버튼1.png")));
	JButton nextBtn6 = new JButton(new ImageIcon(Main.class.getResource("../images/버튼1.png")));
	JButton nextBtn7 = new JButton(new ImageIcon(Main.class.getResource("../images/버튼1.png")));
	JButton nextBtn8 = new JButton(new ImageIcon(Main.class.getResource("../images/버튼1.png")));
	JButton nextBtn9 = new JButton(new ImageIcon(Main.class.getResource("../images/버튼1.png")));
	JButton nextBtn10 = new JButton(new ImageIcon(Main.class.getResource("../images/버튼1.png")));
	JButton nextBtn11 = new JButton(new ImageIcon(Main.class.getResource("../images/버튼1.png")));
	JButton nextBtn12 = new JButton(new ImageIcon(Main.class.getResource("../images/버튼1.png")));
	JButton nextBtnEnd = new JButton(new ImageIcon(Main.class.getResource("../images/버튼1.png")));
	JButton nextBtnExit = new JButton(new ImageIcon(Main.class.getResource("../images/버튼1.png")));
	JButton up = new JButton(new ImageIcon(Main.class.getResource("../images/호감도 상승.png")));
	JButton same = new JButton(new ImageIcon(Main.class.getResource("../images/호감도 유지.png")));
	JButton down = new JButton(new ImageIcon(Main.class.getResource("../images/호감도 하락.png")));
	
	JButton c1_1 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_1_1.png")));
	JButton c1_2 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_1_2.png")));
	JButton c1_3 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_1_3.png")));
	JButton c2_1 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_1.png")));
	JButton c2_2 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_2.png")));
	JButton c2_3 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3.png")));
	JButton c2_1_1 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_1_1.png")));
	JButton c2_1_2 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_1_2.png")));
	JButton c2_1_3 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_1_3.png")));
	JButton c2_2_1 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_2_1.png")));
	JButton c2_2_2 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_2_2.png")));
	JButton c2_2_3 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_2_3.png")));
	JButton c2_3_1 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_1.png")));
	JButton c2_3_2 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_2.png")));
	JButton c2_3_3 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_3.png")));
	JButton c2_3_1_1 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_1_1.png")));
	JButton c2_3_1_2 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_1_2.png")));
	JButton c2_3_1_3 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_1_3.png")));
	JButton c2_3_2_1 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_2_1.png")));
	JButton c2_3_2_2 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_2_2.png")));
	JButton c2_3_2_3 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_2_3.png")));
	JButton c2_3_3_1 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_3_1.png")));
	JButton c2_3_3_2 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_3_2.png")));
	JButton c2_3_3_3 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_3_3.png")));
	
	JLabel name = new JLabel("교수님B");
	JLabel label1 = new JLabel("(캠퍼스에서 교수님과 마주쳤다!)");
	JLabel label2 = new JLabel("(얼떨결에 교수님과 함께 학과 건물로 가게되었다.)");
	JLabel label3 = new JLabel("(학과 건물에 도착한 뒤, 나는 교수님께 공손히");
	JLabel label4 = new JLabel("인사하고 천천히 다른 길로 나갔다.)");	
	
	String[] dialogue = ProfessorDialogue.getDialogue_B(); // 교수님B 대사를 한 줄씩 끊어서 String 배열에 저장
	JLabel d29 = new JLabel(dialogue[29]);
	JLabel d30 = new JLabel(dialogue[30]);
	JLabel d31 = new JLabel(dialogue[31]);
	JLabel d32 = new JLabel(dialogue[32]);
	JLabel d33 = new JLabel(dialogue[33]);
	JLabel d34 = new JLabel(dialogue[34]);
	JLabel d35 = new JLabel(dialogue[35]);
	JLabel d36 = new JLabel(dialogue[36]);
	JLabel d37 = new JLabel(dialogue[37]);
	JLabel d38 = new JLabel(dialogue[38]);
	JLabel d39 = new JLabel(dialogue[39]);
	JLabel d40 = new JLabel(dialogue[40]);
	JLabel d41 = new JLabel(dialogue[41]);
	JLabel d42 = new JLabel(dialogue[42]);
	JLabel d43 = new JLabel(dialogue[43]);
	JLabel d44 = new JLabel(dialogue[44]);
	JLabel d45 = new JLabel(dialogue[45]);
	JLabel d46 = new JLabel(dialogue[46]);
	JLabel d47 = new JLabel(dialogue[47]);
	JLabel d48 = new JLabel(dialogue[48]);
	JLabel d49 = new JLabel(dialogue[49]);
	JLabel d50 = new JLabel(dialogue[50]);
	JLabel d51 = new JLabel(dialogue[51]);
	JLabel d52 = new JLabel(dialogue[52]);
	JLabel d53 = new JLabel(dialogue[53]);
	JLabel d54 = new JLabel(dialogue[54]);
	JLabel d55 = new JLabel(dialogue[55]);

	private ImageIcon nextBtnEnteredImage = new ImageIcon(Main.class.getResource("../images/버튼1_클릭.png"));
	private ImageIcon nextBtnBasicImage = new ImageIcon(Main.class.getResource("../images/버튼1.png"));
	private ImageIcon c1_1EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_1_1_clk.png"));
	private ImageIcon c1_1BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_1_1.png"));
	private ImageIcon c1_2EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_1_2_clk.png"));
	private ImageIcon c1_2BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_1_2.png"));
	private ImageIcon c1_3EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_1_3_clk.png"));
	private ImageIcon c1_3BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_1_3.png"));
	private ImageIcon c2_1EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_1_clk.png"));
	private ImageIcon c2_1BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_1.png"));
	private ImageIcon c2_2EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_2_clk.png"));
	private ImageIcon c2_2BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_2.png"));
	private ImageIcon c2_3EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_clk.png"));
	private ImageIcon c2_3BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3.png"));
	private ImageIcon c2_1_1EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_1_1_clk.png"));
	private ImageIcon c2_1_1BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_1_1.png"));
	private ImageIcon c2_1_2EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_1_2_clk.png"));
	private ImageIcon c2_1_2BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_1_2.png"));
	private ImageIcon c2_1_3EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_1_3_clk.png"));
	private ImageIcon c2_1_3BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_1_3.png"));
	private ImageIcon c2_2_1EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_2_1_clk.png"));
	private ImageIcon c2_2_1BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_2_1.png"));
	private ImageIcon c2_2_2EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_2_2_clk.png"));
	private ImageIcon c2_2_2BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_2_2.png"));
	private ImageIcon c2_2_3EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_2_3_clk.png"));
	private ImageIcon c2_2_3BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_2_3.png"));
	private ImageIcon c2_3_1EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_1_clk.png"));
	private ImageIcon c2_3_1BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_1.png"));
	private ImageIcon c2_3_2EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_2_clk.png"));
	private ImageIcon c2_3_2BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_2.png"));
	private ImageIcon c2_3_3EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_3_clk.png"));
	private ImageIcon c2_3_3BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_3.png"));
	private ImageIcon c2_3_1_1EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_1_1_clk.png"));
	private ImageIcon c2_3_1_1BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_1_1.png"));
	private ImageIcon c2_3_1_2EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_1_2_clk.png"));
	private ImageIcon c2_3_1_2BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_1_2.png"));
	private ImageIcon c2_3_1_3EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_1_3_clk.png"));
	private ImageIcon c2_3_1_3BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_1_3.png"));
	private ImageIcon c2_3_2_1EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_2_1_clk.png"));
	private ImageIcon c2_3_2_1BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_2_1.png"));
	private ImageIcon c2_3_2_2EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_2_2_clk.png"));
	private ImageIcon c2_3_2_2BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_2_2.png"));
	private ImageIcon c2_3_2_3EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_2_3_clk.png"));
	private ImageIcon c2_3_2_3BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_2_3.png"));
	private ImageIcon c2_3_3_1EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_3_1_clk.png"));
	private ImageIcon c2_3_3_1BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_3_1.png"));
	private ImageIcon c2_3_3_2EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_3_2_clk.png"));
	private ImageIcon c2_3_3_2BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_3_2.png"));
	private ImageIcon c2_3_3_3EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_3_3_clk.png"));
	private ImageIcon c2_3_3_3BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_캠퍼스_2_3_3_3.png"));

	public B_Normal_3()
	{
		try
		{
			background = ImageIO.read(file1);
		} catch (IOException e) {}
		
		super.setLayout(null);
		
		label1.setBounds(30, 480, 1200, 100);
		label1.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
		
		nextBtn1.setBounds(1000,400,300,60);
		nextBtn1.setBorderPainted(false);
		nextBtn1.setContentAreaFilled(false);
		nextBtn1.setFocusPainted(false);
		
		super.add(label1);
		super.add(nextBtn1);
		nextBtn1.addActionListener(this);
		nextBtn1.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseEntered(MouseEvent e)
			{
				nextBtn1.setIcon(nextBtnEnteredImage);
				nextBtn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				nextBtn1.setIcon(nextBtnBasicImage);
				nextBtn1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		
		up.setBounds(160,100,100,250);
		up.setBorderPainted(false);
		up.setContentAreaFilled(false);
		up.setFocusPainted(false);
		same.setBounds(160,100,100,250);
		same.setBorderPainted(false);
		same.setContentAreaFilled(false);
		same.setFocusPainted(false);
		down.setBounds(160,100,100,250);
		down.setBorderPainted(false);
		down.setContentAreaFilled(false);
		down.setFocusPainted(false);
		super.add(up);
		super.add(same);
		super.add(down);
		up.setVisible(false);
		same.setVisible(false);
		down.setVisible(false);
	}
	
	public void paintComponent(Graphics g)
	{
		g.drawImage(background, 0, 0, null);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		nextBtnEnd.setBounds(1000,400,300,60);
		nextBtnEnd.setBorderPainted(false);
		nextBtnEnd.setContentAreaFilled(false);
		nextBtnEnd.setFocusPainted(false);
		nextBtnEnd.addActionListener(this);
		nextBtnEnd.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseEntered(MouseEvent e)
			{
				nextBtnEnd.setIcon(nextBtnEnteredImage);
				nextBtnEnd.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				nextBtnEnd.setIcon(nextBtnBasicImage);
				nextBtnEnd.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		
		if(e.getSource() == nextBtn1)
		{
			try
			{
				background = ImageIO.read(file2);
				repaint();
			} catch (IOException e1) {}
			
			nextBtn1.setVisible(false);
			label1.setVisible(false);
			
			c1_1.setBounds(820,325,500,100);
			c1_1.setBorderPainted(false);
			c1_1.setContentAreaFilled(false);
			c1_1.setFocusPainted(false);
			
			super.add(c1_1);
			c1_1.setVisible(true);
			c1_1.addActionListener(this);
			c1_1.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c1_1.setIcon(c1_1EnteredImage);
					c1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c1_1.setIcon(c1_1BasicImage);
					c1_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c1_2.setBounds(820,450,500,100);
			c1_2.setBorderPainted(false);
			c1_2.setContentAreaFilled(false);
			c1_2.setFocusPainted(false);
			
			super.add(c1_2);
			c1_2.setVisible(true);
			c1_2.addActionListener(this);
			c1_2.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c1_2.setIcon(c1_2EnteredImage);
					c1_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c1_2.setIcon(c1_2BasicImage);
					c1_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c1_3.setBounds(820,575,500,100);
			c1_3.setBorderPainted(false);
			c1_3.setContentAreaFilled(false);
			c1_3.setFocusPainted(false);
			
			super.add(c1_3);
			c1_3.setVisible(true);
			c1_3.addActionListener(this);
			c1_3.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c1_3.setIcon(c1_3EnteredImage);
					c1_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c1_3.setIcon(c1_3BasicImage);
					c1_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			repaint();
		}
		
		if(e.getSource() == c1_1 || e.getSource() == c1_2 || e.getSource() == c1_3)
		{
			c1_1.setVisible(false);
			c1_2.setVisible(false);
			c1_3.setVisible(false);
			name.setBounds(30, 385, 300, 100);
			name.setFont(new Font("맑은 고딕", Font.BOLD, 30));
			super.add(name);
	
			nextBtn2.setBounds(1000,400,300,60);
			nextBtn2.setBorderPainted(false);
			nextBtn2.setContentAreaFilled(false);
			nextBtn2.setFocusPainted(false);
			nextBtn2.addActionListener(this);
			nextBtn2.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					nextBtn2.setIcon(nextBtnEnteredImage);
					nextBtn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					nextBtn2.setIcon(nextBtnBasicImage);
					nextBtn2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			super.add(nextBtn2);
			
			if(e.getSource() == c1_1)
			{
				GoodFeeling.teacher2FeelUp();// 호감도 +1
				up.setVisible(true);
				
				d29.setBounds(30, 480, 1200, 100);
				d29.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d29);
			}
			else if(e.getSource() == c1_2)
			{
				GoodFeeling.teacher2FeelDown();// 호감도 -1
				down.setVisible(true);
				
				d30.setBounds(30, 480, 1200, 100);
				d30.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d30);
			}
			else
			{
				GoodFeeling.teacher2FeelSame();// 호감도 +0
				same.setVisible(true);
				
				d31.setBounds(30, 480, 1200, 100);
				d31.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d31);
			}
			repaint();
		}
		
		if(e.getSource() == nextBtn2)
		{
			nextBtn2.setVisible(false);
			up.setVisible(false);
			same.setVisible(false);
			down.setVisible(false);
			d29.setVisible(false);
			d30.setVisible(false);
			d31.setVisible(false);
			
			label2.setBounds(30, 480, 1200, 100);
			label2.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(label2);
			
			nextBtn3.setBounds(1000,400,300,60);
			nextBtn3.setBorderPainted(false);
			nextBtn3.setContentAreaFilled(false);
			nextBtn3.setFocusPainted(false);
			nextBtn3.addActionListener(this);
			nextBtn3.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					nextBtn3.setIcon(nextBtnEnteredImage);
					nextBtn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					nextBtn3.setIcon(nextBtnBasicImage);
					nextBtn3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			super.add(nextBtn3);
			repaint();
		}
		
		if(e.getSource() == nextBtn3)
		{
			nextBtn3.setVisible(false);
			label2.setVisible(false);
			
			//두번째 대화 시작
			d32.setBounds(30, 480, 1200, 100);
			d32.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(d32);
			
			nextBtn4.setBounds(1000,400,300,60);
			nextBtn4.setBorderPainted(false);
			nextBtn4.setContentAreaFilled(false);
			nextBtn4.setFocusPainted(false);
			nextBtn4.addActionListener(this);
			nextBtn4.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					nextBtn4.setIcon(nextBtnEnteredImage);
					nextBtn4.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					nextBtn4.setIcon(nextBtnBasicImage);
					nextBtn4.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			super.add(nextBtn4);
			
			repaint();
		}
		
		if(e.getSource() == nextBtn4)
		{
			nextBtn4.setVisible(false);
			
			c2_1.setBounds(820,325,500,100);
			c2_1.setBorderPainted(false);
			c2_1.setContentAreaFilled(false);
			c2_1.setFocusPainted(false);
			
			super.add(c2_1);
			c2_1.setVisible(true);
			c2_1.addActionListener(this);
			c2_1.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c2_1.setIcon(c2_1EnteredImage);
					c2_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c2_1.setIcon(c2_1BasicImage);
					c2_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c2_2.setBounds(820,450,500,100);
			c2_2.setBorderPainted(false);
			c2_2.setContentAreaFilled(false);
			c2_2.setFocusPainted(false);
			
			super.add(c2_2);
			c2_2.setVisible(true);
			c2_2.addActionListener(this);
			c2_2.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c2_2.setIcon(c2_2EnteredImage);
					c2_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c2_2.setIcon(c2_2BasicImage);
					c2_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c2_3.setBounds(820,575,500,100);
			c2_3.setBorderPainted(false);
			c2_3.setContentAreaFilled(false);
			c2_3.setFocusPainted(false);
			
			super.add(c2_3);
			c2_3.setVisible(true);
			c2_3.addActionListener(this);
			c2_3.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c2_3.setIcon(c2_3EnteredImage);
					c2_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c2_3.setIcon(c2_3BasicImage);
					c2_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			repaint();
		}
		
		if(e.getSource() == c2_1 || e.getSource() == c2_2 || e.getSource() == c2_3)
		{
			c2_1.setVisible(false);
			c2_2.setVisible(false);
			c2_3.setVisible(false);
			d32.setVisible(false);
			
			if(e.getSource() == c2_1)
			{
				d33.setBounds(30, 480, 1200, 100);
				d33.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d33);
				d34.setBounds(30, 550, 1200, 100);
				d34.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d34);
				
				nextBtn5.setBounds(1000,400,300,60);
				nextBtn5.setBorderPainted(false);
				nextBtn5.setContentAreaFilled(false);
				nextBtn5.setFocusPainted(false);
				nextBtn5.addActionListener(this);
				nextBtn5.addMouseListener(new MouseAdapter()
				{
					@Override
					public void mouseEntered(MouseEvent e)
					{
						nextBtn5.setIcon(nextBtnEnteredImage);
						nextBtn5.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e)
					{
						nextBtn5.setIcon(nextBtnBasicImage);
						nextBtn5.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
				});
				super.add(nextBtn5);
			}
			else if(e.getSource() == c2_2)
			{
				d40.setBounds(30, 480, 1200, 100);
				d40.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d40);
				
				nextBtn6.setBounds(1000,400,300,60);
				nextBtn6.setBorderPainted(false);
				nextBtn6.setContentAreaFilled(false);
				nextBtn6.setFocusPainted(false);
				nextBtn6.addActionListener(this);
				nextBtn6.addMouseListener(new MouseAdapter()
				{
					@Override
					public void mouseEntered(MouseEvent e)
					{
						nextBtn6.setIcon(nextBtnEnteredImage);
						nextBtn6.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e)
					{
						nextBtn6.setIcon(nextBtnBasicImage);
						nextBtn6.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
				});
				super.add(nextBtn6);
			}
			else
			{
				d45.setBounds(30, 480, 1200, 100);
				d45.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d45);
				d46.setBounds(30, 550, 1200, 100);
				d46.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d46);
				
				nextBtn7.setBounds(1000,400,300,60);
				nextBtn7.setBorderPainted(false);
				nextBtn7.setContentAreaFilled(false);
				nextBtn7.setFocusPainted(false);
				nextBtn7.addActionListener(this);
				nextBtn7.addMouseListener(new MouseAdapter()
				{
					@Override
					public void mouseEntered(MouseEvent e)
					{
						nextBtn7.setIcon(nextBtnEnteredImage);
						nextBtn7.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e)
					{
						nextBtn7.setIcon(nextBtnBasicImage);
						nextBtn7.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
				});
				super.add(nextBtn7);
			}
			repaint();
		}
		
		if(e.getSource() == nextBtn5) // 선택지 2-1
		{
			nextBtn5.setVisible(false);
			d33.setVisible(false);
			d34.setVisible(false);
			
			d35.setBounds(30, 480, 1200, 100);
			d35.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(d35);
			d36.setBounds(30, 550, 1200, 100);
			d36.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(d36);
			
			nextBtn8.setBounds(1000,400,300,60);
			nextBtn8.setBorderPainted(false);
			nextBtn8.setContentAreaFilled(false);
			nextBtn8.setFocusPainted(false);
			nextBtn8.addActionListener(this);
			nextBtn8.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					nextBtn8.setIcon(nextBtnEnteredImage);
					nextBtn8.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					nextBtn8.setIcon(nextBtnBasicImage);
					nextBtn8.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			super.add(nextBtn8);
			repaint();
		}
		
		if(e.getSource() == nextBtn8)
		{
			nextBtn8.setVisible(false);
			
			c2_1_1.setBounds(820,325,500,100);
			c2_1_1.setBorderPainted(false);
			c2_1_1.setContentAreaFilled(false);
			c2_1_1.setFocusPainted(false);
			
			super.add(c2_1_1);
			c2_1_1.setVisible(true);
			c2_1_1.addActionListener(this);
			c2_1_1.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c2_1_1.setIcon(c2_1_1EnteredImage);
					c2_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c2_1_1.setIcon(c2_1_1BasicImage);
					c2_1_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c2_1_2.setBounds(820,450,500,100);
			c2_1_2.setBorderPainted(false);
			c2_1_2.setContentAreaFilled(false);
			c2_1_2.setFocusPainted(false);
			
			super.add(c2_1_2);
			c2_1_2.setVisible(true);
			c2_1_2.addActionListener(this);
			c2_1_2.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c2_1_2.setIcon(c2_1_2EnteredImage);
					c2_1_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c2_1_2.setIcon(c2_1_2BasicImage);
					c2_1_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c2_1_3.setBounds(820,575,500,100);
			c2_1_3.setBorderPainted(false);
			c2_1_3.setContentAreaFilled(false);
			c2_1_3.setFocusPainted(false);
			
			super.add(c2_1_3);
			c2_1_3.setVisible(true);
			c2_1_3.addActionListener(this);
			c2_1_3.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c2_1_3.setIcon(c2_1_3EnteredImage);
					c2_1_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c2_1_3.setIcon(c2_1_3BasicImage);
					c2_1_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			repaint();
		}
		
		if(e.getSource() == c2_1_1 || e.getSource() == c2_1_2 || e.getSource() == c2_1_3)
		{
			d35.setVisible(false);
			d36.setVisible(false);
			c2_1_1.setVisible(false);
			c2_1_2.setVisible(false);
			c2_1_3.setVisible(false);
			
			if(e.getSource() == c2_1_1)
			{
				GoodFeeling.teacher2FeelDown();//호감도 -1
				down.setVisible(true);
				
				d37.setBounds(30, 480, 1200, 100);
				d37.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d37);
			}
			else if(e.getSource() == c2_1_2)
			{
				GoodFeeling.teacher2FeelUp();//호감도 +1
				up.setVisible(true);
				
				d38.setBounds(30, 480, 1200, 100);
				d38.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d38);
			}
			else
			{
				GoodFeeling.teacher2FeelSame();//호감도 +0
				same.setVisible(true);
				
				d39.setBounds(30, 480, 1200, 100);
				d39.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d39);
			}
			
			super.add(nextBtnEnd);
			repaint();
		}
		
		if(e.getSource() == nextBtn6) // 선택지 2-2 nextBtn9 부터
		{
			nextBtn6.setVisible(false);
			d40.setVisible(false);
			
			d41.setBounds(30, 480, 1200, 100);
			d41.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(d41);
			
			nextBtn9.setBounds(1000,400,300,60);
			nextBtn9.setBorderPainted(false);
			nextBtn9.setContentAreaFilled(false);
			nextBtn9.setFocusPainted(false);
			nextBtn9.addActionListener(this);
			nextBtn9.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					nextBtn9.setIcon(nextBtnEnteredImage);
					nextBtn9.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					nextBtn9.setIcon(nextBtnBasicImage);
					nextBtn9.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			super.add(nextBtn9);
			repaint();
		}
		
		if(e.getSource() == nextBtn9)
		{
			nextBtn9.setVisible(false);
			
			c2_2_1.setBounds(820,325,500,100);
			c2_2_1.setBorderPainted(false);
			c2_2_1.setContentAreaFilled(false);
			c2_2_1.setFocusPainted(false);
			
			super.add(c2_2_1);
			c2_2_1.setVisible(true);
			c2_2_1.addActionListener(this);
			c2_2_1.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c2_2_1.setIcon(c2_2_1EnteredImage);
					c2_2_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c2_2_1.setIcon(c2_2_1BasicImage);
					c2_2_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c2_2_2.setBounds(820,450,500,100);
			c2_2_2.setBorderPainted(false);
			c2_2_2.setContentAreaFilled(false);
			c2_2_2.setFocusPainted(false);
			
			super.add(c2_2_2);
			c2_2_2.setVisible(true);
			c2_2_2.addActionListener(this);
			c2_2_2.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c2_2_2.setIcon(c2_2_2EnteredImage);
					c2_2_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c2_2_2.setIcon(c2_2_2BasicImage);
					c2_2_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c2_2_3.setBounds(820,575,500,100);
			c2_2_3.setBorderPainted(false);
			c2_2_3.setContentAreaFilled(false);
			c2_2_3.setFocusPainted(false);
			
			super.add(c2_2_3);
			c2_2_3.setVisible(true);
			c2_2_3.addActionListener(this);
			c2_2_3.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c2_2_3.setIcon(c2_2_3EnteredImage);
					c2_2_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c2_2_3.setIcon(c2_2_3BasicImage);
					c2_2_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			repaint();
		}
		
		if(e.getSource() == c2_2_1 || e.getSource() == c2_2_2 || e.getSource() == c2_2_3)
		{
			d41.setVisible(false);
			c2_2_1.setVisible(false);
			c2_2_2.setVisible(false);
			c2_2_3.setVisible(false);
			
			if(e.getSource() == c2_2_1)
			{
				GoodFeeling.teacher2FeelDown();//호감도 -1
				down.setVisible(true);
				
				d42.setBounds(30, 480, 1200, 100);
				d42.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d42);
			}
			else if(e.getSource() == c2_2_2)
			{
				GoodFeeling.teacher2FeelUp();//호감도 +1
				up.setVisible(true);
				
				d43.setBounds(30, 480, 1200, 100);
				d43.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d43);
			}
			else
			{
				GoodFeeling.teacher2FeelUp();//호감도 +1
				up.setVisible(true);
				
				d44.setBounds(30, 480, 1200, 100);
				d44.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d44);
			}
			
			super.add(nextBtnEnd);
			repaint();
		}
		
		if(e.getSource() == nextBtn7) // 선택지 2-3 nextBtn10 부터
		{
			nextBtn7.setVisible(false);
			
			c2_3_1.setBounds(820,325,500,100);
			c2_3_1.setBorderPainted(false);
			c2_3_1.setContentAreaFilled(false);
			c2_3_1.setFocusPainted(false);
			
			super.add(c2_3_1);
			c2_3_1.setVisible(true);
			c2_3_1.addActionListener(this);
			c2_3_1.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c2_3_1.setIcon(c2_3_1EnteredImage);
					c2_3_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c2_3_1.setIcon(c2_3_1BasicImage);
					c2_3_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c2_3_2.setBounds(820,450,500,100);
			c2_3_2.setBorderPainted(false);
			c2_3_2.setContentAreaFilled(false);
			c2_3_2.setFocusPainted(false);
			
			super.add(c2_3_2);
			c2_3_2.setVisible(true);
			c2_3_2.addActionListener(this);
			c2_3_2.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c2_3_2.setIcon(c2_3_2EnteredImage);
					c2_3_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c2_3_2.setIcon(c2_3_2BasicImage);
					c2_3_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c2_3_3.setBounds(820,575,500,100);
			c2_3_3.setBorderPainted(false);
			c2_3_3.setContentAreaFilled(false);
			c2_3_3.setFocusPainted(false);
			
			super.add(c2_3_3);
			c2_3_3.setVisible(true);
			c2_3_3.addActionListener(this);
			c2_3_3.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c2_3_3.setIcon(c2_3_3EnteredImage);
					c2_3_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c2_3_3.setIcon(c2_3_3BasicImage);
					c2_3_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			repaint();
		}
		
		if(e.getSource() == c2_3_1 || e.getSource() == c2_3_2 || e.getSource() == c2_3_3)
		{
			d45.setVisible(false);
			d46.setVisible(false);
			c2_3_1.setVisible(false);
			c2_3_2.setVisible(false);
			c2_3_3.setVisible(false);
			
			if(e.getSource() == c2_3_1)
			{
				d47.setBounds(30, 480, 1200, 100);
				d47.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d47);
				d48.setBounds(30, 550, 1200, 100);
				d48.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d48);
				
				nextBtn10.setBounds(1000,400,300,60);
				nextBtn10.setBorderPainted(false);
				nextBtn10.setContentAreaFilled(false);
				nextBtn10.setFocusPainted(false);
				nextBtn10.addActionListener(this);
				nextBtn10.addMouseListener(new MouseAdapter()
				{
					@Override
					public void mouseEntered(MouseEvent e)
					{
						nextBtn10.setIcon(nextBtnEnteredImage);
						nextBtn10.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e)
					{
						nextBtn10.setIcon(nextBtnBasicImage);
						nextBtn10.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
				});
				super.add(nextBtn10);
			}
			else if(e.getSource() == c2_3_2)
			{
				d49.setBounds(30, 480, 1200, 100);
				d49.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d49);
				d50.setBounds(30, 550, 1200, 100);
				d50.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d50);
				
				nextBtn11.setBounds(1000,400,300,60);
				nextBtn11.setBorderPainted(false);
				nextBtn11.setContentAreaFilled(false);
				nextBtn11.setFocusPainted(false);
				nextBtn11.addActionListener(this);
				nextBtn11.addMouseListener(new MouseAdapter()
				{
					@Override
					public void mouseEntered(MouseEvent e)
					{
						nextBtn11.setIcon(nextBtnEnteredImage);
						nextBtn11.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e)
					{
						nextBtn11.setIcon(nextBtnBasicImage);
						nextBtn11.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
				});
				super.add(nextBtn11);
			}
			else
			{
				d51.setBounds(30, 480, 1200, 100);
				d51.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d51);
				d52.setBounds(30, 550, 1200, 100);
				d52.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d52);
				
				nextBtn12.setBounds(1000,400,300,60);
				nextBtn12.setBorderPainted(false);
				nextBtn12.setContentAreaFilled(false);
				nextBtn12.setFocusPainted(false);
				nextBtn12.addActionListener(this);
				nextBtn12.addMouseListener(new MouseAdapter()
				{
					@Override
					public void mouseEntered(MouseEvent e)
					{
						nextBtn12.setIcon(nextBtnEnteredImage);
						nextBtn12.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e)
					{
						nextBtn12.setIcon(nextBtnBasicImage);
						nextBtn12.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
				});
				super.add(nextBtn12);
			}
			repaint();
		}
		
		if(e.getSource() == nextBtn10)
		{
			nextBtn10.setVisible(false);
			
			c2_3_1_1.setBounds(820,325,500,100);
			c2_3_1_1.setBorderPainted(false);
			c2_3_1_1.setContentAreaFilled(false);
			c2_3_1_1.setFocusPainted(false);
			
			super.add(c2_3_1_1);
			c2_3_1_1.setVisible(true);
			c2_3_1_1.addActionListener(this);
			c2_3_1_1.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c2_3_1_1.setIcon(c2_3_1_1EnteredImage);
					c2_3_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c2_3_1_1.setIcon(c2_3_1_1BasicImage);
					c2_3_1_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c2_3_1_2.setBounds(820,450,500,100);
			c2_3_1_2.setBorderPainted(false);
			c2_3_1_2.setContentAreaFilled(false);
			c2_3_1_2.setFocusPainted(false);
			
			super.add(c2_3_1_2);
			c2_3_1_2.setVisible(true);
			c2_3_1_2.addActionListener(this);
			c2_3_1_2.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c2_3_1_2.setIcon(c2_3_1_2EnteredImage);
					c2_3_1_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c2_3_1_2.setIcon(c2_3_1_2BasicImage);
					c2_3_1_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c2_3_1_3.setBounds(820,575,500,100);
			c2_3_1_3.setBorderPainted(false);
			c2_3_1_3.setContentAreaFilled(false);
			c2_3_1_3.setFocusPainted(false);
			
			super.add(c2_3_1_3);
			c2_3_1_3.setVisible(true);
			c2_3_1_3.addActionListener(this);
			c2_3_1_3.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c2_3_1_3.setIcon(c2_3_1_3EnteredImage);
					c2_3_1_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c2_3_1_3.setIcon(c2_3_1_3BasicImage);
					c2_3_1_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			repaint();
		}
		
		if(e.getSource() == c2_3_1_1 || e.getSource() == c2_3_1_2 || e.getSource() == c2_3_1_3)
		{
			d47.setVisible(false);
			d48.setVisible(false);
			c2_3_1_1.setVisible(false);
			c2_3_1_2.setVisible(false);
			c2_3_1_3.setVisible(false);
			
			if(e.getSource() == c2_3_1_1)
			{
				GoodFeeling.teacher2FeelUp(); //호감도 +1
				up.setVisible(true);
				
				d54.setBounds(30, 480, 1200, 100);
				d54.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d54);
			}
			else
			{
				GoodFeeling.teacher2FeelDown(); //호감도 -1
				down.setVisible(true);
				
				d55.setBounds(30, 480, 1200, 100);
				d55.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d55);
			}
			
			super.add(nextBtnEnd);
			repaint();
		}
		
		if(e.getSource() == nextBtn11)
		{
			nextBtn11.setVisible(false);
			
			c2_3_2_1.setBounds(820,325,500,100);
			c2_3_2_1.setBorderPainted(false);
			c2_3_2_1.setContentAreaFilled(false);
			c2_3_2_1.setFocusPainted(false);
			
			super.add(c2_3_2_1);
			c2_3_2_1.setVisible(true);
			c2_3_2_1.addActionListener(this);
			c2_3_2_1.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c2_3_2_1.setIcon(c2_3_2_1EnteredImage);
					c2_3_2_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c2_3_2_1.setIcon(c2_3_2_1BasicImage);
					c2_3_2_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c2_3_2_2.setBounds(820,450,500,100);
			c2_3_2_2.setBorderPainted(false);
			c2_3_2_2.setContentAreaFilled(false);
			c2_3_2_2.setFocusPainted(false);
			
			super.add(c2_3_2_2);
			c2_3_2_2.setVisible(true);
			c2_3_2_2.addActionListener(this);
			c2_3_2_2.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c2_3_2_2.setIcon(c2_3_2_2EnteredImage);
					c2_3_2_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c2_3_2_2.setIcon(c2_3_2_2BasicImage);
					c2_3_2_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c2_3_2_3.setBounds(820,575,500,100);
			c2_3_2_3.setBorderPainted(false);
			c2_3_2_3.setContentAreaFilled(false);
			c2_3_2_3.setFocusPainted(false);
			
			super.add(c2_3_2_3);
			c2_3_2_3.setVisible(true);
			c2_3_2_3.addActionListener(this);
			c2_3_2_3.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c2_3_2_3.setIcon(c2_3_2_3EnteredImage);
					c2_3_2_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c2_3_2_3.setIcon(c2_3_2_3BasicImage);
					c2_3_2_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			repaint();
		}
		
		if(e.getSource() == c2_3_2_1 || e.getSource() == c2_3_2_2 || e.getSource() == c2_3_2_3)
		{
			d49.setVisible(false);
			d50.setVisible(false);
			c2_3_2_1.setVisible(false);
			c2_3_2_2.setVisible(false);
			c2_3_2_3.setVisible(false);
			
			if(e.getSource() == c2_3_2_1)
			{
				GoodFeeling.teacher2FeelUp(); //호감도 +1
				up.setVisible(true);
				
				d54.setBounds(30, 480, 1200, 100);
				d54.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d54);
			}
			else
			{
				GoodFeeling.teacher2FeelDown(); //호감도 -1
				down.setVisible(true);
				
				d55.setBounds(30, 480, 1200, 100);
				d55.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d55);
			}
			
			super.add(nextBtnEnd);
			repaint();
		}
		
		if(e.getSource() == nextBtn12)
		{
			nextBtn12.setVisible(false);
			d51.setVisible(false);
			d52.setVisible(false);
			
			d53.setBounds(30, 480, 1200, 100);
			d53.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(d53);
			
			c2_3_3_1.setBounds(820,325,500,100);
			c2_3_3_1.setBorderPainted(false);
			c2_3_3_1.setContentAreaFilled(false);
			c2_3_3_1.setFocusPainted(false);
			
			super.add(c2_3_3_1);
			c2_3_3_1.setVisible(true);
			c2_3_3_1.addActionListener(this);
			c2_3_3_1.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c2_3_3_1.setIcon(c2_3_3_1EnteredImage);
					c2_3_3_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c2_3_3_1.setIcon(c2_3_3_1BasicImage);
					c2_3_3_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c2_3_3_2.setBounds(820,450,500,100);
			c2_3_3_2.setBorderPainted(false);
			c2_3_3_2.setContentAreaFilled(false);
			c2_3_3_2.setFocusPainted(false);
			
			super.add(c2_3_3_2);
			c2_3_3_2.setVisible(true);
			c2_3_3_2.addActionListener(this);
			c2_3_3_2.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c2_3_3_2.setIcon(c2_3_3_2EnteredImage);
					c2_3_3_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c2_3_3_2.setIcon(c2_3_3_2BasicImage);
					c2_3_3_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c2_3_3_3.setBounds(820,575,500,100);
			c2_3_3_3.setBorderPainted(false);
			c2_3_3_3.setContentAreaFilled(false);
			c2_3_3_3.setFocusPainted(false);
			
			super.add(c2_3_3_3);
			c2_3_3_3.setVisible(true);
			c2_3_3_3.addActionListener(this);
			c2_3_3_3.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c2_3_3_3.setIcon(c2_3_3_3EnteredImage);
					c2_3_3_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c2_3_3_3.setIcon(c2_3_3_3BasicImage);
					c2_3_3_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			repaint();
		}
		
		if(e.getSource() == c2_3_3_1 || e.getSource() == c2_3_3_2 || e.getSource() == c2_3_3_3)
		{
			d53.setVisible(false);
			c2_3_3_1.setVisible(false);
			c2_3_3_2.setVisible(false);
			c2_3_3_3.setVisible(false);
			
			if(e.getSource() == c2_3_3_3)
			{
				GoodFeeling.teacher2FeelUp(); //호감도 +1
				up.setVisible(true);
				
				d54.setBounds(30, 480, 1200, 100);
				d54.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d54);
			}
			else
			{
				GoodFeeling.teacher2FeelDown(); //호감도 -1
				down.setVisible(true);
				
				d55.setBounds(30, 480, 1200, 100);
				d55.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d55);
			}
			
			super.add(nextBtnEnd);
			repaint();
		}
		
		if(e.getSource() == nextBtnEnd) // 대화 끝
		{
			nextBtnEnd.setVisible(false);
			up.setVisible(false);
			same.setVisible(false);
			down.setVisible(false);
			d37.setVisible(false);
			d38.setVisible(false);
			d39.setVisible(false);
			d54.setVisible(false);
			d55.setVisible(false);
			name.setVisible(false);
			d42.setVisible(false);
			d43.setVisible(false);
			d44.setVisible(false);
			
			try
			{
				background = ImageIO.read(file1);
			} catch (IOException e1) {}
			
			label3.setBounds(30, 480, 1200, 100);
			label3.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(label3);
			label4.setBounds(30, 550, 1200, 100);
			label4.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(label4);
			
			nextBtnExit.setBounds(1000,400,300,60);
			nextBtnExit.setBorderPainted(false);
			nextBtnExit.setContentAreaFilled(false);
			nextBtnExit.setFocusPainted(false);
			nextBtnExit.addActionListener(this);
			nextBtnExit.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					nextBtnExit.setIcon(nextBtnEnteredImage);
					nextBtnExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					nextBtnExit.setIcon(nextBtnBasicImage);
					nextBtnExit.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			super.add(nextBtnExit);
			
			repaint();
		}
		
		if(e.getSource() == nextBtnExit)
		{
			super.setVisible(false);
			isWorked = true;
		}
	}
}
