package project;

public class TimeTable {
	public static int gonggang;{ //공강 날을 리턴하는 메소드
		
		
		}
		
		public static int[][] settable(){ //시간표를 정하는 메소드
			int day;
			day=1+(int)(Math.random()*5); //1-5고름
			
			gonggang = day;
		
		int[][] table={{1,6,11,0,0},{2,7,12,0,0},{3,8,13,0,0}};
		int a,temp;
		a=gonggang;
		
		switch(a){
			case 1:
				{for(int i=0;i<3;i++){
					temp=table[i][0];
					table[i][0]=table[i][3];
					table[i][3]=temp;
					}break;
				}
			case 2:
				{for(int i=0;i<3;i++){
					temp=table[i][1];
					table[i][1]=table[i][3];
					table[i][3]=temp;
					}break;}
			case 3:
				{for(int i=0;i<3;i++){
					temp=table[i][2];
					table[i][2]=table[i][3];
					table[i][3]=temp;
					}break;}
			case 4:
				break;
			case 5:
				{for(int i=0;i<3;i++){
					temp=table[i][4];
					table[i][4]=table[i][3];
					table[i][3]=temp;
					}break;}
			} 
		
		
		table=TimeTable.mixtable(table);
		
		
		
		return table;
		}
	
		public static int[][] mixtable(int[][] t){ //시간표 섞는 메소드
		int temp;
		int c,d = 0;
		boolean test=false;
		
		c=TimeTable.gonggang;
		do {
			for(int i=0;i<3;i++){
				for(int j=0;j<5;j++){
			
					if(j==c-1) {}			
					else
					{
							d=(int)(Math.random()*5); //0-4고름
							if(j==d) {}
							else if(c-1==d) {} //{System.out.print("걸림");}
							else {
								temp=t[i][j];
								t[i][j]=t[i][d];
								t[i][d]=temp;
							}
					}
				}
								
								
				}
				
				
			
			test=TimeTable.testtable(t);
		}while(test==false);
			
		return t;
			
			}
		public static boolean testtable(int[][] a) { //하루에 같은과목이 두번 들었는지,공강이 하루에 3개있는지 확인하는 메소드
			
			int gong=TimeTable.gonggang;
			boolean SameClass=false,ThreeInARow=false;
			for(int i=0;i<5;i++) {
				if(gong-1==i) {}
				
					
			else if(a[0][i]==0&&a[1][i]==0&&a[2][i]==0)
							ThreeInARow=true;
				else	if((Math.abs(a[0][i]-a[1][i])==1)||(Math.abs(a[0][i]-a[1][i])==2))
							SameClass=true;
				else	if((Math.abs(a[0][i]-a[2][i])==1)||(Math.abs(a[0][i]-a[2][i])==2))
							SameClass=true;
				else	if((Math.abs(a[1][i]-a[2][i])==1)||(Math.abs(a[1][i]-a[2][i])==2))
							SameClass=true;
						
						
					
			}
			if(SameClass==true||ThreeInARow==true)
				return false;
			else
				return true;
			
		}

}