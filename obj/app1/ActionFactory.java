package sist.com.obj.app1;
									//login,list,del,updateaction °ª È£Ãâ
public class ActionFactory {
static ActionFactory actionFactory;
	
	public static ActionFactory getInstacne() {
		if(actionFactory==null) {
			actionFactory=new ActionFactory();
		}
		return actionFactory;
	}
	
	public  Action getAction(String command) {
		if(command.equals("login")) {
			return new LoginAction("d:\\aa.txt", true);
		}//if
		if(command.equals("list")) {
			return new ListAction("d:\\list.txt", false);
		}//if
		if(command.equals("Delete")) {
			return new DeleteAction("d:\\aa.txt",true);
		}
		if(command.equals("Update")) {
			return new UpdateAction("d:\\aaa.txt",false);
		}
		
		return null;
	}
}//getAction
	
	
