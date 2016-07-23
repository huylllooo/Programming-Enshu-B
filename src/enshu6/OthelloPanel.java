package enshu6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class OthelloPanel extends JPanel{
	private double boxW;
	private double boxH;
	public OthelloPanel() {
		super();
		this.setPreferredSize(new Dimension(440, 440));
	}
	
	public void paint(Graphics g) {
		
		// Delete when complete
		System.out.println("GoPaint!");
		// Clear drawing area
		Rectangle r = this.getBounds();
		boxW = r.width/11;
		boxH = r.height/11;
		g.setColor(Color.green);
		g.fillRect(r.x, r.y, r.width, r.height);
	
		// Line
		g.setColor(Color.black);
		// vertical lines
		for (int i = 0; i< 11; i++) {
			g.drawLine((int) (boxW*(i+0.5)), (int) (boxH*0.5), (int) (boxW*(i+0.5)), (int) (boxH*10.5));
		}
		// horizontal lines
		for (int i = 0; i< 11; i++) {
			g.drawLine((int) (boxW*0.5), (int) (boxH*(i+0.5)), (int) (boxW*10.5), (int) (boxH*(i+0.5)));
		}
	}
}
