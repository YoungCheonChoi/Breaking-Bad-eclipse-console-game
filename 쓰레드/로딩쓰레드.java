package ������;

public class �ε������� implements Runnable {

	private String type;
	
	public �ε�������(String type){
		this.type=type;
	}
	
	//�����׷ε��Ҷ� -> ���Ӽ��� ������ ���� ��ġ
	public void �����׷ε�������() {
		for(int i=0; i<5; i++) {
			System.out.println("");
		}
		System.out.print("�ε���");
		for(int i=0; i<20; i++ ) {
			System.out.print(" ��");
		
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
	
	//���θ޴��� �̵� ��
	public void ���θ޴��ε�������() {

		for(int i=0; i<2; i++) {
			System.out.println("");
		}
		System.out.print("���θ޴���");
		for(int i=0; i<10; i++ ) {
			System.out.print(" ��");

			try {
				Thread.sleep(80);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	//���������ް� ���弳���ϱ����
	public void ��������ε�������() {
		for(int i=0; i<3; i++) {
			System.out.println("");
		}
		System.out.print("���� ���� ��");
		for(int i=0; i<20; i++ ) {
			System.out.print(" ��");

			try {
				Thread.sleep(80);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void �����ε�������() {
		System.out.println();	
	for(int i1=0; i1<1; i1++) {
		System.out.println("");
	}		
	for(int i=0; i<12; i++ ) {
		System.out.println("�� ");

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
			case "�����׷ε�":
				�����׷ε�������();
				break;
			case "���θ޴��ε�"://���θ޴��� �̵��� �� ����
				���θ޴��ε�������();
				break;
			case "���弳���ε�"://���� ���� �Է� �� ����
				��������ε�������();
				break;
			case "�����ε�"://���� ���� �Է� �� ����
				�����ε�������();
				break;

}
	}
}
