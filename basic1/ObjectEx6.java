package basic1;
public class ObjectEx6 {
	int []m;
	public ObjectEx6(int []m) {
		this.m=m;
	}
	public int[] getM() {
		return m;
	}	
	public static void main(String[] args) {
		/*ObjectEx6 o1=new ObjectEx6(new int[] {10,20,30});//10 20 30
		ObjectEx6 o2=new ObjectEx6(new int[] {40,50,60});//10 20 30
		System.out.println(o2.getM()[0]);*/
		
		//기본변수 byte--->double
		int a;//4byte[    900 ]
		long b;//8byte[   600      ]
		a=500;
		b=600;
		a=900;
		
		int []m=new int[3];//[10][100][1000]
		m[0]=10;
		m[0]=100000;
		
		m[1]=100;
		m[2]=1000;
		System.out.println(m[2]);
		    
		Action action1= new Action();//msg|count|avg|state
		Action action2= new Action();//msg|count|avg|state

		action1.msg="화이팅";
		action1.count=900;
		System.out.println(action2.msg+" "+action2.count+" "+action2.state);
		
		
		
		
	}

}







