package 쓰레드;

import user.user;

public class 저녁식사쓰레드 implements Runnable {
	// 마약단속국인 친척 행크네 가족을 저녁식사에 초대한다(50만원 지출)
	// 10초간 저녁식사를 가지면서 
	// 행크의 의심을 낮춰 잡힐확률 10을 감소
	
	user user;
	//boolean b;
	
	public 저녁식사쓰레드(boolean b) {
		
	}
	
	
	@Override
	public void run() {
		 System.out.println("");
		System.out.println(user.가명+": 어서 오시게!");
		System.out.println("행크: 초대해주셔서 감사합니다. 형님. 그동안 잘 지내셨나요?");
		System.out.println(user.가명+": 나야 잘 지내지 뭐...병원 다니고.. 얼른 여기 와서 앉으면 되겠구만");
		System.out.println("");

		System.out.println("(저녁시간 가지며 대화 중)");
		 try 
	        {
	            for (int i=user.잡힐확률 ; i>user.잡힐확률-11 ; i--) 
	            {
	                
	                Thread.sleep(1000);
	               //System.out.println(user.잡힐확률 + "에서 "+i+" 감소");
	                System.out.println("잡힐 확률: "+i);
	            }
	            
	        }catch(InterruptedException e ) 
	        {
	            e.printStackTrace();
	        }
	        
		user.잡힐확률-=10;                            //유저 의욕 10 증가
     	user.돈-=50;                            //유저 자본 10만원 감소
		System.out.println("");

		System.out.println("행크: 음식이 정말 맛있습니다. 열심히 학교 일을 멈추지 않는 모습이 보기 좋습니다! 다음에 또 뵙도록 하죠!");	
		System.out.println("");
		System.out.println("(저녁 식사  지출로 돈이 50만원 감소했습니다.)"); 

		
	}
	
	public void finish() {           //다른 메뉴로 진입할 시 종료	   
        
	    this.interrupt();
	    
	 }


	private void interrupt() {
		// TODO Auto-generated method stub
		
	}

  

	}		
