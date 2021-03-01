package 브레이킹배드_자바작품;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import customer.customer;
import drug.drug;
import drug.대마초;
import drug.메스암페타민;
import drug.모르핀;
import drug.코카인;
import user.user;
import 쓰레드.경찰관단속쓰레드;
import 쓰레드.레벨업쓰레드;
import 쓰레드.로딩쓰레드;
import 쓰레드.배경음악쓰레드;
import 쓰레드.오프닝쓰레드;
import 쓰레드.저녁식사쓰레드;


public class main {

	public static void main(String[] args) {
		
		

		// 제품명, 가격, 수량
		drug 대마초 = new 대마초("대마초", 20, 0 );
		drug 메스암페타민 = new 메스암페타민("메스암페타민", 50, 0);
		drug 모르핀 = new 모르핀("모르핀", 30, 0);
		drug 코카인 = new 코카인("코카인", 40, 0);
		
		System.out.println("______ ______  _____   ___   _   __ _____  _   _  _____  ______   ___  ______ \r\n"
				+ "| ___ \\| ___ \\|  ___| / _ \\ | | / /|_   _|| \\ | ||  __ \\ | ___ \\ / _ \\ |  _  \\\r\n"
				+ "| |_/ /| |_/ /| |__  / /_\\ \\| |/ /   | |  |  \\| || |  \\/ | |_/ // /_\\ \\| | | |\r\n"
				+ "| ___ \\|    / |  __| |  _  ||    \\   | |  | . ` || | __  | ___ \\|  _  || | | |\r\n"
				+ "| |_/ /| |\\ \\ | |___ | | | || |\\  \\ _| |_ | |\\  || |_\\ \\ | |_/ /| | | || |/ / \r\n"
				+ "\\____/ \\_| \\_|\\____/ \\_| |_/\\_| \\_/ \\___/ \\_| \\_/ \\____/ \\____/ \\_| |_/|___/  ");


		
		// 오프닝 스크립트 쓰레드
		Thread 오프닝 = new Thread(new 오프닝쓰레드());

		오프닝.start();

		try {
			 //오프닝 음악쓰레드
			배경음악쓰레드 오프닝음악 = new 배경음악쓰레드("Almost_a_Year_Ago_Sting.mp3", false);
			오프닝음악.run();

			오프닝.join(); // 메인메소드 잠깐 멈추고 오프닝쓰레드가 진행되게

			오프닝음악.close(); // 오프닝음악끄기

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 //join을 쓴 이유는 여러가지 쓰레드(메인, 오프닝로딩 쓰레드가 한번에 나오길래 오프닝이 끝나길 기다린 후 출력되게 만드려고)
	
		
		// 오프닝로딩쓰레드
		Thread 오프닝로딩 = new Thread(new 로딩쓰레드("오프닝로딩"));
		오프닝로딩.start();
		try {
			오프닝로딩.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		게임설명메서드();
		System.out.println("");
		System.out.println("");

		// 유저 정보 받기
		System.out.println("유저가 사용할 가명을 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		System.out.print("가명= ");
		user.가명 = sc.nextLine();

		Thread 가명설립로딩 = new Thread(new 로딩쓰레드("가명설립로딩"));
		가명설립로딩.start();
		try {
			가명설립로딩.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(user.가명 + " 유저가 생성되었습니다.");

		System.out.println();
		System.out.println();
		System.out.println("게임 설명을  한번 더 들으시겠습니까?");
		System.out.println("1. 듣는다  2. 생략한다");

		int num = sc.nextInt();
		if (num == 1) {
			게임설명메서드();

			System.out.println("사업을 시작하기 전 업그레이드 메뉴 [제조실 구매하기]에 들어가 캠핑카를 구매하여야 합니다");

			
			//잡힐확률자동증가 - 6초에 1씩
			Timer m_timer = new Timer();
			TimerTask m_task = new TimerTask() {
			
			@Override
			public void run() {

				user.잡힐확률+=1;
				
			}		
		};
		m_timer.schedule(m_task,1000,3000);
		
		
			// 메인메뉴로딩쓰레드
			Thread 메인메뉴로딩 = new Thread(new 로딩쓰레드("메인메뉴로딩"));
			메인메뉴로딩.start();
			try {
				메인메뉴로딩.join();
			} catch (Exception e) {
				e.printStackTrace();
			}

			메인메뉴메서드();
		} else if (num == 2) {

			System.out.println("사업을 시작하기 전 업그레이드 메뉴 [제조실 구매하기]에 들어가 캠핑카를 구매하여야 합니다");

			Thread 메인메뉴로딩 = new Thread(new 로딩쓰레드("메인메뉴로딩"));
			메인메뉴로딩.start();
			try {
				메인메뉴로딩.join();
			} catch (Exception e) {
				e.printStackTrace();
			}

			메인메뉴메서드();
		} else { // 예외처리
			Thread 메인메뉴로딩 = new Thread(new 로딩쓰레드("메인메뉴로딩"));
			메인메뉴로딩.start();
			try {
				메인메뉴로딩.join();
			} catch (Exception e) {
				e.printStackTrace();
			}

			메인메뉴메서드();
		}
		

	}

	public static void 현상태보여주기() {
		System.out.println("");
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println(" 레벨: " + user.레벨);
		System.out.println(" 자본: " + user.돈 + "만원                               ");
		System.out.println(" 명성: " + user.명성);
		System.out.println(" 잡힐 확률: " + user.잡힐확률);
		System.out.println(" 마나: " + user.마나);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
	}

	public static void 메인메뉴메서드() {

		System.out.println("");
		System.out.println("=====================================");
		System.out.println("1. 제조실 구매하기");
		System.out.println("2. 마약 제조하기");
		System.out.println("3. 인벤토리 - 마약 재고 확인");
		System.out.println("4. 마약 판매하기"); 				// 자동손님쓰레드 사용, 경찰단속이벤트사용
		System.out.println("5. 현 상태확인하기");
		System.out.println("6. 행크 가족과의 저녁식사 ");  		// 일정한 돈을 지불하고 잡힐확률을 줄여준다, 쓰레드 사용
		System.out.println("7. 스킬 사용"); 				    // 1렙 캠핑카, 2렙 텐트, 3렙 실험실, 마나제공
		System.out.println("8. 게임 설명");
		System.out.println("9. 게임 종료");
		System.out.println("10. 치트키 ");
		System.out.println("=====================================");
		System.out.println("원하시는 항목을 선택해주세요");
		System.out.print("번호: ");
		System.out.print("");

		Scanner sc1 = new Scanner(System.in);
		int 메인메뉴번호선택 = sc1.nextInt();

		// 1 상점가기
		if (메인메뉴번호선택 == 1) {
			System.out.println();
			System.out.println("§§§§	제조실 상점에 입장했습니다	   §§§§");
			user.상점가기(); // 유저메소드

			Thread 메인메뉴로딩 = new Thread(new 로딩쓰레드("메인메뉴로딩"));
			메인메뉴로딩.start();
			try {
				메인메뉴로딩.join();
			} catch (Exception e) {
				e.printStackTrace();
			}

			메인메뉴메서드();
		}

		// 2 마약제조하기
		else if (메인메뉴번호선택 == 2) {
			System.out.println("");
			System.out.println("§§§§	마약을 제조하러 왔습니다.	  §§§§");
			
			//단속쓰레드 시작
			경찰관단속쓰레드 단속효과2 = new 경찰관단속쓰레드();
			단속효과2.run();
			user.마약제조하기(); 
			
			Thread 메인메뉴로딩 = new Thread(new 로딩쓰레드("메인메뉴로딩"));
			메인메뉴로딩.start();
			try {
				메인메뉴로딩.join();
			} catch (Exception e) {
				e.printStackTrace();
			}

			메인메뉴메서드();
		}

		// 3 인벤토리
		else if (메인메뉴번호선택 == 3) { 
			
			user.인벤토리보기();

			// 메인메뉴로딩쓰레드
			Thread 메인메뉴로딩 = new Thread(new 로딩쓰레드("메인메뉴로딩"));
			메인메뉴로딩.start();
			try {
				메인메뉴로딩.join();
			} catch (Exception e) {
				e.printStackTrace();
			}

			메인메뉴메서드();
		}

		// 4 마약판매
		else if (메인메뉴번호선택 == 4) { 
				
			System.out.println();
			System.out.println("§§§§	마약 판매를 시작합니다 	   §§§§");
			System.out.println();
			
			
			System.out.println("본인이 직접 마약 판매를 할 수도 있으며 마약 판매상을 고용할 수도 있습니다.(30만원) ");
			System.out.println("본인이 직접판매할 경우 잡힐 확률이 더 커질 수 있습니다.");
			System.out.println("1. 직접 판매한다   2. 판매상을 고용한다");

			//단속쓰레드 시작
			경찰관단속쓰레드 단속효과1 = new 경찰관단속쓰레드();
			단속효과1.run();
			
			int 마약판매 = sc1.nextInt();

			if (마약판매 == 1) {
				System.out.println("직접 판매합니다.");
				
				경찰관단속쓰레드 단속효과2 = new 경찰관단속쓰레드();
				단속효과2.run();

			} else if (마약판매 == 2) {
				System.out.println("판매상을 고용하여 판매합니다.");
				System.out.println("30만원을 지불했습니다.");
				
				경찰관단속쓰레드 단속효과2 = new 경찰관단속쓰레드();
				단속효과2.run();
				
				user.돈 -= 30;
				user.잡힐확률-=5;

			} else {

				// 메인메뉴로딩쓰레드
				Thread 메인메뉴로딩 = new Thread(new 로딩쓰레드("메인메뉴로딩"));
				메인메뉴로딩.start();
				try {
					메인메뉴로딩.join();
				} catch (Exception e) {
					e.printStackTrace();
				}
				메인메뉴메서드();
			}
			

			customer.손님구매하기(); // 손님메소드

			단속효과1.finish();
			
		
			// 5 현상태보여주기
		} else if (메인메뉴번호선택 == 5) {
			System.out.println("");
			System.out.println("§§§§	현 상태를 확인합니다	  §§§§");

			현상태보여주기();

			// 메인메뉴로딩쓰레드
			Thread 메인메뉴로딩 = new Thread(new 로딩쓰레드("메인메뉴로딩"));
			메인메뉴로딩.start();
			try {
				메인메뉴로딩.join();
			} catch (Exception e) {
				e.printStackTrace();
			}
			메인메뉴메서드();

			// 6 친척들과 저녁식사
		} else if (메인메뉴번호선택 == 6) { // 친척들과 같이 저녁식사
			System.out.println();
			System.out.println("§§§§	마약단속국에서 일하는 행크의 가족을 저녁식사에 초대합니다	§§§§");
			System.out.println();

			저녁식사쓰레드 저녁식사효과 = new 저녁식사쓰레드(true);
			저녁식사효과.run();
			저녁식사효과.finish();
			// 일정 돈(50만원)을 지불하고 잡힐확률을 10 떨어트린다

			System.out.println();
			현상태보여주기();

			// 메인메뉴로딩쓰레드
			Thread 메인메뉴로딩 = new Thread(new 로딩쓰레드("메인메뉴로딩"));
			메인메뉴로딩.start();
			try {
				메인메뉴로딩.join();
			} catch (Exception e) {
				e.printStackTrace();
			}

			메인메뉴메서드();

			// 8 게임설명
		} else if (메인메뉴번호선택 == 8) {

			System.out.println();
			System.out.println("§§§§	게임설명을 다시 보여줍니다   	§§§§");
			System.out.println();

			게임설명메서드();

			// 메인메뉴로딩쓰레드
			Thread 메인메뉴로딩 = new Thread(new 로딩쓰레드("메인메뉴로딩"));
			메인메뉴로딩.start();
			try {
				메인메뉴로딩.join();
			} catch (Exception e) {
				e.printStackTrace();
			}
			메인메뉴메서드();

			// 9 게임종료
		} else if (메인메뉴번호선택 == 9) {
			System.out.println();
			System.out.println("게임이 종료됩니다");
			System.out.println();
			System.out.println("새로 시작하시겠습니까?");
			System.out.println("1. 예 -> 레벨, 돈, 명성, 잡힐확률이 모두 초기화 됩니다.");
			System.out.println("2. 아니요 -> 게임이 종료됩니다.");
			System.out.println("번호: ");

			Scanner sc22 = new Scanner(System.in);
			int 새게임번호선택 = sc22.nextInt();

			if (새게임번호선택 == 1) {

				user.레벨 = 1;
				user.돈 = 5000;
				user.명성 = 10;
				user.잡힐확률 = 0;

			} else {
				System.out.println("게임을 종료합니다.");
			}

			// 10 치트키
		} else if (메인메뉴번호선택 == 10) {
			System.out.println("");
			System.out.println("§§§§	치트키를 사용합니다	§§§§");
			System.out.println(user.가명 + "의 명성이 20, 돈이 2000만원 증가하며");
			System.out.println("잡힐확률이 10 감소하고, 마약이 각 100g씩 제조됩니다.");

			user.명성 += 20;
			user.돈 += 2000;
			
			대마초.수량+=100;
			메스암페타민.수량+=100;
			코카인.수량+=100;
			모르핀.수량+=100;
			
			레벨업();
			현상태보여주기();
			게임종료메서드();

			// 메인메뉴로딩쓰레드
			Thread 메인메뉴로딩 = new Thread(new 로딩쓰레드("메인메뉴로딩"));
			메인메뉴로딩.start();
			try {
				메인메뉴로딩.join();
			} catch (Exception e) {
				e.printStackTrace();
			}
			메인메뉴메서드();

		} else if (메인메뉴번호선택 == 7) {
			System.out.println("");
			System.out.println("§§§§	스킬을 사용합니다	  §§§§");
			System.out.println("");
			System.out.println("마나 100을 사용하여 잡힐 확률을 0으로 만들어줍니다.");

			user.잡힐확률 = 0;
			user.마나-=100;

			현상태보여주기();

		} else {
			System.out.println("");
			System.out.println("번호를 잘못 입력하셨습니다");
			System.out.println("메인메뉴로 이동합니다");
			System.out.println("");

			// 메인메뉴로딩쓰레드
			메인메뉴메서드();
		}
	}

	public static void 게임종료메서드() {

		if (user.돈 >= 15000) {
			// 승리조건
		
			Thread 엔딩로딩 = new Thread(new 로딩쓰레드("엔딩로딩"));
			엔딩로딩.start();
			try {
				엔딩로딩.join();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println();
			System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§");
			System.out.println();
			System.out.println("           드디어....목표했던 돈을 모두 모았어...!!          ");
			System.out.println("  이 정도면 내가 없어도 우리 아내가 맛있는 음식도 먹고, 쇼핑도 하고       ");
			System.out.println("         우리 아들 차도 사주고 대학등록금은 책임질 수 있겠어             ");
			System.out.println("             비록 부당한 방법으로 모은 돈이지만...            ");
			System.out.println("         어쩔 수 없었잖아.. 이제야 마음이 좀 편해진 것 같아             ");
			System.out.println();
			System.out.println("          이제 편히 나의 마지막을 맞이할 준비를 해야겠다.         ");
			System.out.println("         그 동안 우리 가족을 위해 플레이 해줘서 감사합니다 .       ");
			System.out.println();
			System.out.println("                    THE END                       ");
			System.out.println();
			System.out.println("§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§§");
			System.out.println("");
			System.out.println("");
			System.out.println("");

			배경음악쓰레드 엔딩음악 = new 배경음악쓰레드("자바작품 엔딩 음악.mp3", false);
			엔딩음악.run();
			엔딩음악.close();

			System.out.println();
			System.out.println();
			System.out.println("새로운 게임을 시작하시겠습니까?");
			System.out.println("1. 예 -> 레벨, 돈, 명성, 잡힐확률이 모두 초기화 됩니다.");
			System.out.println("2. 아니요 -> 게임이 종료됩니다.");
			System.out.println("번호: ");

			Scanner sc22 = new Scanner(System.in);
			int 새게임번호선택 = sc22.nextInt();

			if (새게임번호선택 == 1) {

				user.레벨 = 1;
				user.돈 = 5000;
				user.명성 = 10;
				user.잡힐확률 = 0;

			} else {
				System.out.println("게임을 종료합니다.");
			}

		} else if (user.돈 < 1000) { // 패배조건1
			System.out.println("");
			System.out.println("돈이 너무나 많이 잃었습니다.");
			System.out.println("다시 재개하기 힘든 상황에 오게 되어 마약 판매 사업은 중단됩니다.");
			System.out.println("게임이 종료됩니다.");
			
			System.out.println();
			System.out.println();
			System.out.println("새로운 게임을 시작하시겠습니까?");
			System.out.println("1. 예 -> 레벨, 돈, 명성, 잡힐확률이 모두 초기화 됩니다.");
			System.out.println("2. 아니요 -> 게임이 종료됩니다.");
			System.out.println("번호: ");

			Scanner sc22 = new Scanner(System.in);
			int 새게임번호선택 = sc22.nextInt();

			if (새게임번호선택 == 1) {

				user.레벨 = 1;
				user.돈 = 5000;
				user.명성 = 10;
				user.잡힐확률 = 0;

			} else {
				System.out.println("게임을 종료합니다.");
			}


		} else if (user.잡힐확률 >= 100) { // 패배조건2
			System.out.println("");
			System.out.println("잦은 횟수로 경찰의 눈에 띄어 결국 덜미를 잡혔습니다. ");
			System.out.println("아마 남은 시한부 인생을 모두 감옥에서 보내게 되었습니다.");
			System.out.println("게임이 종료됩니다.");
			
			System.out.println();
			System.out.println();
			System.out.println("새로운 게임을 시작하시겠습니까?");
			System.out.println("1. 예 -> 레벨, 돈, 명성, 잡힐확률이 모두 초기화 됩니다.");
			System.out.println("2. 아니요 -> 게임이 종료됩니다.");
			System.out.println("번호: ");

			Scanner sc22 = new Scanner(System.in);
			int 새게임번호선택 = sc22.nextInt();

			if (새게임번호선택 == 1) {

				user.레벨 = 1;
				user.돈 = 5000;
				user.명성 = 10;
				user.잡힐확률 = 0;

			} else {
				System.out.println("게임을 종료합니다.");
			}


		}
	}

	public static void 게임설명메서드() {

		System.out.println(
				" --------------------------------------------------------------------------------------------------------");
		System.out.println(
				" 1. 시한부 판정을 받은 유저는 남을 가족을 위해 5000만원을 가지고 1억 5000만원을 달성하는 게임입니다.                                            ");
		System.out.println(" 2. 처음에 게임이 시작되면  상점에 가서 캠핑카를 구매해 제조실로 사용해야하고, 재료를 사 마약제조를 해야합니다              ");
		System.out.println(" 3. 마약은 총 4가지로 대마초, 메스암페타민, 코카인, 모르핀이 있습니다.           ");
		System.out.println(" 4. 마약을 판매할 때는 마약상을 이용할 수도 있고 자신이 직접 팔 수도 있습니다.            ");
		System.out.println(" 5. 마약상을 이용하면 30만원을 마약상에게 줘야합니다. 하지만 잡힐확률이 즉시 5 낮아집니다. ");
		System.out.println(" 6. 레벨업은 일정 명성을 넘으면 진행되며, 레벨에 따라 제조실을 업그레이드 할 수 있습니다.                    ");
		System.out.println(" 7. 손님은 가난한 대학생, 부자 대학생, 유명인, 마약중독자, 일반 손님, 파티러가 존재하여 랜덤으로 접근합니다.			      ");
		System.out.println(" 8. 손님의 취향을 물어봐서 이에 알맞은 약을 추천해줄 수 있습니다.  ");
		System.out.println(" 8. 3레벨이 되어 마나가 100이되면 마나를 소모하여 잡힐 확률을 한번 0으로 만들 수 있습니다.  ");
		System.out.println(" 9. 마약단속국 직원인 행크의 가족을 초대해 저녁식사를 대접하면서 이야기를 나누며 잡힐확률을 10감소 할 수 있습니다. ");
		System.out.println(" 10.유저가 생성된 후 6초에 1씩 잡힐확률이 자동으로 증가합니다.  ");
		System.out.println(
				" --------------------------------------------------------------------------------------------------------");

	}

	public static void 레벨업() {

		if (user.명성 == 50) {
			System.out.println("");

			
			레벨업쓰레드 레벨업 = new 레벨업쓰레드();
			레벨업.run();
			레벨업.finish();
					
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("2레벨이 되었습니다.");
			System.out.println("업그레이드 메뉴를 가시면 [텐트]를 구매하실 수 있습니다.");
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");

			user.레벨 += 1;

		} else if (user.명성 == 100) {
			System.out.println("");
			
			레벨업쓰레드 레벨업 = new 레벨업쓰레드();
			레벨업.run();
			레벨업.finish();
			
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println("3레벨이 되었습니다.");
			System.out.println("업그레이드 메뉴를 가시면 [실험실]을 구매하실 수 있습니다.");
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");

			user.레벨 += 1;
		}
	}

}// 전체닫힘
