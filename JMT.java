import java.util.Scanner;

public class JMT {
	Scanner sc = new Scanner(System.in);
	thisJMT thisJMT1 = new thisJMT(); 
	int apple_cnt=0 , mango_cnt=0, lemon_cnt=0 ;
	public void apple() {
		thisJMT1.setapple("1000");
		System.out.println("사과맛을 선택하셨습니다. 금액은 1000원 입니다.");
		System.out.println("내실 금액을 입력하세요:");
		int c_money = sc.nextInt();
		if(Integer.parseInt(thisJMT1.getapple()) < c_money) {
			System.out.println("잔돈은" + (c_money - Integer.parseInt(thisJMT1.getapple()))+"입니다");
			apple_cnt++;
		}else if(c_money == Integer.parseInt(thisJMT1.getapple())){
			System.out.println("거스름돈 : 0원 입니다.");
			apple_cnt++;
		}else {
			System.out.println("금액이" + (Integer.parseInt(thisJMT1.getapple()) - c_money)+ "원 부족합니다.");
		}
	}
	public void mango() {
		thisJMT1.setmango("1500");
		System.out.println("망고맛을 선택하셨습니다. 금액은 1500원 입니다.");
		System.out.println("내실 금액을 입력하세요:");
		int c_money = sc.nextInt();
		if(Integer.parseInt(thisJMT1.getmango()) < c_money) {
			System.out.println("잔돈은" + (c_money - Integer.parseInt(thisJMT1.getmango()))+"입니다");
			mango_cnt++;
		}else if(c_money == Integer.parseInt(thisJMT1.getmango())){
			System.out.println("거스름돈 : 0원 입니다.");
			mango_cnt++;
		}else {
			System.out.println("금액이" + (Integer.parseInt(thisJMT1.getmango()) - c_money)+ "원 부족합니다.");
		}
	}
	public void lemon() {
		thisJMT1.setlemon("2000");
		System.out.println("레몬맛을 선택하셨습니다. 금액은 2000원 입니다.");
		System.out.println("내실 금액을 입력하세요:");
		int c_money = sc.nextInt();
		if(Integer.parseInt(thisJMT1.getlemon()) < c_money) {
			System.out.println("잔돈은" + (c_money - Integer.parseInt(thisJMT1.getlemon()))+"입니다");
			lemon_cnt++;
		}else if(c_money == Integer.parseInt(thisJMT1.getlemon())){
			System.out.println("거스름돈 : 0원 입니다.");
			lemon_cnt++;
		}else {
			System.out.println("금액이" + (Integer.parseInt(thisJMT1.getlemon()) - c_money)+ "원 부족합니다.");
		}
	}
	
	public void list() {
		thisJMT1 = new thisJMT("1000", "1500", "2000");
		//System.out.println(thisJMT1);
		System.out.printf("구매한 음료수 개수: \napple\tmango\tlemon \n"+apple_cnt + "\t"+mango_cnt + "\t"+lemon_cnt);
		System.out.println();
	}
	public void menu() {
		while(true) {
		System.out.println("음료수자판기");
		System.out.println("1.사과맛 2.망고맛 3.레몬맛 4.리스트");
		System.out.println("번호를 입력하세요: ");
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
