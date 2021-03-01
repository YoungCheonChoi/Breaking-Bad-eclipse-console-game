package 쓰레드;

import java.util.Timer;
import java.util.TimerTask;
import 브레이킹배드_자바작품.main;

public class 판매시간제한쓰레드 implements Runnable  {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 System.out.println("제한시간이 지나 메인메뉴로 이동합니다.");
		 
	      // 메인메뉴로딩쓰레드
	      Thread 메인메뉴로딩 = new Thread(new 로딩쓰레드("메인메뉴로딩"));
	      메인메뉴로딩.start();
	      try {
	         메인메뉴로딩.join();
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      main.메인메뉴메서드();
	}
}

/*
 * 	Timer 시간제한_타이며 = new Timer();
	TimerTask 시간제한_태스크 = new TimerTask() {
		
	@Override
	public void run() {
		// TODO Auto-generated method stub
		 System.out.println("제한시간이 지나 메인메뉴로 이동합니다.");
		 
	      // 메인메뉴로딩쓰레드
	      Thread 메인메뉴로딩 = new Thread(new 로딩쓰레드("메인메뉴로딩"));
	      메인메뉴로딩.start();
	      try {
	         메인메뉴로딩.join();
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      main.메인메뉴메서드();
	   }		
	};
		시간제한_타이머.schedule(시간제한_태스크,6000);
 * 
*/