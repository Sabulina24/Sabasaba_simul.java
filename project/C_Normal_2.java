package project;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
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

public class C_Normal_2 extends JPanel{
private static final long serialVersionUID = 1L;
	
	public static boolean isworked=false;
	BufferedImage backGround;
	URL url_1=getClass().getClassLoader().getResource("강의실안.jpg");
	URL url_2=getClass().getClassLoader().getResource("강의실안_C.jpg");
	
	private ImageIcon select1_1=new ImageIcon(getClass().getClassLoader().getResource("선택지2-1.png"));
	private ImageIcon selectc1_1=new ImageIcon(getClass().getClassLoader().getResource("선택지클릭2-1.png"));
	private ImageIcon select1_2=new ImageIcon(getClass().getClassLoader().getResource("선택지2-2.png"));
	private ImageIcon selectc1_2=new ImageIcon(getClass().getClassLoader().getResource("선택지클릭2-2.png"));
	private ImageIcon select1_3=new ImageIcon(getClass().getClassLoader().getResource("선택지2-3.png"));
	private ImageIcon selectc1_3=new ImageIcon(getClass().getClassLoader().getResource("선택지클릭2-3.png"));
	private ImageIcon select1_1_1=new ImageIcon(getClass().getClassLoader().getResource("선택지2-1-1.png"));
	private ImageIcon selectc1_1_1=new ImageIcon(getClass().getClassLoader().getResource("선택지클릭2-1-1.png"));
	private ImageIcon select1_1_2=new ImageIcon(getClass().getClassLoader().getResource("선택지2-1-2.png"));
	private ImageIcon selectc1_1_2=new ImageIcon(getClass().getClassLoader().getResource("선택지클릭2-1-2.png"));
	private ImageIcon select1_1_3=new ImageIcon(getClass().getClassLoader().getResource("선택지2-1-3.png"));
	private ImageIcon selectc1_1_3=new ImageIcon(getClass().getClassLoader().getResource("선택지클릭2-1-3.png"));
	private ImageIcon select1_2_1=new ImageIcon(getClass().getClassLoader().getResource("선택지2-2-1.png"));
	private ImageIcon selectc1_2_1=new ImageIcon(getClass().getClassLoader().getResource("선택지클릭2-2-1.png"));
	private ImageIcon select1_2_2=new ImageIcon(getClass().getClassLoader().getResource("선택지2-2-2.png"));
	private ImageIcon selectc1_2_2=new ImageIcon(getClass().getClassLoader().getResource("선택지클릭2-2-2.png"));
	private ImageIcon select1_2_3=new ImageIcon(getClass().getClassLoader().getResource("선택지2-2-3.png"));
	private ImageIcon selectc1_2_3=new ImageIcon(getClass().getClassLoader().getResource("선택지클릭2-2-3.png"));
	private ImageIcon select1_3_1=new ImageIcon(getClass().getClassLoader().getResource("선택지2-3-1.png"));
	private ImageIcon selectc1_3_1=new ImageIcon(getClass().getClassLoader().getResource("선택지클릭2-3-1.png"));
	private ImageIcon select1_3_2=new ImageIcon(getClass().getClassLoader().getResource("선택지2-3-2.png"));
	private ImageIcon selectc1_3_2=new ImageIcon(getClass().getClassLoader().getResource("선택지클릭2-3-2.png"));
	private ImageIcon select1_3_3=new ImageIcon(getClass().getClassLoader().getResource("선택지2-3-3.png"));
	private ImageIcon selectc1_3_3=new ImageIcon(getClass().getClassLoader().getResource("선택지클릭2-3-3.png"));
	private ImageIcon nextButtonBasicImage=new ImageIcon(getClass().getClassLoader().getResource("버튼1.png"));
	private ImageIcon nextButtonEnteredImage=new ImageIcon(getClass().getClassLoader().getResource("버튼1_클릭.png"));
	private ImageIcon up=new ImageIcon(getClass().getClassLoader().getResource("호감도 상승.png"));
	private ImageIcon down=new ImageIcon(getClass().getClassLoader().getResource("호감도 하락.png"));
	private ImageIcon maintain=new ImageIcon(getClass().getClassLoader().getResource("호감도 유지.png"));
		
