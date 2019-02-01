# Github 업데이트 후 수정 로그

클래스 명 변경
------------
* mainFrame -> MainFrame
* GoodFeeling -> Feeling
* ProfessorDialogue -> ProfessorLines
* Simul_start -> SimulStart  

메소드 및 변수 명 변경
-------------
* Feeling 클래스
  * teacher1FeelUp() -> pf1_UP()
  * teacher1FeelSame() -> pf1_SAME()
  * teacher1FeelDown() -> pf1_DOWN()
    * teacher1Feeling -> pf1_feel
    * teacher2Feeling -> pf2_feel
    * teacher3Feeling -> pf3_feel 

이미지 파일 경로 지정 방식 변경
------------------
__자바실행파일(.jar 또는 .exe) 변환 시 발생하는 이미지 경로 지정 오류로 인해 지정 방식을 일괄 변경함.__  

* file 형식 -> URL 형식
  * ex) File file = new File("./src/images/name.jpg");
  * -> URL url = getClass.getClassLoader().getResource("name.jpg");

    * 단, Music 클래스의 File, FileInputStream, BufferedInputStream 은 유지하되,  
    * file = new File(Main.class.getResource("../music/"+name).toURI());  
    * -> file = new File(getClass().getClassLoader().getResource(name).toURI()); 로 변경.  

* ImageIcon 지정 방식
  * Main.class.getResource("../images/name.png") -> getClass.getClassLoader().getResource("name")  

지나치게 반복되는 변수 단순화 
--------------------
B_Holiday, B_Normal_1, B_Normal_2, B_Normal_3, B_Special 클래스에서 e.getSource()의 비효율적인 반복이 발견 됨.  
Object 클래스 상속받아 e.getSource()의 변수명을 s로 단순화 함.
* Object s = e.getSource();  
* 이후의 e.getSource()를 모두 s로 변경
