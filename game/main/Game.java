package main;

public class Game implements Runnable {
	

	private GamePanel gamePanel;
	private final int FPS_SET=120;
	
	
	public Game()/*constructor atau method utama*/ {
		gamePanel = new GamePanel();
		new GameFrame(gamePanel);
		gamePanel.requestFocus();
        Thread gameThread = new Thread(this);
        gameThread.start();       
	}
	
	@Override
	public void run() {
		double timePerFrame =1000000000.0/FPS_SET;
		long lastFrame=System.nanoTime();//Ini digunakan untuk melacak waktu terakhir kali frame diperbarui.
		long now=System.nanoTime();// Variabel ini digunakan untuk melacak waktu saat ini pada setiap iterasi loop.
		int frames =0;//sebagai counter jumlah frame yang telah diproses.
		long lastCheck=System.currentTimeMillis();// Ini digunakan untuk melacak waktu terakhir kali output FPS ditampilkan.
		while(true) {
			now=System.nanoTime();//Memperbarui nilai variabel now dengan waktu sistem saat ini dalam nanodetik.
			if(now-lastFrame>=timePerFrame) {//Memeriksa apakah sudah waktunya untuk memperbarui frame. 
				gamePanel.repaint(); //untuk memperbarui tampilan game.
				lastFrame=now;//Memperbarui nilai lastFrame dengan waktu sistem saat ini.
				frames++;//Meningkatkan nilai counter frames untuk melacak jumlah frame yang telah diproses.
//up here for the stabilized the FPS. So the character whould't lag
//now game loop it's very smoootly 
			}
		
			if(System.currentTimeMillis() - lastCheck>=1000) {
				lastCheck=System.currentTimeMillis();
				System.out.println("FPS : "+ frames);
				frames=0;
			}
		}
	}

}
