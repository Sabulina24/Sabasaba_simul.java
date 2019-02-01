package project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProfessorLines {

	static BufferedReader br = null;
	private static String[] dialogue = new String[100];
	
	public static String[] getDialogue_B() {
		for(int i = 0; i < 100; i++) {
			dialogue[i] = ""; // String의 내용을 빈칸으로 채운다 (이게 없으면 NullPointerException 발생)
		}
		
		try {
			InputStream in = Main.class.getResourceAsStream("/교수님 대사_B.txt");
			br = new BufferedReader(new InputStreamReader(in));
			
			String line;
			
			int i;
			for(i = 0 ; (line = br.readLine()) != null; i++) { // 더 이상 읽을 줄이 없을 때 까지 한 줄씩 line에 String 형태로 저장
				dialogue[i] = line; // i번째 줄의 대사를 dialogue 배열에 저장
			}
		} catch(IOException e) {};
		
		for(int j = 0; j < 100; j++) {
			int k = dialogue[j].indexOf("//");
			if(k == -1)
				continue;
			dialogue[j] = dialogue[j].substring(0, k); // 문장에 "//"앞까지만  잘라서 저장
		}
		
		return dialogue; // 대사 배열들을 반환한다.
	}
	
	public static String[] getDialogue_A_Special() {	
		for(int i = 0; i < 100; i++) {
			dialogue[i] = ""; // String의 내용을 빈칸으로 채운다 (이게 없으면 NullPointerException 발생)
		}
		
		try {
			InputStream in = Main.class.getResourceAsStream("/특정1-1.txt");
			br = new BufferedReader(new InputStreamReader(in)); // 교수님 대사 파일을 읽어온다
			String line;

			int i;
			for(i = 0 ; (line = br.readLine()) != null; i++) { // 더 이상 읽을 줄이 없을 때 까지 한 줄씩 line에 String 형태로 저장
				dialogue[i] = line; // i번째 줄의 대사를 dialogue 배열에 저장
			}
		} catch(IOException e) {};
		
		for(int j = 0; j < 100; j++) {
			int k = dialogue[j].indexOf("//");
			if(k == -1)
				continue;
			dialogue[j] = dialogue[j].substring(0, k); // 문장에 "//"앞까지만  잘라서 저장
		}
		
		return dialogue; // 대사 배열들을 반환한다.
	}
	
	public static String[] getDialogue_A_Normal1() {	
		for(int i = 0; i < 100; i++) {
			dialogue[i] = ""; // String의 내용을 빈칸으로 채운다 (이게 없으면 NullPointerException 발생)
		}
		
		try {
			InputStream in = Main.class.getResourceAsStream("/일반1-1.txt");
			br = new BufferedReader(new InputStreamReader(in)); // 교수님 대사 파일을 읽어온다
			String line;

			int i;
			for(i = 0 ; (line = br.readLine()) != null; i++) { // 더 이상 읽을 줄이 없을 때 까지 한 줄씩 line에 String 형태로 저장
				dialogue[i] = line; // i번째 줄의 대사를 dialogue 배열에 저장
			}
		} catch(IOException e) {};
		
		for(int j = 0; j < 100; j++) {
			int k = dialogue[j].indexOf("//");
			if(k == -1)
				continue;
			dialogue[j] = dialogue[j].substring(0, k); // 문장에 "//"앞까지만  잘라서 저장
		}
		
		return dialogue; // 대사 배열들을 반환한다.
	}
	
	public static String[] getDialogue_A_Normal2() {
		for(int i = 0; i < 100; i++) {
			dialogue[i] = ""; // String의 내용을 빈칸으로 채운다 (이게 없으면 NullPointerException 발생)
		}
		
		try {
			InputStream in = Main.class.getResourceAsStream("/일반2-1.txt");
			br = new BufferedReader(new InputStreamReader(in)); // 교수님 대사 파일을 읽어온다
			String line;

			int i;
			for(i = 0 ; (line = br.readLine()) != null; i++) { // 더 이상 읽을 줄이 없을 때 까지 한 줄씩 line에 String 형태로 저장
				dialogue[i] = line; // i번째 줄의 대사를 dialogue 배열에 저장
			}
		} catch(IOException e) {};
		
		for(int j = 0; j < 100; j++) {
			int k = dialogue[j].indexOf("//");
			if(k == -1)
				continue;
			dialogue[j] = dialogue[j].substring(0, k); // 문장에 "//"앞까지만  잘라서 저장
		}
		
		return dialogue; // 대사 배열들을 반환한다.
	}
	
	public static String[] getDialogue_A_Normal3() {
		for(int i = 0; i < 100; i++) {
			dialogue[i] = ""; // String의 내용을 빈칸으로 채운다 (이게 없으면 NullPointerException 발생)
		}
		
		try {
			InputStream in = Main.class.getResourceAsStream("/일반3-1.txt");
			br = new BufferedReader(new InputStreamReader(in)); // 교수님 대사 파일을 읽어온다
			String line;

			int i;
			for(i = 0 ; (line = br.readLine()) != null; i++) { // 더 이상 읽을 줄이 없을 때 까지 한 줄씩 line에 String 형태로 저장
				dialogue[i] = line; // i번째 줄의 대사를 dialogue 배열에 저장
			}
		} catch(IOException e) {};
		
		for(int j = 0; j < 100; j++) {
			int k = dialogue[j].indexOf("//");
			if(k == -1)
				continue;
			dialogue[j] = dialogue[j].substring(0, k); // 문장에 "//"앞까지만  잘라서 저장
		}
		
		return dialogue; // 대사 배열들을 반환한다.
	}
	
	public static String[] getDialogue_A_Holiday() {
		for(int i = 0; i < 100; i++) {
			dialogue[i] = ""; // String의 내용을 빈칸으로 채운다 (이게 없으면 NullPointerException 발생)
		}
		
		try {
			InputStream in = Main.class.getResourceAsStream("/휴일.txt");
			br = new BufferedReader(new InputStreamReader(in)); // 교수님 대사 파일을 읽어온다
			String line;

			int i;
			for(i = 0 ; (line = br.readLine()) != null; i++) { // 더 이상 읽을 줄이 없을 때 까지 한 줄씩 line에 String 형태로 저장
				dialogue[i] = line; // i번째 줄의 대사를 dialogue 배열에 저장
			}
		} catch(IOException e) {};
		
		for(int j = 0; j < 100; j++) {
			int k = dialogue[j].indexOf("//");
			if(k == -1)
				continue;
			dialogue[j] = dialogue[j].substring(0, k); // 문장에 "//"앞까지만  잘라서 저장
		}
		
		return dialogue; // 대사 배열들을 반환한다.
	}
	
	public static String[] getDialogue_C() {
		for(int i = 0; i < 100; i++) {
			dialogue[i] = ""; // String의 내용을 빈칸으로 채운다 (이게 없으면 NullPointerException 발생)
		}
		
		try {
			InputStream in = Main.class.getResourceAsStream("/교수님 대화.txt");
			br = new BufferedReader(new InputStreamReader(in)); // 교수님 대사 파일을 읽어온다
			String line;

			int i;
			for(i = 0 ; (line = br.readLine()) != null; i++) { // 더 이상 읽을 줄이 없을 때 까지 한 줄씩 line에 String 형태로 저장
				dialogue[i] = line; // i번째 줄의 대사를 dialogue 배열에 저장
			}
		} catch(IOException e) {};
		
		for(int j = 0; j < 100; j++) {
			int k = dialogue[j].indexOf("//");
			if(k == -1)
				continue;
			dialogue[j] = dialogue[j].substring(0, k); // 문장에 "//"앞까지만  잘라서 저장
		}
		
		return dialogue; // 대사 배열들을 반환한다.
	}
}
