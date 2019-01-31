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

public class B_Special extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;

	public static boolean isWorked = false;
	
	BufferedImage background;
	File file1 = new File("./src/images/교수님방.jpg");
	File file2 = new File("./src/images/교수님방_B.jpg");
	
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
	JButton up = new JButton(new ImageIcon(Main.class.getResource("../images/호감도 상승.png")));
	JButton same = new JButton(new ImageIcon(Main.class.getResource("../images/호감도 유지.png")));
	JButton down = new JButton(new ImageIcon(Main.class.getResource("../images/호감도 하락.png")));
	JButton up_special = new JButton(new ImageIcon(Main.class.getResource("../images/호감도 상승_special.png")));
	JButton down_special = new JButton(new ImageIcon(Main.class.getResource("../images/호감도 하락_special.png")));
	
	JButton c1_1 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_교수님방_1_1.png")));
	JButton c1_2 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_교수님방_1_2.png")));
	JButton c1_3 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_교수님방_1_3.png")));
	JButton c2_1 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_교수님방_2_1.png")));
	JButton c2_2 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_교수님방_2_2.png")));
	JButton c2_3 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_교수님방_2_3.png")));
	JButton c3_1 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_교수님방_3_1.png")));
	JButton c3_2 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_교수님방_3_2.png")));
	
	JLabel name = new JLabel("교수님B");
	JLabel label1 = new JLabel("(저번 시간 교수님과의 약속을 지키기 위해 ");
	JLabel label2 = new JLabel("수업 마치고 바로 교수님 방을 찾아갔다.)");
	JLabel label3 = new JLabel("(교수님께 뭔가를 드려야 할 거 같다. 뭘 드리지?)");
	JLabel label4 = new JLabel("(탁월한 선택이다. 자칫하면 김영란법 때문에");
	JLabel label5 = new JLabel("예민하실 수도 있다.)");
	JLabel label6 = new JLabel("(교수님은 김영란법 때문에 예민하셔서 인상을");
	JLabel label7 = new JLabel("찡그리며 극구 거절하셨다..)");
	JLabel label8 = new JLabel("(전 시간에 몰랐던 내용을 물으면서 지금껏");
	JLabel label9 = new JLabel("몰랐던 문제들이 조금씩 해결되었다.)");
	JLabel label10 = new JLabel("(게다가 교수님 연구분야에 관심을 보이자");
	JLabel label11 = new JLabel("아주 흡족해하시며 길게 설명을 하셨다.)");
	JLabel label12 = new JLabel("(이야기가 막바지에 다다를 즈음,갑자기");
	JLabel label13 = new JLabel("휴대폰이 울렸다.)");
	JLabel label14 = new JLabel("(슬쩍보니 다른 교수님들의 조교로부터");
	JLabel label15 = new JLabel("급히 연락을 달라는 내용이다! 무슨일이지?)");
	JLabel label16 = new JLabel("(교수님께 급하게 인사를 하고 방을 뛰쳐나갔다.)");
	JLabel label17 = new JLabel("(무시하고 교수님과의 대화를 마저 이어나갔다.");
	JLabel label18 = new JLabel("긴 대화가 끝나고 천천히 방을 나왔다.)");
	
	String[] dialogue = ProfessorDialogue.getDialogue_B(); // 교수님B 대사를 한 줄씩 끊어서 String 배열에 저장
	JLabel d56 = new JLabel(dialogue[56]);
	JLabel d57 = new JLabel(dialogue[57]);
	JLabel d58 = new JLabel(dialogue[58]);
	JLabel d59 = new JLabel(dialogue[59]);
	
	private ImageIcon nextBtnEnteredImage = new ImageIcon(Main.class.getResource("../images/버튼1_클릭.png"));
	private ImageIcon nextBtnBasicImage = new ImageIcon(Main.class.getResource("../images/버튼1.png"));
	private ImageIcon c1_1EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_교수님방_1_1_clk.png"));
	private ImageIcon c1_1BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_교수님방_1_1.png"));
	private ImageIcon c1_2EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_교수님방_1_2_clk.png"));
	private ImageIcon c1_2BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_교수님방_1_2.png"));
	private ImageIcon c1_3EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_교수님방_1_3_clk.png"));
	private ImageIcon c1_3BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_교수님방_1_3.png"));
	private ImageIcon c2_1EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_교수님방_2_1_clk.png"));
	private ImageIcon c2_1BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_교수님방_2_1.png"));
	private ImageIcon c2_2EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_교수님방_2_2_clk.png"));
	private ImageIcon c2_2BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_교수님방_2_2.png"));
	private ImageIcon c2_3EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_교수님방_2_3_clk.png"));
	private ImageIcon c2_3BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_교수님방_2_3.png"));
	private ImageIcon c3_1EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_교수님방_3_1_clk.png"));
	private ImageIcon c3_1BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_교수님방_3_1.png"));
	private ImageIcon c3_2EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_교수님방_3_2_clk.png"));
	private ImageIcon c3_2BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_교수님방_3_2.png"));
	
	public B_Special()
	{
		try
		{
			background = ImageIO.read(file1);
		} catch (IOException e) {}
		
		super.setLayout(null);
		
		label1.setBounds(30, 480, 1200, 100);
		label1.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
		label2.setBounds(30, 550, 1200, 100);
		label2.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
		
		nextBtn1.setBounds(1000,400,300,60);
		nextBtn1.setBorderPainted(false);
		nextBtn1.setContentAreaFilled(false);
		nextBtn1.setFocusPainted(false);
		
		super.add(label1);
		super.add(label2);
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
		up_special.setBounds(300,100,100,250);
		up_special.setBorderPainted(false);
		up_special.setContentAreaFilled(false);
		up_special.setFocusPainted(false);
		down_special.setBounds(300,100,100,250);
		down_special.setBorderPainted(false);
		down_special.setContentAreaFilled(false);
		down_special.setFocusPainted(false);
		
		super.add(up);
		super.add(same);
		super.add(down);
		super.add(up_special);
		super.add(down_special);
		up.setVisible(false);
		same.setVisible(false);
		down.setVisible(false);
		up_special.setVisible(false);
		down_special.setVisible(false);
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
			nextBtn1.setVisible(false);
			label1.setVisible(false);
			label2.setVisible(false);
			
			try
			{
				background = ImageIO.read(file2);
			} catch (IOException e1) {}
			
			name.setBounds(30, 385, 300, 100);
			name.setFont(new Font("맑은 고딕", Font.BOLD, 30));
			super.add(name);
			d56.setBounds(30, 480, 1200, 100);
			d56.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(d56);
			
			nextBtn2.setBounds(1000,400,300,60);
			nextBtn2.setBorderPainted(false);
			nextBtn2.setContentAreaFilled(false);
			nextBtn2.setFocusPainted(false);
			
			super.add(nextBtn2);
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
			
			repaint();
		}
		
		if(e.getSource() == nextBtn2)
		{
			nextBtn2.setVisible(false);
			
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
			d56.setVisible(false);
			
			if(e.getSource() == c1_1 || e.getSource() == c1_3)
			{
				GoodFeeling.teacher2FeelDown();//호감도 -1
				down.setVisible(true);
				
				d57.setBounds(30, 480, 1200, 100);
				d57.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d57);
				d58.setBounds(30, 550, 1200, 100);
				d58.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d58);
			}
			else
			{
				GoodFeeling.teacher2FeelUp();//호감도 +1
				up.setVisible(true);
				
				d59.setBounds(30, 480, 1200, 100);
				d59.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d59);
			}
	
			nextBtn3.setBounds(1000,400,300,60);
			nextBtn3.setBorderPainted(false);
			nextBtn3.setContentAreaFilled(false);
			nextBtn3.setFocusPainted(false);
			
			super.add(nextBtn3);
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
			repaint();
		}
		
		if(e.getSource() == nextBtn3)
		{
			nextBtn3.setVisible(false);
			d57.setVisible(false);
			d58.setVisible(false);
			d59.setVisible(false);
			up.setVisible(false);
			same.setVisible(false);
			down.setVisible(false);
			
			label3.setBounds(30, 480, 1200, 100);
			label3.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(label3);
			
			nextBtn4.setBounds(1000,400,300,60);
			nextBtn4.setBorderPainted(false);
			nextBtn4.setContentAreaFilled(false);
			nextBtn4.setFocusPainted(false);
			
			super.add(nextBtn4);
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
			label3.setVisible(false);
			
			if(e.getSource() == c2_1 || e.getSource() == c2_2)
			{
				GoodFeeling.teacher2FeelDown();//호감도 -1
				down.setVisible(true);
				
				label6.setBounds(30, 480, 1200, 100);
				label6.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(label6);
				label7.setBounds(30, 550, 1200, 100);
				label7.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(label7);
			}
			else
			{
				GoodFeeling.teacher2FeelUp();//호감도 +1
				up.setVisible(true);
				
				label4.setBounds(30, 480, 1200, 100);
				label4.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(label4);
				label5.setBounds(30, 550, 1200, 100);
				label5.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(label5);
			}
			
			nextBtn5.setBounds(1000,400,300,60);
			nextBtn5.setBorderPainted(false);
			nextBtn5.setContentAreaFilled(false);
			nextBtn5.setFocusPainted(false);
			
			super.add(nextBtn5);
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
			repaint();
		}
		
		if(e.getSource() == nextBtn5)
		{
			up.setVisible(false);
			down.setVisible(false);
			nextBtn5.setVisible(false);
			label4.setVisible(false);
			label5.setVisible(false);
			label6.setVisible(false);
			label7.setVisible(false);
			
			name.setVisible(false);
			try
			{
				background = ImageIO.read(file1);
			} catch (IOException e1) {}
			
			label8.setBounds(30, 480, 1200, 100);
			label8.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(label8);
			label9.setBounds(30, 550, 1200, 100);
			label9.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(label9);
			
			nextBtn6.setBounds(1000,400,300,60);
			nextBtn6.setBorderPainted(false);
			nextBtn6.setContentAreaFilled(false);
			nextBtn6.setFocusPainted(false);
			
			super.add(nextBtn6);
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
			repaint();
		}
		
		if(e.getSource() == nextBtn6)
		{
			nextBtn6.setVisible(false);
			label8.setVisible(false);
			label9.setVisible(false);
			
			GoodFeeling.teacher2FeelUp();//호감도 +1
			up.setVisible(true);
			
			label10.setBounds(30, 480, 1200, 100);
			label10.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(label10);
			label11.setBounds(30, 550, 1200, 100);
			label11.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(label11);
			
			nextBtn7.setBounds(1000,400,300,60);
			nextBtn7.setBorderPainted(false);
			nextBtn7.setContentAreaFilled(false);
			nextBtn7.setFocusPainted(false);
			
			super.add(nextBtn7);
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
			repaint();
		}
		
		if(e.getSource() == nextBtn7)
		{
			nextBtn7.setVisible(false);
			label10.setVisible(false);
			label11.setVisible(false);
			up.setVisible(false);
			
			try
			{
				background = ImageIO.read(file1);
			} catch (IOException e1) {}
			
			label12.setBounds(30, 480, 1200, 100);
			label12.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(label12);
			label13.setBounds(30, 550, 1200, 100);
			label13.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(label13);
			
			nextBtn8.setBounds(1000,400,300,60);
			nextBtn8.setBorderPainted(false);
			nextBtn8.setContentAreaFilled(false);
			nextBtn8.setFocusPainted(false);
			
			super.add(nextBtn8);
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
			repaint();
		}
		
		if(e.getSource() == nextBtn8)
		{
			nextBtn8.setVisible(false);
			label12.setVisible(false);
			label13.setVisible(false);
			
			label14.setBounds(30, 480, 1200, 100);
			label14.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(label14);
			label15.setBounds(30, 550, 1200, 100);
			label15.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(label15);
			
			nextBtn9.setBounds(1000,400,300,60);
			nextBtn9.setBorderPainted(false);
			nextBtn9.setContentAreaFilled(false);
			nextBtn9.setFocusPainted(false);
			
			super.add(nextBtn9);
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
			repaint();
		}
		
		if(e.getSource() == nextBtn9)
		{
			nextBtn9.setVisible(false);
			
			c3_1.setBounds(820,325,500,100);
			c3_1.setBorderPainted(false);
			c3_1.setContentAreaFilled(false);
			c3_1.setFocusPainted(false);
			
			super.add(c3_1);
			c3_1.setVisible(true);
			c3_1.addActionListener(this);
			c3_1.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c3_1.setIcon(c3_1EnteredImage);
					c3_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c3_1.setIcon(c3_1BasicImage);
					c3_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c3_2.setBounds(820,575,500,100);
			c3_2.setBorderPainted(false);
			c3_2.setContentAreaFilled(false);
			c3_2.setFocusPainted(false);
			
			super.add(c3_2);
			c3_2.setVisible(true);
			c3_2.addActionListener(this);
			c3_2.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c3_2.setIcon(c3_2EnteredImage);
					c3_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c3_2.setIcon(c3_2BasicImage);
					c3_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			repaint();
		}
		
		if(e.getSource() == c3_1 || e.getSource() == c3_2)
		{
			c3_1.setVisible(false);
			c3_2.setVisible(false);
			label14.setVisible(false);
			label15.setVisible(false);
			
			if(e.getSource() == c3_1)
			{
				//호감도 -1 교수님A,C +1
				GoodFeeling.teacher2FeelDown();
				GoodFeeling.teacher1FeelUp();
				GoodFeeling.teacher3FeelUp();
				down.setVisible(true);
				up_special.setVisible(true);
				
				label16.setBounds(30, 480, 1200, 100);
				label16.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(label16);
			}
			else
			{
				//호감도 +1 교수님A,C -1
				GoodFeeling.teacher2FeelUp();
				GoodFeeling.teacher1FeelDown();
				GoodFeeling.teacher3FeelDown();
				up.setVisible(true);
				down_special.setVisible(true);
				
				label17.setBounds(30, 480, 1200, 100);
				label17.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(label17);
				label18.setBounds(30, 550, 1200, 100);
				label18.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(label18);
			}
			
			super.add(nextBtnEnd);
			repaint();
		}
		
		if(e.getSource() == nextBtnEnd)
		{
			super.setVisible(false);
			isWorked = true;
		}
	}
}
