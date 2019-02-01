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

public class C_Special extends JPanel{
private static final long serialVersionUID = 1L;
	
	public static boolean isworked=false;
	
	BufferedImage backGround;
	URL url_1=getClass().getClassLoader().getResource("교수님방.jpg");
	URL url_2=getClass().getClassLoader().getResource("교수님방_C.jpg");
	
	private ImageIcon select1_1=new ImageIcon(getClass().getClassLoader().getResource("선택지5-1.png"));
	private ImageIcon selectc1_1=new ImageIcon(getClass().getClassLoader().getResource("선택지클릭5-1.png"));
	private ImageIcon select1_2=new ImageIcon(getClass().getClassLoader().getResource("선택지5-2.png"));
	private ImageIcon selectc1_2=new ImageIcon(getClass().getClassLoader().getResource("선택지클릭5-2.png"));
	private ImageIcon select1_3=new ImageIcon(getClass().getClassLoader().getResource("선택지5-3.png"));
	private ImageIcon selectc1_3=new ImageIcon(getClass().getClassLoader().getResource("선택지클릭5-3.png"));
	private ImageIcon select1_1_1=new ImageIcon(getClass().getClassLoader().getResource("선택지5-1-1.png"));
	private ImageIcon selectc1_1_1=new ImageIcon(getClass().getClassLoader().getResource("선택지클릭5-1-1.png"));
	private ImageIcon select1_1_2=new ImageIcon(getClass().getClassLoader().getResource("선택지5-1-2.png"));
	private ImageIcon selectc1_1_2=new ImageIcon(getClass().getClassLoader().getResource("선택지클릭5-1-2.png"));
	private ImageIcon select1_1_3=new ImageIcon(getClass().getClassLoader().getResource("선택지5-1-3.png"));
	private ImageIcon selectc1_1_3=new ImageIcon(getClass().getClassLoader().getResource("선택지클릭5-1-3.png"));
	private ImageIcon select1_2_1=new ImageIcon(getClass().getClassLoader().getResource("선택지5-2-1.png"));
	private ImageIcon selectc1_2_1=new ImageIcon(getClass().getClassLoader().getResource("선택지클릭5-2-1.png"));
	private ImageIcon select1_2_2=new ImageIcon(getClass().getClassLoader().getResource("선택지5-2-2.png"));
	private ImageIcon selectc1_2_2=new ImageIcon(getClass().getClassLoader().getResource("선택지클릭5-2-2.png"));
	private ImageIcon select1_2_3=new ImageIcon(getClass().getClassLoader().getResource("선택지5-2-3.png"));
	private ImageIcon selectc1_2_3=new ImageIcon(getClass().getClassLoader().getResource("선택지클릭5-2-3.png"));
	private ImageIcon select1_3_1=new ImageIcon(getClass().getClassLoader().getResource("선택지5-3-1.png"));
	private ImageIcon selectc1_3_1=new ImageIcon(getClass().getClassLoader().getResource("선택지클릭5-3-1.png"));
	private ImageIcon select1_3_2=new ImageIcon(getClass().getClassLoader().getResource("선택지5-3-2.png"));
	private ImageIcon selectc1_3_2=new ImageIcon(getClass().getClassLoader().getResource("선택지클릭5-3-2.png"));
	private ImageIcon select1_3_3=new ImageIcon(getClass().getClassLoader().getResource("선택지5-3-3.png"));
	private ImageIcon selectc1_3_3=new ImageIcon(getClass().getClassLoader().getResource("선택지클릭5-3-3.png"));
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
	private JLabel situation1=new JLabel("갑자기 날 연구실로 부르신 교수님");
	String[] dialogue=ProfessorLines.getDialogue_C();
	
	JLabel d49=new JLabel(dialogue[49]);
	JLabel d50=new JLabel(dialogue[50]);
	JLabel d51=new JLabel(dialogue[51]);
	JLabel d52=new JLabel(dialogue[52]);
	JLabel d53=new JLabel(dialogue[53]);
	JLabel d54=new JLabel(dialogue[54]);
	JLabel d55=new JLabel(dialogue[55]);
	JLabel d56=new JLabel(dialogue[56]);
	JLabel d57=new JLabel(dialogue[57]);
	JLabel d58=new JLabel(dialogue[58]);
	JLabel d59=new JLabel(dialogue[59]);
	JLabel d60=new JLabel(dialogue[60]);
	JLabel d61=new JLabel(dialogue[61]);
	
	public C_Special()
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
		
		d49.setBounds(30, 480, 1200, 100);
		super.add(d49);
		d49.setVisible(false);
		d49.setFont(new Font(null, Font.PLAIN, 40));
		
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
				d49.setVisible(true);
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
		d49.setVisible(false);
		
		professor.setBounds(30, 385, 300, 100);
		super.add(professor);
		professor.setVisible(true);
		professor.setFont(new Font(null, Font.BOLD, 30));
		
