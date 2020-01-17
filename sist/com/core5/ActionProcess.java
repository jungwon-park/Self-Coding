package sist.com.core5;

public class ActionProcess {
	
	public void process(Action list) {
	list.execute();
	//Action a=new LoginAction();//(LoginAction exe (Action exe) )	
    }	
	public static void main(String[] args) {
		ActionProcess a=new ActionProcess();
		a.process(new ListAction());
		
	}

}
