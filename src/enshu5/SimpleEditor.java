package enshu5;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPanel;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SimpleEditor {
	private JTextArea ta = null;
	private JTextField fileName = null;
	private String fname;
    public SimpleEditor() {
   	 JFrame jf = new JFrame("Simple Editor");
   	 
   	 JPanel fileNameBar = new JPanel();
   	 ta = new JTextArea("Enter your text here");
   	 JButton save = new JButton("Save");
   	 // set app's layout
   	 jf.setLayout(new BorderLayout());
   	 jf.add(fileNameBar, BorderLayout.NORTH);
   	 jf.add(new JScrollPane(ta), BorderLayout.CENTER);
   	 jf.add(save, BorderLayout.SOUTH);
   	 
   	 JButton load = new JButton("Load");
   	 fileName = new JTextField("Enter your file name here");
   	 // set fileName text field empty when clicked
   	 fileName.addMouseListener(new MouseAdapter() {
   		public void mouseClicked(MouseEvent e) {
   			fileName.setText(null);
   		}
   	 });
   	 load.addActionListener(new ActionListener() {
   		 public void actionPerformed(ActionEvent e) {
   			 ta.setText(null);
   			 //read file
   			 fname = fileName.getText();
   			 FileReader fr;
   			 try {
   				 fr = new FileReader(fname);
   			 } catch(FileNotFoundException f) {
   				System.out.println("Can not open " + fname);
   				return;
   			 }
   			 //write file into textArea
   			BufferedReader br = new BufferedReader(fr);
   			String line;
   			try {
   				// avoiding newline at the end of file:
   				// write the first line first
   				if ((line = br.readLine()) != null) {
   					ta.append(line);
   				}
   				// "\n" before writing a new line
   				while((line = br.readLine()) != null) {
   					ta.append("\n" + line);
   				}
   				br.close();
   			} catch(IOException f) {
   				f.printStackTrace();
   			}
   			 
   		 }
   	 });
   	 
   	 //set fileNameBar layout
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


