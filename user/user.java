package user;

import java.util.ArrayList;
import java.util.Scanner;
import customer.customer;
import drug.�븶��;
import drug.�޽�����Ÿ��;
import drug.����;
import drug.��ī��;
import �극��ŷ���_�ڹ���ǰ.main;
import ������.�������ܼӾ�����;
import ������.�ε�������;
import inventory.�κ��丮;



public class user {
   
   //static ArrayList<String> �κ��丮 = new ArrayList<>();

   public static String ����;
   public static int ���� = 1;
   public static int �� = 5000;
   public static int ���� = 10;        //������ 50�� �Ǹ� 2����, 100�� ������ 3����
   public static int ����Ȯ�� = 0;
   public static int ���� = 0;

      
   public static  void ��������() {
      //���������� ������ ���׷��̵�(ķ��ī, ��Ʈ, �����)
          
         System.out.println("1. [1����] �߰� ķ��ī");
         System.out.println("   ����: 50���� ");
         System.out.println("");
         System.out.println("2. [2����] ��Ʈ");
         System.out.println("   ����: 100���� ");
         System.out.println("   ���: ���� 50 ����");
         System.out.println("");
         System.out.println("3. [3����] �����");
         System.out.println("   ����: 150���� ");
         System.out.println("   ���: ���� 50 ����");
         
         Scanner sc1 = new Scanner(System.in);
         System.out.println(""); 
         System.out.print("��ȣ= "); 
         int ���׷��̵� = sc1.nextInt();   
         
         //if(user.����==1) {
         if(���׷��̵�==1) {
            if(user.����==1) {
            System.out.println("");
            System.out.println("�߰� ķ��ī�� �����ϼ̽��ϴ�.");
            System.out.println("");
            
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\r\n" + 
                  "@@@@@********************************@@@\r\n" + 
                  "@@@@@*********************************@@\r\n" + 
                  "@@@@**....*,...*.....................!*@\r\n" + 
                  "@@@@*;....******.....................~*@\r\n" + 
                  "@@@@*;....~~~~~~.....................:*@\r\n" + 
                  "@@@;*;..............................,:*@\r\n" + 
                  "@@@@**********************...........~*@\r\n" + 
                  "@@@@@@@@*~.......~!......*.~********.~*@\r\n" + 
                  "@@@@@@@**-!!!!!!.~!.!!!!.*.~*,,*;,,*.~*@\r\n" + 
                  "@@@@@@@*!-*;:::*.~!.*;*!.*.~*..*:..*.~*@\r\n" + 
                  "@@@@@@@*-;!....*.~!.*,:!.*.~*..*:..*.~*@\r\n" + 
                  "@@@@@@**.!;....*.~!.*,:!.*.~*..*:..*.~*@\r\n" + 
                  "@@!****~.*******.~!.***!.*.~********.~*@\r\n" + 
                  "@@***;...........~!......*...........~*@\r\n" + 
                  "@**:~         ...~!......*...........:*@\r\n" + 
                  "@****         ...~!......*..........,:*@\r\n" + 
                  "@**-*......      ~!      *.        .,:*@\r\n" + 
                  "@***;.,~~,.......~!......*...........~*@\r\n" + 
                  "@***.-$##$!......~!......*,,,,,......~*@\r\n" + 
                  "@**!~######:.....:*......*::::~,.....:*@\r\n" + 
                  "@@***#######,,,,,:*,,,,,,******-,,,,,:*@\r\n" + 
                  "@@**$##@@###***************@@**********@\r\n" + 
                  "@@@@########@@@@@@@@@@@@########@@@@@@@@\r\n" + 
                  "@@@@$#######@@@@@@@@@@@@$#######@@@@@@@@\r\n" + 
                  "@@@;;!*****;;;;;;;;;;;;;;!*****;;;@;;;;@\r\n" + 
                  "@@@:::::::::::::::::::::::::::::::@::::@\r\n" + 
                  "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            
            user.��= user.�� - 50;
            
            System.out.println("");
            main.�����º����ֱ�();
            }else {
               
            }
            
         } else if(���׷��̵�==2) {
            if(user.����==2) {
            System.out.println("");
            System.out.println("��Ʈ�� �����ϼ̽��ϴ�.");
            System.out.println("");
            System.out.println(";*===;,                      \r\n" + 
                  "         -~~~~:::::::*#######=.         \r\n" + 
                  "         *~~~::::::::;;!!!!**=$         \r\n" + 
                  "        ,~~~::::::::;;;!!!***!:         \r\n" + 
                  "        ;~~~::::::::;;!!!****!~:        \r\n" + 
                  "        ~~~::::::::;;!!!****=*~~        \r\n" + 
                  "       ,;~~:::::::;;;!!!*****!:!,       \r\n" + 
                  "       -~~:::::::;;;!!!*****=:::-       \r\n" + 
                  "       $~::::::::;;!!!*****=$~;:$       \r\n" + 
                  "      -:::::::::;;;!!*****==:~*::       \r\n" + 
                  "      =~:::::::;;;!!!*****=$~~~:;=      \r\n" + 
                  "     .~::::::::;;!!!*****==$~~~*;:      \r\n" + 
                  "     ~;:::::::;;;!!******=#;:::;;!-     \r\n" + 
                  "     -:::::::;;;!!!*****===;:::!!*-     \r\n" + 
                  "     =:::::::;;!!!*****==$=;;;;!***     \r\n" + 
                  "    .:::::::;;!!!*****====*:;;;!**$     \r\n" + 
                  "    =::::::;;;!!!*****=====;!!;!$**:    \r\n" + 
                  "    ~::::::;;!!!*****=====!!!!!!***#    \r\n" + 
                  "   =:;::::;;!!!******====$!!!!!**==*,   \r\n" + 
                  "  .;::::!$*!!!******=====#!!**!**$==;   \r\n" + 
                  "    ,;=*;~:***$=**=======!!******===;   \r\n" + 
                  "           -~--!#=======#****==#!--:$   \r\n" + 
                  "                  *#====$**#*           \r\n" + 
                  "                     ;*$*               ");
            user.��= user.�� - 100;
            user.����+=50;
            
            System.out.println("");
            main.�����º����ֱ�();
            }else if(user.����==2) {
               System.out.println("");
               System.out.println("[��Ʈ]�� 2���� �����Դϴ�");
               System.out.println("������ ���Ƽ� ������ �� �����ϴ�.");
               System.out.println("");
            }
            
         }else if(���׷��̵�==3) {
            if(user.����==3) {
            System.out.println("");
            System.out.println("������� �����ϼ̽��ϴ�.");
            System.out.println("");
            System.out.println("                          :=:           \r\n" + 
                  "                 ,  .   ~~...~,         \r\n" + 
                  "              ,-~:..-. .!....,:         \r\n" + 
                  "             ,:,-..... !!....,:    : ~. \r\n" + 
                  "             .,...... *,,....,; ~..,..: \r\n" + 
                  "             ,-.....;,...~-.~*  ~...... \r\n" + 
                  "            ;.,-; :~-;...~,   -!-....,- \r\n" + 
                  "           ,.-::  .:-..:,,   .;..~~.~:. \r\n" + 
                  "          :*,;-   ;~...-    ;,-,:~- ,.  \r\n" + 
                  "       ., ,,.. .- ,.:*. ,.  ~.,,.       \r\n" + 
                  "      =~~.*=:.~~~=!~- =-~,  ==-         \r\n" + 
                  "     =~:~.   ,:~~!   ,~~-,              \r\n" + 
                  "     !~;     .~~     !~;                \r\n" + 
                  "     :~!     ,~.     !~*                \r\n" + 
                  "     :~!     ,~.     !~*                \r\n" + 
                  "     !~!     ,~.     !~!                \r\n" + 
                  " ****=~=*==**;~!*=***=~;!!-             \r\n" + 
                  " ~;;;*~*;*!*;:~:;;!;;=~;;;;-            \r\n" + 
                  " ,,-!!:!;*-:!;:;!,:!;!:;;;;;;           \r\n" + 
                  " ,..-=;;;*-.~;;;!.,~;;;;;;;;!;          \r\n" + 
                  " ,...,=;;*-..,:;!...,:;;;;;;;!;         \r\n" + 
                  " ,....,~!*-....:!.....:!;;;;;;!:        \r\n" + 
                  " ,......~!,.....;......!!;;;;;;*,       \r\n" + 
                  " ,.......,.............,*;;;;;;!,       \r\n" + 
                  " ,.....................,=;;;;;;!,       \r\n" + 
                  " ,.;==*....==;....~==-.,=;;;;;;*-       \r\n" + 
                  " ,.!, =....   ...,~  ..,=;;;;;;*-       \r\n" + 
                  " ,.;:~=....~~-...,~~~,.,=;;;;;;*-       \r\n" + 
                  " ,.~:::....::~....-::,.,=;;;;;;*-       \r\n" + 
                  " ,.....................,=;;;;;;*-       \r\n" + 
                  " ,....,................,=;;;;;;*-       \r\n" + 
                  " ,.:, *...-  ,-..,-  -,,=;;;;;;*-       \r\n" + 
                  " ,.:. *...~  ,-..,-  ~,,=;;;;;;*-       \r\n" + 
                  " ,.:. *...-  ,-..,-  -,,=;;;;;;*-       \r\n" + 
                  " ,.:. *...-  ,-..,-  -,,=;;;;;;*-   ");
            
            user.��= user.�� - 150;
            user.����+=50;
            
            System.out.println("");
            main.�����º����ֱ�();
            }else {
               
            }
            
         }else {
            System.out.println("�߸��Է��ϼ̽��ϴ�. ���θ޴��� �̵��մϴ�.");
         
            //���θ޴��ε��޼���
            Thread ���θ޴��ε� = new Thread(new �ε�������("���θ޴��ε�"));
              ���θ޴��ε�.start();
              try {
                  ���θ޴��ε�.join();
              } catch (Exception e) {
                  e.printStackTrace();
              }
            main.���θ޴��޼���();
         }
                                  
         //���θ޴��ε�������   
         Thread ���θ޴��ε� = new Thread(new �ε�������("���θ޴��ε�"));
           ���θ޴��ε�.start();
           try {
               ���θ޴��ε�.join();
           } catch (Exception e) {
               e.printStackTrace();
           }
           main.���θ޴��޼���();
         
      }
         
