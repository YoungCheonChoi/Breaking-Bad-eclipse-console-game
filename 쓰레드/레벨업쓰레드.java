package 쓰레드;

public class 레벨업쓰레드 implements Runnable  {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String[] 레벨업그림=new String[8];
		레벨업그림[0]="888      8888888888 888     888 8888888888 888          888     888 8888888b.  ";
		레벨업그림[1]="888      888        888     888 888        888          888     888 888   Y88b ";
		레벨업그림[2]="888      888        888     888 888        888          888     888 888    888 ";
		레벨업그림[3]="888      8888888    Y88b   d88P 8888888    888          888     888 888   d88P ";
		레벨업그림[4]="888      888         Y88b d88P  888        888          888     888 8888888P\"  ";
		레벨업그림[5]="888      888          Y88o88P   888        888          888     888 888    ";
		레벨업그림[6]="888      888           Y888P    888        888          Y88b. .d88P 888    ";
		레벨업그림[7]="88888888 8888888888     Y8P     8888888888 88888888      \"Y88888P\"  888 ";
		

		for(int i=0;i<레벨업그림.length;i++) {
			System.out.println(레벨업그림[i]);
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
