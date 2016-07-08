package enshu4;

import java.util.HashMap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OrderListLoader {

	private HashMap <String, Integer> item;
	
	public OrderListLoader(String fname) {
		FileReader fr;
		try {
			fr = new FileReader(fname);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Can not open " + fname);
			return;
		}
		
		BufferedReader br = new BufferedReader(fr);
		String line;
		try {
			item = new HashMap <String, Integer>();
			while((line = br.readLine()) != null) {
				String[] splt = line.split(" ");
				if (item.get(splt[0]) != null)
					item.put(splt[0], item.get(splt[0]) + Integer.parseInt(splt[1]));
				else 
					item.put(splt[0], Integer.parseInt(splt[1]));
			}
			br.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void printWaitingList() {
		for (String k: item.keySet()) {
			System.out.println(k + " x" + item.get(k));
		}
	}
	
	public static void main(String[] args) {
		OrderListLoader ol2 = new OrderListLoader("input.txt");
		ol2.printWaitingList();
	}

}
