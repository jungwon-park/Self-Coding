package sist.com.core6;

public class objectex1 {
	
	public void makerex1() {
		String s1 = new String("abc"); //value[a][b][c]
		System.out.println(s1.toString()); 
		char[] value = {'a','b','c'};
		System.out.println(value);
		System.out.println(s1.contains("d")); 
		StringBuffer a = new StringBuffer("abc");
		StringBuffer aa = a;
		System.out.println(a==aa);
		
		System.out.println(a.append("aq"));
		System.out.println(a.append("aq"));
		//System.out.println(s1.append("aa")); // String -> final | StringBuffer -> implements
		System.out.println(s1.charAt(0));
	}
	public void makerex2() {
		StringBuffer sb = new StringBuffer("1234");
		String str = new String("abc");
//		System.out.println(sb.length());
//		System.out.println(sb.append("abc"));
//		System.out.println(sb.capacity());
		System.out.println(String.valueOf(str));
		System.out.println(str.toString());
	}
	
	public static void main(String[] args) {
		objectex1 o = new objectex1();
		o.makerex2();
	}
}