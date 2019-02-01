package project;

public class Dialogue_A {
	public static boolean isSpecialDialogue = false;
	boolean[] isCalled = new boolean[3];
	public static int n = 0;
	
	public void getDialogue(MainFrame f){
		boolean isDialogueWorked = false;
		
		if(isSpecialDialogue == true){
			A_Special b = new A_Special();
			f.add(b);
			n = 3;
			isDialogueWorked = true;
			isSpecialDialogue = false;
		}
		else{
			do{
				n = (int)(Math.random()*4);
			
				if(n == 0){
					if(isCalled[n] == false){
						A_Normal_1 b = new A_Normal_1();
						f.add(b);
						isCalled[n] = true;
						isDialogueWorked = true;		
					}
				}
				if(n == 1){
					if(isCalled[n] == false){
						A_Normal_2 b = new A_Normal_2();
						f.add(b);
						isCalled[n] = true;
						isDialogueWorked = true;
					}
				}
				if(n == 2){
					if(isCalled[n] == false){
						A_Normal_3 b = new A_Normal_3();
						f.add(b);
						isCalled[n] = true;
						isDialogueWorked = true;
					}
				}	
			}while(isDialogueWorked == false);
		}
	}
	
	public void getDialogue_Holiday(MainFrame f){
		A_Holiday b = new A_Holiday();
		f.add(b);
		n = 4;
	}
}
