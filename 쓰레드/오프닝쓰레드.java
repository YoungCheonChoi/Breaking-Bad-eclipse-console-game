package 쓰레드;

public class 오프닝쓰레드 implements Runnable {

	@Override
	public void run() {
		System.out.println();
		System.out.println();
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		String[] 게임배경스크립트= {"나","는"," ","고","등","학","교"," ","화","학","교","사"," ","이","다","."};
		for(int i=0; i<게임배경스크립트.length; i++ ) {
			System.out.print(게임배경스크립트[i]);
		
			try {
				Thread.sleep(180);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		System.out.println("");
		
		String[] 게임배경스크립트2= {"몇","달"," ","전"," ","암"," ","말","기"," ","판","정","을"," ","받","았","다",".","."};
		for(int i=0; i<게임배경스크립트2.length; i++ ) {
			System.out.print(게임배경스크립트2[i]);
		
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		System.out.println("");
		
		String[] 게임배경스크립트3= {"난"," ","이","미"," ","살","","만","큼"," ","살","았","기","에"," ","죽","는"," ","건"," ","두","렵","지","않","다",".",".",".","."," ","하","지","만",".",".","."};
		for(int i=0; i<게임배경스크립트3.length; i++ ) {
			System.out.print(게임배경스크립트3[i]);
		
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		System.out.println("");
		System.out.println("");
				
		String[] 게임배경스크립트4= {"남","을"," ","아","내","와"," ","아","들","이"," ","걱","정","된","다",".",".","."};
		for(int i=0; i<게임배경스크립트4.length; i++ ) {
			System.out.print(게임배경스크립트4[i]);
		
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		System.out.println("");
		
		String[] 게임배경스크립트5= {"그","러","던"," ","중"," ","의","문","의"," ","남","자","에","게"," ","쪽","지","를"," ","받","게","되","었","다","."};
		for(int i=0; i<게임배경스크립트5.length; i++ ) {
			System.out.print(게임배경스크립트5[i]);
		
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		System.out.println("");
		System.out.println("");
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
		System.out.println("☆  선생님의 현재 상황을 잘 알고 있습니다.                             ☆ ");
		System.out.println("☆  저희는 마약제조를 맡아줄 화학에 관련된 전문가가 필요합니다.              ☆ ");
		System.out.println("☆  죽기 전 남은 시간 동안 막대한 양의 돈을 벌 기회를 드리고 싶습니다.          ☆ ");
		System.out.println("☆  관심에 있으시면 010-XXXX-XXXX로 연락 부탁드립니다.                 ☆ ");
		System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆ ☆");
		System.out.println("");
		System.out.println("");

		
		String[] 게임배경스크립트6= {"내","게"," ","남","은"," ","기","회","는"," ","이","것"," ","뿐","인"," ","것"," ","같","다",".",".","!"," ","시","작","해","보","자","!"};
		for(int i=0; i<게임배경스크립트6.length; i++ ) {
			System.out.print(게임배경스크립트6[i]);
		
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
		System.out.println("");
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		System.out.println("");
	}

}
