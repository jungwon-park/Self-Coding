package basic2;

public class b {
	private int b;
	private a a;
	public b() {
	}
	public b(int b, a a) {
		this.b=b;
		this.a=a;
	}
	public void setb(int b , a a) {
		this.b=b;
	}
	public int getb() {
		return this.b;
	}
	public void seta(a a) {
		this.a=a;
	}
	public a geta() {
		return this.a;
	}
	public static void main(String[] args) {
		Node node = new Node(1);
		System.out.println(node.getdata());
	}
}
