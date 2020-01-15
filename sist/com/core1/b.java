package sist.com.core1;

public class b extends a{
	private String asub;
	public b(String asub,String data) {
		super(data);
		this.asub=asub;
	
	}
	public String toString() {
		return super.toString()+" "+asub;
	}
}
