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
				if ((line.isEmpty() 
						|| line.trim().equals("") 
						|| line.trim().equals("\n") 
						|| line == "!") == false) {
					// trim head and tail of input
					// split into first part with String key and second part ends with val
					String[] splt = line.trim().split(" ");
					
					// get index of val in splt
					int valPos = splt.length-1;
					
					// put input order into OrderList item
					// add new key to the current key if already existed 
					if (item.get(splt[0]) != null)
						item.put(splt[0], item.get(splt[0]) + Integer.parseInt(splt[valPos]));
					else 
						item.put(splt[0], Integer.parseInt(splt[valPos]));
				}
					
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
