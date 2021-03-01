package ������;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javazoom.jl.player.Player;
import ����1.����1;


public class ������Ǿ����� extends ������ {

	private Player player;
	private boolean loop; 
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	public ������Ǿ�����(String name, boolean loop) {
		try {
			
			this.loop=loop;
			file=new File(����1.class.getResource("../����.ȿ����/" + name).toURI());		
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
					//player.play();          //null�ͼ��Ƕ߸� ��ġ �ǾƷ��� �ٲ㺸��
				}while(loop);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}		
	}