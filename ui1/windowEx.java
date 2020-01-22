package sist.com.ui1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;

public class windowEx extends Frame{
	//JButton jButton = new JButton("click");
	Pan pan = new Pan();
	int x = -100, y=-100;
	int width=45, height = 45;
	Point[] point = new Point[100];
	int cnt;
	int turn=-1;
	Dimension d;
	public windowEx() {
		this.add(pan);
		//this.add(jButton);
		this.setBackground(Color.YELLOW);
		this.addWindowListener(new WindowAdapter() { 
			//내부 클래스
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		d=toolkit.getScreenSize();
		this.setUndecorated(true);
		this.setBounds(0, 0, d.width, d.height);
		this.setVisible(true);
	}
	public class Pan extends Canvas{
		public Pan() {
			this.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
				x=e.getX();
				y=e.getY();
				point[cnt++] = e.getPoint();
				repaint();
				}
			});
			this.setBackground(Color.pink);
		}
		/*@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("mouseClicked");
		}
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("mousePressed");
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("mouseReleased");
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("mouseEntered");
		}
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("mouseExited");
		}*/
	
		@Override
		public void update(Graphics g) {
			// TODO Auto-generated method stub
			paint(g);
			doll(g);
		}
		public void paint(Graphics g) {
//			g.drawLine(10, 10, 200, 200);
//			g.drawLine(200, 200, 30, 300);
//			g.drawLine(30, 300, 550, 1000);
//			g.drawLine(550, 1000, 800, 100);
			
//			g.drawOval(x-width/2, y-height/2, width, height);
//			if(cnt !=0 && cnt%3 == 0)
//			g.drawLine(point[cnt-3].x, point[cnt-3].y, point[cnt-2].x, point[cnt-2].y);
//			g.drawLine(point[cnt-2].x, point[cnt-2].y, point[cnt-1].x, point[cnt-1].y);
//			g.drawLine(point[cnt-1].x, point[cnt-1].y, point[cnt-3].x, point[cnt-3].y);
			
			for(int i=0; i<30; i++) {
				for (int j = 0; j <30; j++) {
					g.drawRect(i*30, j*30, 30, 30);
					g.drawRect(30, 30, i*30, j *30);
				}
			}
		}
		public void doll(Graphics g) {
			if(turn==-1)
				g.setColor(Color.black);
			else
				g.setColor(Color.WHITE);
			g.fillOval(x-width/2, y-height/2, width, height);
			turn = turn*-1;
		}
	}
	public static void main(String[] args) {
		new windowEx();
	}
	
}
