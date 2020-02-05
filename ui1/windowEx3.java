package sist.com.ui1;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

public class windowEx3 extends Frame implements TreeSelectionListener{
	JTree jTree;
	JScrollPane jscrollpane;
	Object[] obj = {"program","system","design"};
	JButton jbtn;
	
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e);
	}
	
	Vector<Vector<String>> node1 = new Vector<Vector<String>>() {
	@Override
	public synchronized String toString() {
		// TODO Auto-generated method stub
		return "first";
		}
	};
	
	Vector<String> node2 = new Vector<String>() {
	@Override
	public synchronized String toString() {
		// TODO Auto-generated method stub
		return "second";
		}
	};
	
	Vector<String> node3 = new Vector<String>() {
 	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "three";
 		}
	};
	public void initNode() {
		node1.add(node2);
		node1.add(node3);
		
		node2.add("node2 first");
		node2.add("node2 second");
		node2.add("node2 three");
		node2.add("node2 four");
		
		node3.add("node3 first");
		node3.add("node3 second");
		node3.add("node3 three");
		node3.add("node3 four");
		
		obj[0] = node1;
		jTree = new JTree();
		jTree.setRootVisible(true);
		jscrollpane = new JScrollPane(jTree, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);	
		// jscrollpane --> 컴포넌트에 스크롤기능 제공  
		this.add(jscrollpane);
		// 
	}
	public windowEx3() {
		initNode();
		jTree.addTreeSelectionListener(this);
		this.addWindowListener(new WindowAdapter() {
			//내부 클래스
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		this.setBounds(10, 10, 600, 600);
		this.setVisible(true);
		}
	public static void main(String[] args) {
		new windowEx3();
	}
}
