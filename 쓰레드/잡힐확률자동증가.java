package ������;

import java.util.Timer;
import java.util.TimerTask;

import user.user;


public class ����Ȯ���ڵ����� {
	public static void main(String[] args) {

	Timer m_timer = new Timer();
	TimerTask m_task = new TimerTask() {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("ddd");
		//user.����Ȯ��+=1;
		
	}
	
   	 


};
m_timer.schedule(m_task,1000,6000);
}
}


