package sist.com.ui1;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class windowEx2 extends Frame {
	private int x;

	public windowEx2() {
		this.x = 100;
		this.addWindowListener(new WindowAdapter() {
			//내부 클래스
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				x = 10;
				System.exit(0);
			}
		});
		this.setBounds(10, 10, 200, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new windowEx2();
	}

}
