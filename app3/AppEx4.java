package sist.com.obj.app3;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class AppEx4 {
	public void execute1() {
		/*new AbstractList<String>() {
			@Override
			public String get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}
		};*/
		
		/*ArrayList<String>list=new ArrayList<String>();
		list.add("A");
		list.size();
		
		Vector<String>vector=new Vector<String>();//elementsData[A,B,C,D,E]
		Vector<String>vector2=new Vector<String>();//elementsData[A,B,C,D,E]
		
		String[]temp= {"A","B","C","D","E"};
		for(int i=0;i<5;i++) {
			vector.add(temp[i]);
			vector2.add(String.valueOf((char)(temp[i].charAt(0)+1)));
		}
		vector.size();*/
		//System.out.println(vector);
		//System.out.println(vector2);
		//System.out.println(vector.capacity());
		
		/*Iterator<String>it=vector.iterator();
		System.out.println(vector);
		System.out.println(it.next());
		it.remove();
		System.out.println(vector);
		System.out.println(it.next());*/
		
		/*for(;it.hasNext();) {
			System.out.println(it.next());
		}*/
		
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		intlist.add(10);
		intlist.add(20);
		intlist.add(30);
		intlist.add(3, 10);
		intlist.size();
		System.out.println(intlist);
		
		Vector<Integer>vector = new Vector<Integer>();
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(3, 10);
		vector.size();
		System.out.println(vector);
		
	}	
	public static void main(String[] args) {
		AppEx4 app=new AppEx4();
		app.execute1();
	}
}
