package sist.com.obj.app2;

public class objmain{
	WindowListenerEx ex;
	public objmain(WindowListenerEx ex) {
		this.ex =ex;
	}
	public void process() {
		ex.windowClosing();
	}
	public static void main(String[] args) {
		objmain o = new objmain(new objopen());
		o.process();
	}
}
