package sist.com.obj.app3;

import java.util.ArrayList;

public class AppEx5 {
	public void execute1() {
		ArrayList<String>list = new ArrayList<String>();
		list.add("a");
		list.add(0,"a");
		list.add(0,"b");
		list.add(0,"c");
		System.out.println(list);
	}
	public void execute2() {
		ArrayList<Double>list = new ArrayList<Double>();
		ArrayList<Double>list2 = new ArrayList<Double>();
		
		list.add(10.1);
		list.add(10.2);
		list.add(10.3);
		list2.add(110.4);
		list2.add(110.5);
		list2.add(110.6);
		list.addAll(list2);
		list.toArray();
		System.out.println(list);
		System.out.println(list2);
	}
	public static void main(String[] args) {
		AppEx5 a = new AppEx5();
		a.execute2();
	}
}