	private JButton nextButton=new JButton(nextButtonBasicImage);
	private JButton selectButton1_1=new JButton(select1_1);
	private JButton selectButton1_2=new JButton(select1_2);
	private JButton selectButton1_3=new JButton(select1_3);
	private JButton selectButton1_1_1=new JButton(select1_1_1);
	private JButton selectButton1_1_2=new JButton(select1_1_2);
	private JButton selectButton1_1_3=new JButton(select1_1_3);
	private JButton selectButton1_2_1=new JButton(select1_2_1);
	private JButton selectButton1_2_2=new JButton(select1_2_2);
	private JButton selectButton1_2_3=new JButton(select1_2_3);
	private JButton selectButton1_3_1=new JButton(select1_3_1);
	private JButton selectButton1_3_2=new JButton(select1_3_2);
	private JButton selectButton1_3_3=new JButton(select1_3_3);
	private JButton upImage=new JButton(up);
	private JButton downImage=new JButton(down);
	private JButton maintainImage=new JButton(maintain);
	
	private JLabel professor=new JLabel("교수님 C");
	private JLabel situation1=new JLabel("수업 도중 교수님께서 뜬금없는 질문을 하셨다");
	String[] dialogue=ProfessorLines.getDialogue_C();
	
	JLabel d13=new JLabel(dialogue[13]);
	JLabel d14=new JLabel(dialogue[14]);
	JLabel d15=new JLabel(dialogue[15]);
	JLabel d16=new JLabel(dialogue[16]);
	JLabel d17=new JLabel(dialogue[17]);
	JLabel d18=new JLabel(dialogue[18]);
	JLabel d19=new JLabel(dialogue[19]);
	JLabel d20=new JLabel(dialogue[20]);
	JLabel d21=new JLabel(dialogue[21]);
	JLabel d22=new JLabel(dialogue[22]);
	JLabel d23=new JLabel(dialogue[23]);
	JLabel d24=new JLabel(dialogue[24]);
	JLabel d25=new JLabel(dialogue[25]);
	
