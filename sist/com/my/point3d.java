package sist.com.my;

public class point3d extends point{
	int z= 30;
	point3d(){
		this(100,200,300);
	}
	point3d(int x,int y, int z){
		super(x,y);
		this.z =z;
	}
}	
