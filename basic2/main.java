package basic2;

public class main {
	public static void main(String[] args) {
	d d=new d(40,new c(30, new b(20,new a(10))));
	
	System.out.println(d.getc().getb().geta().geta());
	} 


}