	public C_Normal_2()
	{
		try {
			backGround=ImageIO.read(url_1);
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		repaint();
		
		setLayout(null);
		
		situation1.setBounds(30, 480, 1200, 100);
		super.add(situation1);
		situation1.setVisible(true);
		situation1.setFont(new Font(null, Font.PLAIN, 40));
		
		d13.setBounds(30, 480, 1200, 100);
		super.add(d13);
		d13.setVisible(false);
		d13.setFont(new Font(null, Font.PLAIN, 40));
		
		professor.setBounds(30, 385, 300, 100);
		super.add(professor);
		professor.setVisible(false);
		professor.setFont(new Font(null, Font.BOLD, 30));
		
		upImage.setBounds(160, 100, 100, 250);
		upImage.setBorderPainted(false);
		upImage.setContentAreaFilled(false);
		upImage.setFocusPainted(false);
		super.add(upImage);
		upImage.setVisible(false);
		downImage.setBounds(160, 100, 100, 250);
		downImage.setBorderPainted(false);
		downImage.setContentAreaFilled(false);
		downImage.setFocusPainted(false);
		super.add(downImage);
		downImage.setVisible(false);
		maintainImage.setBounds(160, 100, 100, 250);
		maintainImage.setBorderPainted(false);
		maintainImage.setContentAreaFilled(false);
		maintainImage.setFocusPainted(false);
		super.add(maintainImage);
		maintainImage.setVisible(false);
 
		nextButton.setBounds(1000, 400, 300, 60);
		nextButton.setBorderPainted(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setFocusPainted(false);
		nextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				nextButton.setIcon(nextButtonEnteredImage);
				nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				nextButton.setIcon(nextButtonBasicImage);
				nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				
				try {
					backGround=ImageIO.read(url_2);//파일2로 바뀌면서 대화 발생
				}catch(IOException ex) {
					ex.printStackTrace();
				}
				repaint();	
				situation1.setVisible(false);
				d13.setVisible(true);
				repaint();
				professor.setVisible(true);
				
				nextButton.setBounds(1000, 400, 300, 60);
				nextButton.setBorderPainted(false);
				nextButton.setContentAreaFilled(false);
				nextButton.setFocusPainted(false);
				nextButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						nextButton.setIcon(nextButtonEnteredImage);
						nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						nextButton.setIcon(nextButtonBasicImage);
						nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
					@Override
					public void mousePressed(MouseEvent e) {
						nextButton.setVisible(false);
						Select1();
						repaint();	
					}
				});
				add(nextButton);
				repaint();
				
			}
		});
		add(nextButton);
		repaint();
		
	}
	
	public void Select1()//처음선택지 세개
	{
		professor.setVisible(false);
		selectButton1_1.setBounds(820, 325, 500, 100);
		selectButton1_1.setBorderPainted(false);
		selectButton1_1.setContentAreaFilled(false);
		selectButton1_1.setFocusPainted(false);
		selectButton1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				selectButton1_1.setIcon(selectc1_1);
				selectButton1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				selectButton1_1.setIcon(select1_1);
				selectButton1_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				selectButton1_1.setVisible(false);
				selectButton1_2.setVisible(false);
				selectButton1_3.setVisible(false);
 
				repaint();
				
				Selected1();
			}
		});
		add(selectButton1_1);
		
		selectButton1_2.setBounds(820, 450, 500, 100);
		selectButton1_2.setBorderPainted(false);
		selectButton1_2.setContentAreaFilled(false);
		selectButton1_2.setFocusPainted(false);
		selectButton1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				selectButton1_2.setIcon(selectc1_2);
				selectButton1_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				selectButton1_2.setIcon(select1_2);
				selectButton1_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				selectButton1_1.setVisible(false);
				selectButton1_2.setVisible(false);
				selectButton1_3.setVisible(false);
 
				repaint();
				
				Selected2();
			}
		});
		add(selectButton1_2);
		
		selectButton1_3.setBounds(820, 575, 500, 100);
		selectButton1_3.setBorderPainted(false);
		selectButton1_3.setContentAreaFilled(false);
		selectButton1_3.setFocusPainted(false);
		selectButton1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				selectButton1_3.setIcon(selectc1_3);
				selectButton1_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				selectButton1_3.setIcon(select1_3);
				selectButton1_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				selectButton1_1.setVisible(false);
				selectButton1_2.setVisible(false);
				selectButton1_3.setVisible(false);
 
				repaint();
				
				Selected3();
			}
		});
		add(selectButton1_3);
		
	}
	
	public void Selected1()//교수님 재등장
	{
		d13.setVisible(false);
		
		professor.setBounds(30, 385, 300, 100);
		super.add(professor);
		professor.setVisible(true);
		professor.setFont(new Font(null, Font.BOLD, 30));
		
		d14.setBounds(30, 480, 1200, 100);
		super.add(d14);
		d14.setVisible(true);
		d14.setFont(new Font(null, Font.PLAIN, 40));
		
		upImage.setVisible(true);
		Feeling.pf3_UP();
		
		nextButton.setVisible(true);
		nextButton.setBounds(1000, 400, 300, 60);
		nextButton.setBorderPainted(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setFocusPainted(false);
		nextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				nextButton.setIcon(nextButtonEnteredImage);
				nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				nextButton.setIcon(nextButtonBasicImage);
				nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				nextButton.setVisible(false);
 
				repaint();
				Select1_1();
			}
		});
		add(nextButton);
	}
	
	public void Selected2()//교수님 재등장
	{
		d13.setVisible(false);
		
		professor.setBounds(30, 385, 300, 100);
		super.add(professor);
		professor.setVisible(true);
		professor.setFont(new Font(null, Font.BOLD, 30));
		
		d15.setBounds(30, 480, 1200, 100);
		super.add(d15);
		d15.setVisible(true);
		d15.setFont(new Font(null, Font.PLAIN, 40));
		
		downImage.setVisible(true);
		Feeling.pf3_DOWN();
		
		nextButton.setVisible(true);
		nextButton.setBounds(1000, 400, 300, 60);
		nextButton.setBorderPainted(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setFocusPainted(false);
		nextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				nextButton.setIcon(nextButtonEnteredImage);
				nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				nextButton.setIcon(nextButtonBasicImage);
				nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				nextButton.setVisible(false);
 
				repaint();
				Select1_2();
			}
		});
		add(nextButton);
	}
	
	public void Selected3()//교수님 재등장
	{
		d13.setVisible(false);
		
		professor.setBounds(30, 385, 300, 100);
		super.add(professor);
		professor.setVisible(true);
		professor.setFont(new Font(null, Font.BOLD, 30));
		
		d16.setBounds(30, 480, 1200, 100);
		super.add(d16);
		d16.setVisible(true);
		d16.setFont(new Font(null, Font.PLAIN, 40));
		
		maintainImage.setVisible(true);
		Feeling.pf3_SAME();
		
		nextButton.setVisible(true);
		nextButton.setBounds(1000, 400, 300, 60);
		nextButton.setBorderPainted(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setFocusPainted(false);
		nextButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				nextButton.setIcon(nextButtonEnteredImage);
				nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				nextButton.setIcon(nextButtonBasicImage);
				nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				nextButton.setVisible(false);
 
				repaint();
				Select1_3();
			}
		});
		add(nextButton);
	}
	
	public void Select1_1()//두번째 선택지 세개
	{
		d13.setVisible(false);
		
		downImage.setVisible(false);
		upImage.setVisible(false);
		maintainImage.setVisible(false);
 
		professor.setVisible(false);
		selectButton1_1_1.setVisible(true);
		selectButton1_1_1.setBounds(820, 325, 500, 100);
		selectButton1_1_1.setBorderPainted(false);
		selectButton1_1_1.setContentAreaFilled(false);
		selectButton1_1_1.setFocusPainted(false);
		selectButton1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				selectButton1_1_1.setIcon(selectc1_1_1);
				selectButton1_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				selectButton1_1_1.setIcon(select1_1_1);
				selectButton1_1_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					Thread.sleep(50);
				}catch(InterruptedException ex) {
					ex.printStackTrace();
				}
				Last1();
				maintainImage.setVisible(true);
 
				nextButton.setVisible(true);
				nextButton.setBounds(1000, 400, 300, 60);
				nextButton.setBorderPainted(false);
				nextButton.setContentAreaFilled(false);
				nextButton.setFocusPainted(false);
				nextButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						nextButton.setIcon(nextButtonEnteredImage);
						nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						nextButton.setIcon(nextButtonBasicImage);
						nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
					@Override
					public void mousePressed(MouseEvent e) {
						nextButton.setVisible(false);
 
						End();
					}
				});
				add(nextButton);
			}
		});
		add(selectButton1_1_1);
		
		selectButton1_1_2.setVisible(true);
		selectButton1_1_2.setBounds(820, 450, 500, 100);
		selectButton1_1_2.setBorderPainted(false);
		selectButton1_1_2.setContentAreaFilled(false);
		selectButton1_1_2.setFocusPainted(false);
		selectButton1_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				selectButton1_1_2.setIcon(selectc1_1_2);
				selectButton1_1_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				selectButton1_1_2.setIcon(select1_1_2);
				selectButton1_1_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					Thread.sleep(50);
				}catch(InterruptedException ex) {
					ex.printStackTrace();
				}
				Last2();
				maintainImage.setVisible(true);
 
				
				nextButton.setVisible(true);
				nextButton.setBounds(1000, 400, 300, 60);
				nextButton.setBorderPainted(false);
				nextButton.setContentAreaFilled(false);
				nextButton.setFocusPainted(false);
				nextButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						nextButton.setIcon(nextButtonEnteredImage);
						nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						nextButton.setIcon(nextButtonBasicImage);
						nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
					@Override
					public void mousePressed(MouseEvent e) {
						nextButton.setVisible(false);
	
						End();
					}
				});
				add(nextButton);
			}
		});
		add(selectButton1_1_2);
		
		selectButton1_1_3.setVisible(true);
		selectButton1_1_3.setBounds(820, 575, 500, 100);
		selectButton1_1_3.setBorderPainted(false);
		selectButton1_1_3.setContentAreaFilled(false);
		selectButton1_1_3.setFocusPainted(false);
		selectButton1_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				selectButton1_1_3.setIcon(selectc1_1_3);
				selectButton1_1_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				selectButton1_1_3.setIcon(select1_1_3);
				selectButton1_1_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					Thread.sleep(50);
				}catch(InterruptedException ex) {
					ex.printStackTrace();
				}
				Last3();
				downImage.setVisible(true);
 
				
				nextButton.setVisible(true);
				nextButton.setBounds(1000, 400, 300, 60);
				nextButton.setBorderPainted(false);
				nextButton.setContentAreaFilled(false);
				nextButton.setFocusPainted(false);
				nextButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						nextButton.setIcon(nextButtonEnteredImage);
						nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						nextButton.setIcon(nextButtonBasicImage);
						nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
					@Override
					public void mousePressed(MouseEvent e) {
						nextButton.setVisible(false);
 
						End();
					}
				});
				add(nextButton);
			}
		});
		add(selectButton1_1_3);
		
	}
	
	public void Select1_2()//두번째 선택지 세개
	{
		d13.setVisible(false);
		
		downImage.setVisible(false);
		upImage.setVisible(false);
		maintainImage.setVisible(false);
		
		professor.setVisible(false);
		selectButton1_2_1.setVisible(true);
		selectButton1_2_2.setVisible(true);
		selectButton1_2_3.setVisible(true);
		selectButton1_2_1.setBounds(820, 325, 500, 100);
		selectButton1_2_1.setBorderPainted(false);
		selectButton1_2_1.setContentAreaFilled(false);
		selectButton1_2_1.setFocusPainted(false);
		selectButton1_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				selectButton1_2_1.setIcon(selectc1_2_1);
				selectButton1_2_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				selectButton1_2_1.setIcon(select1_2_1);
				selectButton1_2_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					Thread.sleep(50);
				}catch(InterruptedException ex) {
					ex.printStackTrace();
				}
				Last4();
				downImage.setVisible(true);
 
				
				nextButton.setVisible(true);
				nextButton.setBounds(1000, 400, 300, 60);
				nextButton.setBorderPainted(false);
				nextButton.setContentAreaFilled(false);
				nextButton.setFocusPainted(false);
				nextButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						nextButton.setIcon(nextButtonEnteredImage);
						nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						nextButton.setIcon(nextButtonBasicImage);
						nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
					@Override
					public void mousePressed(MouseEvent e) {
						nextButton.setVisible(false);
 
						End();
					}
				});
				add(nextButton);
 
			}
		});
		add(selectButton1_2_1);
		
		selectButton1_2_2.setBounds(820, 450, 500, 100);
		selectButton1_2_2.setBorderPainted(false);
		selectButton1_2_2.setContentAreaFilled(false);
		selectButton1_2_2.setFocusPainted(false);
		selectButton1_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				selectButton1_2_2.setIcon(selectc1_2_2);
				selectButton1_2_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				selectButton1_2_2.setIcon(select1_2_2);
				selectButton1_2_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					Thread.sleep(50);
				}catch(InterruptedException ex) {
					ex.printStackTrace();
				}
				
				Last5();
				maintainImage.setVisible(true);
 
				
				nextButton.setVisible(true);
				nextButton.setBounds(1000, 400, 300, 60);
				nextButton.setBorderPainted(false);
				nextButton.setContentAreaFilled(false);
				nextButton.setFocusPainted(false);
				nextButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						nextButton.setIcon(nextButtonEnteredImage);
						nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						nextButton.setIcon(nextButtonBasicImage);
						nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
					@Override
					public void mousePressed(MouseEvent e) {
						nextButton.setVisible(false);
 
						End();
					}
				});
				add(nextButton);
			}
		});
		add(selectButton1_2_2);
		
		selectButton1_2_3.setBounds(820, 575, 500, 100);
		selectButton1_2_3.setBorderPainted(false);
		selectButton1_2_3.setContentAreaFilled(false);
		selectButton1_2_3.setFocusPainted(false);
		selectButton1_2_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				selectButton1_2_3.setIcon(selectc1_2_3);
				selectButton1_2_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				selectButton1_2_3.setIcon(select1_2_3);
				selectButton1_2_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					Thread.sleep(50);
				}catch(InterruptedException ex) {
					ex.printStackTrace();
				}
				
				Last6();
				downImage.setVisible(true);
 
				
				nextButton.setVisible(true);
				nextButton.setBounds(1000, 400, 300, 60);
				nextButton.setBorderPainted(false);
				nextButton.setContentAreaFilled(false);
				nextButton.setFocusPainted(false);
				nextButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						nextButton.setIcon(nextButtonEnteredImage);
						nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						nextButton.setIcon(nextButtonBasicImage);
						nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
					@Override
					public void mousePressed(MouseEvent e) {
						nextButton.setVisible(false);
	
						End();
					}
				});
				add(nextButton);
			}
		});
		add(selectButton1_2_3);
		
	}
	
	
	public void Select1_3()//두번째 선택지 세개
	{
		d13.setVisible(false);
		
		downImage.setVisible(false);
		upImage.setVisible(false);
		maintainImage.setVisible(false);
		
		professor.setVisible(false);
		selectButton1_3_1.setVisible(true);
		selectButton1_3_2.setVisible(true);
		selectButton1_3_3.setVisible(true);
		selectButton1_3_1.setBounds(820, 325, 500, 100);
		selectButton1_3_1.setBorderPainted(false);
		selectButton1_3_1.setContentAreaFilled(false);
		selectButton1_3_1.setFocusPainted(false);
		selectButton1_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				selectButton1_3_1.setIcon(selectc1_3_1);
				selectButton1_3_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				selectButton1_3_1.setIcon(select1_3_1);
				selectButton1_3_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					Thread.sleep(50);
				}catch(InterruptedException ex) {
					ex.printStackTrace();
				}
				
				Last7();
				downImage.setVisible(true);
 
				
				nextButton.setVisible(true);
				nextButton.setBounds(1000, 400, 300, 60);
				nextButton.setBorderPainted(false);
				nextButton.setContentAreaFilled(false);
				nextButton.setFocusPainted(false);
				nextButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						nextButton.setIcon(nextButtonEnteredImage);
						nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						nextButton.setIcon(nextButtonBasicImage);
						nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
					@Override
					public void mousePressed(MouseEvent e) {
						nextButton.setVisible(false);
 
						End();
					}
				});
				add(nextButton);
			}
		});
		add(selectButton1_3_1);
		
		selectButton1_3_2.setBounds(820, 450, 500, 100);
		selectButton1_3_2.setBorderPainted(false);
		selectButton1_3_2.setContentAreaFilled(false);
		selectButton1_3_2.setFocusPainted(false);
		selectButton1_3_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				selectButton1_3_2.setIcon(selectc1_3_2);
				selectButton1_3_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				selectButton1_3_2.setIcon(select1_3_2);
				selectButton1_3_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					Thread.sleep(50);
				}catch(InterruptedException ex) {
					ex.printStackTrace();
				}
				
				Last8();
				downImage.setVisible(true);
 
				
				nextButton.setVisible(true);
				nextButton.setBounds(1000, 400, 300, 60);
				nextButton.setBorderPainted(false);
				nextButton.setContentAreaFilled(false);
				nextButton.setFocusPainted(false);
				nextButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						nextButton.setIcon(nextButtonEnteredImage);
						nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						nextButton.setIcon(nextButtonBasicImage);
						nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
					@Override
					public void mousePressed(MouseEvent e) {
						nextButton.setVisible(false);
 
						End();
					}
				});
				add(nextButton);
			}
		});
		add(selectButton1_3_2);
		
		selectButton1_3_3.setBounds(820, 575, 500, 100);
		selectButton1_3_3.setBorderPainted(false);
		selectButton1_3_3.setContentAreaFilled(false);
		selectButton1_3_3.setFocusPainted(false);
		selectButton1_3_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				selectButton1_3_3.setIcon(selectc1_3_3);
				selectButton1_3_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				selectButton1_3_3.setIcon(select1_3_3);
				selectButton1_3_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					Thread.sleep(50);
				}catch(InterruptedException ex) {
					ex.printStackTrace();
				}
				
				Last9();
				upImage.setVisible(true);
				
				nextButton.setVisible(true);
				nextButton.setBounds(1000, 400, 300, 60);
				nextButton.setBorderPainted(false);
				nextButton.setContentAreaFilled(false);
				nextButton.setFocusPainted(false);
				nextButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						nextButton.setIcon(nextButtonEnteredImage);
						nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						nextButton.setIcon(nextButtonBasicImage);
						nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
					@Override
					public void mousePressed(MouseEvent e) {
						nextButton.setVisible(false);
 
						End();
					}
				});
				add(nextButton);
			}
		});
		add(selectButton1_3_3);
		
	}
	
	public void Last1()
	{
		professor.setVisible(true);
		d14.setVisible(false);
		Feeling.pf3_SAME();
 
		selectButton1_1_1.setVisible(false);
		selectButton1_1_2.setVisible(false);
		selectButton1_1_3.setVisible(false);
		
		d17.setBounds(30, 480, 1200, 100);
		super.add(d17);
		d17.setVisible(true);
		d17.setFont(new Font(null, Font.PLAIN, 40));
	}
	
	public void Last2()
	{
		professor.setVisible(true);
		d14.setVisible(false);
		Feeling.pf3_SAME();
		
		selectButton1_1_1.setVisible(false);
		selectButton1_1_2.setVisible(false);
		selectButton1_1_3.setVisible(false);
 
		d18.setBounds(30, 480, 1200, 100);
		super.add(d18);
		d18.setVisible(true);
		d18.setFont(new Font(null, Font.PLAIN, 40));
	}
	
	public void Last3()
	{
		professor.setVisible(true);
		d14.setVisible(false);
		Feeling.pf3_DOWN();
		
		selectButton1_1_1.setVisible(false);
		selectButton1_1_2.setVisible(false);
		selectButton1_1_3.setVisible(false);
 
		d19.setBounds(30, 480, 1200, 100);
		super.add(d19);
		d19.setVisible(true);
		d19.setFont(new Font(null, Font.PLAIN, 40));
	}
	
	public void Last4()
	{
		professor.setVisible(true);
		d15.setVisible(false);
		Feeling.pf3_DOWN();
 
		selectButton1_2_1.setVisible(false);
		selectButton1_2_2.setVisible(false);
		selectButton1_2_3.setVisible(false);
		
		d20.setBounds(30, 480, 1200, 100);
		super.add(d20);
		d20.setVisible(true);
		d20.setFont(new Font(null, Font.PLAIN, 40));
	}
	
	public void Last5()
	{
		professor.setVisible(true);
		d15.setVisible(false);
		Feeling.pf3_SAME();
		
		selectButton1_2_1.setVisible(false);
		selectButton1_2_2.setVisible(false);
		selectButton1_2_3.setVisible(false);
 
		d21.setBounds(30, 480, 1200, 100);
		super.add(d21);
		d21.setVisible(true);
		d21.setFont(new Font(null, Font.PLAIN, 40));
	}
	
	public void Last6()
	{
		professor.setVisible(true);
		d15.setVisible(false);
		Feeling.pf3_DOWN();
		
		selectButton1_2_1.setVisible(false);
		selectButton1_2_2.setVisible(false);
		selectButton1_2_3.setVisible(false);
 
		d22.setBounds(30, 480, 1200, 100);
		super.add(d22);
		d22.setVisible(true);
		d22.setFont(new Font(null, Font.PLAIN, 40));
	}
	
	public void Last7()
	{
		professor.setVisible(true);
		d16.setVisible(false);
		Feeling.pf3_DOWN();
 
		selectButton1_3_1.setVisible(false);
		selectButton1_3_2.setVisible(false);
		selectButton1_3_3.setVisible(false);
		
		d23.setBounds(30, 480, 1200, 100);
		super.add(d23);
		d23.setVisible(true);
		d23.setFont(new Font(null, Font.PLAIN, 40));
	}
	
	public void Last8()
	{
		professor.setVisible(true);
		d16.setVisible(false);
		Feeling.pf3_DOWN();
		
		selectButton1_3_1.setVisible(false);
		selectButton1_3_2.setVisible(false);
		selectButton1_3_3.setVisible(false);
 
		d24.setBounds(30, 480, 1200, 100);
		super.add(d24);
		d24.setVisible(true);
		d24.setFont(new Font(null, Font.PLAIN, 40));
	}
	
	public void Last9()
	{
		professor.setVisible(true);
		d16.setVisible(false);
		Feeling.pf3_UP();
		
		selectButton1_3_1.setVisible(false);
		selectButton1_3_2.setVisible(false);
		selectButton1_3_3.setVisible(false);
 
		d25.setBounds(30, 480, 1200, 100);
		super.add(d25);
		d25.setVisible(true);
		d25.setFont(new Font(null, Font.PLAIN, 40));
	}
	
	public void End()
	{
		super.setVisible(false);
		isworked=true;
	}
	
	public void paintComponent(Graphics g)
	{
		g.drawImage(backGround, 0, 0, this);
		paintComponents(g);
		repaint();
	}
	
}
