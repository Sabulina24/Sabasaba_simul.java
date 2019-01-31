package project;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class A_Normal_2 extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	public static boolean isWorked = false;
	String[] d = ProfessorDialogue.getDialogue_A_Normal2();
	
	private int i=0;
	private int t=0;
	private int k=0;
	private Image background=new ImageIcon(Main.class.getResource("../images/�����Թ�_A.jpg")).getImage();
   
    private JLabel label1= new JLabel("������ A");
    private JLabel label2= new JLabel(d[2*k]);
    private JLabel label3= new JLabel(d[2*k+1]);
    private JLabel downlabel=new JLabel(new ImageIcon(Main.class.getResource("../images/ȣ���� �϶�.png")));
    private JLabel uplabel=new JLabel(new ImageIcon(Main.class.getResource("../images/ȣ���� ���.png")));
  
	
    private ImageIcon exitbuttonBasicImage=new ImageIcon(Main.class.getResource("../images/images6.png"));
    private ImageIcon nextbuttonEntered=new ImageIcon(Main.class.getResource("../images/��ư1_Ŭ��.png"));
    private ImageIcon nextbuttonbasic=new ImageIcon(Main.class.getResource("../images/��ư1.png"));
    
    private ImageIcon button1Image=new ImageIcon(Main.class.getResource("../images/2������1_1.png"));
    private ImageIcon button2Image=new ImageIcon(Main.class.getResource("../images/2������1_2.png"));
    private ImageIcon button3Image=new ImageIcon(Main.class.getResource("../images/2������1_3.png"));
    private ImageIcon button1ImageEntered=new ImageIcon(Main.class.getResource("../images/2������_Ŭ��1_1.png"));
    private ImageIcon button2ImageEntered=new ImageIcon(Main.class.getResource("../images/2������_Ŭ��1_2.png"));
    private ImageIcon button3ImageEntered=new ImageIcon(Main.class.getResource("../images/2������_Ŭ��1_3.png"));
    
    private ImageIcon button1ImageEntered2=new ImageIcon(Main.class.getResource("../images/2������_Ŭ��1_1.png"));
    private ImageIcon button2ImageEntered2=new ImageIcon(Main.class.getResource("../images/2������_Ŭ��1_2.png"));
    private ImageIcon button3ImageEntered2=new ImageIcon(Main.class.getResource("../images/2������_Ŭ��1_3.png"));
    
    private ImageIcon button1_1Image=new ImageIcon(Main.class.getResource("../images/2������2_1.png"));
    private ImageIcon button2_1Image=new ImageIcon(Main.class.getResource("../images/2������2_2.png"));
    private ImageIcon button3_1Image=new ImageIcon(Main.class.getResource("../images/2������2_3.png"));
    private ImageIcon button1_1ImageEntered=new ImageIcon(Main.class.getResource("../images/2������_Ŭ��2_1.png"));
    private ImageIcon button2_1ImageEntered=new ImageIcon(Main.class.getResource("../images/2������_Ŭ��2_2.png"));
    private ImageIcon button3_1ImageEntered=new ImageIcon(Main.class.getResource("../images/2������_Ŭ��2_3.png"));
    
    private ImageIcon button1_1ImageEntered2=new ImageIcon(Main.class.getResource("../images/2������_Ŭ��2_1.png"));
    private ImageIcon button2_1ImageEntered2=new ImageIcon(Main.class.getResource("../images/2������_Ŭ��2_2.png"));
    private ImageIcon button3_1ImageEntered2=new ImageIcon(Main.class.getResource("../images/2������_Ŭ��2_3.png"));
    
    private ImageIcon button1_2Image=new ImageIcon(Main.class.getResource("../images/2������3_1.png"));
    private ImageIcon button2_2Image=new ImageIcon(Main.class.getResource("../images/2������3_2.png"));
    private ImageIcon button3_2Image=new ImageIcon(Main.class.getResource("../images/2������3_3.png"));
    private ImageIcon button1_2ImageEntered=new ImageIcon(Main.class.getResource("../images/2������_Ŭ��3_1.png"));
    private ImageIcon button2_2ImageEntered=new ImageIcon(Main.class.getResource("../images/2������_Ŭ��3_2.png"));
    private ImageIcon button3_2ImageEntered=new ImageIcon(Main.class.getResource("../images/2������_Ŭ��3_3.png"));
    
    private ImageIcon button1_2ImageEntered2=new ImageIcon(Main.class.getResource("../images/2������_Ŭ��3_1.png"));
    private ImageIcon button2_2ImageEntered2=new ImageIcon(Main.class.getResource("../images/2������_Ŭ��3_2.png"));
    private ImageIcon button3_2ImageEntered2=new ImageIcon(Main.class.getResource("../images/2������_Ŭ��3_3.png"));
    
    private ImageIcon button1_3Image=new ImageIcon(Main.class.getResource("../images/2������4_1.png"));
    private ImageIcon button2_3Image=new ImageIcon(Main.class.getResource("../images/2������4_2.png"));
   
    private ImageIcon button1_3ImageEntered=new ImageIcon(Main.class.getResource("../images/2������_Ŭ��4_1.png"));
    private ImageIcon button2_3ImageEntered=new ImageIcon(Main.class.getResource("../images/2������_Ŭ��4_2.png"));
   
    
    private ImageIcon button1_3ImageEntered2=new ImageIcon(Main.class.getResource("../images/2������_Ŭ��4_1.png"));
    private ImageIcon button2_3ImageEntered2=new ImageIcon(Main.class.getResource("../images/2������_Ŭ��4_2.png"));
   
    
    
    
    private JButton nextbutton=new JButton(nextbuttonbasic);
    private JButton button1=new JButton(button1Image);
    private JButton button2=new JButton(button2Image);
    private JButton button3=new JButton(button3Image);
    private JButton button1_1=new JButton(button1_1Image);
    private JButton button2_1=new JButton(button2_1Image);
    private JButton button3_1=new JButton(button3_1Image);
    private JButton button1_2=new JButton(button1_2Image);
    private JButton button2_2=new JButton(button2_2Image);
    private JButton button3_2=new JButton(button3_2Image);
    private JButton button1_3=new JButton(button1_3Image);
    private JButton button2_3=new JButton(button2_3Image);
    
    
	public A_Normal_2(){	
		
        setLayout(null);
		
		
			downlabel.setBounds(160,100,100,250);
		   
		    super.add(downlabel);
		    downlabel.setVisible(false);
			
		    uplabel.setBounds(160,100,100,250);
			   
		    super.add(uplabel);
		    uplabel.setVisible(false);
		
		nextbutton.setBounds(1000, 400, 300, 60);
		nextbutton.setBorderPainted(false);
		nextbutton.setContentAreaFilled(false);
		nextbutton.setFocusPainted(false);
		nextbutton.setVisible(false);
		nextbutton.addMouseListener(new MouseAdapter() {
			@Override
			
			public void mouseEntered(MouseEvent e) {
				nextbutton.setIcon(nextbuttonEntered);
			}
			@Override
			
			public void mouseExited(MouseEvent e) {
				nextbutton.setIcon(nextbuttonbasic);
				
			}
            @Override
			
			public void mousePressed(MouseEvent e) {
            	t++;
            	if(t<3) {
            		if(t==2) {
                        
                		button1_1.setVisible(true);
                		button2_1.setVisible(true);
                		button3_1.setVisible(true);
                		nextbutton.setVisible(false);
                	}
            		k++;
            		label2.setText(d[2*k]);
            		label3.setText(d[2*k+1]);
            	}
            	
            	else if(t<5) {
            		 if(t==4) {
                 		
                 		button1_2.setVisible(true);
                 		button2_2.setVisible(true);
                 		button3_2.setVisible(true);
                 		nextbutton.setVisible(false);
                 	}
            		k++;
            		label2.setText(d[2*k]);
            		label3.setText(d[2*k+1]);
            	}
            	else if(t<7) {
            		
            		
                     if(t==6) {
                    	 
                    	
                		button1_3.setVisible(true);
                		button2_3.setVisible(true);
                		
                		nextbutton.setVisible(false);
                	}
                     k++;
             		label2.setText(d[2*k]);
             		label3.setText(d[2*k+1]);
            	}
            	
            	
           if(t==7) {
        	   End();
            	}
            		
            	downlabel.setVisible(false);
            	uplabel.setVisible(false);
            	
            }
			
		});
		
		super.add(nextbutton);
		
		button1.setBounds(820, 325, 500, 100);
		button1.setBorderPainted(false);
		button1.setContentAreaFilled(false);
		button1.setFocusPainted(false);
		button1.setVisible(true);
		button1.addMouseListener(new MouseAdapter() {
             @Override
			
			public void mouseEntered(MouseEvent e) {
            	 button1.setIcon(button1ImageEntered);
			}
			@Override
			
			public void mouseExited(MouseEvent e) {
				button1.setIcon(button1Image);
			}
			
            @Override
			
			public void mousePressed(MouseEvent e) {
            	
               	 
               	 button1.setVisible(false);
                button2.setVisible(false);
                button3.setVisible(false);
                downlabel.setVisible(true);
                 GoodFeeling.teacher1FeelDown();
               	
            	nextbutton.setVisible(true);
            	 button1.setIcon(button1ImageEntered2);
            	i++;
			
            }
		});
		
		super.add(button1);
		
		button2.setBounds(820, 450, 500, 100);
		button2.setBorderPainted(false);
		button2.setContentAreaFilled(false);
		button2.setFocusPainted(false);
		button2.setVisible(true);
		button2.addMouseListener(new MouseAdapter() {
            @Override
			
			public void mouseEntered(MouseEvent e) {
            	button2.setIcon(button2ImageEntered);
			}
			@Override
			
			public void mouseExited(MouseEvent e) {
				button2.setIcon(button2Image);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
             
             
               	
               	button1.setVisible(false);
                button2.setVisible(false);
                button3.setVisible(false);
               GoodFeeling.teacher1FeelUp();
               uplabel.setVisible(true);
               nextbutton.setVisible(true);
			}
             
		});
		
		super.add(button2);
		
		button3.setBounds(820, 575, 500, 100);
		button3.setBorderPainted(false);
		button3.setContentAreaFilled(false);
		button3.setFocusPainted(false);
		button3.setVisible(true);
		button3.addMouseListener(new MouseAdapter() {
           @Override
			
			public void mouseEntered(MouseEvent e) {
				button3.setIcon(button3ImageEntered);
			}
			@Override
			
			public void mouseExited(MouseEvent e) {
				button3.setIcon(button3Image);
			} 
			@Override
			
			public void mousePressed(MouseEvent e) {
				 button1.setVisible(false);
	                button2.setVisible(false);
	                button3.setVisible(false);
	                GoodFeeling.teacher1FeelDown();
	                downlabel.setVisible(true);
				
				button3.setIcon(button3ImageEntered2);
				i++;
				nextbutton.setVisible(true);
			}
		});
		
		super.add(button3);
		
		button1_1.setBounds(820, 325, 500, 100);
		button1_1.setBorderPainted(false);
		button1_1.setContentAreaFilled(false);
		button1_1.setFocusPainted(false);
		button1_1.setVisible(false);
		button1_1.addMouseListener(new MouseAdapter() {
           @Override
			
			public void mouseEntered(MouseEvent e) {
        	   button1_1.setIcon(button1_1ImageEntered);
			}
			@Override
			
			public void mouseExited(MouseEvent e) {
				button1_1.setIcon(button1_1Image);
			} 
			@Override
			
			public void mousePressed(MouseEvent e) {
				button1_1.setVisible(false);
        		button2_1.setVisible(false);
        		button3_1.setVisible(false);
				
				downlabel.setVisible(true);
                GoodFeeling.teacher1FeelDown();
				
				button1_1.setIcon(button1_1ImageEntered2);
				i++;
				nextbutton.setVisible(true);
			}
		});
		
		super.add(button1_1);
		
		button2_1.setBounds(820, 450, 500, 100);
		button2_1.setBorderPainted(false);
		button2_1.setContentAreaFilled(false);
		button2_1.setFocusPainted(false);
		button2_1.setVisible(false);
		button2_1.addMouseListener(new MouseAdapter() {
           @Override
			
			public void mouseEntered(MouseEvent e) {
        	   button2_1.setIcon(button2_1ImageEntered);
			}
			@Override
			
			public void mouseExited(MouseEvent e) {
				button2_1.setIcon(button2_1Image);
			} 
			@Override
			
			public void mousePressed(MouseEvent e) {
				button1_1.setVisible(false);
        		button2_1.setVisible(false);
        		button3_1.setVisible(false);
				
        		 GoodFeeling.teacher1FeelUp();
                 uplabel.setVisible(true);
				
				button2_1.setIcon(button2_1ImageEntered2);
				i++;
				nextbutton.setVisible(true);
			}
		});
		
		super.add(button2_1);
		button3_1.setBounds(820, 575, 500, 100);
		button3_1.setBorderPainted(false);
		button3_1.setContentAreaFilled(false);
		button3_1.setFocusPainted(false);
		button3_1.setVisible(false);
		button3_1.addMouseListener(new MouseAdapter() {
           @Override
			
			public void mouseEntered(MouseEvent e) {
        	   button3_1.setIcon(button3_1ImageEntered);
			}
			@Override
			
			public void mouseExited(MouseEvent e) {
				button3_1.setIcon(button3_1Image);
			} 
			@Override
			
			public void mousePressed(MouseEvent e) {
				button1_1.setVisible(false);
        		button2_1.setVisible(false);
        		button3_1.setVisible(false);
				
        		 GoodFeeling.teacher1FeelDown();
                 downlabel.setVisible(true);
				
				button1_1.setIcon(button3_1ImageEntered2);
				i++;
				nextbutton.setVisible(true);
			}
		});
		
		super.add(button3_1);
		
		button1_2.setBounds(820, 325, 500, 100);
		button1_2.setBorderPainted(false);
		button1_2.setContentAreaFilled(false);
		button1_2.setFocusPainted(false);
		button1_2.setVisible(false);
		button1_2.addMouseListener(new MouseAdapter() {
           @Override
			
			public void mouseEntered(MouseEvent e) {
        	   button1_2.setIcon(button1_2ImageEntered);
			}
			@Override
			
			public void mouseExited(MouseEvent e) {
				button1_2.setIcon(button1_2Image);
			} 
			@Override
			
			public void mousePressed(MouseEvent e) {
				button1_2.setVisible(false);
        		button2_2.setVisible(false);
        		button3_2.setVisible(false);
				
        		 GoodFeeling.teacher1FeelDown();
                 downlabel.setVisible(true);
				
                 button1_2.setIcon(button1_2ImageEntered2);
				i++;
				nextbutton.setVisible(true);
			}
		});
		
		super.add(button1_2);
		
		button2_2.setBounds(820, 450, 500, 100);
		button2_2.setBorderPainted(false);
		button2_2.setContentAreaFilled(false);
		button2_2.setFocusPainted(false);
		button2_2.setVisible(false);
		button2_2.addMouseListener(new MouseAdapter() {
           @Override
			
			public void mouseEntered(MouseEvent e) {
        	   button2_2.setIcon(button2_2ImageEntered);
			}
			@Override
			
			public void mouseExited(MouseEvent e) {
				button2_2.setIcon(button2_2Image);
			} 
			@Override
			
			public void mousePressed(MouseEvent e) {
				button1_2.setVisible(false);
        		button2_2.setVisible(false);
        		button3_2.setVisible(false);
				
        		 GoodFeeling.teacher1FeelDown();
                 downlabel.setVisible(true);
				
                 button2_2.setIcon(button2_2ImageEntered2);
				i++;
				nextbutton.setVisible(true);
			}
		});
		
		super.add(button2_2);
		
		
		
		button3_2.setBounds(820, 575, 500, 100);
		button3_2.setBorderPainted(false);
		button3_2.setContentAreaFilled(false);
		button3_2.setFocusPainted(false);
		button3_2.setVisible(false);
		button3_2.addMouseListener(new MouseAdapter() {
           @Override
			
			public void mouseEntered(MouseEvent e) {
        	   button3_2.setIcon(button3_2ImageEntered);
			}
			@Override
			
			public void mouseExited(MouseEvent e) {
				button3_2.setIcon(button3_2Image);
			} 
			@Override
			
			public void mousePressed(MouseEvent e) {
				button1_2.setVisible(false);
        		button2_2.setVisible(false);
        		button3_2.setVisible(false);
				
        		 GoodFeeling.teacher1FeelUp();
                 uplabel.setVisible(true);
				
                 button3_2.setIcon(button3_2ImageEntered2);
				i++;
				nextbutton.setVisible(true);
			}
		});
		
		super.add(button3_2);
		
		
		button1_3.setBounds(820, 325, 500, 100);
		button1_3.setBorderPainted(false);
		button1_3.setContentAreaFilled(false);
		button1_3.setFocusPainted(false);
		button1_3.setVisible(false);
		button1_3.addMouseListener(new MouseAdapter() {
           @Override
			
			public void mouseEntered(MouseEvent e) {
        	   button1_3.setIcon(button1_3ImageEntered);
			}
			@Override
			
			public void mouseExited(MouseEvent e) {
				button1_3.setIcon(button1_3Image);
			} 
			@Override
			
			public void mousePressed(MouseEvent e) {
				
				button1_3.setVisible(false);
				button2_3.setVisible(false);
				
        		 GoodFeeling.teacher1FeelDown();
                 downlabel.setVisible(true);
				
                 button1_3.setIcon(button1_3ImageEntered2);
				i++;
				nextbutton.setVisible(true);
			}
		});
		
		super.add(button1_3);
		
		
		button2_3.setBounds(820, 450, 500, 100);
		button2_3.setBorderPainted(false);
		button2_3.setContentAreaFilled(false);
		button2_3.setFocusPainted(false);
		button2_3.setVisible(false);
		button2_3.addMouseListener(new MouseAdapter() {
           @Override
			
			public void mouseEntered(MouseEvent e) {
        	   button2_3.setIcon(button2_3ImageEntered);
			}
			@Override
			
			public void mouseExited(MouseEvent e) {
				button2_3.setIcon(button2_3Image);
			} 
			@Override
			
			public void mousePressed(MouseEvent e) {
				button1_3.setVisible(false);
				button2_3.setVisible(false);
				
        		 GoodFeeling.teacher1FeelUp();
                 uplabel.setVisible(true);
				
                 button2_3.setIcon(button2_3ImageEntered2);
				i++;
				nextbutton.setVisible(true);
			}
		});
		
		super.add(button2_3);
		
		label1.setBounds(30, 385, 300, 100);
		label1.setFont((new Font("���� ����",Font.BOLD,30)));
		super.add(label1);
		label2.setFont((new Font("���� ����",Font.PLAIN,40)));
		label2.setBounds(30, 480, 1200, 100);
		super.add(label2);
		label3.setFont((new Font("���� ����",Font.PLAIN,40)));
		label3.setBounds(30, 550, 1200, 100);
		add(label3);
		
	    	}
	public void paint(Graphics g)
	{
		g.drawImage(background, 0, 0, null);
		paintComponents(g);
		repaint();
	}
	
	public void End()
	{
		isWorked = true;
		super.setVisible(false);
	}
}