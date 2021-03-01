package customer;

import java.util.Scanner;
import drug.drug;
import drug.대마초;
import drug.메스암페타민;
import drug.모르핀;
import drug.코카인;
import user.user;
import 브레이킹배드_자바작품.main;
import 쓰레드.경찰관단속쓰레드;
import 쓰레드.배경음악쓰레드;

public class customer {


public static void 손님구매하기() {
		// 랜덤한 마약을 랜덤한 그램 수 많큼 구매
	

		int 고객번호 = (int) (Math.random() * 10 + 1);

		// 가난한대학생
		if (고객번호 == 1) {
			System.out.println("");
			System.out.println("가난한 대학생이 다가옵니다.");
			System.out.println("");

			// 발자국 효과음
			배경음악쓰레드 손님등장효과음 = new 배경음악쓰레드("Jog_on_concrete.mp3", false);
			손님등장효과음.run(); // 발자국 소리
			손님등장효과음.close();

			user.마약추천하기(); // 유저가 추천해주면 추천해준 마약을 구매하고, 추천을 안선택하면 랜덤으로 구매

			// 구매효과음
			배경음악쓰레드 손님구매효과음 = new 배경음악쓰레드("손님 구매 효과음.mp3", false);
			손님구매효과음.run();
			손님구매효과음.close();

			user.명성 += 5;
			System.out.println("명성이 5가 증가했습니다.");

			//경찰관단속쓰레드 단속효과 = new 경찰관단속쓰레드();
			//단속효과.run();
			//단속효과.finish();

			main.레벨업();
			main.현상태보여주기();
			main.게임종료메서드();
			user.손님더찾을지말지();

			// 부자 대학생
		} else if (고객번호 == 2) {

			System.out.println("");
			System.out.println("부자 대학생이 다가옵니다.");
			System.out.println("");

			// 발자국 효과음
			배경음악쓰레드 손님등장효과음 = new 배경음악쓰레드("Jog_on_concrete.mp3", false);
			손님등장효과음.run(); // 발자국 소리
			손님등장효과음.close();

			user.마약추천하기(); // customer.부자대학생랜덤그램수();

			// 구매효과음
			배경음악쓰레드 손님구매효과음 = new 배경음악쓰레드("손님 구매 효과음.mp3", false);
			손님구매효과음.run();
			손님구매효과음.close();

			user.명성 += 5;
			System.out.println("명성이 5가 증가했습니다.");

			//경찰관단속쓰레드 단속효과 = new 경찰관단속쓰레드();
			//단속효과.run();
			//단속효과.finish();

			main.레벨업();
			main.현상태보여주기();
			main.게임종료메서드();
			user.손님더찾을지말지();

			// 마약 중독자
		} else if (고객번호 >= 3 && 고객번호 <= 5) {

			System.out.println("");
			System.out.println("마약 중독자가 다가옵니다.");
			System.out.println("");

			// 발자국 효과음
			배경음악쓰레드 손님등장효과음 = new 배경음악쓰레드("Jog_on_concrete.mp3", false); // false는 반복 없애기 1번만 재생
			손님등장효과음.run(); // 발자국 소리
			손님등장효과음.close();

			user.마약추천하기();

			// 구매효과음
			배경음악쓰레드 손님구매효과음 = new 배경음악쓰레드("손님 구매 효과음.mp3", false);
			손님구매효과음.run();
			손님구매효과음.close();

			user.명성 += 5;
			System.out.println("명성이 5가 증가했습니다.");

			// 마약중독자의 제안
			System.out.println();
			System.out.println();
			System.out.println("마약 중독자가 제안을 해옵니다");
			System.out.println("미니게임에서 이기면 500만원 추가금을 주고, 지면 700만원을 자신에게 달라고 제안합니다. ");
			System.out.println("종목은 가위바위보 단판입니다. 제안을 받아들이시겠습니까?");
			System.out.println("1.예   2.아니요");

			Scanner sc22 = new Scanner(System.in);
			System.out.println("번호: ");
			int 중독자제안선택 = sc22.nextInt();

			if (중독자제안선택 == 1) {
				마약중독자.중독자의제안();
			} else {
				System.out.println("제안을 거절했습니다.");
			}

			//경찰관단속쓰레드 단속효과 = new 경찰관단속쓰레드();
			//단속효과.run();
			//단속효과.finish();

			main.레벨업();
			main.현상태보여주기();
			main.게임종료메서드();
			user.손님더찾을지말지();

			// 유명인
		} else if (고객번호 == 6) {

			System.out.println("");
			System.out.println("유명인이 다가옵니다.");
			System.out.println("");

			// 발자국 효과음
			배경음악쓰레드 손님등장효과음 = new 배경음악쓰레드("Jog_on_concrete.mp3", false);
			손님등장효과음.run(); 			// 발자국 소리
			손님등장효과음.close();

			user.마약추천하기();

			// 구매효과음
			배경음악쓰레드 손님구매효과음 = new 배경음악쓰레드("손님 구매 효과음.mp3", false);
			손님구매효과음.run();
			손님구매효과음.close();

			user.명성 += 5;
			System.out.println("명성이 5가 증가했습니다.");

			//경찰관단속쓰레드 단속효과 = new 경찰관단속쓰레드();
			//단속효과.run();
			//단속효과.finish();

			main.레벨업();
			main.현상태보여주기();
			main.게임종료메서드();
			user.손님더찾을지말지();

			// 일반 손님
		} else if (고객번호 >= 7 && 고객번호 <= 9) {

			System.out.println("");
			System.out.println("일반 손님이 다가옵니다.");
			System.out.println("");

			// 발자국 효과음
			배경음악쓰레드 손님등장효과음 = new 배경음악쓰레드("Jog_on_concrete.mp3", false);
			손님등장효과음.run(); // 발자국 소리
			손님등장효과음.close();

			user.마약추천하기();

			// 구매효과음
			배경음악쓰레드 손님구매효과음 = new 배경음악쓰레드("손님 구매 효과음.mp3", false);
			손님구매효과음.run();
			손님구매효과음.close();

			user.명성 += 5;
			System.out.println("명성이 5가 증가했습니다.");

			//경찰관단속쓰레드 단속효과 = new 경찰관단속쓰레드();
			//단속효과.run();
			//단속효과.finish();

			main.레벨업();
			main.현상태보여주기();
			main.게임종료메서드();
			user.손님더찾을지말지();

			// 파티러
		} else {

			System.out.println("");
			System.out.println("파티러가 다가옵니다.");
			System.out.println("");

			// 발자국 효과음
			배경음악쓰레드 손님등장효과음 = new 배경음악쓰레드("Jog_on_concrete.mp3", false);
			손님등장효과음.run(); // 발자국 소리
			손님등장효과음.close();

			user.마약추천하기();

			// 구매효과음
			배경음악쓰레드 손님구매효과음 = new 배경음악쓰레드("손님 구매 효과음.mp3", false);
			손님구매효과음.run();
			손님구매효과음.close();

			user.명성 += 5;
			System.out.println("명성이 5가 증가했습니다.");

			//경찰관단속쓰레드 단속효과 = new 경찰관단속쓰레드();
			//단속효과.run();
			//단속효과.finish();

			main.레벨업();
			main.현상태보여주기();
			main.게임종료메서드();
			user.손님더찾을지말지();

		}
	
		
	}
	
public static void 랜덤마약선택() {
		// 4종류 중 랜덤한 종류를 손님에 다른 랜덤한 숫자로 제공

		int 마약종류랜덤 = (int) (Math.random() * 4) + 1;
		int 마약랜덤수량 = (int) (Math.random() * 10) + 3;

		if (마약종류랜덤 == 1) {
			System.out.println("손님이 [대마초]를 " + 마약랜덤수량 + "g 을선택했습니다.");
			//System.out.println("돈이 " + 대마초.get가격() * 마약랜덤수량 + "만원 증가했습니다.");
			//user.돈 = user.돈 + (대마초.get가격() * 마약랜덤수량);
						
			System.out.println("돈이 " + 20 * 마약랜덤수량 + "만원 증가했습니다.");
			user.돈 = user.돈 + (20 * 마약랜덤수량);
			user.명성 += 5;
			대마초.수량-=마약랜덤수량;
			System.out.println("명성이 5가 증가했습니다.");
			
			// 구매효과음
			배경음악쓰레드 손님구매효과음 = new 배경음악쓰레드("손님 구매 효과음.mp3", false);
			손님구매효과음.run();
			손님구매효과음.close();
			
			경찰관단속쓰레드 단속효과 = new 경찰관단속쓰레드();
			단속효과.run();
			단속효과.finish();

			main.레벨업();
			main.현상태보여주기();
			main.게임종료메서드();
			user.손님더찾을지말지();

		} else if (마약종류랜덤 == 2) {
			System.out.println("손님이 [메스암페타민]을 " + 마약랜덤수량 + "g을 선택했습니다.");
			//System.out.println("돈이 " + 메스암페타민.get가격() * 마약랜덤수량 + "만원 증가했습니다.");
			//user.돈 = user.돈 + (메스암페타민.get가격() * 마약랜덤수량);

			System.out.println("돈이 " + 50 * 마약랜덤수량 + "만원 증가했습니다.");
			user.돈 = user.돈 + (50 * 마약랜덤수량);
			user.명성 += 5;
			메스암페타민.수량-=마약랜덤수량;
			System.out.println("명성이 5가 증가했습니다.");
			
			// 구매효과음
			배경음악쓰레드 손님구매효과음 = new 배경음악쓰레드("손님 구매 효과음.mp3", false);
			손님구매효과음.run();
			손님구매효과음.close();
			
			경찰관단속쓰레드 단속효과 = new 경찰관단속쓰레드();
			단속효과.run();
			단속효과.finish();
					
			main.레벨업();
			main.현상태보여주기();
			main.게임종료메서드();
			user.손님더찾을지말지();

		} else if (마약종류랜덤 == 3) {

			System.out.println("손님이 [모르핀]을 " + 마약랜덤수량 + "g을 선택했습니다.");
			//System.out.println("돈이 " + 모르핀.get가격() * 마약랜덤수량 + "만원 증가했습니다.");

			//user.돈 = user.돈 + (모르핀.get가격() * 마약랜덤수량);

			System.out.println("돈이 " + 30 * 마약랜덤수량 + "만원 증가했습니다.");
			user.돈 = user.돈 + (30 * 마약랜덤수량);
			user.명성 += 5;
			모르핀.수량-=마약랜덤수량;
			System.out.println("명성이 5가 증가했습니다.");

			// 구매효과음
			배경음악쓰레드 손님구매효과음 = new 배경음악쓰레드("손님 구매 효과음.mp3", false);
			손님구매효과음.run();
			손님구매효과음.close();
			
			경찰관단속쓰레드 단속효과 = new 경찰관단속쓰레드();
			단속효과.run();
			단속효과.finish();

			main.레벨업();
			main.현상태보여주기();
			main.게임종료메서드();
			user.손님더찾을지말지();

		} else if (마약종류랜덤 == 4) {

			System.out.println("손님이 [코카인]을 " + 마약랜덤수량 + "g을 선택했습니다.");
			//System.out.println("돈이 " + 코카인.get가격() * 마약랜덤수량 + "만원 증가했습니다.");
			//user.돈 = user.돈 + (코카인.get가격() * 마약랜덤수량);

			System.out.println("돈이 " + 40 * 마약랜덤수량 + "만원 증가했습니다.");
			user.돈 = user.돈 + (40 * 마약랜덤수량);
			user.명성 += 5;
			코카인.수량-=마약랜덤수량;
			System.out.println("명성이 5가 증가했습니다.");
			
			// 구매효과음
			배경음악쓰레드 손님구매효과음 = new 배경음악쓰레드("손님 구매 효과음.mp3", false);
			손님구매효과음.run();
			손님구매효과음.close();
			
			경찰관단속쓰레드 단속효과 = new 경찰관단속쓰레드();
			단속효과.run();
			단속효과.finish();

			main.레벨업();
			main.현상태보여주기();
			main.게임종료메서드();
			user.손님더찾을지말지();

		}
	}

}
