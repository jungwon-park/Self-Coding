package sist.com.ui1;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TEST extends Frame {
private CardLayout c = new CardLayout();
private JButton jb = new JButton();
private String[] animal = {"고양이","개","사자"};
private JPanel jp1,jp2;

	public void init() {
		jp1 = new JPanel(new BorderLayout());
		jp2 = new JPanel();
		
		for (int i = 0; i < jbtn.length; i++) {
			
			
		}
	}
	public TEST() {
		this.addWindowListener(new WindowAdapter() {
			//내부 클래스
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		this.setBounds(10, 10, 200, 200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new TEST();
	}

}

