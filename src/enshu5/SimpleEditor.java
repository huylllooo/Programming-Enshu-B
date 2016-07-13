package enshu5;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class SimpleEditor {

    public SimpleEditor() {
   	 JFrame jf = new JFrame("Simple Editor");
   	 
   	 JPanel fileNameBar = new JPanel();
   	 JTextArea ta = new JTextArea("Enter your text here");
   	 
   	 jf.setLayout(new BorderLayout());
   	 jf.add(fileNameBar, BorderLayout.NORTH);
   	 jf.add(new JScrollPane(ta), BorderLayout.CENTER);
   	 
   	 JButton load = new JButton("Load");
   	 JTextField fileName = new JTextField("Enter your text here");
   	 
   	 fileNameBar.setLayout(new BorderLayout());
   	 fileNameBar.add(load, BorderLayout.EAST);
   	 fileNameBar.add(fileName,BorderLayout.CENTER);
   	 jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 jf.setSize(320, 240);
   	 jf.setVisible(true);
    }
    public static void main(String[] args) {
   	 // TODO Auto-generated method stub
   	 new SimpleEditor();
    }

}


