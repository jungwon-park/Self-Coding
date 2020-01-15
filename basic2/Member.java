package basic2;

public class Member {
	private String id;
	private String name;
	private int age;	
	private static Member member;
	private Member() {		
	}
	public static Member getInstance() {
		if(member==null)
		   member=new Member();
		return member;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return this.id;
	}
	/*public static void rankTest() {			// 성공  id -  
		member = new Member();
		System.out.println(member.id = "ddd");
	}*/
	public static void rankTest() {  		//오류 
		member = new Member();
		
	}
	public static void main(String[] args) {
		rankTest();
	}
}
