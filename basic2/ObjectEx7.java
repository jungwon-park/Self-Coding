package basic2;

public class ObjectEx7 {
	private int instance;
	private static String msg;
	private static int cnt;
	public static int sayMessage() {
		System.out.println("�ȳ�");
		return cnt;
	}
	public static String says() {
		System.out.println("����");
		return msg;
	}
	public static void main(String[] args) {
		ObjectEx7.sayMessage();
		ObjectEx7.says();
		
	}
}
