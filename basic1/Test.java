package basic1;

public class Test {	
	public static void main(String[] args) {
		String []str={"C","A","B","F"};
		String []str2= {"����ǥ","���¿�","������"};
		System.out.println(str[1].compareTo("A"));
		System.out.println(str2[1].charAt(0)-str2[1].charAt(0));
		System.out.println(str[0].charAt(0)-str[1].charAt(0));
	}

}
