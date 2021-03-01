package drug;

public class 코카인 extends drug {

	
	public static int 수량;

	public 코카인(String 제품명, int 가격, int 수량) {
		super(제품명, 가격, 수량);

	}

	public void show() {
		System.out.println("제품명: "+get제품명());
		System.out.println("가격: "+get가격()+" 만원");
		System.out.println("수량: "+get수량());
	}

}


