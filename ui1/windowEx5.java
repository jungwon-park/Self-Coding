package sist.com.ui1;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Point;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import sist.com.core1.object;

public class windowEx5 extends Frame implements TextListener,ActionListener{
	private TextField tf;
	private JButton jbtn,jbtnExit;
	private JPanel panel;
	private JTextArea jTextArea;
	@Override
	public void textValueChanged(TextEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(tf.getText().length());
				if(tf.getText().length()>0) {
					jbtn.setEnabled(true);
					//jbtn.setLabel(tf.getText().length());
					jbtn.setText(String.valueOf(30-tf.getText().length()));
				}else {
					jbtn.setEnabled(false);
				}
				if(tf.getText().length()>=30) {
					//JOptionPane.showMessageDialog(this, "30글자만 가능");			
					//tf.setText("");
				}
			}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		/*if (e.getSource() instanceof TextField) {
		JOptionPane.showMessageDialog(this, "글자입력하세요");			
	}
	if(e.getSource() instanceof JButton) {
		JColorChooser.showDialog(this, "", Color.RED);
	}*/
	Object obj=e.getSource();
	if(obj == tf|| obj==jbtn) {
		if(tf.getText().length()==0) {
			JOptionPane.showMessageDialog(this, "글자입력하세요");
		}else {
			jTextArea.append(tf.getText()+"\n");
			tf.setText("");
		}
	}
	//Object obj=new JButton();
	}
	public void initLayEx() {
		panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel.add(tf = new TextField(30));
		tf.addTextListener(this);
		tf.addActionListener(this);
		panel.add(jbtn=new JButton("Input"));
		jbtn.addActionListener(this);
		this.add("North",panel);
		this.add(new JScrollPane(jTextArea=new JTextArea(20,50),
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
		this.add("South",(jbtnExit = new JButton("exit")));
		jbtnExit.addActionListener(this);
	}
	
	public windowEx5() {
		initLayEx();
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				int rs=JOptionPane.showConfirmDialog(windowEx5.this, "정말종료할거니?");
				if(rs==JOptionPane.OK_OPTION) {
					System.exit(0);
				}
			}
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				jbtn.setEnabled(false);
			}
		});
		this.setLocation(new Point(200, 100));
		this.pack();
		//this.setBounds(100, 100, 500, 500);
		this.setVisible(true);
	}
 public static void main(String[] args) {
	new windowEx5();
 }
}
