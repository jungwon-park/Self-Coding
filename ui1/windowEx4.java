package sist.com.ui1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class windowEx4 extends Frame implements ActionListener {
	private JButton[] jbtn = new JButton[20]; //[][][][][] 
	private JPanel[] jpanels = new JPanel[4]; //[][][][]
	Button btn;		//button -> java  JButton ->javax  java->javax 확장된것
	
	public void buttonInit() {
		for (int i = 0; i < jbtn.length; i++) {
			jbtn[i] = new JButton(String.valueOf(i+1));
			jbtn[i].addActionListener(this);
		}
		for (int i = 0; i < jpanels.length; i++) {
			jpanels[i] = new JPanel(new BorderLayout());
			
		}
	}
	public void borderCoreLayoutEx() {
		this.setLayout(new GridLayout(2,2)); 	// 레이아웃 값지정
		jpanels[0].add(jbtn[0],BorderLayout.NORTH);  //0번째 패널에 north 레이아웃값 넣기
		jpanels[0].add(jbtn[1],BorderLayout.SOUTH);  //0번째 패널에 SOUTH 레이아웃값 넣기
		jpanels[0].add(jbtn[2],BorderLayout.EAST); 
		jpanels[0].add(jbtn[3],BorderLayout.WEST);  
		
		jpanels[1].add(jbtn[4],BorderLayout.EAST);  
		//jpanels[1].add(jbtn[5],BorderLayout.);  
		
		
		jpanels[2].add(jbtn[6],BorderLayout.WEST); 
		jpanels[2].add(jbtn[7],BorderLayout.EAST); 
		
		jpanels[3].add(jbtn[9],BorderLayout.WEST);
		jpanels[3].add(jbtn[10],BorderLayout.EAST);
		
		
		this.add(jpanels[0]);
		this.add(jpanels[1]);
		this.add(jpanels[2]);
		this.add(jpanels[3]);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getActionCommand()); //getActionCommand() 누른 데이터의 값호출
		((JButton)e.getSource()).setBackground(Color.cyan);
	}

	public void borderLayoutEx() {
		this.add("North",jbtn[0]);
		this.add("South",jbtn[1]);
		this.add("Center",jbtn[2]);
		this.add("East",jbtn[3]);
		this.add("West",jbtn[4]);
	}
	public void flowLayoutEx() {
		this.setLayout(new FlowLayout());
		for (int i = 0; i < jbtn.length; i++) {
			this.add(jbtn[i]);
		}
	}
	public void gridlayoutex() {
		this.setLayout(new GridLayout(10,10,10,10));
		for (int i = 0; i < jbtn.length; i++) {
			this.add(jbtn[i]);
		}
	}
	public windowEx4() {
		buttonInit();
		borderCoreLayoutEx();
		//gridlayoutex();
		//flowLayoutEx();
		//borderLayoutEx(); 
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
		new windowEx4();
	}
}
