package sist.com.core3;
//interface(�����߻�Ŭ����) --> abstractCalass(�ϼ� + �̿ϼ�) --> InstanceClass
public abstract class AbstractSuper extends Object{
	public AbstractSuper() {
		super();
	}
	public abstract void superAbstractMethod(); // �̿ϼ�
	
	public void superSay() {
		System.out.println("supersay");
	}
	
}
