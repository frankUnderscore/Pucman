package pacmanGame;
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
		double h = this.HEIGHT;
		double w = this.WIDTH;

		g2d.setColor(Color.YELLOW);
		g2d.fillOval(0, 0, 30, 30);
	}
	public static JFrame createGameFrame(){
		JFrame gameFrame = new JFrame("Pacman Clone");
		gameFrame.add(new Game());
		gameFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        gameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameFrame.setVisible(true);
        return gameFrame;
	}
	
}
