package basic1;

//Ŭ���� -->���赵,û����,Ʋ,��������� �ڷ��� 
public class ObjectEx1 {	
	//�Ӽ� +��� 
	int cnt;//�ν��Ͻ�����
	public ObjectEx1() {	
		this.cnt=900;
	}
	public ObjectEx1(int cnt) {
		//System.out.println("this="+this);
		this.cnt=cnt;
	}	
	public ObjectEx1(String str) {	
		cnt=777;
	}	
	public void setCnt(int cnt) {
		this.cnt=cnt;
	}
	public int getCnt() {
		System.out.println("this="+this);
		return this.cnt;
	}	
	public static void main(String[] args) {
		ObjectEx1 o1=new ObjectEx1(20);//cnt 20 
		ObjectEx1 o2=new ObjectEx1(30);//cnt 30 
		
		System.out.println(o2.getCnt());
		
		System.out.println("o1="+o1);
		System.out.println("o2="+o2);
		
		
		String s1=new String("abc");//abc
		System.out.println(s1.charAt(0));
		System.out.println(s1.codePointAt(0));
		
		
		
		
		
	}
}









