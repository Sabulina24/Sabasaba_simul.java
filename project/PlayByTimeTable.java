package project;

import java.awt.image.BufferedImage;

public class PlayByTimeTable {

	int[][] table = TimeTable.settable();
	// 교수님A : 1,2,3	교수님B : 6,7,8	교수님C : 11,12,13
	
	MainFrame f = new mainFrame();
	Dialogue_A a = new Dialogue_A();
	Dialogue_B b = new Dialogue_B();
	Dialogue_C c = new Dialogue_C();
	Work w = new Work();
	BufferedImage background;
	
	private static int n = 0;
	
	public PlayByTimeTable()
	{
		Dialogue_C.n = 4;
		c.getDialogue_Holiday(f);
		f.setVisible(true);
		w.IsWork_C();
		
		/*
		f.add(new Simul_start());
		f.setVisible(true);
		
		w.Start();
		
		for(int i = 0 ; i < 5; i++)
		{
			System.out.println("하루시작");
			Background z = new Background();
			f.add(z);
			
			if(table[0][i] == 0 && table[1][i] == 0 && table[2][i] == 0) // 풀공강 일 때
			{
				z.getBackground(i);
				z.getHoliday();
				
				w.IsWork_day();
				Background.isWorked = false;
				
				// 휴일 대화를 불러온다.
				n = (int)(Math.random()*3);
				if(n == 0)
				{
					Dialogue_A.n = 4;
					a.getDialogue_Holiday(f);
					f.setVisible(true);
					w.IsWork_A();
				}
				else if(n == 1)
				{
					Dialogue_B.n = 4;
					b.getDialogue_Holiday(f);
					f.setVisible(true);
					w.IsWork_B();
				}
				else
				{
					Dialogue_C.n = 4;
					c.getDialogue_Holiday(f);
					f.setVisible(true);
					w.IsWork_C();
				}
			}
			else
			{
				z.getBackground(i);
				int x1 = table[0][i];
				int x2 = table[1][i];
				int x3 = table[2][i];
				z.getFirstClass(x1);
				z.getSecondClass(x2);
				z.getThirdClass(x3);
				
				w.IsWork_day();
				Background.isWorked = false;
			}
			
			for(int j = 0 ; j < 3; j++)
			{
				if(table[j][i] == 1 || table[j][i] == 2 || table[j][i] == 3)
				{
					a.getDialogue(f);
					f.setVisible(true);
					w.IsWork_A();
				}
				else if(table[j][i] == 6 || table[j][i] == 7 || table[j][i] == 8)
				{
					b.getDialogue(f);
					f.setVisible(true);
					w.IsWork_B();
				}
				else if(table[j][i] == 11 || table[j][i] == 12 || table[j][i] == 13)
				{
					c.getDialogue(f);
					f.setVisible(true);
					w.IsWork_C();
				}
			}
		}
		
		Background v = new Background();
		f.add(v);
		v.getSaturday();
		f.setVisible(true);

		w.IsWork_day();
		Background.isWorked = false;
		
		// 미니게임 실행
		f.add(new DrinkingGame());
		f.setVisible(true);
		
		w.IsWork_Drinking();
	
		
		if(DrinkingGame.n == 1)
		{
			f.add(new profA());
			f.setVisible(true);
			
			w.Drink_A();
		}
		else if(DrinkingGame.n == 2)
		{
			f.add(new profB());
			f.setVisible(true);
			
			w.Drink_B();
		}
		else
		{
			f.add(new profC());
			f.setVisible(true);
			
			w.Drink_C();
		}
		
		
		Background u = new Background();
		f.add(u);
		u.getSunday();
		f.setVisible(true);
		
		w.IsWork_day();
		
		//미니게임 실행
		f.add(new TryNotToSleep());
		f.setVisible(true);
		
		w.IsWork_Sleep();
		
		f.add(new TryNotToSleep_Play());
		f.setVisible(true);
		
		w.IsWork_SleepPlay();
		
		//게임 결과 창 실행
		f.add(new GameResult());
		f.setVisible(true);
		*/
	}
}

class Work{
	
