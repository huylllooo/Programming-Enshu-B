package enshu4;

import java.util.HashMap;

public class OrderList2 {

	private HashMap <String, Integer> item;
	
	public OrderList2() {
		item = new HashMap <String, Integer>();
		
		item.put("Maguro", new Integer(1));
		item.put("Tamago", new Integer(2));
		item.put("Ikura", new Integer(5));
	}
	
	public void printWaitingList() {
		for (String k: item.keySet()) {
			System.out.println(k + " x " + item.get(k));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderList2 ol2 = new OrderList2();
		ol2.printWaitingList();
	}

}
