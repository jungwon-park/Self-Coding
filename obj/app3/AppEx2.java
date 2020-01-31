package sist.com.obj.app3;

import java.util.ArrayList;
import java.util.Iterator;

import sist.com.core1.object;

public class AppEx2 {
		
	public void makerEx1() {
		CharSequence cs = new String("abc"); //String (CharSequence)
		cs.charAt(0);
		cs = new StringBuffer("abc");//StringBuffer ( CharSequence)
		cs.charAt(0);
		((StringBuffer)cs).equals("");
		if(cs instanceof StringBuffer) {
			StringBuffer new_name = (StringBuffer)cs;
		}
		if(cs instanceof String) {
			String new_name = (String) cs;
		}
		if(cs instanceof StringBuilder) {
			StringBuilder new_name = (StringBuilder) cs;
		}
	}
	public void makerEx2() {
		String str1 = "abc";
		//System.out.println(str1.codePointAt(0));
		str1+="def";
		/*System.out.println(str1);
		str1.codePointBefore(6);
		System.out.println(str1.codePoints().sum());*/
//		System.out.println(str1.compareTo("b"));
//		System.out.println(str1.contains("ab"));	//순서대로입력될경우만 true
//		System.out.println(str1.startsWith("bc"));	//시작이 맞아야만 true
//		System.out.println(str1.endsWith("abcdef"));		//끝 문자 or 순서대로 입력이 같으면 true
		char[] imsi = new char[10];
		str1.getChars(0, 2, imsi,0);
		System.out.println(imsi[1]);
	}
	public void makerEx3() {
		ArrayList<String>list1 = new ArrayList<String>();
		list1.add("A");
		list1.add("b");
		list1.add("C");
		System.out.println(list1);
		/*for (int i = 0; i < list1.size(); i++) {
		System.out.println(list1.get(i));	
		}
		*/
		/*for(String s:list1) {
			System.out.println(s);
		}*/
		Iterator<String>it = list1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public void makerEx4() {
		ArrayList<Double>list = new ArrayList<Double>();
		for (int i = 0; i < 100; i++) {
			list.add(10.2);
		}
		System.out.println(list.size());
	}
	public void makerEx5() {
		ArrayList<Integer>list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		Iterator<Integer>it = list.iterator();
		/*for (Integer o : list) {
			System.out.println(o);
		}*/
		if(it.hasNext()) {
			System.out.println(it.next());
			System.out.println(it.next());
			System.out.println(it.next());
		}
		
	}
	public static void main(String[] args) {
		AppEx2 a = new AppEx2();
		a.makerEx5();
	}
}
