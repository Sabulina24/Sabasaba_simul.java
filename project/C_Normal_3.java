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

public class C_Normal_3 extends JPanel{

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

	private ImageIcon select1_1=new ImageIcon(Main.class.getResource("../images/선택지3-1.png"));

	private ImageIcon selectc1_1=new ImageIcon(Main.class.getResource("../images/선택지클릭3-1.png"));

	private ImageIcon select1_2=new ImageIcon(Main.class.getResource("../images/선택지3-2.png"));

	private ImageIcon selectc1_2=new ImageIcon(Main.class.getResource("../images/선택지클릭3-2.png"));

	private ImageIcon select1_3=new ImageIcon(Main.class.getResource("../images/선택지3-3.png"));

	private ImageIcon selectc1_3=new ImageIcon(Main.class.getResource("../images/선택지클릭3-3.png"));

	private ImageIcon select1_1_1=new ImageIcon(Main.class.getResource("../images/선택지3-1-1.png"));

	private ImageIcon selectc1_1_1=new ImageIcon(Main.class.getResource("../images/선택지클릭3-1-1.png"));

	private ImageIcon select1_1_2=new ImageIcon(Main.class.getResource("../images/선택지3-1-2.png"));

	private ImageIcon selectc1_1_2=new ImageIcon(Main.class.getResource("../images/선택지클릭3-1-2.png"));

	private ImageIcon select1_1_3=new ImageIcon(Main.class.getResource("../images/선택지3-1-3.png"));

	private ImageIcon selectc1_1_3=new ImageIcon(Main.class.getResource("../images/선택지클릭3-1-3.png"));

	private ImageIcon select1_2_1=new ImageIcon(Main.class.getResource("../images/선택지3-2-1.png"));

	private ImageIcon selectc1_2_1=new ImageIcon(Main.class.getResource("../images/선택지클릭3-2-1.png"));

	private ImageIcon select1_2_2=new ImageIcon(Main.class.getResource("../images/선택지3-2-2.png"));

	private ImageIcon selectc1_2_2=new ImageIcon(Main.class.getResource("../images/선택지클릭3-2-2.png"));

	private ImageIcon select1_2_3=new ImageIcon(Main.class.getResource("../images/선택지3-2-3.png"));

	private ImageIcon selectc1_2_3=new ImageIcon(Main.class.getResource("../images/선택지클릭3-2-3.png"));

	private ImageIcon select1_3_1=new ImageIcon(Main.class.getResource("../images/선택지3-3-1.png"));

	private ImageIcon selectc1_3_1=new ImageIcon(Main.class.getResource("../images/선택지클릭3-3-1.png"));

	private ImageIcon select1_3_2=new ImageIcon(Main.class.getResource("../images/선택지3-3-2.png"));

	private ImageIcon selectc1_3_2=new ImageIcon(Main.class.getResource("../images/선택지클릭3-3-2.png"));

	private ImageIcon select1_3_3=new ImageIcon(Main.class.getResource("../images/선택지3-3-3.png"));

	private ImageIcon selectc1_3_3=new ImageIcon(Main.class.getResource("../images/선택지클릭3-3-3.png"));

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

	private JLabel situation1=new JLabel("복도를 지나가다 교수님을 마주쳤다");

	String[] dialogue=ProfessorDialogue.getDialogue_C();

	

	JLabel d26=new JLabel(dialogue[26]);

	JLabel d27=new JLabel(dialogue[27]);

	JLabel d28=new JLabel(dialogue[28]);

	JLabel d29=new JLabel(dialogue[29]);

	JLabel d30=new JLabel(dialogue[30]);

	JLabel d31=new JLabel(dialogue[31]);

	JLabel d32=new JLabel(dialogue[32]);

	JLabel d33=new JLabel(dialogue[33]);

	JLabel d34=new JLabel(dialogue[34]);

	JLabel d35=new JLabel(dialogue[35]);

	JLabel d36=new JLabel(dialogue[36]);

	JLabel d37=new JLabel(dialogue[37]);

	JLabel d38=new JLabel(dialogue[38]);

	

	public C_Normal_3()

	{

		try {

			backGround=ImageIO.read(file1);

		}catch(IOException ex) {

			ex.printStackTrace();

		}

		repaint();

		

		

		/*setTitle("교수님께 사바사바하는 시뮬레이션 게임");

		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);

		setResizable(false);

		setLocationRelativeTo(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);*/

		setLayout(null);

		

		situation1.setBounds(30, 480, 1200, 100);

		super.add(situation1);

		situation1.setVisible(true);

		situation1.setFont(new Font(null, Font.PLAIN, 40));

		

		d26.setBounds(30, 480, 1200, 100);

		super.add(d26);

		d26.setVisible(false);

		d26.setFont(new Font(null, Font.PLAIN, 40));

		

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

					backGround=ImageIO.read(file2);//파일2로 바뀌면서 대화 발생

				}catch(IOException ex) {

					ex.printStackTrace();

				}

				repaint();	

				situation1.setVisible(false);

				d26.setVisible(true);

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

		d26.setVisible(false);

		

		professor.setBounds(30, 385, 300, 100);

		super.add(professor);

		professor.setVisible(true);

		professor.setFont(new Font(null, Font.BOLD, 30));

		