	public void IsWork_day()
	{
		Day();
	}
	public void IsWork_A()
	{
		if(Dialogue_A.n == 0)
		{
			ANormal_1();
		}
		else if(Dialogue_A.n == 1)
		{
			ANormal_2();
		}
		else if(Dialogue_A.n == 2)
		{
			ANormal_3();
		}
		else if(Dialogue_A.n == 3)
		{
			ASpecial();
		}
		else if(Dialogue_A.n == 4)
		{
			AHoliday();
		}
	}
	public void IsWork_B()
	{
		if(Dialogue_B.n == 0)
		{
			BNormal_1();
		}
		else if(Dialogue_B.n == 1)
		{
			BNormal_2();
		}
		else if(Dialogue_B.n == 2)
		{
			BNormal_3();
		}
		else if(Dialogue_B.n == 3)
		{
			BSpecial();
		}
		else if(Dialogue_B.n == 4)
		{
			BHoliday();
		}
	}
	public void IsWork_C()
	{
		if(Dialogue_C.n == 0)
		{
			CNormal_1();
		}
		else if(Dialogue_C.n == 1)
		{
			CNormal_2();
		}
		else if(Dialogue_C.n == 2)
		{
			CNormal_3();
		}
		else if(Dialogue_C.n == 3)
		{
			CSpecial();
		}
		else if(Dialogue_C.n == 4)
		{
			CHoliday();
		}
	}
	public void IsWork_Drinking()
	{
		Drinking();
	}
	public void IsWork_Drink_A()
	{
		Drink_A();
	}
	public void IsWork_Drink_B()
	{
		Drink_B();
	}
	public void IsWork_Drink_C()
	{
		Drink_C();
	}
	public void IsWork_Sleep()
	{
		Sleep();
	}
	public void IsWork_SleepPlay()
	{
		SleepPlay();
	}
	public synchronized void Sleep()
	{
		while(TryNotToSleep.isWorked == false)
		{
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e) {System.out.println("예외");}
		}
	}
	public synchronized void SleepPlay()
	{
		while(TryNotToSleep_Play.isWorked == false)
		{
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e) {System.out.println("예외");}
		}
	}
	public synchronized void Drink_A()
	{
		while(profA.isWorked == false)
		{
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e) {System.out.println("예외");}
		}
	}
	public synchronized void Drink_B()
	{
		while(profB.isWorked == false)
		{
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e) {System.out.println("예외");}
		}
	}
	public synchronized void Drink_C()
	{
		while(profC.isWorked == false)
		{
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e) {System.out.println("예외");}
		}
	}
	public synchronized void Drinking()
	{
		while(DrinkingGame.isWorked == false)
		{
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e) {System.out.println("예외");}
		}
	}
	public synchronized void Day()
	{
		while(Background.isWorked == false)
		{
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e) {System.out.println("예외");}
		}
	}
	public synchronized void Start()
	{
		while(Simul_start.isWorked == false)
		{
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e) {System.out.println("예외");}
		}
	}
	public synchronized void ANormal_1()
	{
		while(A_Normal_1.isWorked == false)
		{
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e) {System.out.println("예외");}
		}
	}
	public synchronized void ANormal_2()
	{
		while(A_Normal_2.isWorked == false)
		{
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e) {System.out.println("예외");}
		}
	}
	public synchronized void ANormal_3()
	{
		while(A_Normal_3.isWorked == false)
		{
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e) {System.out.println("예외");}
		}
	}
	public synchronized void ASpecial()
	{
		while(A_Special.isWorked == false)
		{
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e) {System.out.println("예외");}
		}
	}
	public synchronized void AHoliday()
	{
		while(A_Holiday.isWorked == false)
		{
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e) {System.out.println("예외");}
		}
	}
	public synchronized void BNormal_1()
	{
		while(B_Normal_1.isWorked == false)
		{
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e) {System.out.println("예외");}
		}
	}
	public synchronized void BNormal_2()
	{
		while(B_Normal_2.isWorked == false)
		{
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e) {}

		}
	}
	public synchronized void BNormal_3()
	{
		while(B_Normal_3.isWorked == false)
		{
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e) {System.out.println("예외");}
		}
	}
	public synchronized void BSpecial()
	{
		while(B_Special.isWorked == false)
		{
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e) {System.out.println("예외");}
		}
	}
	public synchronized void BHoliday()
	{
		while(B_Holiday.isWorked == false)
		{
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e) {System.out.println("예외");}
		}
	}
	public synchronized void CNormal_1()
	{
		while(C_Normal_1.isworked == false)
		{
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e) {System.out.println("예외");}
		}
	}
	public synchronized void CNormal_2()
	{
		while(C_Normal_2.isworked == false)
		{
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e) {}

		}
	}
	public synchronized void CNormal_3()
	{
		while(C_Normal_3.isworked == false)
		{
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e) {System.out.println("예외");}
		}
	}
	public synchronized void CSpecial()
	{
		while(C_Special.isworked == false)
		{
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e) {System.out.println("예외");}
		}
	}
	public synchronized void CHoliday()
	{
		while(C_Holiday.isworked == false)
		{
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e) {System.out.println("예외");}
		}
	}
}
