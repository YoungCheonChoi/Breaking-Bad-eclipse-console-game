package ������;

import java.util.Timer;
import java.util.TimerTask;
import �극��ŷ���_�ڹ���ǰ.main;

public class �ǸŽð����Ѿ����� implements Runnable  {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 System.out.println("���ѽð��� ���� ���θ޴��� �̵��մϴ�.");
		 
	      // ���θ޴��ε�������
	      Thread ���θ޴��ε� = new Thread(new �ε�������("���θ޴��ε�"));
	      ���θ޴��ε�.start();
	      try {
	         ���θ޴��ε�.join();
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      main.���θ޴��޼���();
	}
}

/*
 * 	Timer �ð�����_Ÿ�̸� = new Timer();
	TimerTask �ð�����_�½�ũ = new TimerTask() {
		
	@Override
	public void run() {
		// TODO Auto-generated method stub
		 System.out.println("���ѽð��� ���� ���θ޴��� �̵��մϴ�.");
		 
	      // ���θ޴��ε�������
	      Thread ���θ޴��ε� = new Thread(new �ε�������("���θ޴��ε�"));
	      ���θ޴��ε�.start();
	      try {
	         ���θ޴��ε�.join();
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      main.���θ޴��޼���();
	   }		
	};
		�ð�����_Ÿ�̸�.schedule(�ð�����_�½�ũ,6000);
 * 
*/