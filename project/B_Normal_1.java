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

public class B_Normal_1 extends JPanel implements ActionListener {
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
	
	public static boolean isWorked = false;
	
	BufferedImage backGround;
	URL url_1 = getClass().getClassLoader().getResource("강의실복도.jpg");	
	URL url_2 = getClass().getClassLoader().getResource("강의실복도_B.jpg"); 
	
	JButton nextBtn_1 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton nextBtn_2 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton nextBtn_3 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton nextBtn_4 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton nextBtn_5 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton nextBtn_6 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton end = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton exit = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton up = new JButton(new ImageIcon(getClass().getClassLoader().getResource("호감도 상승.png")));
	JButton same = new JButton(new ImageIcon(getClass().getClassLoader().getResource("호감도 유지.png")));
	JButton down = new JButton(new ImageIcon(getClass().getClassLoader().getResource("호감도 하락.png")));

	JButton c1 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("선택지_B01.png")));
	JButton c2 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("선택지_B02.png")));
	JButton c3 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("선택지_B03.png")));
	JButton c1_1 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("선택지_B01_1.png")));
	JButton c1_2 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("선택지_B01_2.png")));
	JButton c1_3 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("선택지_B01_3.png")));
	JButton c2_1 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("선택지_B02_1.png")));
	JButton c2_2 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("선택지_B02_2.png")));
	JButton c2_3 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("선택지_B02_3.png")));
	
	JLabel name = new JLabel("교수님B");
	JLabel label_1 = new JLabel("(수업을 마치고 나오는 길에 복도에서 교수님과 마주쳤다!)");
	JLabel label_2 = new JLabel("(나는 그대로 도망치듯 그 자리를 떠났다.)");
	
	String[] dialogue = ProfessorLines.getDialogue_B();
	JLabel d0 = new JLabel(dialogue[0]);
	JLabel d1 = new JLabel(dialogue[1]);
	JLabel d2 = new JLabel(dialogue[2]);
	JLabel d3 = new JLabel(dialogue[3]);
	JLabel d4 = new JLabel(dialogue[4]);
	JLabel d5 = new JLabel(dialogue[5]);
	JLabel d6 = new JLabel(dialogue[6]);
	JLabel d7 = new JLabel(dialogue[7]);
	JLabel d8 = new JLabel(dialogue[8]);
	JLabel d9 = new JLabel(dialogue[9]);
	JLabel d10 = new JLabel(dialogue[10]);
	JLabel d11 = new JLabel(dialogue[11]);
	JLabel d12 = new JLabel(dialogue[12]);
	JLabel d13 = new JLabel(dialogue[13]);
	JLabel d14 = new JLabel(dialogue[14]);
	
	private ImageIcon nextBtnEntered = new ImageIcon(getClass().getClassLoader().getResource("버튼1_클릭.png"));
	private ImageIcon nextBtnBasic = new ImageIcon(getClass().getClassLoader().getResource("버튼1_클릭.png"));
	private ImageIcon c1Entered = new ImageIcon(getClass().getClassLoader().getResource("선택지_B01_clk.png"));
	private ImageIcon c1Basic = new ImageIcon(getClass().getClassLoader().getResource("선택지_B01.png"));
	private ImageIcon c2Entered = new ImageIcon(getClass().getClassLoader().getResource("선택지_B02_clk.png"));
	private ImageIcon c2Basic = new ImageIcon(getClass().getClassLoader().getResource("선택지_B02.png"));
	private ImageIcon c3Entered = new ImageIcon(getClass().getClassLoader().getResource("선택지_B03_clk.png"));
	private ImageIcon c3Basic = new ImageIcon(getClass().getClassLoader().getResource("선택지_B03.png"));
	private ImageIcon c1_1Entered = new ImageIcon(getClass().getClassLoader().getResource("선택지_B01_1_clk.png"));
	private ImageIcon c1_1Basic = new ImageIcon(getClass().getClassLoader().getResource("선택지_B01_1.png"));
	private ImageIcon c1_2Entered = new ImageIcon(getClass().getClassLoader().getResource("선택지_B01_2_clk.png"));
	private ImageIcon c1_2Basic = new ImageIcon(getClass().getClassLoader().getResource("선택지_B01_2.png"));
	private ImageIcon c1_3Entered = new ImageIcon(getClass().getClassLoader().getResource("선택지_B01_3_clk.png"));
	private ImageIcon c1_3Basic = new ImageIcon(getClass().getClassLoader().getResource("선택지_B01_3.png"));
	private ImageIcon c2_1Entered = new ImageIcon(getClass().getClassLoader().getResource("선택지_B02_1_clk.png"));
	private ImageIcon c2_1Basic = new ImageIcon(getClass().getClassLoader().getResource("선택지_B02_1.png"));
	private ImageIcon c2_2Entered = new ImageIcon(getClass().getClassLoader().getResource("선택지_B02_2_clk.png"));
	private ImageIcon c2_2Basic = new ImageIcon(getClass().getClassLoader().getResource("선택지_B02_2.png"));
	private ImageIcon c2_3Entered = new ImageIcon(getClass().getClassLoader().getResource("선택지_B02_3_clk.png"));
	private ImageIcon c2_3Basic = new ImageIcon(getClass().getClassLoader().getResource("선택지_B02_3.png"));
	
	public void paintComponent(Graphics g) {
		g.drawImage(backGround, 0, 0, null);
	}
	
	public B_Normal_1() {
		try {
			backGround = ImageIO.read(url_1);
		} catch (IOException e) {}
		
		super.setLayout(null);
		
		label_1.setBounds(30, 480, 1200, 100);	// 자막 좌표 설정
		label_1.setFont(new Font("맑은 고딕", Font.PLAIN, 40));	// 자막 폰트 설정
		
		nextBtn_1.setBounds(1000, 400, 300, 60); // 버튼의 위치, 크기 설정
		nextBtn_1.setBorderPainted(false); // 버튼 외곽선 제거
		nextBtn_1.setContentAreaFilled(false); // 버튼 영역 채우기 제거
		nextBtn_1.setFocusPainted(false); // 버튼 활성화 시 테두리 제거
		
		super.add(label_1);	// 패널에 자막 추가
		super.add(nextBtn_1);	// 패널에 버튼 추가
		
		nextBtn_1.addActionListener(this);
		nextBtn_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				nextBtn_1.setIcon(nextBtnEntered);
				nextBtn_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				nextBtn_1.setIcon(nextBtnBasic);
				nextBtn_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		
		up.setBounds(160, 100, 100, 250);	// 호감도 상승 버튼 설정
		up.setBorderPainted(false);
		up.setContentAreaFilled(false);
		up.setFocusPainted(false);
		super.add(up);
		up.setVisible(false);
		same.setBounds(160, 100, 100, 250);	// 호감도 일정 버튼 설정
		same.setBorderPainted(false);
		same.setContentAreaFilled(false);
		same.setFocusPainted(false);
		super.add(same);
		same.setVisible(false);
		down.setBounds(160, 100, 100, 250);	// 호감도 하락 버튼 설정
		down.setBorderPainted(false);
		down.setContentAreaFilled(false);
		down.setFocusPainted(false);
		super.add(down);
		down.setVisible(false);
		
		// 다음 화면 실행
	}
	
	public void actionPerformed(ActionEvent e) {
		Object s = e.getSource();
		end.setBounds(1000,400,300,60);	// end버튼 설정
		end.setBorderPainted(false);
		end.setContentAreaFilled(false);
		end.setFocusPainted(false);
		end.addActionListener(this);
		end.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				end.setIcon(nextBtnEntered);
				end.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				end.setIcon(nextBtnBasic);
				end.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		
		if(s == nextBtn_1) {	// 버튼을 눌렀을 때 이벤트 시작
			try {
				backGround = ImageIO.read(url_2);	// 배경 변경
				repaint();
			} catch (IOException e1) {}
			nextBtn_1.setVisible(false);	// 버튼 숨기기
			label_1.setVisible(false); 	// 자막 숨기기
		
			name.setBounds(30, 385, 300, 100);	// 이름 표시
			name.setFont(new Font("맑은 고딕", Font.BOLD, 30));
			super.add(name);
			
			d0.setBounds(30, 480, 1200, 100);	// 대사 표시
			d0.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(d0);
			
			nextBtn_2.setBounds(1000,400,300,60);	// 다음 버튼 표시
			nextBtn_2.setBorderPainted(false);
			nextBtn_2.setContentAreaFilled(false);
			nextBtn_2.setFocusPainted(false);
			super.add(nextBtn_2);
			nextBtn_2.setVisible(true);
			nextBtn_2.addActionListener(this);
			nextBtn_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					nextBtn_2.setIcon(nextBtnEntered);
					nextBtn_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					nextBtn_2.setIcon(nextBtnBasic);
					nextBtn_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
		}
		if(s == nextBtn_2) {
			nextBtn_2.setVisible(false);
			
			c1.setBounds(820,325,500,100);
			c1.setBorderPainted(false);
			c1.setContentAreaFilled(false);
			c1.setFocusPainted(false);
			
			super.add(c1);
			c1.setVisible(true);
			c1.addActionListener(this);
			c1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					c1.setIcon(c1Entered);
					c1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					c1.setIcon(c1Basic);
					c1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c2.setBounds(820,450,500,100);
			c2.setBorderPainted(false);
			c2.setContentAreaFilled(false);
			c2.setFocusPainted(false);
			
			super.add(c2);
			c2.setVisible(true);
			c2.addActionListener(this);
			c2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					c2.setIcon(c2Entered);
					c2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					c2.setIcon(c2Basic);
					c2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c3.setBounds(820,575,500,100);
			c3.setBorderPainted(false);
			c3.setContentAreaFilled(false);
			c3.setFocusPainted(false);
			
			super.add(c3);
			c3.setVisible(true);
			c3.addActionListener(this);
			c3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					c3.setIcon(c3Entered);
					c3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					c3.setIcon(c3Basic);
					c3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			
			
			repaint();
		}
		if(s == c1 || s == c2 || s == c3) {
			d0.setVisible(false);
			c1.setVisible(false);
			c2.setVisible(false);
			c3.setVisible(false);
			
			if(s == c1) {
				Feeling.pf2_UP();// 호감도 +1
				up.setVisible(true);
				
				d1.setBounds(30, 480, 1200, 100);
				d1.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d1);
				
				nextBtn_3.setBounds(1000,400,300,60);
				nextBtn_3.setBorderPainted(false);
				nextBtn_3.setContentAreaFilled(false);
				nextBtn_3.setFocusPainted(false);
				super.add(nextBtn_3);
				nextBtn_3.setVisible(true);
				nextBtn_3.addActionListener(this);
				nextBtn_3.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						nextBtn_3.setIcon(nextBtnEntered);
						nextBtn_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						nextBtn_3.setIcon(nextBtnBasic);
						nextBtn_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
				});
			}
			else if(s == c2) {
				Feeling.pf2_UP();// 호감도 +1
				up.setVisible(true);
				
				d2.setBounds(30, 480, 1200, 100);
				d2.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				d3.setBounds(30, 550, 1200, 100);
				d3.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				
				super.add(d2);
				super.add(d3);
				
				nextBtn_4.setBounds(1000,400,300,60);
				nextBtn_4.setBorderPainted(false);
				nextBtn_4.setContentAreaFilled(false);
				nextBtn_4.setFocusPainted(false);
				super.add(nextBtn_4);
				nextBtn_4.setVisible(true);
				nextBtn_4.addActionListener(this);
				nextBtn_4.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						nextBtn_4.setIcon(nextBtnEntered);
						nextBtn_4.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						nextBtn_4.setIcon(nextBtnBasic);
						nextBtn_4.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
				});
			}
			else {
				d4.setBounds(30, 480, 1200, 100);
				d4.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d4);
				
				Feeling.pf2_DOWN();// 호감도 -2
				down.setVisible(true);;
				
				super.add(end);
				end.setVisible(true);
				repaint();	
			}
		}
		if(s == nextBtn_3) {
			nextBtn_3.setVisible(false);
			
			c1_1.setBounds(820,325,500,100);
			c1_1.setBorderPainted(false);
			c1_1.setContentAreaFilled(false);
			c1_1.setFocusPainted(false);
			super.add(c1_1);
			c1_1.setVisible(true);
			c1_1.addActionListener(this);
			c1_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					c1_1.setIcon(c1_1Entered);
					c1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					c1_1.setIcon(c1_1Basic);
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
			c1_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					c1_2.setIcon(c1_2Entered);
					c1_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					c1_2.setIcon(c1_2Basic);
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
			c1_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					c1_3.setIcon(c1_3Entered);
					c1_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					c1_3.setIcon(c1_3Basic);
					c1_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			repaint();
		}
		
		if(s == c1_1 || s == c1_2 || s == c1_3) {
			up.setVisible(false);
			c1_1.setVisible(false);
			c1_2.setVisible(false);
			c1_3.setVisible(false);
			d1.setVisible(false);
			
			if(s == c1_1) {
				Feeling.pf2_SAME();// 호감도 +0
				same.setVisible(true);
				
				d5.setBounds(30, 480, 1200, 100);
				d5.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d5);
			}
			else if(s == c1_2) {
				Feeling.pf2_DOWN();// 호감도 -1
				down.setVisible(true);
				
				d6.setBounds(30, 480, 1200, 100);
				d6.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d6);
				d7.setBounds(30, 550, 1200, 100);
				d7.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d7);
			}
			else {
				Feeling.pf2_DOWN();// 호감도 -1
				down.setVisible(true);
				
				d8.setBounds(30, 480, 1200, 100);
				d8.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d8);
			}
			label_1.setBounds(30, 480, 1200, 100);
			label_1.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(label_2);
			
			super.add(end);
			end.setVisible(true);
			repaint();	
		}
		
		if(s == end) {
			up.setVisible(false);
			same.setVisible(false);
			down.setVisible(false);
			
			d5.setVisible(false);
			d6.setVisible(false);
			d7.setVisible(false);
			d8.setVisible(false);
			name.setVisible(false);
			d14.setVisible(false);
			d4.setVisible(false);
			end.setVisible(false);
			try	{
				backGround = ImageIO.read(url_2);
				repaint();
			} catch (IOException e1) {}
			label_2.setBounds(30, 480, 1200, 100);
			label_2.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(label_2);
			
			exit.setBounds(1000,400,300,60);
			exit.setBorderPainted(false);
			exit.setContentAreaFilled(false);
			exit.setFocusPainted(false);
			super.add(exit);
			exit.setVisible(true);
			exit.addActionListener(this);
			exit.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					exit.setIcon(nextBtnEntered);
					exit.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					exit.setIcon(nextBtnBasic);
					exit.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
		}
		
		if(s == exit) {
			super.setVisible(false);
			isWorked = true;
		}
		
		if(s == nextBtn_4) {
			nextBtn_4.setVisible(false);
			d2.setVisible(false);
			d3.setVisible(false);
			d9.setBounds(30, 480, 1200, 100);
			d9.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(d9);
			
			nextBtn_5.setBounds(1000,400,300,60);
			nextBtn_5.setBorderPainted(false);
			nextBtn_5.setContentAreaFilled(false);
			nextBtn_5.setFocusPainted(false);
			
			super.add(nextBtn_5);
			nextBtn_5.setVisible(true);
			nextBtn_5.addActionListener(this);
			nextBtn_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					nextBtn_5.setIcon(nextBtnEntered);
					nextBtn_5.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					nextBtn_5.setIcon(nextBtnBasic);
					nextBtn_5.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
		}
		
		if(s == nextBtn_5) {
			up.setVisible(false);
			nextBtn_5.setVisible(false);
			
			c2_1.setBounds(820,325,500,100);
			c2_1.setBorderPainted(false);
			c2_1.setContentAreaFilled(false);
			c2_1.setFocusPainted(false);
			super.add(c2_1);
			c2_1.setVisible(true);
			c2_1.addActionListener(this);
			c2_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					c2_1.setIcon(c2_1Entered);
					c2_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					c2_1.setIcon(c2_1Basic);
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
			c2_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					c2_2.setIcon(c2_2Entered);
					c2_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					c2_2.setIcon(c2_2Basic);
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
			c2_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					c2_3.setIcon(c2_3Entered);
					c2_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					c2_3.setIcon(c2_3Basic);
					c2_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			repaint();
		}
		
		if(s == c2_1 || s == c2_2 || s == c2_3) {
			c2_1.setVisible(false);
			c2_2.setVisible(false);
			c2_3.setVisible(false);
			d9.setVisible(false);
			
			if(s == c2_1) {
				Feeling.pf2_DOWN();// 호감도 -1
				down.setVisible(true);
				
				d10.setBounds(30, 480, 1200, 100);
				d10.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d10);
			}
			else if(s == c2_2) {
				Feeling.pf2_DOWN();// 호감도 -1
				down.setVisible(true);
				
				d11.setBounds(30, 480, 1200, 100);
				d11.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d11);
			}
			else {
				Feeling.pf2_UP();// 호감도 +1
				up.setVisible(true);
				
				d12.setBounds(30, 480, 1200, 100);
				d12.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d12);
				d13.setBounds(30, 550, 1200, 100);
				d13.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d13);
			}
			
			nextBtn_6.setBounds(1000,400,300,60);
			nextBtn_6.setBorderPainted(false);
			nextBtn_6.setContentAreaFilled(false);
			nextBtn_6.setFocusPainted(false);
			
			super.add(nextBtn_6);
			nextBtn_6.setVisible(true);
			nextBtn_6.addActionListener(this);
			nextBtn_6.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					nextBtn_6.setIcon(nextBtnEntered);
					nextBtn_6.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					nextBtn_6.setIcon(nextBtnBasic);
					nextBtn_6.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			repaint();
		}
		
		if(s == nextBtn_6) {
			up.setVisible(false);
			down.setVisible(false);
			nextBtn_6.setVisible(false);
			d10.setVisible(false);
			d11.setVisible(false);
			d12.setVisible(false);
			d13.setVisible(false);
			
			d14.setBounds(30, 480, 1200, 100);
			d14.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(d14);
			
			super.add(end);
			end.setVisible(true);
			
			Dialogue_B.isSpecialDialogue = true; // 특정 대화 조건 발동
			repaint();
		}
	}
}
