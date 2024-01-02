package main;

import java.awt.Graphics;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;

import javax.swing.JPanel;

import Inputs.KeyboardInputs;
import Inputs.MouseInputs;

public class GamePanel extends JPanel/*memanggil jpanel*/{
	private MouseInputs mouseInputs;
	private float xDelta = 100,yDelta=100;
	private int xMouse = 0,yMouse=0;

	public GamePanel() {
		 mouseInputs = new MouseInputs(this);
		    addKeyListener(new KeyboardInputs(this));
		    addMouseListener(mouseInputs);
		    addMouseMotionListener(mouseInputs);
		    setFocusable(true);

	}
	public void changexDelta (int value) {
		this.xDelta+=value;
		repaint();
	}
	public void changeyDelta (int value) {
		this.yDelta+=value;
		repaint();//this is for looping /redrawing
	}
	//di atas ini untuk mengubah x dan y nya

	public void setRectPos(int x,int y) {
		this.xMouse=x;
		this.yMouse=y;
		repaint();
		}
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		g.drawRect(xMouse, yMouse, 20, 50);//kotak kossong
		g.fillRect(10+(int)xDelta,10+(int)yDelta, 60, 30);//kotak isi
		//it is for calling a Jcomponet's paintcomponent
		/*its for jpanel own paintcomponent to draw*/
	
	}
	
}
//jpanel untuk menggambar, kalau jframe untuk luas untuk gambarnya
//ibaratkan jpanel adalah kuas,cat
//sedangkan jframe adalah kanfanya