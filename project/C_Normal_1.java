package project;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
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

public class C_Normal_1 extends JPanel{

private static final long serialVersionUID = 1L;

	public static boolean isworked=false;

	BufferedImage backGround;

	File file1=new File("./src/images/강의실복도.jpg");
	File file2=new File("./src/images/강의실복도_C.jpg");
	File file3=new File("./src/images/강의실안.jpg");
	File file4=new File("./src/images/강의실안_C.jpg");
	File file5=new File("./src/images/교수님방.jpg");
	File file6=new File("./src/images/교수님방_C.jpg");
	File file7=new File("./src/images/캠퍼스.jpg");
	File file8=new File("./src/images/캠퍼스_C.jpg");

	private ImageIcon select1_1=new ImageIcon(Main.class.getResource("../images/선택지1-1.png"));
	private ImageIcon selectc1_1=new ImageIcon(Main.class.getResource("../images/선택지클릭1-1.png"));
	private ImageIcon select1_2=new ImageIcon(Main.class.getResource("../images/선택지1-2.png"));
	private ImageIcon selectc1_2=new ImageIcon(Main.class.getResource("../images/선택지클릭1-2.png"));
	private ImageIcon select1_3=new ImageIcon(Main.class.getResource("../images/선택지1-3.png"));
	private ImageIcon selectc1_3=new ImageIcon(Main.class.getResource("../images/선택지클릭1-3.png"));
	private ImageIcon select1_1_1=new ImageIcon(Main.class.getResource("../images/선택지1-1-1.png"));
	private ImageIcon selectc1_1_1=new ImageIcon(Main.class.getResource("../images/선택지클릭1-1-1.png"));
	private ImageIcon select1_1_2=new ImageIcon(Main.class.getResource("../images/선택지1-1-2.png"));
	private ImageIcon selectc1_1_2=new ImageIcon(Main.class.getResource("../images/선택지클릭1-1-2.png"));
	private ImageIcon select1_1_3=new ImageIcon(Main.class.getResource("../images/선택지1-1-3.png"));
	private ImageIcon selectc1_1_3=new ImageIcon(Main.class.getResource("../images/선택지클릭1-1-3.png"));
	private ImageIcon select1_2_1=new ImageIcon(Main.class.getResource("../images/선택지1-2-1.png"));
	private ImageIcon selectc1_2_1=new ImageIcon(Main.class.getResource("../images/선택지클릭1-2-1.png"));
	private ImageIcon select1_2_2=new ImageIcon(Main.class.getResource("../images/선택지1-2-2.png"));
	private ImageIcon selectc1_2_2=new ImageIcon(Main.class.getResource("../images/선택지클릭1-2-2.png"));
	private ImageIcon select1_2_3=new ImageIcon(Main.class.getResource("../images/선택지1-2-3.png"));
	private ImageIcon selectc1_2_3=new ImageIcon(Main.class.getResource("../images/선택지클릭1-2-3.png"));
	private ImageIcon select1_3_1=new ImageIcon(Main.class.getResource("../images/선택지1-3-1.png"));
	private ImageIcon selectc1_3_1=new ImageIcon(Main.class.getResource("../images/선택지클릭1-3-1.png"));
	private ImageIcon select1_3_2=new ImageIcon(Main.class.getResource("../images/선택지1-3-2.png"));
	private ImageIcon selectc1_3_2=new ImageIcon(Main.class.getResource("../images/선택지클릭1-3-2.png"));
	private ImageIcon select1_3_3=new ImageIcon(Main.class.getResource("../images/선택지1-3-3.png"));
	private ImageIcon selectc1_3_3=new ImageIcon(Main.class.getResource("../images/선택지클릭1-3-3.png"));
	private ImageIcon nextButtonBasicImage=new ImageIcon(Main.class.getResource("../images/버튼1.png"));
	private ImageIcon nextButtonEnteredImage=new ImageIcon(Main.class.getResource("../images/버튼1_클릭.png"));
	private ImageIcon up=new ImageIcon(Main.class.getResource("../images/호감도 상승.png"));
	private ImageIcon down=new ImageIcon(Main.class.getResource("../images/호감도 하락.png"));
	private ImageIcon maintain=new ImageIcon(Main.class.getResource("../images/호감도 유지.png"));

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
	private JLabel situation1=new JLabel("수업 중 갑자기 교수님이 나에게 질문을 하셨다");

