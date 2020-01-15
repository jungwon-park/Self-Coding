package basic1;
public class ObjectEx3 {//Å¬·¡½º 
	Point point=null;
	
	
	public ObjectEx3() {		
	}
	public ObjectEx3(Point point) {	
		this.point=point; 
	}
	public void action() {
		System.out.println(point.getX());
	}
	
	public static void main(String[] args) {
		ObjectEx3 o1=new ObjectEx3(new Point(1,5));//x|y
		o1.action();
		
		
	}

}
