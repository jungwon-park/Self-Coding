package sist.com.obj.app3;

import java.nio.IntBuffer;

import sist.com.core5.interfaceabstract;

public class AppEx1 {
	public void stringEx1() {
		/*String s1 = "abc";
		String s2 = "abc";
		s2+="def";
		System.out.println(s1 == s2);
		*/
		String s3 = new String("abc");
		String s4 = new String("abc");
		System.out.println(s3 == s4);
		System.out.println(s3.hashCode()==s4.hashCode());
	}
	public void stringEx3() {
		String s1 = "abc";
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
	}
	public void stringEx4() {
		
	}
	public static void main(String[] args) {
		AppEx1 a = new AppEx1();
		a.stringEx4();
	}
}
