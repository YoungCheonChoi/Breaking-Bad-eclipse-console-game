package customer;

import java.util.Scanner;
import user.user;


public class �����ߵ��� extends customer {

	public static void �ߵ���������(){
		System.out.println("");
		
		System.out.println("***************�����ߵ��ڿ� ���������� ���� �̴ϰ���*********************");
		System.out.println("");
		System.out.println("1. ������ �������� ����˴ϴ�");
		System.out.println("");
		System.out.println("2. ������ �̱�� �ߵ��ڿ��� 500������ �� �޾Ƴ� �� �ֽ��ϴ�.");
		System.out.println("");
		System.out.println("3. ������ ���ԵǸ� 700������ ����մϴ�.");
		System.out.println("");
		System.out.println("*************************************************************");
		
		Scanner rsp = new Scanner(System.in);
		String comrsp="";
		String ����rsp="";
		
		int win=0;
		int lose=0;
		int draw=0;
		int fail=0;
		
		int coin = 0; //������ ��
		
	    System.out.println("��� ���ðڽ��ϱ�? 1.����   2.����   3.��");
	    for(int i = 0;i<=coin;i++) {
	    	
	        //1~3�� ���� ����
	        int computer =(int)(Math.random()*3)+1;
	        
	        //����� �Է°�
	        int ���� = rsp.nextInt();
	        
	        //��ǻ�� ��
	        if(computer == 1) {
	            comrsp="����";
	        }else if(computer == 2) {
	            comrsp="����";
	        }else if(computer == 3) {
	            comrsp="��";
	        }else {
	            comrsp="�ý��� ����";
	        }
	        
	        //������ ��
	        if(���� == 1) {
	        	����rsp="����";
	        }else if(���� == 2) {
	        	����rsp="����";
	        }else if(���� == 3) {
	        	����rsp="��";
	        }else {
	        	����rsp="�հ��� ����";
	        }
	        System.out.println("[����] "+����rsp+" VS "+comrsp+" [��ǻ��]");
	        if(���� >= 1 && ���� <= 3) {
	            if((computer == 1 && ���� == 2) || (computer == 2 && ���� == 3) || (computer == 3 && ���� == 1)) {

	            	//�¸�
	            	win++;
	                System.out.println("[�¸�]");
	                System.out.println("���Ǳ����� 500������ �߰��� ������ϴ�.");
	                user.��+=500;
	                
	            }else if(computer == ����) {
	                lose++;
	                System.out.println("���º�");
	                System.out.println("�����ߵ��ڿ��� 700������ ����մϴ�.");
	                user.��-=700;
	            }else {
	                draw++;
	                System.out.println("�й�");
	                System.out.println("�����ߵ��ڿ��� 700������ ����մϴ�.");
	                user.��-=700;
	            }
	        }else {
	            fail++;
	            System.out.println("���� �߸� �Է� �Ͽ����ϴ�.");  
                System.out.println("�����ߵ��ڿ��� 700������ ����մϴ�.");
                user.��-=700;
	        }
	    }
	}
	}

