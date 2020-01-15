package basic2;

public class ObjectEx1  extends Object {
	private int data;
	private String strValue;
	/*public void set(int data) {
		this.data=data;
		System.out.println(data);
	}*/
	public void set(int data,String strValue) {
		set(data);		
	}
	public void set(String strValue,int data) {
		set(data);		
	}
	public void set(Object obj) {
		System.out.println(obj);
	}
	public void objectMethod1() {
		String str=new String();
//		Double d=new Double("10.5");
//		int i=100;//물통
//		Integer it=new Integer(5);// 정수기
//		it.longValue();
		
		/*int a=new Integer(1000);	
		System.out.println(a);
		
		Integer b=50;
		
		System.out.println(b);
		
		float f=new Float(10.5F);*/
		
		Long l=(long)10.5;
		 
		
	}
	public ObjectEx1(){		
	}	
	public static void main(String[] args){
		ObjectEx1 o=new ObjectEx1();
		o.objectMethod1();
		//o.set("hi");
		
	}

}