   public static  void ���������ϱ�() {
      
      System.out.println("");
      System.out.println("� ������ ���� �Ͻðڽ��ϱ�?");
      
		//�ܼӾ����� ����
		�������ܼӾ����� �ܼ�ȿ��2 = new �������ܼӾ�����();
		�ܼ�ȿ��2.run();
		
      System.out.println("1. �븶��  2. �޽�����Ÿ��  3.����  4.��ī��");
      System.out.println("��ȣ: ");
      
      Scanner sc1 = new Scanner(System.in);
      int �������� = sc1.nextInt();   
      
      if(��������==1) {
         System.out.println("�븶�ʸ� �����մϴ�. ");
         System.out.println("�� g�� �����Ͻðڽ��ϱ�?");
         int ������������ = sc1.nextInt();
         System.out.println("�븶�ʸ� "+������������+"g ��������ϴ�.");
         System.out.println((20*������������)/2+" ������ �����߽��ϴ�");
         
         �븶��.����+=������������;
         
         //�������
         user.��=user.��-(20*������������)/2;
         
         main.�����º����ֱ�();
         
         
         System.out.println();
         System.out.println("�� �����Ͻðڽ��ϱ�?");
         System.out.println("1.��  2.�ƴϿ�");
         
       //�ܼӾ����� ����
 		�������ܼӾ����� �ܼ�ȿ��3 = new �������ܼӾ�����();
 		�ܼ�ȿ��3.run();
 		
         int ��������� = sc1.nextInt();
         if(���������==1) {
        	 
		�������ܼӾ����� �ܼ�ȿ��4 = new �������ܼӾ�����();
		�ܼ�ȿ��4.run();
				
            ���������ϱ�();
         }else  {
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
         
               
      }else if(��������==2) {
         System.out.println("�޽�����Ÿ�θ� �����մϴ�. ");
         System.out.println("�� g�� �����Ͻðڽ��ϱ�?");
         int ������������ = sc1.nextInt();
         System.out.println("�޽�����Ÿ�θ� "+������������+"g ��������ϴ�.");
         System.out.println((50*������������)/2+" ������ �����߽��ϴ�");
         
         //�κ��丮.add("�޽�����Ÿ�� " +������������+"g");
         �޽�����Ÿ��.����+=������������;
         
         //�������
         user.��-=(50*������������)/2;
         
         main.�����º����ֱ�();
         
         
         System.out.println();
         System.out.println("�� �����Ͻðڽ��ϱ�?");
         System.out.println("1.��  2.�ƴϿ�");
         
  
         �������ܼӾ����� �ܼ�ȿ��4 = new �������ܼӾ�����();
 		 �ܼ�ȿ��4.run();
 		
 		int ��������� = sc1.nextInt();
         if(���������==1) {
            ���������ϱ�();
         }else  {
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
         
                  
         }else if(��������==3) {
         System.out.println("������ �����մϴ�. ");
         System.out.println("�� g�� �����Ͻðڽ��ϱ�?");
         int ������������ = sc1.nextInt();
         System.out.println("������ "+������������+"g ��������ϴ�.");
         System.out.println((30*������������)/2+" ������ �����߽��ϴ�");
         
         //�κ��丮.add("���� " +������������+"g");
         ����.����+=������������;
         
         //�������
         user.��-=(30*������������)/2;
         
         �������ܼӾ����� �ܼ�ȿ��4 = new �������ܼӾ�����();
 		�ܼ�ȿ��4.run();
 		
         main.�����º����ֱ�();
         
         
         System.out.println();
         System.out.println("�� �����Ͻðڽ��ϱ�?");
         System.out.println("1.��  2.�ƴϿ�");
         int ��������� = sc1.nextInt();
         if(���������==1) {
            ���������ϱ�();
         }else  {
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
         
         
      }else if(��������==4) {
         System.out.println("��ī���� �����մϴ�. ");
         System.out.println("�� g�� �����Ͻðڽ��ϱ�?");
         int ������������ = sc1.nextInt();
         System.out.println("��ī���� "+������������+"g ��������ϴ�.");
         System.out.println((40*������������)/2+" ������ �����߽��ϴ�");
         
         //�κ��丮.add("��ī�� "+������������+"g");
         ��ī��.����+=������������;
         
         //�������
         //user.��-=(��ī��.get����()*������������)/2;
         user.��-=(40*������������)/2;
         
         �������ܼӾ����� �ܼ�ȿ��4 = new �������ܼӾ�����();
 		�ܼ�ȿ��4.run();
 		
         main.�����º����ֱ�();
         
         //�߰� ����
         System.out.println();
         System.out.println("�� �����Ͻðڽ��ϱ�?");
         System.out.println("1.��  2.�ƴϿ�");
         int ��������� = sc1.nextInt();
         if(���������==1) {
            ���������ϱ�();
         }else  {
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
               
         
      }else {
         System.out.println("�߸��Է��ϼ̽��ϴ�.");
         System.out.println("�������� ���ư��ϴ�.");
         
         ���������ϱ�();
      }
      
   }
   
   public static void �κ��丮����() {

      System.out.println();
      System.out.println("�ססס�   â���� ���� ������ ������ ����� Ȯ���մϴ�      �ססס�");
      System.out.println();
      
      
      System.out.println("�븶�� ����: "+�븶��.����+"g");
      System.out.println("�޽�����Ÿ�� ����: "+�޽�����Ÿ��.����+"g");
      System.out.println("���� ����: "+����.����+"g");
      System.out.println("��ī�� ����: "+��ī��.����+"g");
      

   }

   public static void �մԴ�ã��������() {
      
      System.out.println("1. �մ��� �� �޽��ϴ�.  2. �޴��� ���ư��ϴ�. ");
      System.out.print("��ȣ: ");
      System.out.println("");
      
      Scanner sc = new Scanner(System.in);
      int �մԴ��ޱ� = sc.nextInt();   
         
      while(true) {                         //�մ� ���ޱ⸦ �ݺ��ϴٺ��� 2�� ���� ������ ���鼭 ������ ���ߴ� ������ �־��µ�  
      if(�մԴ��ޱ�==1) {               //�ݺ� �Է½� ����� ������ �ذ��ϱ� ���� while���� �־�� �������.   
      
      customer.�մԱ����ϱ�();   
         
      } else if(�մԴ��ޱ�==2) {
         System.out.println("���θ޴��� ���ư��ϴ�.");
         
         //���θ޴��ε�������
         
         main.���θ޴��޼���();
         
      } 
      }
      
   }

   public static void ������õ�ϱ�() {         
        //��õ��� ������ ���� �ְ� ��õ�ȹ����� �������� ����
      
        //ó���� �մ��� ������
        System.out.println("�ȳ��ϼ���. ��ǰ ��õ�� �ص帱���?");
        System.out.println("1.��, ó���̶󼭿�    2.�ƴϿ�. �������ϴ�");
        System.out.println("��ȣ= ");
        Scanner sc1 = new Scanner(System.in);
        int ������õ���� = sc1.nextInt();
        
        if(������õ����==1) {
        
           System.out.println("� ȿ���� ���Ͻó���?");
           System.out.println("1. ���ž��� ����;��    2. ������ �� �����ϰ� �ϰ� �;��   3. ���ǵ����ϰ��;��   4. ��� ������ ������ �;��");
           System.out.println("��ȣ= ");
           Scanner sc = new Scanner(System.in);
           int �������� = sc.nextInt();
        
           if(��������==1){
              System.out.println(user.����+": �ϻ� ��Ȱ�� ��û �����ϰ� �׷��ó� ���׿�.... �׷� �� �޽�����Ÿ���� �ѹ� ����غ�����. ����� �������� ���� ��� ���ϰſ���!");
              System.out.println(user.����+": ������ ������� ��ȸ���� ������ �ſ���.");
              System.out.println();
              System.out.println("�մ�: ���� �ʿ��� ȿ���Դϴ�!! �����ϰڽ��ϴ�.");
              

              int ��õ�����׷��� = (int)(Math.random()*7)+1;
                                            
              System.out.println("�մ�: �޽�����Ÿ�� "+��õ�����׷���+"g �ּ���.");
              System.out.println(user.����+": ���� �����̽ʴϴ�!");
              System.out.println();
              
              //System.out.println("���� "+�޽�����Ÿ��.get����()*��õ�����׷���+" ���� �����߽��ϴ�." );        
              //user.�� = user.��+(�޽�����Ÿ��.get����()*��õ�����׷���);
              System.out.println("���� "+50*��õ�����׷���+" ���� �����߽��ϴ�." );
              user.�� = user.��+(50*��õ�����׷���);
              �޽�����Ÿ��.����-=��õ�����׷���;
             
           }else if(��������==2){
              System.out.println(user.����+": ȭ���� �ϵ��� �����ðų�, ū ��ȭ�� ����̳����׿�...�׷� �� ������ �ѹ� ����غ�����. ���������鼭 ���� �� �Ͽ� �����ϰ� �� �ſ���.");
              System.out.println();
              System.out.println("�մ�: ���� �ʿ��� ȿ���Դϴ�!! �����ϰڽ��ϴ�.");
              
              int ��õ�����׷��� = (int)(Math.random()*7)+1;
                   
              System.out.println("�մ�: ���� "+��õ�����׷���+"g �ּ���.");
              System.out.println(user.����+": ���� �����̽ʴϴ�!");
              System.out.println();
              
              //System.out.println("���� "+����.get����()*��õ�����׷���+" ���� �����߽��ϴ�." );              
              //user.�� = user.��+(����.get����()*��õ�����׷���);
              System.out.println("���� "+30*��õ�����׷���+" ���� �����߽��ϴ�." );
              user.�� = user.��+(30*��õ�����׷���);
              ����.����=����.����-��õ�����׷���;
              
           }else if(��������==3){
              System.out.println(user.����+": �� ū ������ �ְų� �߿��� ���� �����Ű����׿�...�׷� �� ��ī���� �ѹ� ����غ�����. ��� ������ �ذ�  �� �� �ٽ� ����غ�����.");
              System.out.println();
              System.out.println("�մ�: ���� �ʿ��� ȿ���Դϴ�!! �����ϰڽ��ϴ�.");
              
              int ��õ�����׷��� = (int)(Math.random()*7)+1;
                 
              System.out.println("�մ�: ��ī�� "+��õ�����׷���+"g �ּ���.");
              System.out.println(user.����+": ���� �����̽ʴϴ�!");
              System.out.println();
              
              //System.out.println("���� "+��ī��.get����()*��õ�����׷���+" ���� �����߽��ϴ�." );
              //user.�� = user.��+(��ī��.get����()*��õ�����׷���);
              System.out.println("���� "+40*��õ�����׷���+" ���� �����߽��ϴ�." );
              user.�� = user.��+(40*��õ�����׷���);
              ��ī��.����-=��õ�����׷���;
              
           }else if(��������==4){
              System.out.println(user.����+": ȲȦ�� ������ �ϱ� ���� �븶�ʸ�ŭ ���� ȿ���� ���� �� ����! ���� ���ڸ� �Ծ �� �ϳ��ϳ��� ���� ��� ���� �� �ִ�ϴ�.");
              System.out.println();
              System.out.println("�մ�: ���� �ʿ��� ȿ���Դϴ�!! �����ϰڽ��ϴ�.");
              
              int ��õ�����׷��� = (int)(Math.random()*7)+1;
                 
              System.out.println("�մ�: �븶�� "+��õ�����׷���+"g �ּ���.");
              System.out.println(user.����+": ���� �����̽ʴϴ�!");
              System.out.println();
              
              //System.out.println("���� "+�븶��.get����()*��õ�����׷���+" ���� �����߽��ϴ�." );                   
              //user.�� = user.��+(�븶��.get����()*��õ�����׷���);
              System.out.println("���� "+20*��õ�����׷���+" ���� �����߽��ϴ�." );
              user.�� = user.��+(20*��õ�����׷���);
              �븶��.����-=��õ�����׷���;
              
           }               
        }else if(������õ����==2){
                     
          customer.�������༱��();       //�������༱�ð� ���� �ѹ���
           
           
          System.out.println(""); 
         �մԴ�ã��������();           //�����޼ҵ�
           
        }

   }
}//��ü����