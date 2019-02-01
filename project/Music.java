package project;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javazoom.jl.player.Player;

public class Music extends Thread {
	private Player player;
	private boolean isLoop;
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	public Music(String name, boolean isLoop) {
		try {
			this.isLoop=isLoop;
			
			file = new File("outFile.java");
			InputStream in = Main.class.getClassLoader().getResourceAsStream(name);
			OutputStream out = new FileOutputStream(file);
			byte[] buf = new byte[1024];
			int len = 0;
			while((len = in.read(buf))>0) {
				out.write(buf, 0, len);
			}
			out.close();
			in.close();
			//file=new File(getClass().getClassLoader().getResource(name).toURI());
			player=new Player(new BufferedInputStream(new FileInputStream(file)));
		} 
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public int getTime(){
		if(player==null)
			return 0;
		return player.getPosition();
	}
	
	public void close(){
		isLoop=false;
		player.close();
		this.interrupt();
	}
	
	@Override//thread상속시 필수
	public void run(){
		try{
			do{
				player.play();
				fis=new FileInputStream(file);
				bis=new BufferedInputStream(fis);
				player=new Player(bis);
			}while(isLoop);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
