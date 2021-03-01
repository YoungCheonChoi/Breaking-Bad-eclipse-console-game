package user;

import java.util.ArrayList;
import java.util.Scanner;
import customer.customer;
import drug.대마초;
import drug.메스암페타민;
import drug.모르핀;
import drug.코카인;
import 브레이킹배드_자바작품.main;
import 쓰레드.경찰관단속쓰레드;
import 쓰레드.로딩쓰레드;
import inventory.인벤토리;



public class user {
   
   //static ArrayList<String> 인벤토리 = new ArrayList<>();

   public static String 가명;
   public static int 레벨 = 1;
   public static int 돈 = 5000;
   public static int 명성 = 10;        //명성이 50이 되면 2레벨, 100이 넘으면 3레벨
   public static int 잡힐확률 = 0;
   public static int 마나 = 0;

      
   public static  void 상점가기() {
      //상점에서는 제조실 업그레이드(캠핑카, 텐트, 실험실)
          
         System.out.println("1. [1레벨] 중고 캠핑카");
         System.out.println("   가격: 50만원 ");
         System.out.println("");
         System.out.println("2. [2레벨] 텐트");
         System.out.println("   가격: 100만원 ");
         System.out.println("   기능: 마나 50 제공");
         System.out.println("");
         System.out.println("3. [3레벨] 실험실");
         System.out.println("   가격: 150만원 ");
         System.out.println("   기능: 마나 50 제공");
         
         Scanner sc1 = new Scanner(System.in);
         System.out.println(""); 
         System.out.print("번호= "); 
         int 업그레이드 = sc1.nextInt();   
         
         //if(user.레벨==1) {
         if(업그레이드==1) {
            if(user.레벨==1) {
            System.out.println("");
            System.out.println("중고 캠핑카를 구매하셨습니다.");
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
            
            user.돈= user.돈 - 50;
            
            System.out.println("");
            main.현상태보여주기();
            }else {
               
            }
            
         } else if(업그레이드==2) {
            if(user.레벨==2) {
            System.out.println("");
            System.out.println("텐트를 구매하셨습니다.");
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
            user.돈= user.돈 - 100;
            user.마나+=50;
            
            System.out.println("");
            main.현상태보여주기();
            }else if(user.레벨==2) {
               System.out.println("");
               System.out.println("[텐트]는 2레벨 전용입니다");
               System.out.println("레벨이 낮아서 구매할 수 없습니다.");
               System.out.println("");
            }
            
         }else if(업그레이드==3) {
            if(user.레벨==3) {
            System.out.println("");
            System.out.println("실험실을 구매하셨습니다.");
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
            
            user.돈= user.돈 - 150;
            user.마나+=50;
            
            System.out.println("");
            main.현상태보여주기();
            }else {
               
            }
            
         }else {
            System.out.println("잘못입력하셨습니다. 메인메뉴로 이동합니다.");
         
            //메인메뉴로딩메서드
            Thread 메인메뉴로딩 = new Thread(new 로딩쓰레드("메인메뉴로딩"));
              메인메뉴로딩.start();
              try {
                  메인메뉴로딩.join();
              } catch (Exception e) {
                  e.printStackTrace();
              }
            main.메인메뉴메서드();
         }
                                  
         //메인메뉴로딩쓰레드   
         Thread 메인메뉴로딩 = new Thread(new 로딩쓰레드("메인메뉴로딩"));
           메인메뉴로딩.start();
           try {
               메인메뉴로딩.join();
           } catch (Exception e) {
               e.printStackTrace();
           }
           main.메인메뉴메서드();
         
      }
         
