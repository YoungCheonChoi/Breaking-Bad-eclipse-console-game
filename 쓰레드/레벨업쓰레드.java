package ������;

public class ������������ implements Runnable  {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String[] �������׸�=new String[8];
		�������׸�[0]="888      8888888888 888     888 8888888888 888          888     888 8888888b.  ";
		�������׸�[1]="888      888        888     888 888        888          888     888 888   Y88b ";
		�������׸�[2]="888      888        888     888 888        888          888     888 888    888 ";
		�������׸�[3]="888      8888888    Y88b   d88P 8888888    888          888     888 888   d88P ";
		�������׸�[4]="888      888         Y88b d88P  888        888          888     888 8888888P\"  ";
		�������׸�[5]="888      888          Y88o88P   888        888          888     888 888    ";
		�������׸�[6]="888      888           Y888P    888        888          Y88b. .d88P 888    ";
		�������׸�[7]="88888888 8888888888     Y8P     8888888888 88888888      \"Y88888P\"  888 ";
		

		for(int i=0;i<�������׸�.length;i++) {
			System.out.println(�������׸�[i]);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
	}

	public void finish() {
		// TODO Auto-generated method stub
		this.interrupt();
	}

	private void interrupt() {
		// TODO Auto-generated method stub
		
	}
}
