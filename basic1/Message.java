package basic1;
public class Message {
	String msg;
	
	public  Message(String msg) {		
		this.msg=msg;
	}
	
	/*public String getMsg(String m) {
		String value=m;
		if(m.equals("Abc"))
		value+="Z";
		else
		value+="K";
		return msg;
	}*/
	
	public String getMsg() {
		return msg;
	}
	
	public static void main(String[] args) {
		Message m=new Message("AAA");//msg
		System.out.println(m.getMsg());
	}
	
	
	

}
