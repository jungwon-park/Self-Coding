package sist.com.core1;

public class subclass extends Superclass{
	private int subData;
	
	public subclass(int superdata,int subdat) {
		//this.SuperData = 500;
		super(superdata);
		this.subData=subData;
	}
	public String toString() {
		return super.tostring()+" "+subData+"";
	}
}
