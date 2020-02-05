package sist.com.ui1;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class windowEx6 extends Frame implements ActionListener{
private CardLayout card = new CardLayout();
private JButton[] jbtn = new JButton[5];
private String[] str = {"±è","À±","Áö","¹Ù","º¸"};
private JPanel jp1,jp2;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String command = e.getActionCommand();
		if(command.equals("¹Ù")) {
			card.show(this, "B");
		}
		if(command.equals("±è")) {
			card.show(this, "A");
		}
	}
	public void initButton() {
		jp1 = new JPanel(new BorderLayout());
		jp2 = new JPanel();
		
		for (int i = 0; i < jbtn.length; i++) {
			jbtn[i] = new JButton(str[i]);
			jbtn[i].addActionListener(this);	//ActionEvent °¨Áö
			switch(i) {
			case 0:
			case 1:
			case 2:
				jp2.add(jbtn[i]);
				break;
			case 3:
				jp1.add("North",jbtn[i]);
				break;
			case 4:
				jp1.add("South",jbtn[i]);
				break;
			default: 
				break;
			}
		}
		this.add("A",jp1);
		this.add("B",jp2);
	}
	

	public windowEx6() {
		this.setLayout(card);
		initButton();
		this.addWindowListener(new WindowAdapter() {
			//³»ºÎ Å¬·¡½º
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
		new windowEx6();
	}
}
