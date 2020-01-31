package sist.com.obj.app3;

import java.io.BufferedInputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import num1.calendar;

public class AppEx6 {
	int index;
	Scanner sc;
	private ArrayList<Board>list;
	public AppEx6() {
		try {
			//sc = new Scanner(new File("d:\\hello.java"));
			list = new ArrayList<Board>();
			sc = new Scanner(System.in);
			//System.out.println(System.in);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public  void addBoard() {
		Board board = new Board();
		do {
			System.out.println("id:");
			board.setId(sc.next());
		}while(check(board.getId()));
		System.out.println("writer:");
		board.setWriter(sc.next().trim());
		System.out.println("title:");
		board.setTitle(sc.next().trim());
		System.out.println("contents:");
		board.setContents(sc.next().trim());
		String regdate="";
		Calendar calender = Calendar.getInstance();
		regdate = regdate.concat(calender.get(Calendar.YEAR)+"/"+(calender.get(Calendar.MONTH)+1)+"/"+(calender.get(Calendar.DATE)));
		board.setRegdate(regdate);
		System.out.println(board);
		list.add(board);
	}
	public boolean check(String x) {
		for (int i = 0; i < list.size(); i++) {
			Board b = list.get(i);
			if(b.getId().equals(x))return true;
		}
		return false;
	}
	public int search(String id) {
		for (int i = 0; i < list.size(); i++) {
			Board b = list.get(i);
			if(b.getId().trim().equals(id))return i;
		}
		return -1;
	}
	public Board getBoard(int index) {
		return list.get(index);
	}
	public void boardlist() {
		for(Board b:list) {
			System.out.println(b);
		}
	}
	public void boardInfo() {
		System.out.println("searchid:");
		int index = search(sc.next().trim());
		if(index==-1)getBoard(index).setHit(getBoard(index).getHit()+1);
		System.out.println(index==-1?"no search":getBoard(index));
	}
	public void searchItem() {
		System.out.println("SearchID:");
		index=search(sc.next().trim());
	}
	public void delete() {
		searchItem();
		System.out.println(index==-1?"no search":list.remove(index).getId());
	}
	public void modifyBoard() {
		searchItem();
		if(index == -1) {
			System.out.println("no search");
			return;
		}
		Board b = getBoard(index);
		System.out.println("modify writer");
		b.setWriter(sc.next().trim());
		System.out.println("modufy title");
		b.setTitle(sc.next().trim());
		System.out.println("modify contents");
		b.setContents(sc.next().trim());
		
		System.out.println("success");
	}
	public void print() {
		/*while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}*/
		System.out.println("1.add 2.list 3.Info 4.delete 5.modify");
		while(true) {
			switch (sc.nextInt()) {
			case 1:
				addBoard();
				break;
			case 2:
				boardlist();
				break;
			case 3:
				boardInfo();
				break;
			case 4:
				delete();
				break;
			case 5:
				break;
			default:
				break;
			}
		}
	}
	public static void main(String[] args) {
		new AppEx6().print();
		Calendar calendar=Calendar.getInstance();
		//System.out.println(calendar.get(Calendar.YEAR));
		//System.out.println(calendar.get(Calendar.MONTH)+1);
		//System.out.println(calendar.get(Calendar.DATE));
	}
}
