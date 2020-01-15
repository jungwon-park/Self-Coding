package basic1;
//(변수) 메모리 
//기본 byte < short <int < long <float <double
public class ObjectEx4 {
	static int a;
	public  void demoEx1() {
		int b=0;
		b++;
		a++;
		System.out.println("a="+a+" b="+b);		
	}	
	public  void demoEx2() {
		
		int i=10;//  [  10     ]
		String s="abc";//[abc의 시작주소   ]
		byte b=127;//[127]
		
		int []m=new int[3];//[10][20][30]
		m[0]=10;
		m[1]=20;
		m[2]=30;
		/*System.out.println(m[0]);
		System.out.println(m[1]);*/
		
		
		Action a=new Action("안녕",50,1.5);//[String][int][double]
		/*a.msg="ㅁㅁ";
		a.count=50;
		a.avg=9.5;*/
		/*System.out.println(a.getMsg());
		System.out.println(a.getCount());*/
		
		Action []action1=new Action[3];//[][][]
		Action []action2= {new Action("A",20,1.6),new Action("B",30,2.6),new Action()};
		
		for(Action ii:action2) {
			System.out.println(ii.getCount()+" "+ii.getMsg()+" "+ii.getAvg());
			
		}
		
	}
	public static void main(String[] args) {
		ObjectEx4 o1=new ObjectEx4();//a
		o1.demoEx2();
		
	}
	

}
