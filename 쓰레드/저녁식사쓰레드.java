package ������;

import user.user;

public class ����Ļ羲���� implements Runnable {
	// ����ܼӱ��� ģô ��ũ�� ������ ����Ļ翡 �ʴ��Ѵ�(50���� ����)
	// 10�ʰ� ����Ļ縦 �����鼭 
	// ��ũ�� �ǽ��� ���� ����Ȯ�� 10�� ����
	
	user user;
	//boolean b;
	
	public ����Ļ羲����(boolean b) {
		
	}
	
	
	@Override
	public void run() {
		 System.out.println("");
		System.out.println(user.����+": � ���ð�!");
		System.out.println("��ũ: �ʴ����ּż� �����մϴ�. ����. �׵��� �� �����̳���?");
		System.out.println(user.����+": ���� �� ������ ��...���� �ٴϰ�.. �� ���� �ͼ� ������ �ǰڱ���");
		System.out.println("");

		System.out.println("(����ð� ������ ��ȭ ��)");
		 try 
	        {
	            for (int i=user.����Ȯ�� ; i>user.����Ȯ��-11 ; i--) 
	            {
	                
	                Thread.sleep(1000);
	               //System.out.println(user.����Ȯ�� + "���� "+i+" ����");
	                System.out.println("���� Ȯ��: "+i);
	            }
	            
	        }catch(InterruptedException e ) 
	        {
	            e.printStackTrace();
	        }
	        
		user.����Ȯ��-=10;                            //���� �ǿ� 10 ����
     	user.��-=50;                            //���� �ں� 10���� ����
		System.out.println("");

		System.out.println("��ũ: ������ ���� ���ֽ��ϴ�. ������ �б� ���� ������ �ʴ� ����� ���� �����ϴ�! ������ �� �˵��� ����!");	
		System.out.println("");
		System.out.println("(���� �Ļ�  ����� ���� 50���� �����߽��ϴ�.)"); 

		
	}
	
	public void finish() {           //�ٸ� �޴��� ������ �� ����	   
        
	    this.interrupt();
	    
	 }


	private void interrupt() {
		// TODO Auto-generated method stub
		
	}

  

	}		
