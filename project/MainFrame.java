package project;

import javax.swing.JFrame;

public class MainFrame extends JFrame{

	private static final long serialVersionUID = 1L;

	public MainFrame(){
		setSize(1280, 720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("교수님 사바사바 시뮬레이션");
		setVisible(true);
		setResizable(false); // 화면 크기 임의 조정 불가
		setLocationRelativeTo(null); // 화면 정중앙에 고정
	}
	
	public void exitFrame(){
		setVisible(false);
	}	
}
