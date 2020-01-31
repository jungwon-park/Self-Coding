package sist.com.obj.app3;

import java.util.ArrayList;


public class AppEx7 {
	
	ArrayList<Board>list = new ArrayList<Board>();
	public void execute1() {
		Board b1 = new Board();
		Board b2 = new Board();
		
		list.add(b1);
		list.add(null);
		list.add(b2);
		System.out.println(list.equals(this.list));
		System.out.println(list.equals(list));
		System.out.println(equals(this));
		System.out.println(equals(this.list));
		
	}
	public void execute2() {
		System.out.println(equals(this));
	}
	public static void main(String[] args) {
		AppEx7 a = new AppEx7();
		a.execute1();
	}
}
