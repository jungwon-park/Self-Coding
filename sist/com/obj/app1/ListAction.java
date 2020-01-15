package sist.com.obj.app1;

public class ListAction extends Action{
	private String path;
	private boolean redirect;
	public ListAction(String path, boolean redirect) {
		super();
		this.path = path;
		this.redirect = redirect;
	}
	@Override
	public ActionForward execute() {
		// TODO Auto-generated method stub
		System.out.println("ListAction");
		return new ActionForward(path, redirect);
	}
}
