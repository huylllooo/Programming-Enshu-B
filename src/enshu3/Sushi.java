package enshu3;

public class Sushi {
	private String name;
	private int num;
	
	// constructor
	public Sushi(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	// equals(Object O): method override
	public boolean equals(Object o) {
		Sushi s = (Sushi) o;
		return this.name.equals(s.name) && this.num == s.num;
	}
	
	public void print() {
		System.out.println(name + " x " + num);
	}
}
