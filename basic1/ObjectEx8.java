package basic1;

import java.util.Scanner;

public class ObjectEx8 {
	Person[] person;
	Scanner scanner = new Scanner(System.in);
    int top;
    public void init(int top) {
    	 for (int i = top; i < person.length; i++) {
 			person[i]=new Person();
 		}
    }
	public ObjectEx8() {// [][][][][]
		person = new Person[5];
		init(0);
	   
	}
	public ObjectEx8(int len) {
		person = new Person[len];
		init(0);
	}
	public boolean isFull() {
		return top==person.length;
	}
	public void increment() {
		Person []imsi=new Person[person.length*2];
		System.arraycopy(person, 0, imsi, 0, person.length);
		person=imsi;
		init(top);
	}
	public void add() {	
		if(isFull())increment();
		System.out.println("Name:");
		person[top].setName(scanner.next());
		System.out.println("Age:");
		person[top].setAge(scanner.nextInt());
		System.out.println("Height:");
		person[top].setHeight(scanner.nextDouble());
		System.out.println("Weight:");
		person[top].setWeight(scanner.nextDouble());
		top++;
	}
	public void list() {
		/*for(Person p:person) {
			System.out.println(p);
		}*/
		System.out.println("************List***************");
		
		System.out.printf("%-9s%-9s%-9s%-9s\n","Name","Age","Height","Weight");
		System.out.println("*******************************");
		for(int i=0;i<top;i++) {
			System.out.printf("%-9s%-9d%-9.0f%-9.0f\n",person[i].getName(),person[i].getAge(),person[i].getHeight(),person[i].getWeight());
			System.out.println("--------------------------------");
		}
		
	}
	public int search(String data) {
		for (int i = 0; i < person.length; i++) {
			if(person[i].getName().equals(data)) {
				return i;
			}//if			
		}//for
		return -1;
	}
	public Person getPerson(int index) {
		return person[index];
	}
	public void personInfo() {
		System.out.println("SearchName:");
		int index=search(scanner.next().trim());
		System.out.println(index==-1?"NotFoundData":getPerson(index));
	}
	public void swap(Person[]person,int i,int j) {
		Person imsi=null;
		imsi=person[i];
		person[i]=person[j];
		person[j]=imsi;
	}
	public void sort(int attr,int order) {
		
		for (int i = 0; i < top-1; i++) {
			for (int j = i+1; j < top; j++) {
				if(attr==1) {
					if(order==1) {
					if(person[i].getName().charAt(0) <person[j].getName().charAt(0)) {
						swap(person, i, j);
					  }
					}else {
						if(person[i].getName().charAt(0) >person[j].getName().charAt(0)) {
							swap(person, i, j);
						  }
					}
				}
				
				
				
				if(attr==2) {
					if(order==1) {
					if(person[i].getAge()< person[j].getAge()) {
						swap(person, i, j);
					  }
					}else {
						if(person[i].getAge()> person[j].getAge()) {
							swap(person, i, j);
						  }
					}
				}//
			}
		}
		
	}
	public void sortOrder(int attr) {
		System.out.println("1.DESC 2.ASC");
		switch (scanner.nextInt()) {
		case 1:	
			sort(attr, 1);
			break;
		case 2:
			sort(attr, 2);
			break;

		default:
			break;
		}
	}
	public void sortManager() {
		System.out.println("1.Name 2.Age 3.Height");
		switch (scanner.nextInt()) {
		case 1:	
			sortOrder(1);
			break;
		case 2:
			sortOrder(2);
			break;
		case 3:
			sortOrder(3);
			break;
		default:
			break;
		}
		
		
	}
	public void menu() {
		
		while (true) {
			System.out.println("1.Add 2.List 3.Info 4.Sort");
			switch (scanner.nextInt()) {
			case 1:
				add();
				list();
				break;
			case 2:
				list();
				break;
			case 3:
				personInfo();
				break;
			case 4:
				sortManager();
			default:
				break;
			}
		}

	}

	public static void main(String[] args) {
		ObjectEx8 o = new ObjectEx8();
		o.menu();

	}

}
