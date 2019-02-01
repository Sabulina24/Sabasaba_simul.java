package project;

public class Feeling {
	private static int pf1_feel;
	private static int pf2_feel;
	private static int pf3_feel;
	
	public Feeling(int a, int b, int c) {
		pf1_feel = a;
		pf2_feel = b;
		pf3_feel = c;
	}
	public static void pf1_UP() {
		if(pf1_feel < 10)
			pf1_feel++;
	}
	public static void pf2_UP() {
		if(pf2_feel < 10)
			pf2_feel++;
	}
	public static void pf3_UP() {
		if(pf3_feel < 10)
			pf3_feel++;
	}
	public static void pf1_SAME() {
	}
	public static void pf2_SAME() {
	}
	public static void pf3_SAME() {
	}
	public static void pf1_DOWN() {
		if(pf1_feel > 0)
			pf1_feel--;
	}
	public static void pf2_DOWN() {
		if(pf2_feel > 0)
			pf2_feel--;
	}
	public static void pf3_DOWN() {
		if(pf3_feel > 0)
			pf3_feel--;
	}
	public static int get_pf1() {
		return pf1_feel;
	}
	public static int get_pf2() {
		return pf2_feel;
	}
	public static int get_pf3() {
		return pf3_feel;
	}
}
