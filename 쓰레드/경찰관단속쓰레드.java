package ������;

import user.user;

public class �������ܼӾ����� implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int ���������� = (int)(Math.random()*10)+1;
		
		 try{ 	

			if(����������>=7 && ����������<=10)
	            {
				
				        user.��-=50;                       //���� �� 50���� ����
				        user.����Ȯ��+=10;
				        
           		System.out.println("");
           		System.out.println("");
           		
				    System.out.println("�ءءءءءءءءءءءءءءءءءءءءءء�");
	            	System.out.println("��                   ������ �ܼӿ� �ɷȽ��ϴ�           ��");
	            	System.out.println("��                                                                             ��");
	            	System.out.println("��            ���� ���� ���� �������� ���׽��ϴ�. ��");
	            	System.out.println("��            �Ը��� ��� 50������ �����˴ϴ�.  ��");
	            	System.out.println("��                ����Ȯ���� 10 �����մϴ�.     ��");
	            	System.out.println("��                ���� ��: "+user.��+"����                   ��");
	            	System.out.println("�ءءءءءءءءءءءءءءءءءءءءءء�");
	            	
	            	System.out.println("");
	            	System.out.println("");
	            	
	                Thread.sleep(1700);   	           
	            }
			
	        }catch(InterruptedException e ) {
	        
	            e.printStackTrace();
	         
	        }
	        	        	        	        
	    }
	
	public void finish() {           //�ٸ� �޴��� ������ �� ����	   
       
	    this.interrupt();
	    
	 }

	private void interrupt() {
		// TODO Auto-generated method stub
		
	}

	}