		d50.setBounds(30, 480, 1200, 100);
		super.add(d50);
		d50.setVisible(true);
		d50.setFont(new Font(null, Font.PLAIN, 40));
		
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
				Select1_1();
			}
		});
		add(nextButton);
	}
	
	public void Selected2()//교수님 재등장
	{
		d49.setVisible(false);
		
		professor.setBounds(30, 385, 300, 100);
		super.add(professor);
		professor.setVisible(true);
		professor.setFont(new Font(null, Font.BOLD, 30));
		
		d51.setBounds(30, 480, 1200, 100);
		super.add(d51);
		d51.setVisible(true);
		d51.setFont(new Font(null, Font.PLAIN, 40));
		
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
		d49.setVisible(false);
		
		professor.setBounds(30, 385, 300, 100);
		super.add(professor);
		professor.setVisible(true);
		professor.setFont(new Font(null, Font.BOLD, 30));
		
		d52.setBounds(30, 480, 1200, 100);
		super.add(d52);
		d52.setVisible(true);
		d52.setFont(new Font(null, Font.PLAIN, 40));
		
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
		d49.setVisible(false);
		
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
		add(selectButton1_1_3);
		
	}
	
	public void Select1_2()//두번째 선택지 세개
	{
		d49.setVisible(false);
		
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
		d49.setVisible(false);
		
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
		add(selectButton1_3_3);
		
	}
	
	public void Last1()
	{
		professor.setVisible(true);
		d50.setVisible(false);
		Feeling.pf3_SAME();
 
		selectButton1_1_1.setVisible(false);
		selectButton1_1_2.setVisible(false);
		selectButton1_1_3.setVisible(false);
		
		d53.setBounds(30, 480, 1200, 100);
		super.add(d53);
		d53.setVisible(true);
		d53.setFont(new Font(null, Font.PLAIN, 40));
	}
	
	public void Last2()
	{
		professor.setVisible(true);
		d50.setVisible(false);
		Feeling.pf3_DOWN();
		
		selectButton1_1_1.setVisible(false);
		selectButton1_1_2.setVisible(false);
		selectButton1_1_3.setVisible(false);
 
		d54.setBounds(30, 480, 1200, 100);
		super.add(d54);
		d54.setVisible(true);
		d54.setFont(new Font(null, Font.PLAIN, 40));
	}
	
	public void Last3()
	{
		professor.setVisible(true);
		d50.setVisible(false);
		Feeling.pf3_UP();
		
		selectButton1_1_1.setVisible(false);
		selectButton1_1_2.setVisible(false);
		selectButton1_1_3.setVisible(false);
 
		d55.setBounds(30, 480, 1200, 100);
		super.add(d55);
		d55.setVisible(true);
		d55.setFont(new Font(null, Font.PLAIN, 40));
	}
	
	public void Last4()
	{
		professor.setVisible(true);
		d51.setVisible(false);
		Feeling.pf3_UP();
 
		selectButton1_2_1.setVisible(false);
		selectButton1_2_2.setVisible(false);
		selectButton1_2_3.setVisible(false);
		
		d56.setBounds(30, 480, 1200, 100);
		super.add(d56);
		d56.setVisible(true);
		d56.setFont(new Font(null, Font.PLAIN, 40));
	}
	
	public void Last5()
	{
		professor.setVisible(true);
		d51.setVisible(false);
		Feeling.pf3_DOWN();
		
		selectButton1_2_1.setVisible(false);
		selectButton1_2_2.setVisible(false);
		selectButton1_2_3.setVisible(false);
 
		d57.setBounds(30, 480, 1200, 100);
		super.add(d57);
		d57.setVisible(true);
		d57.setFont(new Font(null, Font.PLAIN, 40));
	}
	
	public void Last6()
	{
		professor.setVisible(true);
		d51.setVisible(false);
		Feeling.pf3_DOWN();
		
		selectButton1_2_1.setVisible(false);
		selectButton1_2_2.setVisible(false);
		selectButton1_2_3.setVisible(false);
 
		d58.setBounds(30, 480, 1200, 100);
		super.add(d58);
		d58.setVisible(true);
		d58.setFont(new Font(null, Font.PLAIN, 40));
	}
	
	public void Last7()
	{
		professor.setVisible(true);
		d52.setVisible(false);
		Feeling.pf3_DOWN();
 
		selectButton1_3_1.setVisible(false);
		selectButton1_3_2.setVisible(false);
		selectButton1_3_3.setVisible(false);
		
		d59.setBounds(30, 480, 1200, 100);
		super.add(d59);
		d59.setVisible(true);
		d59.setFont(new Font(null, Font.PLAIN, 40));
	}
	
	public void Last8()
	{
		professor.setVisible(true);
		d52.setVisible(false);
		Feeling.pf3_DOWN();
		
		selectButton1_3_1.setVisible(false);
		selectButton1_3_2.setVisible(false);
		selectButton1_3_3.setVisible(false);
 
		d60.setBounds(30, 480, 1200, 100);
		super.add(d60);
		d60.setVisible(true);
		d60.setFont(new Font(null, Font.PLAIN, 40));
	}
	
	public void Last9()
	{
		professor.setVisible(true);
		d52.setVisible(false);
		Feeling.pf3_SAME();
		
		selectButton1_3_1.setVisible(false);
		selectButton1_3_2.setVisible(false);
		selectButton1_3_3.setVisible(false);
 
		d61.setBounds(30, 480, 1200, 100);
		super.add(d61);
		d61.setVisible(true);
		d61.setFont(new Font(null, Font.PLAIN, 40));
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
