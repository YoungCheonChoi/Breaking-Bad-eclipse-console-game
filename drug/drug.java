package drug;

public class drug {
	String 제품명;
	public int 가격;
	private int 수량;

	
	public drug(String 제품명, int 가격, int 수량) {
		this.제품명 = 제품명;
		this.가격 = 가격;
		this.수량= 수량;
	}
	
	public String get제품명() {
		return 제품명;
	}

	public void set제품명(String 제품명) {
		this.제품명 = 제품명;
	}

	public int get가격() {
		return 가격;
	}

	public void set가격(int 가격) {
		this.가격 = 가격;
	}
	
	public int get수량() {
		return 수량;
	}

	public void set수량(int 수량) {
		this.수량 = 수량;
	}
	
}
