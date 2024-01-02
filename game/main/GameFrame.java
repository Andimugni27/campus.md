package main;

import javax.swing.JFrame;

public class GameFrame {
	private JFrame jframe;//membuat jframe object
	public GameFrame(GamePanel gamePanel) {
		jframe = new JFrame();
		jframe.setSize(400, 400);//Disamping ini untuk mengukur window game
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ini untuk tombol untuk keluar atau terminated
		//we not gonna use this because this is include the border
		jframe.add(gamePanel);//menyelaraskan jframe dengan jpanel
		jframe.setLocationRelativeTo(null);//this is for mid open
		jframe.setVisible(true);//ini untuk menampilkan visualnya
	}

}
