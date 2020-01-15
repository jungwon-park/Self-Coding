package basic2;

public class Membermain {
	
	public static void main(String[] args) {
		/*Member member=new Member();
		member.setId("A010");
		System.out.println(member.getId());*/
		Member.getInstance().setId("A010");
		System.out.println(Member.getInstance().getId());
	}

}
