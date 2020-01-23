package sist.com.exception;
//RunTime, compile 
public class ExceptionEx1 implements Cloneable{
	public void arrayIndexOutOfBoundsException() {
		int []m=new int [5];//[][][][][]
		for(int i=0;i<=5;i++) {
			try {
				if(i==0)return;
			System.out.println(m[i]);
			Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println("Catch");
			}catch(Exception v) {
				System.out.println("Exception");
			}finally {
				System.out.println("finally");
			}
		}
		/*while(true) {
			System.out.println("지혜짱");
		}*/
		//System.out.println("슬기짱");	//무한로프로 인한 접근불가
	}
	public void StringIndexOutOfBoundsException(String data) {
		try {
		System.out.println(data.substring(data.indexOf('c')+2));
	}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("catch");
			e.printStackTrace();
		}
	}
	public String getParameter(int data) {
		switch (data) {
		case 1:
			return "딸기";
		case 2:
			return "수박";
		case 3:
			return "사과";
		default:
			return null;
		}
	}
	public void numberFormatException(String data) {
		//System.out.println(Integer.parseInt(data.substring(1,2)) + Integer.parseInt(data.substring(5,6)));
		String rs = getParameter(2);
		System.out.println(Integer.parseInt(rs));
	}
	public void nullpointException() {
		System.out.println(getParameter(4).charAt(0));
	}
	public void nullpointException2(String data) {
		if(data.startsWith("[STONE]")) {
			System.out.println("stone");
			System.out.println(data.substring(data.indexOf("]")+1).split(",")[0]);
		}else if(data.startsWith("[MSG]")) {
			System.out.println("MSG");
		}
	}
	public void cloneNotSupportedException() {
		try {
			Object o=this.clone();
			System.out.println(o);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void interruptedException() {
		for (int i = 1; i <=100; i++) {
			try {
				Thread.sleep(100);				
				if(i%8==0)System.out.println();
				if(i==10) {
					throw new InterruptedException();
				}
				System.out.printf("%5d",i);
			}catch(InterruptedException e) {
				// TODO: handle exception
				System.out.println("InterruptedException catch");
				e.printStackTrace();
				return;
				
			}
		}
		
	}
	public static void main(String[] args) {
		ExceptionEx1 e=new ExceptionEx1();
		//e.arrayIndexOutOfBoundsException();
		//e.StringIndexOutOfBoundsException("F101A3c");
		//e.numberFormatException("A5b7c9");
		//e.nullpointException();
		//e.numberFormatException("[MSG]5#안녕");
		//e.numberFormatException("[DROP]7#슬기");
		//e.nullpointException2("[STONE]X = 100, Y=200");
		//e.cloneNotSupportedException();
		e.interruptedException();
	}
}
