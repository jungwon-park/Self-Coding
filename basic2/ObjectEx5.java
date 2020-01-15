package basic2;

//»ý¼ºÀÚ, this, instance, static, final 
public class ObjectEx5 {
	private int data =200;
	public ObjectEx5() {
		data = 500;
	}
	static {
		data1 = 100;
	}
	
	private static int data1 = 400;

	@Override
	public String toString() {
		return "ObjectEx5 [data=" + data + " " + data1+"]";
	}


	public static void main(String[] args) {
		ObjectEx5 o = new ObjectEx5();
		System.out.println(o);
	}

}