   public static  void 마약제조하기() {
      
      System.out.println("");
      System.out.println("어떤 마약을 제조 하시겠습니까?");
      
		//단속쓰레드 시작
		경찰관단속쓰레드 단속효과2 = new 경찰관단속쓰레드();
		단속효과2.run();
		
      System.out.println("1. 대마초  2. 메스암페타민  3.모르핀  4.코카인");
      System.out.println("번호: ");
      
      Scanner sc1 = new Scanner(System.in);
      int 마약제조 = sc1.nextInt();   
      
      if(마약제조==1) {
         System.out.println("대마초를 제조합니다. ");
         System.out.println("몇 g을 제조하시겠습니까?");
         int 마약제조수량 = sc1.nextInt();
         System.out.println("대마초를 "+마약제조수량+"g 만들었습니다.");
         System.out.println((20*마약제조수량)/2+" 만원을 지출했습니다");
         
         대마초.수량+=마약제조수량;
         
         //제조비용
         user.돈=user.돈-(20*마약제조수량)/2;
         
         main.현상태보여주기();
         
         
         System.out.println();
         System.out.println("더 제조하시겠습니까?");
         System.out.println("1.네  2.아니요");
         
       //단속쓰레드 시작
 		경찰관단속쓰레드 단속효과3 = new 경찰관단속쓰레드();
 		단속효과3.run();
 		
         int 마약더제조 = sc1.nextInt();
         if(마약더제조==1) {
        	 
		경찰관단속쓰레드 단속효과4 = new 경찰관단속쓰레드();
		단속효과4.run();
				
            마약제조하기();
         }else  {
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
         
               
      }else if(마약제조==2) {
         System.out.println("메스암페타민를 제조합니다. ");
         System.out.println("몇 g을 제조하시겠습니까?");
         int 마약제조수량 = sc1.nextInt();
         System.out.println("메스암페타민를 "+마약제조수량+"g 만들었습니다.");
         System.out.println((50*마약제조수량)/2+" 만원을 지출했습니다");
         
         //인벤토리.add("메스암페타민 " +마약제조수량+"g");
         메스암페타민.수량+=마약제조수량;
         
         //제조비용
         user.돈-=(50*마약제조수량)/2;
         
         main.현상태보여주기();
         
         
         System.out.println();
         System.out.println("더 제조하시겠습니까?");
         System.out.println("1.네  2.아니요");
         
  
         경찰관단속쓰레드 단속효과4 = new 경찰관단속쓰레드();
 		 단속효과4.run();
 		
 		int 마약더제조 = sc1.nextInt();
         if(마약더제조==1) {
            마약제조하기();
         }else  {
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
         
                  
         }else if(마약제조==3) {
         System.out.println("모르핀을 제조합니다. ");
         System.out.println("몇 g을 제조하시겠습니까?");
         int 마약제조수량 = sc1.nextInt();
         System.out.println("모르핀을 "+마약제조수량+"g 만들었습니다.");
         System.out.println((30*마약제조수량)/2+" 만원을 지출했습니다");
         
         //인벤토리.add("모르핀 " +마약제조수량+"g");
         모르핀.수량+=마약제조수량;
         
         //제조비용
         user.돈-=(30*마약제조수량)/2;
         
         경찰관단속쓰레드 단속효과4 = new 경찰관단속쓰레드();
 		단속효과4.run();
 		
         main.현상태보여주기();
         
         
         System.out.println();
         System.out.println("더 제조하시겠습니까?");
         System.out.println("1.네  2.아니요");
         int 마약더제조 = sc1.nextInt();
         if(마약더제조==1) {
            마약제조하기();
         }else  {
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
         
         
      }else if(마약제조==4) {
         System.out.println("코카인을 제조합니다. ");
         System.out.println("몇 g을 제조하시겠습니까?");
         int 마약제조수량 = sc1.nextInt();
         System.out.println("코카인을 "+마약제조수량+"g 만들었습니다.");
         System.out.println((40*마약제조수량)/2+" 만원을 지출했습니다");
         
         //인벤토리.add("코카인 "+마약제조수량+"g");
         코카인.수량+=마약제조수량;
         
         //제조비용
         //user.돈-=(코카인.get가격()*마약제조수량)/2;
         user.돈-=(40*마약제조수량)/2;
         
         경찰관단속쓰레드 단속효과4 = new 경찰관단속쓰레드();
 		단속효과4.run();
 		
         main.현상태보여주기();
         
         //추가 제조
         System.out.println();
         System.out.println("더 제조하시겠습니까?");
         System.out.println("1.네  2.아니요");
         int 마약더제조 = sc1.nextInt();
         if(마약더제조==1) {
            마약제조하기();
         }else  {
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
               
         
      }else {
         System.out.println("잘못입력하셨습니다.");
         System.out.println("이전으로 돌아갑니다.");
         
         마약제조하기();
      }
      
   }
   
   public static void 인벤토리보기() {

      System.out.println();
      System.out.println("§§§§   창고에 가서 제조한 마약의 재고를 확인합니다      §§§§");
      System.out.println();
      
      
      System.out.println("대마초 수량: "+대마초.수량+"g");
      System.out.println("메스암페타민 수량: "+메스암페타민.수량+"g");
      System.out.println("모르핀 수량: "+모르핀.수량+"g");
      System.out.println("코카인 수량: "+코카인.수량+"g");
      

   }

   public static void 손님더찾을지말지() {
      
      System.out.println("1. 손님을 더 받습니다.  2. 메뉴로 돌아갑니다. ");
      System.out.print("번호: ");
      System.out.println("");
      
      Scanner sc = new Scanner(System.in);
      int 손님더받기 = sc.nextInt();   
         
      while(true) {                         //손님 더받기를 반복하다보면 2번 연속 오류가 나면서 구동이 멈추는 에러가 있었는데  
      if(손님더받기==1) {               //반복 입력시 끊기는 에러를 해결하기 위해 while문을 넣어보니 사라졌다.   
      
      customer.손님구매하기();   
         
      } else if(손님더받기==2) {
         System.out.println("메인메뉴로 돌아갑니다.");
         
         //메인메뉴로딩쓰레드
         
         main.메인메뉴메서드();
         
      } 
      }
      
   }

   public static void 마약추천하기() {         
        //추천대로 구매할 수도 있고 추천안받으면 랜덤선택 구매
      
        //처음에 손님이 들어오면
        System.out.println("안녕하세요. 제품 추천을 해드릴까요?");
        System.out.println("1.네, 처음이라서요    2.아니요. 괜찮습니다");
        System.out.println("번호= ");
        Scanner sc1 = new Scanner(System.in);
        int 마약추천여부 = sc1.nextInt();
        
        if(마약추천여부==1) {
        
           System.out.println("어떤 효과를 원하시나요?");
           System.out.println("1. 정신없이 놀고싶어요    2. 마음을 좀 차분하게 하고 싶어요   3. 현실도피하고싶어요   4. 모든 감각을 느끼고 싶어요");
           System.out.println("번호= ");
           Scanner sc = new Scanner(System.in);
           int 마약취향 = sc.nextInt();
        
           if(마약취향==1){
              System.out.println(user.가명+": 일상 생활이 엄청 지루하고 그러시나 보네요.... 그럴 땐 메스암페타민을 한번 사용해보세요. 기분이 좋아지고 모든게 밝게 보일거에요!");
              System.out.println(user.가명+": 가격은 비싸지만 후회하지 않으실 거에요.");
              System.out.println();
              System.out.println("손님: 제가 필요한 효과입니다!! 구매하겠습니다.");
              

              int 추천랜덤그램수 = (int)(Math.random()*7)+1;
                                            
              System.out.println("손님: 메스암페타민 "+추천랜덤그램수+"g 주세요.");
              System.out.println(user.가명+": 좋은 선택이십니다!");
              System.out.println();
              
              //System.out.println("돈이 "+메스암페타민.get가격()*추천랜덤그램수+" 만원 증가했습니다." );        
              //user.돈 = user.돈+(메스암페타민.get가격()*추천랜덤그램수);
              System.out.println("돈이 "+50*추천랜덤그램수+" 만원 증가했습니다." );
              user.돈 = user.돈+(50*추천랜덤그램수);
              메스암페타민.수량-=추천랜덤그램수;
             
           }else if(마약취향==2){
              System.out.println(user.가명+": 화나는 일들이 많으시거나, 큰 변화가 생기셨나보네요...그럴 땐 모르핀을 한번 사용해보세요. 몽롱해지면서 졸린 듯 하여 차분하게 될 거에요.");
              System.out.println();
              System.out.println("손님: 제가 필요한 효과입니다!! 구매하겠습니다.");
              
              int 추천랜덤그램수 = (int)(Math.random()*7)+1;
                   
              System.out.println("손님: 모르핀 "+추천랜덤그램수+"g 주세요.");
              System.out.println(user.가명+": 좋은 선택이십니다!");
              System.out.println();
              
              //System.out.println("돈이 "+모르핀.get가격()*추천랜덤그램수+" 만원 증가했습니다." );              
              //user.돈 = user.돈+(모르핀.get가격()*추천랜덤그램수);
              System.out.println("돈이 "+30*추천랜덤그램수+" 만원 증가했습니다." );
              user.돈 = user.돈+(30*추천랜덤그램수);
              모르핀.수량=모르핀.수량-추천랜덤그램수;
              
           }else if(마약취향==3){
              System.out.println(user.가명+": 곧 큰 시험이 있거나 중요한 일이 있으신가보네요...그럴 땐 코카인을 한번 사용해보세요. 잠시 현실을 잊고  이 후 다시 출발해보세요.");
              System.out.println();
              System.out.println("손님: 제가 필요한 효과입니다!! 구매하겠습니다.");
              
              int 추천랜덤그램수 = (int)(Math.random()*7)+1;
                 
              System.out.println("손님: 코카인 "+추천랜덤그램수+"g 주세요.");
              System.out.println(user.가명+": 좋은 선택이십니다!");
              System.out.println();
              
              //System.out.println("돈이 "+코카인.get가격()*추천랜덤그램수+" 만원 증가했습니다." );
              //user.돈 = user.돈+(코카인.get가격()*추천랜덤그램수);
              System.out.println("돈이 "+40*추천랜덤그램수+" 만원 증가했습니다." );
              user.돈 = user.돈+(40*추천랜덤그램수);
              코카인.수량-=추천랜덤그램수;
              
           }else if(마약취향==4){
              System.out.println(user.가명+": 황홀한 경험을 하기 전에 대마초만큼 좋은 효과를 보는 건 없죠! 만약 피자를 먹어도 그 하나하나의 맛을 모두 느낄 수 있답니다.");
              System.out.println();
              System.out.println("손님: 제가 필요한 효과입니다!! 구매하겠습니다.");
              
              int 추천랜덤그램수 = (int)(Math.random()*7)+1;
                 
              System.out.println("손님: 대마초 "+추천랜덤그램수+"g 주세요.");
              System.out.println(user.가명+": 좋은 선택이십니다!");
              System.out.println();
              
              //System.out.println("돈이 "+대마초.get가격()*추천랜덤그램수+" 만원 증가했습니다." );                   
              //user.돈 = user.돈+(대마초.get가격()*추천랜덤그램수);
              System.out.println("돈이 "+20*추천랜덤그램수+" 만원 증가했습니다." );
              user.돈 = user.돈+(20*추천랜덤그램수);
              대마초.수량-=추천랜덤그램수;
              
           }               
        }else if(마약추천여부==2){
                     
          customer.랜덤마약선택();       //랜덤마약선택과 구매 한번에
           
           
          System.out.println(""); 
         손님더찾을지말지();           //유저메소드
           
        }

   }
}//전체닫힘
