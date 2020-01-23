package sist.com.exception;

public class ExceptionEx2 {
	public void arithmeticException() {
		int[] m = new int[5];
		for (int i = 0; i < m.length; i++) {
			m[i] = (int)(100/Math.random()*10);
		}
	for(int j:m) {
		System.out.printf("%5d",j);
	}
	}
	public void arithmeticException2(String data) {
		int rs = Integer.parseInt(data.substring(1,3)) / Integer.parseInt(data.substring(5,6));
		System.out.println(rs);
	}
	public static void main(String[] args) {
		ExceptionEx2 e = new ExceptionEx2();
		//e.arithmeticException();
		e.arithmeticException2("F12C30");
	}
}
