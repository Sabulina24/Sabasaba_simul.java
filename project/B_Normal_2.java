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
public class B_Normal_2 extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;

	public static boolean isWorked = false;
	
	BufferedImage background;
	URL url_1 = getClass().getClassLoader().getResource("강의실안.jpg");
	URL url_2 = getClass().getClassLoader().getResource("강의실안_B.jpg");
	
	JButton nextBtn1 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton nextBtn2 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton nextBtn3 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton nextBtn4 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton nextBtn5 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton nextBtn6 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton nextBtn7 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton nextBtn8 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton nextBtn9 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton nextBtn10 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton nextBtn11 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton nextBtn12 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton nextBtn13 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton nextBtn14 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton nextBtn15 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton nextBtn16 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton nextBtn17 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton nextBtn18 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton nextBtn19 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton nextBtn20 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton nextBtnEnd = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton nextBtnExit = new JButton(new ImageIcon(getClass().getClassLoader().getResource("버튼1.png")));
	JButton up = new JButton(new ImageIcon(getClass().getClassLoader().getResource("호감도 상승.png")));
	JButton same = new JButton(new ImageIcon(getClass().getClassLoader().getResource("호감도 유지.png")));
	JButton down = new JButton(new ImageIcon(getClass().getClassLoader().getResource("호감도 하락.png")));
	
	JButton c1_1 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_1_1.png")));
	JButton c1_2 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_1_2.png")));
	JButton c1_3 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_1_3.png")));
	JButton c2_1 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_1.png")));
	JButton c2_2 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_2.png")));
	JButton c2_3 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_3.png")));
	JButton c2_1_1 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_1_1.png")));
	JButton c2_1_2 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_1_2.png")));
	JButton c2_1_3 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_1_3.png")));
	JButton c2_2_1 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_2_1.png")));
	JButton c2_2_2 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_2_2.png")));
	JButton c2_2_3 = new JButton(new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_2_3.png")));
	
	JLabel name = new JLabel("교수님B");
	JLabel label1 = new JLabel("(언제나처럼 수업에 지각한 나는 헐레벌떡 강의실로 들어와");
	JLabel label2 = new JLabel("자연스레 가까운 뒷자리에 슬그머니 앉는다.)");
	JLabel label3 = new JLabel("(한 숨을 고르고 공책과 필기도구를 꺼내 눈치껏 필기하려는");
	JLabel label4 = new JLabel("찰나, 교수님이 날 지목하셨다.)");
	JLabel label5 = new JLabel("(교수님은 저번 시간에 배운 파트의 핵심 내용을 물으신 듯 하다.");
	JLabel label6 = new JLabel("아뿔싸! 나는 지난 시간에 수업을 째서 하나도 모르는데..!)");
	JLabel label7 = new JLabel("(일단 위기는 넘긴 듯하다..)");
	JLabel label8 = new JLabel("(나는 어색한 웃음을 지으며 다시 자리에 앉았다.)");
	JLabel label9 = new JLabel("(수업이 끝나고 나는 지친 듯한 모습으로 수업자료와 출석부");
	JLabel label10 = new JLabel("그리고 그의 전용 커피잔을 챙기시는 교수님께 다가갔다.)");
	JLabel label11 = new JLabel("(아차, 그러고보니 교재를 집에 두고왔다! 어떡하지?)");
	JLabel label12 = new JLabel("(어..음, 그게..)");
	JLabel label13 = new JLabel("(이런! 지금 상황에서 애교는 무리수였다..)");
	JLabel label14 = new JLabel("(나는 적당히 대화를 마무리 지은 후 교수님께 공손히");
	JLabel label15 = new JLabel("인사하고 후다닥 나왔다)");
	JLabel label16 = new JLabel("(음...어떤게 공적결석에 인정되는거였더라??)");
	JLabel label17 = new JLabel("(시도는 좋았으나 난 결석처리되었고 거짓말까지 들통났다.)");
	JLabel label18 = new JLabel("(만세! 공적결석이 인정되었다.)");
	
	String[] dialogue = ProfessorLines.getDialogue_B(); // 교수님B 대사를 한 줄씩 끊어서 String 배열에 저장
	
	JLabel d15 = new JLabel(dialogue[15]); // 교수님 대사 텍스트 파일의 16번째 줄의 문장을 ("//"뒷부분은 잘라짐) d15에 저장.
	JLabel d16 = new JLabel(dialogue[16]);
	JLabel d17 = new JLabel(dialogue[17]);
	JLabel d18 = new JLabel(dialogue[18]);
	JLabel d19 = new JLabel(dialogue[19]);
	JLabel d20 = new JLabel(dialogue[20]);
	JLabel d21 = new JLabel(dialogue[21]);
	JLabel d22 = new JLabel(dialogue[22]);
	JLabel d23 = new JLabel(dialogue[23]);
	JLabel d24 = new JLabel(dialogue[24]);
	JLabel d25 = new JLabel(dialogue[25]);
	JLabel d26 = new JLabel(dialogue[26]);
	JLabel d27 = new JLabel(dialogue[27]);
	JLabel d28 = new JLabel(dialogue[28]);
	
	private ImageIcon nextBtnEnteredImage = new ImageIcon(getClass().getClassLoader().getResource("버튼1_클릭.png"));
	private ImageIcon nextBtnBasicImage = new ImageIcon(getClass().getClassLoader().getResource("버튼1.png"));
	private ImageIcon c1_1EnteredImage = new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_1_1_clk.png"));
	private ImageIcon c1_1BasicImage = new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_1_1.png"));
	private ImageIcon c1_2EnteredImage = new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_1_2_clk.png"));
	private ImageIcon c1_2BasicImage = new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_1_2.png"));
	private ImageIcon c1_3EnteredImage = new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_1_3_clk.png"));
	private ImageIcon c1_3BasicImage = new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_1_3.png"));
	private ImageIcon c2_1EnteredImage = new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_1_clk.png"));
	private ImageIcon c2_1BasicImage = new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_1.png"));
	private ImageIcon c2_2EnteredImage = new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_2_clk.png"));
	private ImageIcon c2_2BasicImage = new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_2.png"));
	private ImageIcon c2_3EnteredImage = new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_3_clk.png"));
	private ImageIcon c2_3BasicImage = new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_3.png"));
	private ImageIcon c2_1_1EnteredImage = new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_1_1_clk.png"));
	private ImageIcon c2_1_1BasicImage = new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_1_1.png"));
	private ImageIcon c2_1_2EnteredImage = new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_1_2_clk.png"));
	private ImageIcon c2_1_2BasicImage = new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_1_2.png"));
	private ImageIcon c2_1_3EnteredImage = new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_1_3_clk.png"));
	private ImageIcon c2_1_3BasicImage = new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_1_3.png"));
	private ImageIcon c2_2_1EnteredImage = new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_2_1_clk.png"));
	private ImageIcon c2_2_1BasicImage = new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_2_1.png"));
	private ImageIcon c2_2_2EnteredImage = new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_2_2_clk.png"));
	private ImageIcon c2_2_2BasicImage = new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_2_2.png"));
	private ImageIcon c2_2_3EnteredImage = new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_2_3_clk.png"));
	private ImageIcon c2_2_3BasicImage = new ImageIcon(getClass().getClassLoader().getResource("선택지_강의실_2_2_3.png"));
	
	public B_Normal_2(){
		try{
			background = ImageIO.read(url_1);
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
		nextBtn1.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseEntered(MouseEvent e){
				nextBtn1.setIcon(nextBtnEnteredImage);
				nextBtn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e){
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
	
	public void paintComponent(Graphics g){
		g.drawImage(background, 0, 0, null);
	}
	
	public void actionPerformed(ActionEvent e){
		nextBtnEnd.setBounds(1000,400,300,60);
		nextBtnEnd.setBorderPainted(false);
		nextBtnEnd.setContentAreaFilled(false);
		nextBtnEnd.setFocusPainted(false);
		nextBtnEnd.addActionListener(this);
		nextBtnEnd.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseEntered(MouseEvent e){
				nextBtnEnd.setIcon(nextBtnEnteredImage);
				nextBtnEnd.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e){
				nextBtnEnd.setIcon(nextBtnBasicImage);
				nextBtnEnd.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		
		if(e.getSource() == nextBtn1){
			try{
				background = ImageIO.read(url_2);
				repaint();
			} catch (IOException e1) {}
			
			nextBtn1.setVisible(false);
			label1.setVisible(false);
			label2.setVisible(false);
			
			label3.setBounds(30, 480, 1200, 100);
			label3.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			label4.setBounds(30, 550, 1200, 100);
			label4.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			
			nextBtn2.setBounds(1000,400,300,60);
			nextBtn2.setBorderPainted(false);
			nextBtn2.setContentAreaFilled(false);
			nextBtn2.setFocusPainted(false);
			
			super.add(label3);
			super.add(label4);
			super.add(nextBtn2);
			nextBtn2.addActionListener(this);
			nextBtn2.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseEntered(MouseEvent e){
					nextBtn2.setIcon(nextBtnEnteredImage);
					nextBtn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e){
					nextBtn2.setIcon(nextBtnBasicImage);
					nextBtn2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			repaint();
		}
		
		if(e.getSource() == nextBtn2){
			nextBtn2.setVisible(false);
			label3.setVisible(false);
			label4.setVisible(false);
			
			name.setBounds(30, 385, 300, 100);
			name.setFont(new Font("맑은 고딕", Font.BOLD, 30));
			super.add(name);
			
			d15.setBounds(30, 480, 1200, 100);
			d15.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			
			nextBtn3.setBounds(1000,400,300,60);
			nextBtn3.setBorderPainted(false);
			nextBtn3.setContentAreaFilled(false);
			nextBtn3.setFocusPainted(false);
			
			super.add(d15);
			super.add(nextBtn3);
			nextBtn3.addActionListener(this);
			nextBtn3.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseEntered(MouseEvent e){
					nextBtn3.setIcon(nextBtnEnteredImage);
					nextBtn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e){
					nextBtn3.setIcon(nextBtnBasicImage);
					nextBtn3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			repaint();
		}
		
		if(e.getSource() == nextBtn3){
			nextBtn3.setVisible(false);
			d15.setVisible(false);
			name.setVisible(false);
			
			label5.setBounds(30, 480, 1200, 100);
			label5.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			label6.setBounds(30, 550, 1200, 100);
			label6.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(label5);
			super.add(label6);
			
			nextBtn4.setBounds(1000,400,300,60);
			nextBtn4.setBorderPainted(false);
			nextBtn4.setContentAreaFilled(false);
			nextBtn4.setFocusPainted(false);
			super.add(nextBtn4);
			nextBtn4.addActionListener(this);
			nextBtn4.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseEntered(MouseEvent e){
					nextBtn4.setIcon(nextBtnEnteredImage);
					nextBtn4.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e){
					nextBtn4.setIcon(nextBtnBasicImage);
					nextBtn4.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			repaint();
		}
		
		if(e.getSource() == nextBtn4){
			nextBtn4.setVisible(false);
			label5.setVisible(false);
			label6.setVisible(false);
			
			c1_1.setBounds(820,325,500,100);
			c1_1.setBorderPainted(false);
			c1_1.setContentAreaFilled(false);
			c1_1.setFocusPainted(false);
			
			super.add(c1_1);
			c1_1.setVisible(true);
			c1_1.addActionListener(this);
			c1_1.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseEntered(MouseEvent e){
					c1_1.setIcon(c1_1EnteredImage);
					c1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e){
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
			c1_2.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseEntered(MouseEvent e){
					c1_2.setIcon(c1_2EnteredImage);
					c1_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e){
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
			c1_3.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseEntered(MouseEvent e){
					c1_3.setIcon(c1_3EnteredImage);
					c1_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e){
					c1_3.setIcon(c1_3BasicImage);
					c1_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			repaint();
		}
		
		if(e.getSource() == c1_1 || e.getSource() == c1_2 || e.getSource() == c1_3){
			c1_1.setVisible(false);
			c1_2.setVisible(false);
			c1_3.setVisible(false);
			name.setVisible(true);
			
			d17.setBounds(30, 480, 1200, 100);
			d17.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			
			nextBtn8.setBounds(1000,400,300,60);
			nextBtn8.setBorderPainted(false);
			nextBtn8.setContentAreaFilled(false);
			nextBtn8.setFocusPainted(false);
			nextBtn8.addActionListener(this);
			nextBtn8.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseEntered(MouseEvent e){
					nextBtn8.setIcon(nextBtnEnteredImage);
					nextBtn8.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e){
					nextBtn8.setIcon(nextBtnBasicImage);
					nextBtn8.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			if(e.getSource() == c1_1){
				Feeling.pf2_SAME();// 호감도 +0
				same.setVisible(true);
				
				d16.setBounds(30, 480, 1200, 100);
				d16.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d16);
				nextBtn5.setBounds(1000,400,300,60);
				nextBtn5.setBorderPainted(false);
				nextBtn5.setContentAreaFilled(false);
				nextBtn5.setFocusPainted(false);
				super.add(nextBtn5);
				nextBtn5.addActionListener(this);
				nextBtn5.addMouseListener(new MouseAdapter(){
					@Override
					public void mouseEntered(MouseEvent e){
						nextBtn5.setIcon(nextBtnEnteredImage);
						nextBtn5.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e){
						nextBtn5.setIcon(nextBtnBasicImage);
						nextBtn5.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
				});
			}
			else if(e.getSource() == c1_2){
				
				super.add(d17);
				nextBtn6.setBounds(1000,400,300,60);
				nextBtn6.setBorderPainted(false);
				nextBtn6.setContentAreaFilled(false);
				nextBtn6.setFocusPainted(false);
				super.add(nextBtn6);
				nextBtn6.addActionListener(this);
				nextBtn6.addMouseListener(new MouseAdapter(){
					@Override
					public void mouseEntered(MouseEvent e){
						nextBtn6.setIcon(nextBtnEnteredImage);
						nextBtn6.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e){
						nextBtn6.setIcon(nextBtnBasicImage);
						nextBtn6.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
				});
				
			}
			else{
				super.add(d17);
				nextBtn7.setBounds(1000,400,300,60);
				nextBtn7.setBorderPainted(false);
				nextBtn7.setContentAreaFilled(false);
				nextBtn7.setFocusPainted(false);
				super.add(nextBtn7);
				nextBtn7.addActionListener(this);
				nextBtn7.addMouseListener(new MouseAdapter(){
					@Override
					public void mouseEntered(MouseEvent e){
						nextBtn7.setIcon(nextBtnEnteredImage);
						nextBtn7.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e){
						nextBtn7.setIcon(nextBtnBasicImage);
						nextBtn7.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
				});
			}
			repaint();
		}
		
		if(e.getSource() == nextBtn5){
			same.setVisible(false);
			d16.setVisible(false);
			nextBtn5.setVisible(false);
			name.setVisible(false);
			
			label7.setBounds(30, 480, 1200, 100);
			label7.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(label7);
			
			super.add(nextBtn8);
		}
		
		if(e.getSource() == nextBtn6 || e.getSource() == nextBtn7){
			Feeling.pf2_DOWN();// 호감도 -1
			down.setVisible(true);
			
			nextBtn6.setVisible(false);
			nextBtn7.setVisible(false);
			d17.setVisible(false);
			
			d18.setBounds(30, 480, 1200, 100);
			d18.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(d18);
			
			nextBtn9.setBounds(1000,400,300,60);
			nextBtn9.setBorderPainted(false);
			nextBtn9.setContentAreaFilled(false);
			nextBtn9.setFocusPainted(false);
			nextBtn9.addActionListener(this);
			nextBtn9.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseEntered(MouseEvent e){
					nextBtn9.setIcon(nextBtnEnteredImage);
					nextBtn9.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e){
					nextBtn9.setIcon(nextBtnBasicImage);
					nextBtn9.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			if(e.getSource() == nextBtn6){
				d19.setBounds(30, 550, 1200, 100);
				d19.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d19);
				super.add(nextBtn9);
			}
			else{
				d20.setBounds(30, 550, 1200, 100);
				d20.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d20);
				super.add(nextBtn9);
			}
			repaint();
		}
		
		if(e.getSource() == nextBtn9){
			down.setVisible(false);
			nextBtn9.setVisible(false);
			d18.setVisible(false);
			d19.setVisible(false);
			d20.setVisible(false);
			
			label8.setBounds(30, 480, 1200, 100);
			label8.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(label8);
			
			super.add(nextBtn8);
		}
		
		if(e.getSource() == nextBtn8){
			try{
				background = ImageIO.read(url_1);
				repaint();
			} catch (IOException e1) {}
			nextBtn8.setVisible(false);
			label8.setVisible(false);
			label7.setVisible(false);
			
			label9.setBounds(30, 480, 1200, 100);
			label9.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			label10.setBounds(30, 550, 1200, 100);
			label10.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(label9);
			super.add(label10);
			
			nextBtn10.setBounds(1000,400,300,60);
			nextBtn10.setBorderPainted(false);
			nextBtn10.setContentAreaFilled(false);
			nextBtn10.setFocusPainted(false);
			nextBtn10.addActionListener(this);
			nextBtn10.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseEntered(MouseEvent e){
					nextBtn10.setIcon(nextBtnEnteredImage);
					nextBtn10.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e){
					nextBtn10.setIcon(nextBtnBasicImage);
					nextBtn10.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			super.add(nextBtn10);
			
			repaint();
		}
		
		if(e.getSource() == nextBtn10){
			try{
				background = ImageIO.read(url_2);
				repaint();
			} catch (IOException e1) {}
			label9.setVisible(false);
			label10.setVisible(false);
			nextBtn10.setVisible(false);
			name.setVisible(true);
			d21.setBounds(30, 480, 1200, 100);
			d21.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(d21);
			nextBtn11.setBounds(1000,400,300,60);
			nextBtn11.setBorderPainted(false);
			nextBtn11.setContentAreaFilled(false);
			nextBtn11.setFocusPainted(false);
			nextBtn11.addActionListener(this);
			nextBtn11.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseEntered(MouseEvent e){
					nextBtn11.setIcon(nextBtnEnteredImage);
					nextBtn11.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e){
					nextBtn11.setIcon(nextBtnBasicImage);
					nextBtn11.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			super.add(nextBtn11);
			
			repaint();
		}
		
		if(e.getSource() == nextBtn11){
			nextBtn11.setVisible(false);
			
			c2_1.setBounds(820,325,500,100);
			c2_1.setBorderPainted(false);
			c2_1.setContentAreaFilled(false);
			c2_1.setFocusPainted(false);
			
			super.add(c2_1);
			c2_1.setVisible(true);
			c2_1.addActionListener(this);
			c2_1.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseEntered(MouseEvent e){
					c2_1.setIcon(c2_1EnteredImage);
					c2_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e){
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
			c2_2.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseEntered(MouseEvent e){
					c2_2.setIcon(c2_2EnteredImage);
					c2_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e){
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
			c2_3.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseEntered(MouseEvent e){
					c2_3.setIcon(c2_3EnteredImage);
					c2_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e){
					c2_3.setIcon(c2_3BasicImage);
					c2_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			repaint();
		}
		
		if(e.getSource() == c2_1 || e.getSource() == c2_2 || e.getSource() == c2_3){
			c2_1.setVisible(false);
			c2_2.setVisible(false);
			c2_3.setVisible(false);
			d21.setVisible(false);
			
			if(e.getSource() == c2_1){
				Feeling.pf2_UP();// 호감도 +1
				up.setVisible(true);
				
				d22.setBounds(30, 480, 1200, 100);
				d22.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d22);
				
				nextBtn12.setBounds(1000,400,300,60);
				nextBtn12.setBorderPainted(false);
				nextBtn12.setContentAreaFilled(false);
				nextBtn12.setFocusPainted(false);
				nextBtn12.addActionListener(this);
				nextBtn12.addMouseListener(new MouseAdapter(){
					@Override
					public void mouseEntered(MouseEvent e){
						nextBtn12.setIcon(nextBtnEnteredImage);
						nextBtn12.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e){
						nextBtn12.setIcon(nextBtnBasicImage);
						nextBtn12.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
				});
				super.add(nextBtn12);
			}
			else if(e.getSource() == c2_2){
				Feeling.pf2_SAME();// 호감도 +0
				same.setVisible(true);
				
				d23.setBounds(30, 480, 1200, 100);
				d23.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d23);
				
				nextBtn13.setBounds(1000,400,300,60);
				nextBtn13.setBorderPainted(false);
				nextBtn13.setContentAreaFilled(false);
				nextBtn13.setFocusPainted(false);
				nextBtn13.addActionListener(this);
				nextBtn13.addMouseListener(new MouseAdapter(){
					@Override
					public void mouseEntered(MouseEvent e){
						nextBtn13.setIcon(nextBtnEnteredImage);
						nextBtn13.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e){
						nextBtn13.setIcon(nextBtnBasicImage);
						nextBtn13.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
				});
				super.add(nextBtn13);
			}
			else{
				Feeling.pf2_DOWN();//호감도 -1
				down.setVisible(true);
				
				d24.setBounds(30, 480, 1200, 100);
				d24.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d24);
				
				nextBtn14.setBounds(1000,400,300,60);
				nextBtn14.setBorderPainted(false);
				nextBtn14.setContentAreaFilled(false);
				nextBtn14.setFocusPainted(false);
				nextBtn14.addActionListener(this);
				nextBtn14.addMouseListener(new MouseAdapter(){
					@Override
					public void mouseEntered(MouseEvent e){
						nextBtn14.setIcon(nextBtnEnteredImage);
						nextBtn14.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e){
						nextBtn14.setIcon(nextBtnBasicImage);
						nextBtn14.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
				});
				super.add(nextBtn14);
			}
			
			repaint();
		}
		
		if(e.getSource() == nextBtn12){
			nextBtn12.setVisible(false);
			up.setVisible(false);
			d22.setVisible(false);
			
			label11.setBounds(30, 480, 1200, 100);
			label11.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(label11);
			
			nextBtn15.setBounds(1000,400,300,60);
			nextBtn15.setBorderPainted(false);
			nextBtn15.setContentAreaFilled(false);
			nextBtn15.setFocusPainted(false);
			nextBtn15.addActionListener(this);
			nextBtn15.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseEntered(MouseEvent e){
					nextBtn15.setIcon(nextBtnEnteredImage);
					nextBtn15.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e){
					nextBtn15.setIcon(nextBtnBasicImage);
					nextBtn15.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			super.add(nextBtn15);
			
			repaint();
		}
		
		if(e.getSource() == nextBtn15){
			nextBtn15.setVisible(false);
			label11.setVisible(false);
			
			label12.setBounds(30, 480, 1200, 100);
			label12.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(label12);
			
			//선택지 1번에 대한 선택지들
			c2_1_1.setBounds(820,325,500,100);
			c2_1_1.setBorderPainted(false);
			c2_1_1.setContentAreaFilled(false);
			c2_1_1.setFocusPainted(false);
			
			super.add(c2_1_1);
			c2_1_1.setVisible(true);
			c2_1_1.addActionListener(this);
			c2_1_1.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseEntered(MouseEvent e){
					c2_1_1.setIcon(c2_1_1EnteredImage);
					c2_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e){
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
			c2_1_2.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseEntered(MouseEvent e){
					c2_1_2.setIcon(c2_1_2EnteredImage);
					c2_1_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e){
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
			c2_1_3.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseEntered(MouseEvent e){
					c2_1_3.setIcon(c2_1_3EnteredImage);
					c2_1_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e){
					c2_1_3.setIcon(c2_1_3BasicImage);
					c2_1_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			repaint();
		}
		
		if(e.getSource() == c2_1_1 || e.getSource() == c2_1_2 || e.getSource() == c2_1_3){
			label12.setVisible(false);
			c2_1_1.setVisible(false);
			c2_1_2.setVisible(false);
			c2_1_3.setVisible(false);
			
			if(e.getSource() == c2_1_1){
				Feeling.pf2_DOWN();// 호감도 -1
				down.setVisible(true);
				d25.setBounds(30, 480, 1200, 100);
				d25.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d25);
				
			}
			else if(e.getSource() == c2_1_2){
				Feeling.pf2_UP();// 호감도 +1
				up.setVisible(true);
				d26.setBounds(30, 480, 1200, 100);
				d26.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d26);
				Dialogue_B.isSpecialDialogue = true; // 특정 대화 조건 발동
			}
			else{
				Feeling.pf2_DOWN();// 호감도 -1
				down.setVisible(true);
				d27.setBounds(30, 480, 1200, 100);
				d27.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d27);
				d28.setBounds(30, 550, 1200, 100);
				d28.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(d28);
			}
			super.add(nextBtnEnd);
			repaint();
		}
		
		if(e.getSource() == nextBtn13){
			nextBtn13.setVisible(false);
			same.setVisible(false);
			d23.setVisible(false);
			
			label16.setBounds(30, 480, 1200, 100);
			label16.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(label16);
			
			//선택지 2번에 대한 선택지들
			c2_2_1.setBounds(820,325,500,100);
			c2_2_1.setBorderPainted(false);
			c2_2_1.setContentAreaFilled(false);
			c2_2_1.setFocusPainted(false);
			
			super.add(c2_2_1);
			c2_2_1.setVisible(true);
			c2_2_1.addActionListener(this);
			c2_2_1.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseEntered(MouseEvent e){
					c2_2_1.setIcon(c2_2_1EnteredImage);
					c2_2_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e){
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
			c2_2_2.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseEntered(MouseEvent e){
					c2_2_2.setIcon(c2_2_2EnteredImage);
					c2_2_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e){
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
			c2_2_3.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseEntered(MouseEvent e){
					c2_2_3.setIcon(c2_2_3EnteredImage);
					c2_2_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e){
					c2_2_3.setIcon(c2_2_3BasicImage);
					c2_2_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			repaint();
		}
		
		if(e.getSource() == c2_2_1 || e.getSource() == c2_2_2 || e.getSource() == c2_2_3){
			label16.setVisible(false);
			c2_2_1.setVisible(false);
			c2_2_2.setVisible(false);
			c2_2_3.setVisible(false);
			
			if(e.getSource() == c2_2_1 || e.getSource() == c2_2_3){
				Feeling.pf2_DOWN();// 호감도 -1
				down.setVisible(true);
				label17.setBounds(30, 480, 1200, 100);
				label17.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(label17);
			}
			else{
				Feeling.pf2_UP();//호감도 +1
				up.setVisible(true);
				label18.setBounds(30, 480, 1200, 100);
				label18.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
				super.add(label18);
			}
			super.add(nextBtnEnd);
			repaint();
		}
		
		if(e.getSource() == nextBtn14){
			nextBtn14.setVisible(false);
			down.setVisible(false);
			d24.setVisible(false);
			
			label13.setBounds(30, 480, 1200, 100);
			label13.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(label13);
			
			super.add(nextBtnEnd);
			
			repaint();
		}
		
		if(e.getSource() == nextBtnEnd){
			nextBtnEnd.setVisible(false);
			up.setVisible(false);
			same.setVisible(false);
			down.setVisible(false);
			label13.setVisible(false);
			label17.setVisible(false);
			label18.setVisible(false);
			d25.setVisible(false);
			d26.setVisible(false);
			d27.setVisible(false);
			d28.setVisible(false);
			
			label14.setBounds(30, 480, 1200, 100);
			label14.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(label14);
			label15.setBounds(30, 550, 1200, 100);
			label15.setFont(new Font("맑은 고딕", Font.PLAIN, 40));
			super.add(label15);
			
			nextBtnExit.setBounds(1000,400,300,60);
			nextBtnExit.setBorderPainted(false);
			nextBtnExit.setContentAreaFilled(false);
			nextBtnExit.setFocusPainted(false);
			nextBtnExit.addActionListener(this);
			nextBtnExit.addMouseListener(new MouseAdapter(){
				@Override
				public void mouseEntered(MouseEvent e){
					nextBtnExit.setIcon(nextBtnEnteredImage);
					nextBtnExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e){
					nextBtnExit.setIcon(nextBtnBasicImage);
					nextBtnExit.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			super.add(nextBtnExit);
			
			repaint();
		}
		
		if(e.getSource() == nextBtnExit){
			super.setVisible(false);
			isWorked = true;
		}
	}
}