	String[] dialogue=ProfessorDialogue.getDialogue_C();
	JLabel d0=new JLabel(dialogue[0]);
	JLabel d1=new JLabel(dialogue[1]);
	JLabel d2=new JLabel(dialogue[2]);
	JLabel d3=new JLabel(dialogue[3]);
	JLabel d4=new JLabel(dialogue[4]);
	JLabel d5=new JLabel(dialogue[5]);
	JLabel d6=new JLabel(dialogue[6]);
	JLabel d7=new JLabel(dialogue[7]);
	JLabel d8=new JLabel(dialogue[8]);
	JLabel d9=new JLabel(dialogue[9]);
	JLabel d10=new JLabel(dialogue[10]);
	JLabel d11=new JLabel(dialogue[11]);
	JLabel d12=new JLabel(dialogue[12]);

	public C_Normal_1()
	{
		try {
			backGround=ImageIO.read(file3);
		}catch(IOException ex) {

			ex.printStackTrace();
		}
		repaint();

		setLayout(null);

		situation1.setBounds(30, 480, 1200, 100);
		super.add(situation1);
		situation1.setVisible(true);
		situation1.setFont(new Font(null, Font.PLAIN, 40));

		d0.setBounds(30, 480, 1200, 100);
		super.add(d0);
		d0.setVisible(false);
		d0.setFont(new Font(null, Font.PLAIN, 40));

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

					backGround=ImageIO.read(file4);//파일2로 바뀌면서 대화 발생

				}catch(IOException ex) {

					ex.printStackTrace();

				}

				repaint();	

				situation1.setVisible(false);

				d0.setVisible(true);

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

		d0.setVisible(false);

		

		professor.setBounds(30, 385, 300, 100);

		super.add(professor);

		professor.setVisible(true);

		professor.setFont(new Font(null, Font.BOLD, 30));

		

		d1.setBounds(30, 480, 1200, 100);

		super.add(d1);

		d1.setVisible(true);

		d1.setFont(new Font(null, Font.PLAIN, 40));

		

		downImage.setVisible(true);

		GoodFeeling.teacher3FeelDown();

		

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

		d0.setVisible(false);

		

		professor.setBounds(30, 385, 300, 100);

		super.add(professor);

		professor.setVisible(true);

		professor.setFont(new Font(null, Font.BOLD, 30));

		

		d2.setBounds(30, 480, 1200, 100);

		super.add(d2);

		d2.setVisible(true);

		d2.setFont(new Font(null, Font.PLAIN, 40));

		

		maintainImage.setVisible(true);

		GoodFeeling.teacher3FeelSame();

		

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

		d0.setVisible(false);

		

		professor.setBounds(30, 385, 300, 100);

		super.add(professor);

		professor.setVisible(true);

		professor.setFont(new Font(null, Font.BOLD, 30));

		

		d3.setBounds(30, 480, 1200, 100);

		super.add(d3);

		d3.setVisible(true);

		d3.setFont(new Font(null, Font.PLAIN, 40));

		

		downImage.setVisible(true);

		GoodFeeling.teacher3FeelDown();

		

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

		d0.setVisible(false);

		

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

