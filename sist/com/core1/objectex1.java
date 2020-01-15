package sist.com.core1;

public class objectex1 {
	private String data;
	
	public objectex1() {
	}
	public String toString() {
		return data;
	}
	public void objectexMethod() {
		object obj = new object();
		System.out.println(obj.equals(new object()));
		System.out.println(obj.equals(obj));
		System.out.println(new Object() == new object());
		System.out.println(new object() == obj);
		
		System.out.println("---------------");
		
		Object obj2 = new String("abc");
		System.out.println(obj2.equals(new String("abc")));
		System.out.println(new Object().equals(obj2));
		System.out.println(new object().equals(new object()));
		System.out.println(obj.equals(obj2));
		System.out.println(obj2.toString());
		System.out.println(String.valueOf(obj2));
	}
	
	
	public static void main(String[] args) {
//		objectex1 o = new objectex1();
//		System.out.println(o.toString());
//		object o = new object();
//		System.out.println(o.toString());
		objectex1 o = new objectex1();
		o.objectexMethod();
	}
}
