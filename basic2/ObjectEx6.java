package basic2;

public class ObjectEx6 {
	private int num;
	static int sv;
	private int local;
	public ObjectEx6() {
		//num = 99;
	}
	public void setnum(int num) {
		this.num = num;
	}
	public int getnum() {
		return this.num;
	}
	public void increment() {
		int local=0;
		local++;
		num++;
		sv++;
		System.out.println("local="+local+" num="+num+" sv="+sv+"]");
	}
	@Override
	public String toString() {
		return "local="+local+" num="+num+" sv="+sv+"]";
	}
	public static void setsv(int sv) {
		ObjectEx6.sv= sv;
	}
	public static int getsv() {
		return ObjectEx6.sv;
	}
	public static void main(String[] args) {
		ObjectEx6 o1 = new ObjectEx6(); //num
		ObjectEx6 o2 = new ObjectEx6(); 
		ObjectEx6 o3 = new ObjectEx6(); 
		
//		o.setsv(20);
//		o.setnum(100);
//		o2.setnum(150);
//		o2.setsv(10);
		o1.increment();
		o1.increment();
		o1.increment();
		System.out.println("-------------------");
		o2.increment();
		o2.increment();
		o2.increment();
		System.out.println("-------------------");
		o3.increment();
		o3.increment();
		o3.increment();
		

	}
}
