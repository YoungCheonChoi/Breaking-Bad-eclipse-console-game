package �극��ŷ���_�ڹ���ǰ;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import customer.customer;
import drug.drug;
import drug.�븶��;
import drug.�޽�����Ÿ��;
import drug.����;
import drug.��ī��;
import user.user;
import ������.�������ܼӾ�����;
import ������.������������;
import ������.�ε�������;
import ������.������Ǿ�����;
import ������.�����׾�����;
import ������.����Ļ羲����;


public class main {

	public static void main(String[] args) {
		
		

		// ��ǰ��, ����, ����
		drug �븶�� = new �븶��("�븶��", 20, 0 );
		drug �޽�����Ÿ�� = new �޽�����Ÿ��("�޽�����Ÿ��", 50, 0);
		drug ���� = new ����("����", 30, 0);
		drug ��ī�� = new ��ī��("��ī��", 40, 0);
		
		System.out.println("______ ______  _____   ___   _   __ _____  _   _  _____  ______   ___  ______ \r\n"
				+ "| ___ \\| ___ \\|  ___| / _ \\ | | / /|_   _|| \\ | ||  __ \\ | ___ \\ / _ \\ |  _  \\\r\n"
				+ "| |_/ /| |_/ /| |__  / /_\\ \\| |/ /   | |  |  \\| || |  \\/ | |_/ // /_\\ \\| | | |\r\n"
				+ "| ___ \\|    / |  __| |  _  ||    \\   | |  | . ` || | __  | ___ \\|  _  || | | |\r\n"
				+ "| |_/ /| |\\ \\ | |___ | | | || |\\  \\ _| |_ | |\\  || |_\\ \\ | |_/ /| | | || |/ / \r\n"
				+ "\\____/ \\_| \\_|\\____/ \\_| |_/\\_| \\_/ \\___/ \\_| \\_/ \\____/ \\____/ \\_| |_/|___/  ");


		
		// ������ ��ũ��Ʈ ������
		Thread ������ = new Thread(new �����׾�����());

		������.start();

		try {
			 //������ ���Ǿ�����
			������Ǿ����� ���������� = new ������Ǿ�����("Almost_a_Year_Ago_Sting.mp3", false);
			����������.run();

			������.join(); // ���θ޼ҵ� ��� ���߰� �����׾����尡 ����ǰ�

			����������.close(); // ���������ǲ���

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 //join�� �� ������ �������� ������(����, �����׷ε� �����尡 �ѹ��� �����淡 �������� ������ ��ٸ� �� ��µǰ� �������)
	
		
		// �����׷ε�������
		Thread �����׷ε� = new Thread(new �ε�������("�����׷ε�"));
		�����׷ε�.start();
		try {
			�����׷ε�.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		���Ӽ���޼���();
		System.out.println("");
		System.out.println("");

		// ���� ���� �ޱ�
		System.out.println("������ ����� ������ �Է����ּ���.");
		Scanner sc = new Scanner(System.in);
		System.out.print("����= ");
		user.���� = sc.nextLine();

		Thread �������ε� = new Thread(new �ε�������("�������ε�"));
		�������ε�.start();
		try {
			�������ε�.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(user.���� + " ������ �����Ǿ����ϴ�.");

		System.out.println();
		System.out.println();
		System.out.println("���� ������  �ѹ� �� �����ðڽ��ϱ�?");
		System.out.println("1. ��´�  2. �����Ѵ�");

		int num = sc.nextInt();
		if (num == 1) {
			���Ӽ���޼���();

			System.out.println("����� �����ϱ� �� ���׷��̵� �޴� [������ �����ϱ�]�� �� ķ��ī�� �����Ͽ��� �մϴ�");

			
			//����Ȯ���ڵ����� - 6�ʿ� 1��
			Timer m_timer = new Timer();
			TimerTask m_task = new TimerTask() {
			
			@Override
			public void run() {

				user.����Ȯ��+=1;
				
			}		
		};
		m_timer.schedule(m_task,1000,3000);
		
		
			// ���θ޴��ε�������
			Thread ���θ޴��ε� = new Thread(new �ε�������("���θ޴��ε�"));
			���θ޴��ε�.start();
			try {
				���θ޴��ε�.join();
			} catch (Exception e) {
				e.printStackTrace();
			}

			���θ޴��޼���();
		} else if (num == 2) {

			System.out.println("����� �����ϱ� �� ���׷��̵� �޴� [������ �����ϱ�]�� �� ķ��ī�� �����Ͽ��� �մϴ�");

			Thread ���θ޴��ε� = new Thread(new �ε�������("���θ޴��ε�"));
			���θ޴��ε�.start();
			try {
				���θ޴��ε�.join();
			} catch (Exception e) {
				e.printStackTrace();
			}

			���θ޴��޼���();
		} else { // ����ó��
			Thread ���θ޴��ε� = new Thread(new �ε�������("���θ޴��ε�"));
			���θ޴��ε�.start();
			try {
				���θ޴��ε�.join();
			} catch (Exception e) {
				e.printStackTrace();
			}

			���θ޴��޼���();
		}
		

	}

	public static void �����º����ֱ�() {
		System.out.println("");
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println(" ����: " + user.����);
		System.out.println(" �ں�: " + user.�� + "����                               ");
		System.out.println(" ��: " + user.��);
		System.out.println(" ���� Ȯ��: " + user.����Ȯ��);
		System.out.println(" ����: " + user.����);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
	}

	public static void ���θ޴��޼���() {

		System.out.println("");
		System.out.println("=====================================");
		System.out.println("1. ������ �����ϱ�");
		System.out.println("2. ���� �����ϱ�");
		System.out.println("3. �κ��丮 - ���� ��� Ȯ��");
		System.out.println("4. ���� �Ǹ��ϱ�"); 				// �ڵ��մԾ����� ���, �����ܼ��̺�Ʈ���
		System.out.println("5. �� ����Ȯ���ϱ�");
		System.out.println("6. ��ũ �������� ����Ļ� ");  		// ������ ���� �����ϰ� ����Ȯ���� �ٿ��ش�, ������ ���
		System.out.println("7. ��ų ���"); 				    // 1�� ķ��ī, 2�� ��Ʈ, 3�� �����, ��������
		System.out.println("8. ���� ����");
		System.out.println("9. ���� ����");
		System.out.println("10. ġƮŰ ");
		System.out.println("=====================================");
		System.out.println("���Ͻô� �׸��� �������ּ���");
		System.out.print("��ȣ: ");
		System.out.print("");

		Scanner sc1 = new Scanner(System.in);
		int ���θ޴���ȣ���� = sc1.nextInt();

		// 1 ��������
		if (���θ޴���ȣ���� == 1) {
			System.out.println();
			System.out.println("�ססס�	������ ������ �����߽��ϴ�	   �ססס�");
			user.��������(); // �����޼ҵ�

			Thread ���θ޴��ε� = new Thread(new �ε�������("���θ޴��ε�"));
			���θ޴��ε�.start();
			try {
				���θ޴��ε�.join();
			} catch (Exception e) {
				e.printStackTrace();
			}

			���θ޴��޼���();
		}

		// 2 ���������ϱ�
		else if (���θ޴���ȣ���� == 2) {
			System.out.println("");
			System.out.println("�ססס�	������ �����Ϸ� �Խ��ϴ�.	  �ססס�");
			
			//�ܼӾ����� ����
			�������ܼӾ����� �ܼ�ȿ��2 = new �������ܼӾ�����();
			�ܼ�ȿ��2.run();
			user.���������ϱ�(); 
			
			Thread ���θ޴��ε� = new Thread(new �ε�������("���θ޴��ε�"));
			���θ޴��ε�.start();
			try {
				���θ޴��ε�.join();
			} catch (Exception e) {
				e.printStackTrace();
			}

			���θ޴��޼���();
		}

		// 3 �κ��丮
		else if (���θ޴���ȣ���� == 3) { 
			
			user.�κ��丮����();

			// ���θ޴��ε�������
			Thread ���θ޴��ε� = new Thread(new �ε�������("���θ޴��ε�"));
			���θ޴��ε�.start();
			try {
				���θ޴��ε�.join();
			} catch (Exception e) {
				e.printStackTrace();
			}

			���θ޴��޼���();
		}

		// 4 �����Ǹ�
		else if (���θ޴���ȣ���� == 4) { 
				
			System.out.println();
			System.out.println("�ססס�	���� �ǸŸ� �����մϴ� 	   �ססס�");
			System.out.println();
			
			
			System.out.println("������ ���� ���� �ǸŸ� �� ���� ������ ���� �ǸŻ��� ����� ���� �ֽ��ϴ�.(30����) ");
			System.out.println("������ �����Ǹ��� ��� ���� Ȯ���� �� Ŀ�� �� �ֽ��ϴ�.");
			System.out.println("1. ���� �Ǹ��Ѵ�   2. �ǸŻ��� ����Ѵ�");

			//�ܼӾ����� ����
			�������ܼӾ����� �ܼ�ȿ��1 = new �������ܼӾ�����();
			�ܼ�ȿ��1.run();
			
			int �����Ǹ� = sc1.nextInt();

			if (�����Ǹ� == 1) {
				System.out.println("���� �Ǹ��մϴ�.");
				
				�������ܼӾ����� �ܼ�ȿ��2 = new �������ܼӾ�����();
				�ܼ�ȿ��2.run();

			} else if (�����Ǹ� == 2) {
				System.out.println("�ǸŻ��� ����Ͽ� �Ǹ��մϴ�.");
				System.out.println("30������ �����߽��ϴ�.");
				
				�������ܼӾ����� �ܼ�ȿ��2 = new �������ܼӾ�����();
				�ܼ�ȿ��2.run();
				
				user.�� -= 30;
				user.����Ȯ��-=5;

			} else {

				// ���θ޴��ε�������
				Thread ���θ޴��ε� = new Thread(new �ε�������("���θ޴��ε�"));
				���θ޴��ε�.start();
				try {
					���θ޴��ε�.join();
				} catch (Exception e) {
					e.printStackTrace();
				}
				���θ޴��޼���();
			}
			

			customer.�մԱ����ϱ�(); // �մԸ޼ҵ�

			�ܼ�ȿ��1.finish();
			
		
			// 5 �����º����ֱ�
		} else if (���θ޴���ȣ���� == 5) {
			System.out.println("");
			System.out.println("�ססס�	�� ���¸� Ȯ���մϴ�	  �ססס�");

			�����º����ֱ�();

			// ���θ޴��ε�������
			Thread ���θ޴��ε� = new Thread(new �ε�������("���θ޴��ε�"));
			���θ޴��ε�.start();
			try {
				���θ޴��ε�.join();
			} catch (Exception e) {
				e.printStackTrace();
			}
			���θ޴��޼���();

			// 6 ģô��� ����Ļ�
		} else if (���θ޴���ȣ���� == 6) { // ģô��� ���� ����Ļ�
			System.out.println();
			System.out.println("�ססס�	����ܼӱ����� ���ϴ� ��ũ�� ������ ����Ļ翡 �ʴ��մϴ�	�ססס�");
			System.out.println();

			����Ļ羲���� ����Ļ�ȿ�� = new ����Ļ羲����(true);
			����Ļ�ȿ��.run();
			����Ļ�ȿ��.finish();
			// ���� ��(50����)�� �����ϰ� ����Ȯ���� 10 ����Ʈ����

			System.out.println();
			�����º����ֱ�();

			// ���θ޴��ε�������
			Thread ���θ޴��ε� = new Thread(new �ε�������("���θ޴��ε�"));
			���θ޴��ε�.start();
			try {
				���θ޴��ε�.join();
			} catch (Exception e) {
				e.printStackTrace();
			}

			���θ޴��޼���();

			// 8 ���Ӽ���
		} else if (���θ޴���ȣ���� == 8) {

			System.out.println();
			System.out.println("�ססס�	���Ӽ����� �ٽ� �����ݴϴ�   	�ססס�");
			System.out.println();

			���Ӽ���޼���();

			// ���θ޴��ε�������
			Thread ���θ޴��ε� = new Thread(new �ε�������("���θ޴��ε�"));
			���θ޴��ε�.start();
			try {
				���θ޴��ε�.join();
			} catch (Exception e) {
				e.printStackTrace();
			}
			���θ޴��޼���();

			// 9 ��������
		} else if (���θ޴���ȣ���� == 9) {
			System.out.println();
			System.out.println("������ ����˴ϴ�");
			System.out.println();
			System.out.println("���� �����Ͻðڽ��ϱ�?");
			System.out.println("1. �� -> ����, ��, ��, ����Ȯ���� ��� �ʱ�ȭ �˴ϴ�.");
			System.out.println("2. �ƴϿ� -> ������ ����˴ϴ�.");
			System.out.println("��ȣ: ");

			Scanner sc22 = new Scanner(System.in);
			int �����ӹ�ȣ���� = sc22.nextInt();

			if (�����ӹ�ȣ���� == 1) {

				user.���� = 1;
				user.�� = 5000;
				user.�� = 10;
				user.����Ȯ�� = 0;

			} else {
				System.out.println("������ �����մϴ�.");
			}

			// 10 ġƮŰ
		} else if (���θ޴���ȣ���� == 10) {
			System.out.println("");
			System.out.println("�ססס�	ġƮŰ�� ����մϴ�	�ססס�");
			System.out.println(user.���� + "�� ���� 20, ���� 2000���� �����ϸ�");
			System.out.println("����Ȯ���� 10 �����ϰ�, ������ �� 100g�� �����˴ϴ�.");

			user.�� += 20;
			user.�� += 2000;
			
			�븶��.����+=100;
			�޽�����Ÿ��.����+=100;
			��ī��.����+=100;
			����.����+=100;
			
			������();
			�����º����ֱ�();
			��������޼���();

			// ���θ޴��ε�������
			Thread ���θ޴��ε� = new Thread(new �ε�������("���θ޴��ε�"));
			���θ޴��ε�.start();
			try {
				���θ޴��ε�.join();
			} catch (Exception e) {
				e.printStackTrace();
			}
			���θ޴��޼���();

		} else if (���θ޴���ȣ���� == 7) {
			System.out.println("");
			System.out.println("�ססס�	��ų�� ����մϴ�	  �ססס�");
			System.out.println("");
			System.out.println("���� 100�� ����Ͽ� ���� Ȯ���� 0���� ������ݴϴ�.");

			user.����Ȯ�� = 0;
			user.����-=100;

			�����º����ֱ�();

		} else {
			System.out.println("");
			System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�");
			System.out.println("���θ޴��� �̵��մϴ�");
			System.out.println("");

			// ���θ޴��ε�������
			���θ޴��޼���();
		}
	}

	public static void ��������޼���() {

		if (user.�� >= 15000) {
			// �¸�����
		
			Thread �����ε� = new Thread(new �ε�������("�����ε�"));
			�����ε�.start();
			try {
				�����ε�.join();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println();
			System.out.println("�סססססססססססססססססססססססססססססססססססססססססססססססס�");
			System.out.println();
			System.out.println("           ����....��ǥ�ߴ� ���� ��� ��Ҿ�...!!          ");
			System.out.println("  �� ������ ���� ��� �츮 �Ƴ��� ���ִ� ���ĵ� �԰�, ���ε� �ϰ�       ");
			System.out.println("         �츮 �Ƶ� ���� ���ְ� ���е�ϱ��� å���� �� �ְھ�             ");
			System.out.println("             ��� �δ��� ������� ���� ��������...            ");
			System.out.println("         ��¿ �� �����ݾ�.. ������ ������ �� ������ �� ����             ");
			System.out.println();
			System.out.println("          ���� ���� ���� �������� ������ �غ� �ؾ߰ڴ�.         ");
			System.out.println("         �� ���� �츮 ������ ���� �÷��� ���༭ �����մϴ� .       ");
			System.out.println();
			System.out.println("                    THE END                       ");
			System.out.println();
			System.out.println("�סססססססססססססססססססססססססססססססססססססססססססססססס�");
			System.out.println("");
			System.out.println("");
			System.out.println("");

			������Ǿ����� �������� = new ������Ǿ�����("�ڹ���ǰ ���� ����.mp3", false);
			��������.run();
			��������.close();

			System.out.println();
			System.out.println();
			System.out.println("���ο� ������ �����Ͻðڽ��ϱ�?");
			System.out.println("1. �� -> ����, ��, ��, ����Ȯ���� ��� �ʱ�ȭ �˴ϴ�.");
			System.out.println("2. �ƴϿ� -> ������ ����˴ϴ�.");
			System.out.println("��ȣ: ");

			Scanner sc22 = new Scanner(System.in);
			int �����ӹ�ȣ���� = sc22.nextInt();

			if (�����ӹ�ȣ���� == 1) {

				user.���� = 1;
				user.�� = 5000;
				user.�� = 10;
				user.����Ȯ�� = 0;

			} else {
				System.out.println("������ �����մϴ�.");
			}

		} else if (user.�� < 1000) { // �й�����1
			System.out.println("");
			System.out.println("���� �ʹ��� ���� �Ҿ����ϴ�.");
			System.out.println("�ٽ� �簳�ϱ� ���� ��Ȳ�� ���� �Ǿ� ���� �Ǹ� ����� �ߴܵ˴ϴ�.");
			System.out.println("������ ����˴ϴ�.");
			
			System.out.println();
			System.out.println();
			System.out.println("���ο� ������ �����Ͻðڽ��ϱ�?");
			System.out.println("1. �� -> ����, ��, ��, ����Ȯ���� ��� �ʱ�ȭ �˴ϴ�.");
			System.out.println("2. �ƴϿ� -> ������ ����˴ϴ�.");
			System.out.println("��ȣ: ");

			Scanner sc22 = new Scanner(System.in);
			int �����ӹ�ȣ���� = sc22.nextInt();

			if (�����ӹ�ȣ���� == 1) {

				user.���� = 1;
				user.�� = 5000;
				user.�� = 10;
				user.����Ȯ�� = 0;

			} else {
				System.out.println("������ �����մϴ�.");
			}


		} else if (user.����Ȯ�� >= 100) { // �й�����2
			System.out.println("");
			System.out.println("���� Ƚ���� ������ ���� ��� �ᱹ ���̸� �������ϴ�. ");
			System.out.println("�Ƹ� ���� ���Ѻ� �λ��� ��� �������� ������ �Ǿ����ϴ�.");
			System.out.println("������ ����˴ϴ�.");
			
			System.out.println();
			System.out.println();
			System.out.println("���ο� ������ �����Ͻðڽ��ϱ�?");
			System.out.println("1. �� -> ����, ��, ��, ����Ȯ���� ��� �ʱ�ȭ �˴ϴ�.");
			System.out.println("2. �ƴϿ� -> ������ ����˴ϴ�.");
			System.out.println("��ȣ: ");

			Scanner sc22 = new Scanner(System.in);
			int �����ӹ�ȣ���� = sc22.nextInt();

			if (�����ӹ�ȣ���� == 1) {

				user.���� = 1;
				user.�� = 5000;
				user.�� = 10;
				user.����Ȯ�� = 0;

			} else {
				System.out.println("������ �����մϴ�.");
			}


		}
	}

	public static void ���Ӽ���޼���() {

		System.out.println(
				" --------------------------------------------------------------------------------------------------------");
		System.out.println(
				" 1. ���Ѻ� ������ ���� ������ ���� ������ ���� 5000������ ������ 1�� 5000������ �޼��ϴ� �����Դϴ�.                                            ");
		System.out.println(" 2. ó���� ������ ���۵Ǹ�  ������ ���� ķ��ī�� ������ �����Ƿ� ����ؾ��ϰ�, ��Ḧ �� ���������� �ؾ��մϴ�              ");
		System.out.println(" 3. ������ �� 4������ �븶��, �޽�����Ÿ��, ��ī��, ������ �ֽ��ϴ�.           ");
		System.out.println(" 4. ������ �Ǹ��� ���� ������� �̿��� ���� �ְ� �ڽ��� ���� �� ���� �ֽ��ϴ�.            ");
		System.out.println(" 5. ������� �̿��ϸ� 30������ ����󿡰� ����մϴ�. ������ ����Ȯ���� ��� 5 �������ϴ�. ");
		System.out.println(" 6. �������� ���� ���� ������ ����Ǹ�, ������ ���� �������� ���׷��̵� �� �� �ֽ��ϴ�.                    ");
		System.out.println(" 7. �մ��� ������ ���л�, ���� ���л�, ������, �����ߵ���, �Ϲ� �մ�, ��Ƽ���� �����Ͽ� �������� �����մϴ�.			      ");
		System.out.println(" 8. �մ��� ������ ������� �̿� �˸��� ���� ��õ���� �� �ֽ��ϴ�.  ");
		System.out.println(" 8. 3������ �Ǿ� ������ 100�̵Ǹ� ������ �Ҹ��Ͽ� ���� Ȯ���� �ѹ� 0���� ���� �� �ֽ��ϴ�.  ");
		System.out.println(" 9. ����ܼӱ� ������ ��ũ�� ������ �ʴ��� ����Ļ縦 �����ϸ鼭 �̾߱⸦ ������ ����Ȯ���� 10���� �� �� �ֽ��ϴ�. ");
		System.out.println(" 10.������ ������ �� 6�ʿ� 1�� ����Ȯ���� �ڵ����� �����մϴ�.  ");
		System.out.println(
				" --------------------------------------------------------------------------------------------------------");

	}

	public static void ������() {

		if (user.�� == 50) {
			System.out.println("");

			
			������������ ������ = new ������������();
			������.run();
			������.finish();
					
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("2������ �Ǿ����ϴ�.");
			System.out.println("���׷��̵� �޴��� ���ø� [��Ʈ]�� �����Ͻ� �� �ֽ��ϴ�.");
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءءءءءءءءء�");

			user.���� += 1;

		} else if (user.�� == 100) {
			System.out.println("");
			
			������������ ������ = new ������������();
			������.run();
			������.finish();
			
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءءءءءءءءء�");
			System.out.println("3������ �Ǿ����ϴ�.");
			System.out.println("���׷��̵� �޴��� ���ø� [�����]�� �����Ͻ� �� �ֽ��ϴ�.");
			System.out.println("�ءءءءءءءءءءءءءءءءءءءءءءءءءءءءءء�");

			user.���� += 1;
		}
	}

}// ��ü����
