package sist.com.core1;

public class numberex {
	private Number number;
	public numberex(Number number) {
		this.number = number;
	}
	public void checktype() {
		if(this.number instanceof Double) {
			System.out.println("double");
		}
		if(this.number instanceof Long) {
			System.out.println("Long");
		}
		if(this.number instanceof Integer) {
			System.out.println("Integer");
		}
	}
	public static void main(String[] args) {
		numberex n1 = new numberex(10.2);
		numberex n2 = new numberex(10L);
		numberex n3 = new numberex(10);
		n3.checktype();
	}
}
