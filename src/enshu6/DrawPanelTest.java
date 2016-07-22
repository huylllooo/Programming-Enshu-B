package enshu6;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class DrawPanelTest {
	public DrawPanelTest() {
		JFrame jf = new JFrame("Draw Panel Test");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new BorderLayout());
		
		DrawPanel dp = new DrawPanel();
		JButton b1 = new JButton("Do nothing");
		jf.add(dp, BorderLayout.CENTER);
		jf.add(b1, BorderLayout.SOUTH);
		
		jf.pack();
		jf.setVisible(true);
	}
	
	public static void main(String[] args) {
		new DrawPanelTest();
	}

}
