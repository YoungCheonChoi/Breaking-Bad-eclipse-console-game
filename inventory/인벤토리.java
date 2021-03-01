package inventory;

import drug.drug;

public class 인벤토리 {
	String 제품명;
	int 수량;
	public 인벤토리() {
		
	}
	public 인벤토리(String a, int b) {
		제품명=a;
		수량=b;
	}
	public String get제품명() {
		return 제품명;
		
	}
	public int get수량() {
		return 수량;
		
	}
	public  void set제품명() {
	 this.제품명=제품명;
		
	}
	public void set가격() {
		this.수량=수량;
	}
	public static drug get(int i) {
		// TODO Auto-generated method stub
		return null;
	}


}
