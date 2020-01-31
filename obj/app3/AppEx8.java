package sist.com.obj.app3;

import java.util.Vector;

public class AppEx8 {
	public void execute1() {
		Vector<String>vector = new Vector<String>();
		vector.addElement("ÁØ¼ö");
		vector.addElement("½Â¿ø");
		System.out.println(vector.contains("½Â¿ø"));
	}
	public void execute2() {
		Vector<String>v = new Vector<String>();
		v.add("1");
		v.add("2");
		System.out.println(v.contains("1"));
		System.out.println(v.elementAt(1));
		v.insertElementAt("good",2);
		System.out.println(v);
		System.out.println(v.lastIndexOf(v));
	}
	public static void main(String[] args) {
		AppEx8 a = new AppEx8();
		//a.execute1();
		a.execute2();
	}
}
