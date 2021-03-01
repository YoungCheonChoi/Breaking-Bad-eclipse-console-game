package 쓰레드;

import user.user;

public class 경찰관단속쓰레드 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int 경찰관랜덤 = (int)(Math.random()*10)+1;
		
		 try{ 	

			if(경찰관랜덤>=7 && 경찰관랜덤<=10)
	            {
				
				        user.돈-=50;                       //유저 돈 50만원 감소
				        user.잡힐확률+=10;
				        
           		System.out.println("");
           		System.out.println("");
           		
				    System.out.println("※※※※※※※※※※※※※※※※※※※※※※※");
	            	System.out.println("※                   경찰관 단속에 걸렸습니다           ※");
	            	System.out.println("※                                                                             ※");
	            	System.out.println("※            동네 순찰 중인 경찰에게 들켰습니다. ※");
	            	System.out.println("※            입막음 비용 50만원이 차감됩니다.  ※");
	            	System.out.println("※                잡힐확률이 10 증가합니다.     ※");
	            	System.out.println("※                남은 돈: "+user.돈+"만원                   ※");
	            	System.out.println("※※※※※※※※※※※※※※※※※※※※※※※");
	            	
	            	System.out.println("");
	            	System.out.println("");
	            	
	                Thread.sleep(1700);   	           
	            }
			
	        }catch(InterruptedException e ) {
	        
	            e.printStackTrace();
	         
	        }
	        	        	        	        
	    }
	
	public void finish() {           //다른 메뉴로 진입할 시 종료	   
       
	    this.interrupt();
	    
	 }

	private void interrupt() {
		// TODO Auto-generated method stub
		
	}

	}


