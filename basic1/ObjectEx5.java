package basic1;

import java.util.Scanner;

public class ObjectEx5 {
	Scanner scanner=new Scanner(System.in);
	int []i=new int [3];//[][][]
	
	Book m=new Book();//author|price|title|publisher
	
	public void add() {
		System.out.println("Author:");
		m.setAuthor(scanner.next());
		System.out.println("Price:");
		m.setPrice(scanner.nextInt());
		
		System.out.println(m.getAutor()+" "+m.getPrice());
	
	}
	
	public void menu() {
		System.out.println("1.Add 2.List");
		switch (scanner.nextInt()) {
		case 1:	
			add();
			break;
		case 2:
			break;
		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		ObjectEx5 o=new ObjectEx5();
		o.menu();
	}
}




