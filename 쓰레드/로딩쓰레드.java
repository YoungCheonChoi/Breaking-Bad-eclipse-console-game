package 쓰레드;

public class 로딩쓰레드 implements Runnable {

	private String type;
	
	public 로딩쓰레드(String type){
		this.type=type;
	}
	
	//오프닝로딩할때 -> 게임설명 나오기 전에 위치
	public void 오프닝로딩쓰레드() {
		for(int i=0; i<5; i++) {
			System.out.println("");
		}
		System.out.print("로딩중");
		for(int i=0; i<20; i++ ) {
			System.out.print(" ▷");
		
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for(int i=0; i<5; i++) {
			System.out.println("");
		}
	}
	
	//메인메뉴로 이동 시
	public void 메인메뉴로딩쓰레드() {

		for(int i=0; i<2; i++) {
			System.out.println("");
		}
		System.out.print("메인메뉴로");
		for(int i=0; i<10; i++ ) {
			System.out.print(" ▷");

			try {
				Thread.sleep(80);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	//유저정보받고 매장설립하기까지
	public void 가명생성로딩쓰레드() {
		for(int i=0; i<3; i++) {
			System.out.println("");
		}
		System.out.print("유저 생성 중");
		for(int i=0; i<20; i++ ) {
			System.out.print(" ▷");

			try {
				Thread.sleep(80);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void 엔딩로딩쓰레드() {
		System.out.println();	
	for(int i1=0; i1<1; i1++) {
		System.out.println("");
	}		
	for(int i=0; i<12; i++ ) {
		System.out.println("▼ ");

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

	@Override
	public void run() {
		switch(type) {
			case "오프닝로딩":
				오프닝로딩쓰레드();
				break;
			case "메인메뉴로딩"://메인메뉴로 이동할 때 실행
				메인메뉴로딩쓰레드();
				break;
			case "매장설립로딩"://유저 정보 입력 시 실행
				가명생성로딩쓰레드();
				break;
			case "엔딩로딩"://유저 정보 입력 시 실행
				엔딩로딩쓰레드();
				break;

}
	}
}