		d27.setBounds(30, 480, 1200, 100);

		super.add(d27);

		d27.setVisible(true);

		d27.setFont(new Font(null, Font.PLAIN, 40));

		

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

				Select1_1();

			}

		});

		add(nextButton);

	}

	

	public void Selected2()//교수님 재등장

	{

		d26.setVisible(false);

		

		professor.setBounds(30, 385, 300, 100);

		super.add(professor);

		professor.setVisible(true);

		professor.setFont(new Font(null, Font.BOLD, 30));

		

		d28.setBounds(30, 480, 1200, 100);

		super.add(d28);

		d28.setVisible(true);

		d28.setFont(new Font(null, Font.PLAIN, 40));

		

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

		d26.setVisible(false);

		

		professor.setBounds(30, 385, 300, 100);

		super.add(professor);

		professor.setVisible(true);

		professor.setFont(new Font(null, Font.BOLD, 30));

		

		d29.setBounds(30, 480, 1200, 100);

		super.add(d29);

		d29.setVisible(true);

		d29.setFont(new Font(null, Font.PLAIN, 40));

		

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

 

				repaint();

				Select1_3();

			}

		});

		add(nextButton);

	}

	

	public void Select1_1()//두번째 선택지 세개

	{

		d26.setVisible(false);

		

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

		d26.setVisible(false);

		

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

		add(selectButton1_2_3);

		

	}

	

	

	public void Select1_3()//두번째 선택지 세개

	{

		d26.setVisible(false);

		

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

		add(selectButton1_3_3);

		

	}

	

	public void Last1()

	{

		professor.setVisible(true);

		d27.setVisible(false);

		GoodFeeling.teacher3FeelDown();

 

		selectButton1_1_1.setVisible(false);

		selectButton1_1_2.setVisible(false);

		selectButton1_1_3.setVisible(false);

		

		d30.setBounds(30, 480, 1200, 100);

		super.add(d30);

		d30.setVisible(true);

		d30.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last2()

	{

		professor.setVisible(true);

		d27.setVisible(false);

		GoodFeeling.teacher3FeelDown();

		

		selectButton1_1_1.setVisible(false);

		selectButton1_1_2.setVisible(false);

		selectButton1_1_3.setVisible(false);

 

		d31.setBounds(30, 480, 1200, 100);

		super.add(d31);

		d31.setVisible(true);

		d31.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last3()

	{

		professor.setVisible(true);

		d27.setVisible(false);

		GoodFeeling.teacher3FeelUp();

		

		selectButton1_1_1.setVisible(false);

		selectButton1_1_2.setVisible(false);

		selectButton1_1_3.setVisible(false);

 

		d32.setBounds(30, 480, 1200, 100);

		super.add(d32);

		d32.setVisible(true);

		d32.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last4()

	{

		professor.setVisible(true);

		d28.setVisible(false);

		GoodFeeling.teacher3FeelSame();

 

		selectButton1_2_1.setVisible(false);

		selectButton1_2_2.setVisible(false);

		selectButton1_2_3.setVisible(false);

		

		d33.setBounds(30, 480, 1200, 100);

		super.add(d33);

		d33.setVisible(true);

		d33.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last5()

	{

		professor.setVisible(true);

		d28.setVisible(false);

		GoodFeeling.teacher3FeelSame();

		

		selectButton1_2_1.setVisible(false);

		selectButton1_2_2.setVisible(false);

		selectButton1_2_3.setVisible(false);

 

		d34.setBounds(30, 480, 1200, 100);

		super.add(d34);

		d34.setVisible(true);

		d34.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last6()

	{

		professor.setVisible(true);

		d28.setVisible(false);

		GoodFeeling.teacher3FeelUp();

		

		selectButton1_2_1.setVisible(false);

		selectButton1_2_2.setVisible(false);

		selectButton1_2_3.setVisible(false);

 

		d35.setBounds(30, 480, 1200, 100);

		super.add(d35);

		d35.setVisible(true);

		d35.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last7()

	{

		professor.setVisible(true);

		d29.setVisible(false);

		GoodFeeling.teacher3FeelUp();

 

		selectButton1_3_1.setVisible(false);

		selectButton1_3_2.setVisible(false);

		selectButton1_3_3.setVisible(false);

		

		d36.setBounds(30, 480, 1200, 100);

		super.add(d36);

		d36.setVisible(true);

		d36.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last8()

	{

		professor.setVisible(true);

		d29.setVisible(false);

		GoodFeeling.teacher3FeelSame();

		

		selectButton1_3_1.setVisible(false);

		selectButton1_3_2.setVisible(false);

		selectButton1_3_3.setVisible(false);

 

		d37.setBounds(30, 480, 1200, 100);

		super.add(d37);

		d37.setVisible(true);

		d37.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last9()

	{

		professor.setVisible(true);

		d29.setVisible(false);

		GoodFeeling.teacher3FeelDown();

		

		selectButton1_3_1.setVisible(false);

		selectButton1_3_2.setVisible(false);

		selectButton1_3_3.setVisible(false);

 

		d38.setBounds(30, 480, 1200, 100);

		super.add(d38);

		d38.setVisible(true);

		d38.setFont(new Font(null, Font.PLAIN, 40));

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
