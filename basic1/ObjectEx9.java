package basic1;

import java.util.Scanner;

public class ObjectEx9 {
	Student[]students;
	Scanner scanner=new Scanner(System.in);
	int top;
	public ObjectEx9(int a) {
		students=new Student[5];
	}
	public void add() {
		System.out.println("Name:");
		students[top].setName(scanner.next());
		System.out.println("Kor:");
		students[top].setKor(scanner.nextInt());
		System.out.println("Eng:");
		students[top].setEng(scanner.nextInt());
		System.out.println("Mat:");
		students[top].setMat(scanner.nextInt());		
		students[top].setAvg(students[top].average(students[top].total(students[top].getKor(),students[top].getEng(), students[top].getMat())));
		students[top].setGrade(students[top].getGradeAction(students[top].getAvg()));
		top++;
		
	}
	public void rank() {
		for (int i = 0; i < students.length; i++) {
			students[i].setRank(1);
			for (int j = 0; j < students.length; j++) {
				if(students[i].getAvg()< students[j].getAvg()) {
					students[i].setRank(students[i].getRank()+1);
				}
			}
		}
		
	}
	
	public void list() {
		rank();
	}
	
	public static void main(String[] args) {
		new ObjectEx1();
		
		
	}
	
	

}

