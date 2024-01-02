package Inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.GamePanel;

public class KeyboardInputs implements KeyListener {
	
	private GamePanel gamePanel;
	public KeyboardInputs(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_W:
			gamePanel.changeyDelta(-10);
			System.out.println("W");
			break;
		case KeyEvent.VK_A:
			gamePanel.changexDelta(-10);
			System.out.println("A");
			break;
		case KeyEvent.VK_S:
			gamePanel.changeyDelta(10);
			System.out.println("S");
			break;
		case KeyEvent.VK_D:
			gamePanel.changexDelta(10);
			System.out.println("D");
			break;
		}
		
	}



}
