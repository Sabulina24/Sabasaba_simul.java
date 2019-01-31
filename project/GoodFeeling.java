package project;

public class GoodFeeling {
	 private static int teacher1Feeling;
	 private static int teacher2Feeling;
	 private static int teacher3Feeling;
	 
	 public GoodFeeling(int a,int b,int c) {
		 teacher1Feeling=5;
		 teacher2Feeling=5;
		 teacher3Feeling=5;
	 }
	 
	 public static void teacher1FeelUp() {
		 if(teacher1Feeling<10)
		 teacher1Feeling++;
	 }
	 public static void teacher1FeelSame() {
		
	 }
	 public static void teacher2FeelUp() {
		 if(teacher2Feeling<10)
		 teacher2Feeling++;
	 }
	 public static void teacher2FeelSame() {
			
	 }
	 public static void teacher3FeelUp() {
		 if(teacher3Feeling<10)
		 teacher3Feeling++;
	 }
	 public static void teacher3FeelSame() {
			
	 }
	 public static void teacher1FeelDown() {
		 if(0<teacher1Feeling)
		 teacher1Feeling--;
	 }
	 public static void teacher2FeelDown() {
		 if(0<teacher2Feeling)
		 teacher2Feeling--;
	 }
	 public static void teacher3FeelDown() {
		 if(0<teacher3Feeling)
		 teacher3Feeling--;
	 }
	 public static int teacher1Feelre() {
		 return teacher1Feeling;
	 }
	 public static  int teacher2Feelre() {
		 return teacher2Feeling;
	 }
	 public static  int teacher3Feelre() {
		 return teacher3Feeling;
	 }
	}