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

public class B_Normal_1 extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;

	public static boolean isWorked = false;
	
	String[] dialogue = ProfessorDialogue.getDialogue_B(); // 교수님B 대사를 한 줄씩 끊어서 String 배열에 저장
	BufferedImage dialogBackground; // 배경 이미지
	File file1 = new File("./src/images/강의실복도.jpg"); // 강의실복도 이미지를 파일에 저장
	File file2 = new File("./src/images/강의실복도_B.jpg"); // 강의실복도_B 이미지를 파일에 저장
	JButton button1 = new JButton(new ImageIcon(Main.class.getResource("../images/버튼1.png")));
	JButton button2 = new JButton(new ImageIcon(Main.class.getResource("../images/버튼1.png")));
	JButton button_C1 = new JButton(new ImageIcon(Main.class.getResource("../images/버튼1.png")));
	JButton button_C2 = new JButton(new ImageIcon(Main.class.getResource("../images/버튼1.png")));
	JButton button_C2_2 = new JButton(new ImageIcon(Main.class.getResource("../images/버튼1.png")));
	JButton button_C2_3 = new JButton(new ImageIcon(Main.class.getResource("../images/버튼1.png")));
	JButton choose1 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_B01.png")));
	JButton choose2 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_B02.png")));
	JButton choose3 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_B03.png")));
	JButton choose1_1 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_B01_1.png")));
	JButton choose1_2 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_B01_2.png")));
	JButton choose1_3 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_B01_3.png")));
	JButton choose2_1 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_B02_1.png")));
	JButton choose2_2 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_B02_2.png")));
	JButton choose2_3 = new JButton(new ImageIcon(Main.class.getResource("../images/선택지_B02_3.png")));
	JButton chooseEnd = new JButton(new ImageIcon(Main.class.getResource("../images/버튼1.png")));
	JButton EndBtn = new JButton(new ImageIcon(Main.class.getResource("../images/버튼1.png")));
	JButton up = new JButton(new ImageIcon(Main.class.getResource("../images/호감도 상승.png")));
	JButton same = new JButton(new ImageIcon(Main.class.getResource("../images/호감도 유지.png")));
	JButton down = new JButton(new ImageIcon(Main.class.getResource("../images/호감도 하락.png")));
	
	JLabel label01 = new JLabel("(수업을 마치고 나오는 길에 복도에서 교수님과 마주쳤다!)");
	JLabel label02 = new JLabel("(나는 그대로 도망치듯 그 자리를 떠났다.)");
	JLabel label1 = new JLabel("교수님B");
	JLabel label2 = new JLabel(dialogue[0]);
	JLabel labelC1__1 = new JLabel(dialogue[1]);
	JLabel labelC2__1 = new JLabel(dialogue[2]);
	JLabel labelC2__2 = new JLabel(dialogue[3]);
	JLabel labelC3__1 = new JLabel(dialogue[4]);
	JLabel labelC1_1__1 = new JLabel(dialogue[5]);
	JLabel labelC1_2__1 = new JLabel(dialogue[6]);
	JLabel labelC1_2__2 = new JLabel(dialogue[7]);
	JLabel labelC1_3__1 = new JLabel(dialogue[8]);
	JLabel labelC2_0 = new JLabel(dialogue[9]);
	JLabel labelC2_1__1 = new JLabel(dialogue[10]);
	JLabel labelC2_2__1 = new JLabel(dialogue[11]);
	JLabel labelC2_3__1 = new JLabel(dialogue[12]);
	JLabel labelC2_3__2 = new JLabel(dialogue[13]);
	JLabel labelC2_End = new JLabel(dialogue[14]);
	
	private ImageIcon button1EnteredImage = new ImageIcon(Main.class.getResource("../images/버튼1_클릭.png"));
	private ImageIcon button1BasicImage = new ImageIcon(Main.class.getResource("../images/버튼1.png"));
	private ImageIcon choose1BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_B01.png"));
	private ImageIcon choose2BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_B02.png"));
	private ImageIcon choose3BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_B03.png"));
	private ImageIcon choose1EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_B01_clk.png"));
	private ImageIcon choose2EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_B02_clk.png"));
	private ImageIcon choose3EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_B03_clk.png"));
	private ImageIcon choose1_1BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_B01_1.png"));
	private ImageIcon choose1_2BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_B01_2.png"));
	private ImageIcon choose1_3BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_B01_3.png"));
	private ImageIcon choose1_1EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_B01_1_clk.png"));
	private ImageIcon choose1_2EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_B01_2_clk.png"));
	private ImageIcon choose1_3EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_B01_3_clk.png"));
	private ImageIcon choose2_1BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_B02_1.png"));
	private ImageIcon choose2_2BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_B02_2.png"));
	private ImageIcon choose2_3BasicImage = new ImageIcon(Main.class.getResource("../images/선택지_B02_3.png"));
	private ImageIcon choose2_1EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_B02_1_clk.png"));
	private ImageIcon choose2_2EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_B02_2_clk.png"));
	private ImageIcon choose2_3EnteredImage = new ImageIcon(Main.class.getResource("../images/선택지_B02_3_clk.png"));
	
	public void paintComponent(Graphics g)
	{
		g.drawImage(dialogBackground, 0, 0, null);
	}
	
	public B_Normal_1()
	{
		
		try
		{
			dialogBackground = ImageIO.read(file1);
		} catch (IOException e) {}
		
		super.setLayout(null);

		label01.setBounds(30, 480, 1200, 100);
		label01.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
		
		button1.setBounds(1000,400,300,60); // 버튼의 위치와 크기 지정
		button1.setBorderPainted(false); // 버튼의 외곽선 없앰
		button1.setContentAreaFilled(false); // 버튼의 내용영역 채우기 안 함
		button1.setFocusPainted(false); // 버튼이 선택되었을 때 생기는 테두리 사용 안 함
		
		super.add(label01);
		super.add(button1);
		button1.addActionListener(this);
		button1.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseEntered(MouseEvent e)
			{
				button1.setIcon(button1EnteredImage);
				button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				button1.setIcon(button1BasicImage);
				button1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
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
		
		//다음 화면 실행
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		chooseEnd.setBounds(1000,400,300,60);
		chooseEnd.setBorderPainted(false);
		chooseEnd.setContentAreaFilled(false);
		chooseEnd.setFocusPainted(false);
		chooseEnd.addActionListener(this);
		chooseEnd.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseEntered(MouseEvent e)
			{
				chooseEnd.setIcon(button1EnteredImage);
				chooseEnd.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				chooseEnd.setIcon(button1BasicImage);
				chooseEnd.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		
		if(e.getSource() == button1)
		{
			try
			{
				dialogBackground = ImageIO.read(file2);
				repaint();
			} catch (IOException e1) {}
			button1.setVisible(false);
			label01.setVisible(false);
		
			label1.setBounds(30, 385, 300, 100);
			label1.setFont(new Font("맑은 고딕", Font.BOLD, 30));
			super.add(label1);
			
			label2.setBounds(30, 480, 1200, 100);
			label2.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			
			button2.setBounds(1000,400,300,60);
			button2.setBorderPainted(false);
			button2.setContentAreaFilled(false);
			button2.setFocusPainted(false);
			super.add(label2);
			super.add(button2);
			button2.setVisible(true);
			button2.addActionListener(this);
			button2.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					button2.setIcon(button1EnteredImage);
					button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					button2.setIcon(button1BasicImage);
					button2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
		}
		if(e.getSource() == button2)
		{
			button2.setVisible(false);
			
			choose1.setBounds(820,325,500,100);
			choose1.setBorderPainted(false);
			choose1.setContentAreaFilled(false);
			choose1.setFocusPainted(false);
			
			super.add(choose1);
			choose1.setVisible(true);
			choose1.addActionListener(this);
			choose1.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					choose1.setIcon(choose1EnteredImage);
					choose1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					choose1.setIcon(choose1BasicImage);
					choose1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			choose2.setBounds(820,450,500,100);
			choose2.setBorderPainted(false);
			choose2.setContentAreaFilled(false);
			choose2.setFocusPainted(false);
			
			super.add(choose2);
			choose2.setVisible(true);
			choose2.addActionListener(this);
			choose2.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					choose2.setIcon(choose2EnteredImage);
					choose2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					choose2.setIcon(choose2BasicImage);
					choose2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			choose3.setBounds(820,575,500,100);
			choose3.setBorderPainted(false);
			choose3.setContentAreaFilled(false);
			choose3.setFocusPainted(false);
			
			super.add(choose3);
			choose3.setVisible(true);
			choose3.addActionListener(this);
			choose3.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					choose3.setIcon(choose3EnteredImage);
					choose3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					choose3.setIcon(choose3BasicImage);
					choose3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			
			
			repaint();
		}
		if(e.getSource() == choose1 || e.getSource() == choose2 || e.getSource() == choose3)
		{
			label2.setVisible(false);
			choose1.setVisible(false);
			choose2.setVisible(false);
			choose3.setVisible(false);
			
			if(e.getSource() == choose1)
			{
				GoodFeeling.teacher2FeelUp();// 호감도 +1
				up.setVisible(true);
				
				labelC1__1.setBounds(30, 480, 1200, 100);
				labelC1__1.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(labelC1__1);
				
				button_C1.setBounds(1000,400,300,60);
				button_C1.setBorderPainted(false);
				button_C1.setContentAreaFilled(false);
				button_C1.setFocusPainted(false);
				super.add(button_C1);
				button_C1.setVisible(true);
				button_C1.addActionListener(this);
				button_C1.addMouseListener(new MouseAdapter()
				{
					@Override
					public void mouseEntered(MouseEvent e)
					{
						button_C1.setIcon(button1EnteredImage);
						button_C1.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e)
					{
						button_C1.setIcon(button1BasicImage);
						button_C1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
				});
			}
			else if(e.getSource() == choose2)
			{
				GoodFeeling.teacher2FeelUp();// 호감도 +1
				up.setVisible(true);
				
				labelC2__1.setBounds(30, 480, 1200, 100);
				labelC2__1.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				labelC2__2.setBounds(30, 550, 1200, 100);
				labelC2__2.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				
				super.add(labelC2__1);
				super.add(labelC2__2);
				
				button_C2.setBounds(1000,400,300,60);
				button_C2.setBorderPainted(false);
				button_C2.setContentAreaFilled(false);
				button_C2.setFocusPainted(false);
				super.add(button_C2);
				button_C2.setVisible(true);
				button_C2.addActionListener(this);
				button_C2.addMouseListener(new MouseAdapter()
				{
					@Override
					public void mouseEntered(MouseEvent e)
					{
						button_C2.setIcon(button1EnteredImage);
						button_C2.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e)
					{
						button_C2.setIcon(button1BasicImage);
						button_C2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
				});
			}
			else
			{
				labelC3__1.setBounds(30, 480, 1200, 100);
				labelC3__1.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(labelC3__1);
				
				GoodFeeling.teacher2FeelDown();// 호감도 -2
				down.setVisible(true);;
				
				super.add(chooseEnd);
				chooseEnd.setVisible(true);
				repaint();
				
			}
		}
		if(e.getSource() == button_C1)
		{
			button_C1.setVisible(false);
			
			
			
			choose1_1.setBounds(820,325,500,100);
			choose1_1.setBorderPainted(false);
			choose1_1.setContentAreaFilled(false);
			choose1_1.setFocusPainted(false);
			super.add(choose1_1);
			choose1_1.setVisible(true);
			choose1_1.addActionListener(this);
			choose1_1.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					choose1_1.setIcon(choose1_1EnteredImage);
					choose1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					choose1_1.setIcon(choose1_1BasicImage);
					choose1_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			choose1_2.setBounds(820,450,500,100);
			choose1_2.setBorderPainted(false);
			choose1_2.setContentAreaFilled(false);
			choose1_2.setFocusPainted(false);
			super.add(choose1_2);
			choose1_2.setVisible(true);
			choose1_2.addActionListener(this);
			choose1_2.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					choose1_2.setIcon(choose1_2EnteredImage);
					choose1_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					choose1_2.setIcon(choose1_2BasicImage);
					choose1_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			choose1_3.setBounds(820,575,500,100);
			choose1_3.setBorderPainted(false);
			choose1_3.setContentAreaFilled(false);
			choose1_3.setFocusPainted(false);
			super.add(choose1_3);
			choose1_3.setVisible(true);
			choose1_3.addActionListener(this);
			choose1_3.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					choose1_3.setIcon(choose1_3EnteredImage);
					choose1_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					choose1_3.setIcon(choose1_3BasicImage);
					choose1_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			repaint();
		}
		
		if(e.getSource() == choose1_1 || e.getSource() == choose1_2 || e.getSource() == choose1_3)
		{
			up.setVisible(false);
			choose1_1.setVisible(false);
			choose1_2.setVisible(false);
			choose1_3.setVisible(false);
			labelC1__1.setVisible(false);
			
			if(e.getSource() == choose1_1)
			{
				GoodFeeling.teacher2FeelSame();// 호감도 +0
				same.setVisible(true);
				
				labelC1_1__1.setBounds(30, 480, 1200, 100);
				labelC1_1__1.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(labelC1_1__1);
			}
			else if(e.getSource() == choose1_2)
			{
				GoodFeeling.teacher2FeelDown();// 호감도 -1
				down.setVisible(true);
				
				labelC1_2__1.setBounds(30, 480, 1200, 100);
				labelC1_2__1.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				labelC1_2__2.setBounds(30, 550, 1200, 100);
				labelC1_2__2.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(labelC1_2__1);
				super.add(labelC1_2__2);
			}
			else
			{
				GoodFeeling.teacher2FeelDown();// 호감도 -1
				down.setVisible(true);
				
				labelC1_3__1.setBounds(30, 480, 1200, 100);
				labelC1_3__1.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(labelC1_3__1);
			}
			label01.setBounds(30, 480, 1200, 100);
			label01.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(label02);
			
			super.add(chooseEnd);
			chooseEnd.setVisible(true);
			repaint();
			
		}
		
		if(e.getSource() == chooseEnd)
		{
			up.setVisible(false);
			same.setVisible(false);
			down.setVisible(false);
			
			labelC1_1__1.setVisible(false);
			labelC1_2__1.setVisible(false);
			labelC1_2__2.setVisible(false);
			labelC1_3__1.setVisible(false);
			label1.setVisible(false);
			labelC2_End.setVisible(false);
			labelC3__1.setVisible(false);
			chooseEnd.setVisible(false);
			try
			{
				dialogBackground = ImageIO.read(file1);
				repaint();
			} catch (IOException e1) {}
			label02.setBounds(30, 480, 1200, 100);
			label02.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(label02);
			
			EndBtn.setBounds(1000,400,300,60);
			EndBtn.setBorderPainted(false);
			EndBtn.setContentAreaFilled(false);
			EndBtn.setFocusPainted(false);
			super.add(EndBtn);
			EndBtn.setVisible(true);
			EndBtn.addActionListener(this);
			EndBtn.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					EndBtn.setIcon(button1EnteredImage);
					EndBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					EndBtn.setIcon(button1BasicImage);
					EndBtn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
		}
		
		if(e.getSource() == EndBtn)
		{
			super.setVisible(false);
			isWorked = true;
		}
		
		if(e.getSource() == button_C2)
		{
			button_C2.setVisible(false);
			labelC2__1.setVisible(false);
			labelC2__2.setVisible(false);
			labelC2_0.setBounds(30, 480, 1200, 100);
			labelC2_0.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(labelC2_0);
			
			button_C2_2.setBounds(1000,400,300,60);
			button_C2_2.setBorderPainted(false);
			button_C2_2.setContentAreaFilled(false);
			button_C2_2.setFocusPainted(false);
			
			super.add(button_C2_2);
			button_C2_2.setVisible(true);
			button_C2_2.addActionListener(this);
			button_C2_2.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					button_C2_2.setIcon(button1EnteredImage);
					button_C2_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					button_C2_2.setIcon(button1BasicImage);
					button_C2_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
		}
		
		if(e.getSource() == button_C2_2)
		{
			up.setVisible(false);
			button_C2_2.setVisible(false);
			
			choose2_1.setBounds(820,325,500,100);
			choose2_1.setBorderPainted(false);
			choose2_1.setContentAreaFilled(false);
			choose2_1.setFocusPainted(false);
			super.add(choose2_1);
			choose2_1.setVisible(true);
			choose2_1.addActionListener(this);
			choose2_1.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					choose2_1.setIcon(choose2_1EnteredImage);
					choose2_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					choose2_1.setIcon(choose2_1BasicImage);
					choose2_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			choose2_2.setBounds(820,450,500,100);
			choose2_2.setBorderPainted(false);
			choose2_2.setContentAreaFilled(false);
			choose2_2.setFocusPainted(false);
			super.add(choose2_2);
			choose2_2.setVisible(true);
			choose2_2.addActionListener(this);
			choose2_2.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					choose2_2.setIcon(choose2_2EnteredImage);
					choose2_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					choose2_2.setIcon(choose2_2BasicImage);
					choose2_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			choose2_3.setBounds(820,575,500,100);
			choose2_3.setBorderPainted(false);
			choose2_3.setContentAreaFilled(false);
			choose2_3.setFocusPainted(false);
			super.add(choose2_3);
			choose2_3.setVisible(true);
			choose2_3.addActionListener(this);
			choose2_3.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					choose2_3.setIcon(choose2_3EnteredImage);
					choose2_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					choose2_3.setIcon(choose2_3BasicImage);
					choose2_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			repaint();
		}
		
		if(e.getSource() == choose2_1 || e.getSource() == choose2_2 || e.getSource() == choose2_3)
		{
			choose2_1.setVisible(false);
			choose2_2.setVisible(false);
			choose2_3.setVisible(false);
			labelC2_0.setVisible(false);
			
			if(e.getSource() == choose2_1)
			{
				GoodFeeling.teacher2FeelDown();// 호감도 -1
				down.setVisible(true);
				
				labelC2_1__1.setBounds(30, 480, 1200, 100);
				labelC2_1__1.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(labelC2_1__1);
			}
			else if(e.getSource() == choose2_2)
			{
				GoodFeeling.teacher2FeelDown();// 호감도 -1
				down.setVisible(true);
				
				labelC2_2__1.setBounds(30, 480, 1200, 100);
				labelC2_2__1.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(labelC2_2__1);
			}
			else
			{
				GoodFeeling.teacher2FeelUp();// 호감도 +1
				up.setVisible(true);
				
				labelC2_3__1.setBounds(30, 480, 1200, 100);
				labelC2_3__1.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				labelC2_3__2.setBounds(30, 550, 1200, 100);
				labelC2_3__2.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(labelC2_3__1);
				super.add(labelC2_3__2);
			}
			
			button_C2_3.setBounds(1000,400,300,60);
			button_C2_3.setBorderPainted(false);
			button_C2_3.setContentAreaFilled(false);
			button_C2_3.setFocusPainted(false);
			
			super.add(button_C2_3);
			button_C2_3.setVisible(true);
			button_C2_3.addActionListener(this);
			button_C2_3.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					button_C2_3.setIcon(button1EnteredImage);
					button_C2_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					button_C2_3.setIcon(button1BasicImage);
					button_C2_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			repaint();
		}
		
		if(e.getSource() == button_C2_3)
		{
			up.setVisible(false);
			down.setVisible(false);
			button_C2_3.setVisible(false);
			labelC2_1__1.setVisible(false);
			labelC2_2__1.setVisible(false);
			labelC2_3__1.setVisible(false);
			labelC2_3__2.setVisible(false);
			
			labelC2_End.setBounds(30, 480, 1200, 100);
			labelC2_End.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(labelC2_End);
			
			super.add(chooseEnd);
			chooseEnd.setVisible(true);
			
			Dialogue_B.isSpecialDialogue = true; // 특정 대화 조건 발동
			repaint();
		}
	}

}
