package project;

public class Dialogue_B {

	public static boolean isSpecialDialogue = false;
	boolean[] isCalled = new boolean[3];
	public static int n = 0;
	
	public void getDialogue(mainFrame f)
	{
		boolean isDialogueWorked = false;
		
		if(isSpecialDialogue == true)
		{
			// Special 대화 불러오기
			
			B_Special s = new B_Special();
			f.add(s);
			n = 3;
			isDialogueWorked = true;
			isSpecialDialogue = false;
		}
		else
		{
			do
			{
				n = (int)(Math.random()*4);
			
				if(n == 0)
				{
					if(isCalled[n] == false)
					{
						B_Normal_1 b = new B_Normal_1();
						f.add(b);
						isCalled[n] = true;
						isDialogueWorked = true;
					}
				}
				if(n == 1)
				{
					if(isCalled[n] == false)
					{
						B_Normal_2 b = new B_Normal_2();
						f.add(b);
						isCalled[n] = true;
						isDialogueWorked = true;
					}
				}
				if(n == 2)
				{
					if(isCalled[n] == false)
					{
						B_Normal_3 b = new B_Normal_3();
						f.add(b);
						isCalled[n] = true;
						isDialogueWorked = true;
					}
				}
		}while(isDialogueWorked == false);
		}
	}
	
	public void getDialogue_Holiday(mainFrame f)
	{
		// Holiday 대화 불러오기
		B_Holiday b = new B_Holiday();
		f.add(b);
		n = 4;
	}
}
