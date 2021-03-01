package customer;

import java.util.Scanner;
import user.user;


public class 마약중독자 extends customer {

	public static void 중독자의제안(){
		System.out.println("");
		
		System.out.println("***************마약중독자와 가위바위보 랜덤 미니게임*********************");
		System.out.println("");
		System.out.println("1. 게임은 단판으로 진행됩니다");
		System.out.println("");
		System.out.println("2. 유저가 이기면 중독자에게 500만원을 더 받아낼 수 있습니다.");
		System.out.println("");
		System.out.println("3. 유저가 지게되면 700만원을 줘야합니다.");
		System.out.println("");
		System.out.println("*************************************************************");
		
		Scanner rsp = new Scanner(System.in);
		String comrsp="";
		String 유저rsp="";
		
		int win=0;
		int lose=0;
		int draw=0;
		int fail=0;
		
		int coin = 0; //게임판 수
		
	    System.out.println("어떤걸 내시겠습니까? 1.가위   2.바위   3.보");
	    for(int i = 0;i<=coin;i++) {
	    	
	        //1~3의 랜덤 숫자
	        int computer =(int)(Math.random()*3)+1;
	        
	        //사용자 입력값
	        int 유저 = rsp.nextInt();
	        
	        //컴퓨터 값
	        if(computer == 1) {
	            comrsp="가위";
	        }else if(computer == 2) {
	            comrsp="바위";
	        }else if(computer == 3) {
	            comrsp="보";
	        }else {
	            comrsp="시스템 오류";
	        }
	        
	        //유저의 값
	        if(유저 == 1) {
	        	유저rsp="가위";
	        }else if(유저 == 2) {
	        	유저rsp="바위";
	        }else if(유저 == 3) {
	        	유저rsp="보";
	        }else {
	        	유저rsp="손가락 오류";
	        }
	        System.out.println("[유저] "+유저rsp+" VS "+comrsp+" [컴퓨터]");
	        if(유저 >= 1 && 유저 <= 3) {
	            if((computer == 1 && 유저 == 2) || (computer == 2 && 유저 == 3) || (computer == 3 && 유저 == 1)) {

	            	//승리
	            	win++;
	                System.out.println("[승리]");
	                System.out.println("합의금으로 500만원을 추가로 얻었습니다.");
	                user.돈+=500;
	                
	            }else if(computer == 유저) {
	                lose++;
	                System.out.println("무승부");
	                System.out.println("마약중독자에게 700만원을 줘야합니다.");
	                user.돈-=700;
	            }else {
	                draw++;
	                System.out.println("패배");
	                System.out.println("마약중독자에게 700만원을 줘야합니다.");
	                user.돈-=700;
	            }
	        }else {
	            fail++;
	            System.out.println("값을 잘못 입력 하였습니다.");  
                System.out.println("마약중독자에게 700만원을 줘야합니다.");
                user.돈-=700;
	        }
	    }
	}
	}

