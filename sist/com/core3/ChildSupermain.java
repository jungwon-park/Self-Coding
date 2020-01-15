package sist.com.core3;

public class ChildSupermain {
	public static void main(String[] args) {
//		ChildClass c1=new ChildClass();
//		c1.subAbstractMethod();
		// (ChildClass (AbstractSub subAbstract,subSay (AbstractSuper(sa,superSay)) ) )
		//AbstractSuper abSuper=new ChildClass();
		//abSuper.superAbstractMethod();
		//((AbstractSub)abSuper).subAbstractMethod();
		
		
		AbstractSub aSub=new ChildClass();//(ChildClass (AbstractSub subAbstract,subSay (AbstractSuper(sa,superSay)) ) )
		aSub.subsay();
		
	}
}
