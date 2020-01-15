package basic2;

public class c {
	private int c;
	private b b;
	public c() {
	}
	public c(int c) {
		this.c = c;
	}
	public c(int c, b b) {
		this.c = c;
		this.b = b;
	}
	public void setc(int c) {
		this.c = c;
	}
	public int getc() {
		return this.c;
	}
	public void setb(b b) {
		this.b = b;
	}
	public b getb() {
		return this.b;
	}
}
