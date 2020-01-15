package basic1;

public class Point {
	 private int x;
	 int y;
	 double width;
	 double height;
	 
	public Point() {
		
	}
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void setX(int x) {
		if(x>=0 && x<=100)
			this.x=x;
		
	}
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public static void main(String[] args) {
		//new Point(0,50).x=500;//x[500]|y
       // System.out.println(new Point(0,50).x);	
		Point p1=new Point(20,100);//x|y 20 100
		Point p2=new Point(30,500);//x|y 30 500 
		p1.setX(500);
		p1.x=90009;
		System.out.println(p1.getX());
		
	}

}




