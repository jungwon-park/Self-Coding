package sist.com.obj.app2;

import java.awt.Frame;
import java.awt.Rectangle;

public class Obj2 {
	Frame frame; // has a
	public Obj2(Frame frame) {
		this.frame = frame;
		frame.setBounds(new Rectangle(100, 100, 500, 500));
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Obj2(new Frame());
	}
}	