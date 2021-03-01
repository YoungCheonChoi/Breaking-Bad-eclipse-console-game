package 쓰레드;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javazoom.jl.player.Player;
import 메인1.메인1;


public class 배경음악쓰레드 extends 쓰레드 {

	private Player player;
	private boolean loop; 
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	public 배경음악쓰레드(String name, boolean loop) {
		try {
			
			this.loop=loop;
			file=new File(메인1.class.getResource("../음악.효과음/" + name).toURI());		
			fis=new FileInputStream(file);
			bis=new BufferedInputStream(fis);
			player=new Player(bis);  

	}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public int getTime() {
		if(player==null)
			return 0;
		return player.getPosition();
	}

	public void close() {
		loop=false;
		player.close();                
		this.interrupt();
	}

	private void interrupt() {
		
	}

	@Override
	public void run() {
			try {
				do {
					player.play();
					fis=new FileInputStream(file);
					bis=new BufferedInputStream(fis);
					player=new Player(bis); 
					//player.play();          //null익셉션뜨면 위치 맨아래로 바꿔보기
				}while(loop);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}		
	}