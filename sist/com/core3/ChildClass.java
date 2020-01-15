package sist.com.core3;

public class ChildClass extends AbstractSub {
	public ChildClass() {
		super();
	}
	public void subAbstractMethod() {
		System.out.println("ChildClass subAbstractMethod");
	}
	public void superAbstractMethod() {
		System.out.println("child superAbstractMethod");
	}
	public void subSay() {
		System.out.println("childClass subSay");
	}
}
