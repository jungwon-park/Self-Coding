package basic2;

public class ObjectEx2 {
	private final static  int DATA=1000;
	private int num;	
	public ObjectEx2() {
		
	}	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public int getDATA() {
		return DATA;
	}
	public void process(Object value) {
		if(value instanceof Integer) {
			System.out.println(((Integer)value).intValue());
		}
		if(value instanceof String) {
			System.out.println(((String)value).charAt(0));
		}
		if(value instanceof Float) {
			System.out.println(value);
		}
	}
	public static void main(String[] args) {
		ObjectEx2 o1= new ObjectEx2();//data|num
//		ObjectEx2 o2= new ObjectEx2();//data|num
//		ObjectEx2 o3= new ObjectEx2();//data|num
//		o1.setNum(55);
	  // System.out.println(o1.getNum());
		//Double b=new Double();
	   o1.process(new Integer(10));
	   o1.process(new String("abc"));
	   o1.process(0f);
	   ObjectEx3.staticValue = "say";
	   System.out.println(ObjectEx3.staticValue);
	}

}



