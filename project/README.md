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
Object 클래스를 상속받아 e.getSource()의 변수명을 s로 단순화 함.
* Object s = e.getSource();  
* 이후의 e.getSource()를 모두 s로 변경

jar 및 exe 파일 실행 오류 핸들링
------------------------
__이클립스에선 멀쩡히 실행되는 코드가 jar 및 exe 파일로 변환 시 경로 지정 오류로 발생하는 NullPointerException 처리.__  
jar파일 실행을 위해 File 시스템 대신 Stream 시스템을 사용.  
* 교수님 대사 txt파일을 불러오는 데 실패하는 오류 발생.  

  * -> ProfessorLines 클래스에서 FileReader 대신 InputStream을 사용하여 txt파일 경로를 결정.  
  
* 게임 실행 시 음악 재생이 되지 않는 오류 발생. (URI가 계층적이지 않음)  

  * -> Music 클래스에서 File 자체의 경로 지정후 URI로 변환하는 대신, InputStream으로 경로를 결정한 후 그 변수를 File 형식으로 변환해서 FileInputStream의 파라미터로 씀.  
  
* 자바 이클립스에선 경로 설정된 이미지파일 확장자명을 대소문자 구분을 하지 않는 것으로 확인. (ex) image.PNG 파일을 "image.png"으로 적어도 가능)    
  * But, jar/exe 실행파일에선 대소문자 구분을 하는 것으로 확인됐으며 String내부의 확장자명 대소문자 구분을 수정함.  
