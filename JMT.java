import java.util.Scanner;

public class JMT {
	Scanner sc = new Scanner(System.in);
	thisJMT thisJMT1 = new thisJMT(); 
	int apple_cnt=0 , mango_cnt=0, lemon_cnt=0 ;
	public void apple() {
		thisJMT1.setapple("1000");
		System.out.println("������� �����ϼ̽��ϴ�. �ݾ��� 1000�� �Դϴ�.");
		System.out.println("���� �ݾ��� �Է��ϼ���:");
		int c_money = sc.nextInt();
		if(Integer.parseInt(thisJMT1.getapple()) < c_money) {
			System.out.println("�ܵ���" + (c_money - Integer.parseInt(thisJMT1.getapple()))+"�Դϴ�");
			apple_cnt++;
		}else if(c_money == Integer.parseInt(thisJMT1.getapple())){
			System.out.println("�Ž����� : 0�� �Դϴ�.");
			apple_cnt++;
		}else {
			System.out.println("�ݾ���" + (Integer.parseInt(thisJMT1.getapple()) - c_money)+ "�� �����մϴ�.");
		}
	}
	public void mango() {
		thisJMT1.setmango("1500");
		System.out.println("������� �����ϼ̽��ϴ�. �ݾ��� 1500�� �Դϴ�.");
		System.out.println("���� �ݾ��� �Է��ϼ���:");
		int c_money = sc.nextInt();
		if(Integer.parseInt(thisJMT1.getmango()) < c_money) {
			System.out.println("�ܵ���" + (c_money - Integer.parseInt(thisJMT1.getmango()))+"�Դϴ�");
			mango_cnt++;
		}else if(c_money == Integer.parseInt(thisJMT1.getmango())){
			System.out.println("�Ž����� : 0�� �Դϴ�.");
			mango_cnt++;
		}else {
			System.out.println("�ݾ���" + (Integer.parseInt(thisJMT1.getmango()) - c_money)+ "�� �����մϴ�.");
		}
	}
	public void lemon() {
		thisJMT1.setlemon("2000");
		System.out.println("������� �����ϼ̽��ϴ�. �ݾ��� 2000�� �Դϴ�.");
		System.out.println("���� �ݾ��� �Է��ϼ���:");
		int c_money = sc.nextInt();
		if(Integer.parseInt(thisJMT1.getlemon()) < c_money) {
			System.out.println("�ܵ���" + (c_money - Integer.parseInt(thisJMT1.getlemon()))+"�Դϴ�");
			lemon_cnt++;
		}else if(c_money == Integer.parseInt(thisJMT1.getlemon())){
			System.out.println("�Ž����� : 0�� �Դϴ�.");
			lemon_cnt++;
		}else {
			System.out.println("�ݾ���" + (Integer.parseInt(thisJMT1.getlemon()) - c_money)+ "�� �����մϴ�.");
		}
	}
	
	public void list() {
		thisJMT1 = new thisJMT("1000", "1500", "2000");
		//System.out.println(thisJMT1);
		System.out.printf("������ ����� ����: \napple\tmango\tlemon \n"+apple_cnt + "\t"+mango_cnt + "\t"+lemon_cnt);
		System.out.println();
	}
	public void menu() {
		while(true) {
		System.out.println("��������Ǳ�");
		System.out.println("1.����� 2.����� 3.����� 4.����Ʈ");
		System.out.println("��ȣ�� �Է��ϼ���: ");
		int bunho = sc.nextInt();
		if(bunho == 1) {
			apple();
		}
		else if(bunho == 2) {
			mango();
		}
		else if(bunho == 3) {
			lemon();
		}
		else if(bunho == 4) {
			list();
		}
	}
	}
	public String toString() {
		return null;
	}
	public static void main(String[] args) {
		JMT j = new JMT();
		j.menu();
	}
}
