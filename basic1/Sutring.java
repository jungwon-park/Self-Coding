package basic1;
public class Sutring {
	char []value;	
	public Sutring() {		
	}
	public Sutring(char []value) {
		this.value=value;
	}
	public int codePointAt(int index) {
		return value[index];
	}
	public char getChar(int index) {
		return value[index];
	}
	public static void main(String[] args) {
		char []value1= {'a','b','c'};		
		char []value2= {'d','e','f'};		
		Sutring s1=new Sutring(value1);//value a b c
		Sutring s2=new Sutring(value2);//value d e f
		System.out.println(s2.getChar(0));
		System.out.println(s2.codePointAt(0));
		
	}
}
