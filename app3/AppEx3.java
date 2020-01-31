package sist.com.obj.app3;

import java.util.ArrayList;

public class AppEx3 {
	
	public void makerEx1() {
		String[] temp = {"java","oop","oracle","jsp","script"};
		ArrayList<String>list = new ArrayList<String>();
		for (int i = 0; i < temp.length; i++) {
			list.add(i, temp[i]);
		}
		System.out.println(list.toString());
		list.clear();
		System.out.println(list.toString());
	}
	public static void main(String[] args) {
		AppEx3 a = new AppEx3();
		a.makerEx1();
	}
}
