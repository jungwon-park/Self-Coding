package sist.com.core3;
//interface(완전추상클래스) --> abstractCalass(완성 + 미완성) --> InstanceClass
public abstract class AbstractSuper extends Object{
	public AbstractSuper() {
		super();
	}
	public abstract void superAbstractMethod(); // 미완성
	
	public void superSay() {
		System.out.println("supersay");
	}
	
}
