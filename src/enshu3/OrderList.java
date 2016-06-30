package enshu3;
import java.util.Iterator;
import java.util.Vector;

public class OrderList {
	private Vector<Sushi> items;
	
	// constructor
	public OrderList() {
		items = new Vector<Sushi>();
	}
	
	public void add(String name) {
		items.add(new Sushi(name,1));
	}
	
	public void add(String name, int num) {
		items.add(new Sushi(name,num));
	}
	
	public void remove(String name, int num) {
		Iterator<Sushi> it = items.iterator();
		Sushi rm = new Sushi(name, num);
		while (it.hasNext()) {
			Sushi x = it.next();
			if(x.equals(rm)) {
				it.remove();
			}
		}
	}
	
	public void printWaitingList() {
		Iterator<Sushi> it = items.iterator();
		while(it.hasNext()) {
			it.next().print();
		}
	}
	
	public static void main(String[] args) {
		OrderList ol = new OrderList();
		// order sushi
		ol.add("Tuna");
		ol.add("Egg",2);
		ol.add("Ikura",5);
		// print waiting list
		ol.printWaitingList();
		// remove 2 eggs
		ol.remove("Egg",2);
		// print order list
		System.out.println("--------");
		ol.printWaitingList();

	}

}
