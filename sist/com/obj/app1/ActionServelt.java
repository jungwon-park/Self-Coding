package sist.com.obj.app1;

import java.util.Scanner;

public class ActionServelt {
	Scanner sc = new Scanner(System.in);
	/*public ActionServelt() {
		System.out.println(System.in.toString());
	}*/
	
	public void menu() {
		String command="";
		while(true) {
			System.out.println("1.Login 2.list 3.Delete 4.Update");
			switch (sc.nextInt()) {
			case 1:
				command="login";
				break;
			case 2:
				command="list";
				break;
			case 3:
				command="Delete";
				break;
			case 4:
				command="Update";
				break;
			default:
				break;
			}
			Action action=ActionFactory.getInstacne().getAction(command);
			ActionForward af=action.execute();
			if(af.isRedirect()) {
				System.out.println("직접 이동"+ af.getPath());
			}else {
				System.out.println("간접 이동"+ af.getPath());
			}
	public static void main(String[] args) {
		//new ActionServelt();
		new ActionServelt().menu();
	}
}
