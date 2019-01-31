package project;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Simul_start extends JPanel
{
	public static boolean isWorked = false;
	private static final long serialVersionUID = 1L;

	private ImageIcon startButtonEnteredImage=new ImageIcon(Main.class.getResource("../images/start button2.png"));
	private ImageIcon startButtonBasicImage=new ImageIcon(Main.class.getResource("../images/start button.png"));
	private ImageIcon endButtonEnteredImage=new ImageIcon(Main.class.getResource("../images/end button2.png"));
	private ImageIcon endButtonBasicImage=new ImageIcon(Main.class.getResource("../images/end button.png"));
	private ImageIcon nextButtonImage=new ImageIcon(Main.class.getResource("../images/nextButton.png"));
	private ImageIcon passButtonBasicImage=new ImageIcon(Main.class.getResource("../images/버튼1.png"));
	private ImageIcon passButtonEnteredImage=new ImageIcon(Main.class.getResource("../images/버튼1_클릭.png"));
	
	private Image background=new ImageIcon(Main.class.getResource("../images/backGround!!.jpg")).getImage();
	
	private JButton startButton=new JButton(startButtonBasicImage);
	private JButton endButton=new JButton(endButtonBasicImage);
	private JButton nextButton=new JButton(nextButtonImage);
	private JButton passButton=new JButton(passButtonBasicImage);
	
	private JLabel me=new JLabel("  나");
	private JLabel sit1=new JLabel("공부를 아무리해도 잘 나오지 않는 성적으로 교수님께");
	private JLabel sit2=new JLabel("사바사바라도 하기에 이른 나... 남은 날짜는 앞으로 일주일!");
	
	JTextField text=new JTextField(10);
	Music introMusic=new Music("Bruno Mars-04-That`s What I Like-320k.mp3", true);
	
	public static String name;

	public Simul_start()
	{	
		setLayout(null);

		me.setBounds(30, 385, 300, 100);
		super.add(me);
		me.setVisible(false);
		me.setFont(new Font(null, Font.BOLD, 30));

		sit1.setBounds(30, 480, 1200, 100);
		super.add(sit1);
		sit1.setVisible(false);
		sit1.setFont(new Font(null, Font.BOLD, 40));

		sit2.setBounds(30, 550, 1200, 100);
		super.add(sit2);
		sit2.setVisible(false);
		sit2.setFont(new Font(null, Font.BOLD, 40));

		introMusic.start();

		nextButton.setBounds(795, 504, 100, 53);
		nextButton.setBorderPainted(false);
		nextButton.setContentAreaFilled(false);
		nextButton.setFocusPainted(false);
		nextButton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				nextButton.setIcon(nextButtonImage);
				nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				nextButton.setIcon(nextButtonImage);
				nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				try {
					Thread.sleep(100);
				}catch(InterruptedException ex) {
					ex.printStackTrace();
				}
				name = text.getText();
				introduce();
			}
		});
		
		startButton.setBounds(970, 422, 250, 74);
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setFocusPainted(false);
		startButton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				startButton.setIcon(startButtonEnteredImage);
				startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				startButton.setIcon(startButtonBasicImage);
				startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				startButton.setVisible(false);
				endButton.setVisible(false);
				
				background=new ImageIcon(Main.class.getResource("../images/backName.jpg")).getImage();//main으로 넘어옴						

				Text();

				add(nextButton);
			}
		});
		add(startButton);

		endButton.setBounds(970, 532, 250, 74);
		endButton.setBorderPainted(false);
		endButton.setContentAreaFilled(false);
		endButton.setFocusPainted(false);
		endButton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				endButton.setIcon(endButtonEnteredImage);
				endButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				endButton.setIcon(endButtonBasicImage);
				endButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				try {
					Thread.sleep(100);
				}catch(InterruptedException ex) {
					ex.printStackTrace();
				}
				System.exit(0);
			}
		});

		add(endButton);
		repaint();
	}

	@SuppressWarnings("deprecation")
	public void End()
	{
		introMusic.stop();
		super.setVisible(false);
		isWorked = true;
	}

	public void paint(Graphics g)
	{
		g.drawImage(background, 0, 0, null);
		paintComponents(g);
		repaint();
	}

	public void Text()
	{
		super.setLayout(null);
		text.setBounds(500, 500, 300, 60);
		super.add(text);
		text.setVisible(true);
		text.setFont(new Font(null, Font.PLAIN, 25));
		name=text.getText();	
		name=String.valueOf(text.getText());
	}

	public void introduce()
	{
		nextButton.setVisible(false);
		text.setVisible(false);
		
		background=new ImageIcon(Main.class.getResource("../images/교수님소개.jpg")).getImage();

		passButton.setBounds(950, 600, 300, 60);
		passButton.setBorderPainted(false);
		passButton.setContentAreaFilled(false);
		passButton.setFocusPainted(false);
		passButton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				passButton.setIcon(passButtonEnteredImage);
				passButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				passButton.setIcon(passButtonBasicImage);
				passButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				try {
					Thread.sleep(100);
				}catch(InterruptedException ex) {
					ex.printStackTrace();
				}
				Situation();
			}
		});

		add(passButton);
		repaint();
	}

	public void Situation()
	{		
		nextButton.setVisible(false);
		
		background=new ImageIcon(Main.class.getResource("../images/강의실복도.jpg")).getImage();

		me.setVisible(true);
		sit1.setVisible(true);
		sit2.setVisible(true);

		passButton.setBounds(1000, 400, 300, 60);
		passButton.setBorderPainted(false);
		passButton.setContentAreaFilled(false);
		passButton.setFocusPainted(false);
		passButton.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				passButton.setIcon(passButtonEnteredImage);
				passButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				passButton.setIcon(passButtonBasicImage);
				passButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				try {
					Thread.sleep(100);
				}catch(InterruptedException ex) {
					ex.printStackTrace();
				}

				End();
			}
		});

		add(passButton);
	}
}