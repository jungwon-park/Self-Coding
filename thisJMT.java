
public class thisJMT {
	private String apple;
	private String mango;
	private String lemon;
		
	public void setapple(String apple){
		this.apple = apple;
	}
	public String getapple() {
		return apple;
	}
	public void setmango(String mango) {
		this.mango = mango;
	}
	public String getmango() {
		return mango;
	}
	public void setlemon(String lemon) {
		this.lemon = lemon;
	}
	public String getlemon() {
		return lemon;
	}
	public thisJMT() {
	}
	public thisJMT(String apple) {
		this.apple = apple;
	}
	public thisJMT(String apple, String mango) {
		this.apple = apple;
		this.mango = mango;
	}
	public thisJMT(String apple, String mango, String lemon) {
		super();
		this.apple = apple;
		this.mango = mango;
		this.lemon = lemon;
	}
	@Override
	public String toString() {
		return " [apple=" + apple + ", mango=" + mango + ", lemon=" + lemon + "]";
	}
//	public static void main(String[] args) {
//		thisJMT j = new thisJMT("apple","mango","lemon");
//			System.out.println(j.toString());
//	}
}
