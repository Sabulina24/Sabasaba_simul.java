package project;

public class DrinkingAlgorithm {
	public static int DrunkMeter=0;
	public static int Mood=0;

	public static boolean HangoverCure=false;
		public static int Drink(boolean d) {
			if(d==false&&HangoverCure==true)
				DrunkMeter-=3;
			if(d==true)
				DrunkMeter+=(int)(Math.random()*4);
			if(d==false)
				DrunkMeter-=(int)(Math.random()*3);
			else
			{}
			
			return DrunkMeter;
		}
}
