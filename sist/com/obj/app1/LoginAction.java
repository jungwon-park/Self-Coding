package sist.com.obj.app1;

public class LoginAction extends Action{
	private String path;
	private boolean redirect;
	
	public LoginAction() {
		super();
	}
	public LoginAction(String path, boolean redirect) {
		super();
		this.path = path;
		this.redirect = redirect;
	}
	@Override
	public ActionForward execute() {
		// TODO Auto-generated method stub
		System.out.println("LoginAction");
		return new ActionForward(path, redirect);
	} 
}
