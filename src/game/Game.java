package game;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Game extends JPanel{
	public static void main(String[] arg0){
		JFrame gameFrame = createGameFrame();
		
	}
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		//this.scaleGraphics(g);
		g2d.setColor(Color.YELLOW);
		g2d.fillOval(1280/2-15, 720/2-15, 30, 30);
	}
	public static JFrame createGameFrame(){
		JFrame gameFrame = new JFrame("Pacman Clone");
		gameFrame.add(new Game());
		gameFrame.setSize(1280*3/2, 720*3/2);
        gameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameFrame.setVisible(true);
        return gameFrame;
	}
	public void scaleGraphics(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		double w = this.getSize().width;
        double h = this.getSize().height;
        g2d.scale(w/1280, h/720);
	}
	
}
