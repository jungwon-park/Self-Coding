package basic1;
public class Student {
	private String name;
	private int kor,eng,mat;
	private double avg;
	private char grade;
	private int rank;
	
	
	public Student() {
		super();
	}


	public Student(String name, int kor, int eng, int mat, double avg, char grade, int rank) {		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.avg = avg;
		this.grade = grade;
		this.rank = rank;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMat() {
		return mat;
	}


	public void setMat(int mat) {
		this.mat = mat;
	}


	public double getAvg() {
		return avg;
	}


	public void setAvg(double avg) {
		this.avg = avg;
	}


	public char getGrade() {
		return grade;
	}


	public void setGrade(char grade) {
		this.grade = grade;
	}


	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}
	public int total(int kor,int eng, int mat) {
		return (kor+eng+mat);
	}
	public double average(int data) {
		return data/3.;
	}
	public char getGradeAction(double avg) {
		switch ((int)(avg/10)) {
		case 10:
		case 9:
			return 'A';
		case 8:
			return 'B';
		case 7:
			return 'C';
		case 6:
			return 'D';

		default:
			return 'F';
		}
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", avg=" + avg + ", grade="
				+ grade + ", rank=" + rank + "]";
	}
	
	

}
