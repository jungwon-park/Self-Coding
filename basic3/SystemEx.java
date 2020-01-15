package basic3;
public class SystemEx {
	private int data;
	public static final PrintStremEx out;
	
	static {
		out=new PrintStremEx();
	}
	public SystemEx() {		
	}
	/*public SystemEx(PrintStremEx out) {
		this.out=out;
	}*/
	public void fileCheck() {
		System.out.println("FileCheck");
	}
	public void dataValueCheck() {
		System.out.println("dataValueCheck");
	}

}
