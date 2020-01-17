package sist.com.obj.app2;

import java.util.ArrayList;
import java.util.Vector;

public class obj3 {
	public void exmaker1() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list);
		
		Vector<String>vector = new Vector<>();
		vector.add("a");
		vector.add("b");
		vector.add("c");
		vector.remove("a");
		System.out.println(vector);
		System.out.println(vector.contains("b"));
	}
	public static void main(String[] args) {
		obj3 o = new obj3();
		o.exmaker1();
	}
}
