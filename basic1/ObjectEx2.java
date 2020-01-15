package basic1;

public class ObjectEx2 {
	
	public Point getData(int x,int y) {
		x++;
		y++;
		return new Point(x, y);
	}		
	public static void main(String[] args) {
		ObjectEx2 o=new ObjectEx2();
		Point p=o.getData(10,20);
		System.out.println(p.getX()+" "+p.getY());		
		
		/*Point p1=new Point();//x|y
		p1.x=100;
		System.out.println(p1.x);
		p1.setX(27);
		System.out.println(p1.getX());*/
	}

}