					Thread.sleep(1000);

				}catch(InterruptedException ex) {

					ex.printStackTrace();

				}

				Last1();

				maintainImage.setVisible(true);

				GoodFeeling.teacher3FeelSame();

 

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

					Thread.sleep(1000);

				}catch(InterruptedException ex) {

					ex.printStackTrace();

				}

				Last2();

				downImage.setVisible(true);

				GoodFeeling.teacher3FeelDown();

				

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

					Thread.sleep(1000);

				}catch(InterruptedException ex) {

					ex.printStackTrace();

				}

				Last3();

				upImage.setVisible(true);

				GoodFeeling.teacher3FeelUp();

				

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

		d0.setVisible(false);

		

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

					Thread.sleep(1000);

				}catch(InterruptedException ex) {

					ex.printStackTrace();

				}

				Last4();

				upImage.setVisible(true);

				GoodFeeling.teacher3FeelUp();

				

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

				GoodFeeling.teacher3FeelSame();

				

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

				upImage.setVisible(true);

				GoodFeeling.teacher3FeelUp();

				

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

		d0.setVisible(false);

		

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

				upImage.setVisible(true);

				GoodFeeling.teacher3FeelUp();

				

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

				GoodFeeling.teacher3FeelDown();

				

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

					Thread.sleep(1000);

				}catch(InterruptedException ex) {

					ex.printStackTrace();

				}

				

				Last9();

				maintainImage.setVisible(true);

				GoodFeeling.teacher3FeelSame();

				

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

		d1.setVisible(false);

 

		selectButton1_1_1.setVisible(false);

		selectButton1_1_2.setVisible(false);

		selectButton1_1_3.setVisible(false);

		

		d4.setBounds(30, 480, 1200, 100);

		super.add(d4);

		d4.setVisible(true);

		d4.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last2()

	{

		professor.setVisible(true);

		d1.setVisible(false);

		

		selectButton1_1_1.setVisible(false);

		selectButton1_1_2.setVisible(false);

		selectButton1_1_3.setVisible(false);

 

		d5.setBounds(30, 480, 1200, 100);

		super.add(d5);

		d5.setVisible(true);

		d5.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last3()

	{

		professor.setVisible(true);

		d1.setVisible(false);

		

		selectButton1_1_1.setVisible(false);

		selectButton1_1_2.setVisible(false);

		selectButton1_1_3.setVisible(false);

 

		d6.setBounds(30, 480, 1200, 100);

		super.add(d6);

		d6.setVisible(true);

		d6.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last4()

	{

		professor.setVisible(true);

		d2.setVisible(false);

 

		selectButton1_2_1.setVisible(false);

		selectButton1_2_2.setVisible(false);

		selectButton1_2_3.setVisible(false);

		

		d7.setBounds(30, 480, 1200, 100);

		super.add(d7);

		d7.setVisible(true);

		d7.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last5()

	{

		professor.setVisible(true);

		d2.setVisible(false);

		

		selectButton1_2_1.setVisible(false);

		selectButton1_2_2.setVisible(false);

		selectButton1_2_3.setVisible(false);

 

		d8.setBounds(30, 480, 1200, 100);

		super.add(d8);

		d8.setVisible(true);

		d8.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last6()

	{

		professor.setVisible(true);

		d2.setVisible(false);

		

		selectButton1_2_1.setVisible(false);

		selectButton1_2_2.setVisible(false);

		selectButton1_2_3.setVisible(false);

 

		d9.setBounds(30, 480, 1200, 100);

		super.add(d9);

		d9.setVisible(true);

		d9.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last7()

	{

		professor.setVisible(true);

		d3.setVisible(false);

 

		selectButton1_3_1.setVisible(false);

		selectButton1_3_2.setVisible(false);

		selectButton1_3_3.setVisible(false);

		

		d10.setBounds(30, 480, 1200, 100);

		super.add(d10);

		d10.setVisible(true);

		d10.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last8()

	{

		professor.setVisible(true);

		d3.setVisible(false);

		

		selectButton1_3_1.setVisible(false);

		selectButton1_3_2.setVisible(false);

		selectButton1_3_3.setVisible(false);

 

		d11.setBounds(30, 480, 1200, 100);

		super.add(d11);

		d11.setVisible(true);

		d11.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last9()

	{

		professor.setVisible(true);

		d3.setVisible(false);

		

		selectButton1_3_1.setVisible(false);

		selectButton1_3_2.setVisible(false);

		selectButton1_3_3.setVisible(false);

 

		d12.setBounds(30, 480, 1200, 100);

		super.add(d12);

		d12.setVisible(true);

		d12.setFont(new Font(null, Font.PLAIN, 40));

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
