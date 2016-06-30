package enshu1;

public class CalcWallet {
	private	double balance;
	/**
	 * constructors
	 */
	// without parameter
	public CalcWallet() {
		balance = 0.0;
	}
	// with parameter
	public CalcWallet(double initialBalance) {
		balance = initialBalance;
	}
	/**
	 *  public methods 
	 */
	// sets balance
	public void set(double d) {
		balance = d;
	}
	// adds to current balance
	public void add(double d) {
		balance += d;
	}
	// subtracts from current balance
	public void sub(double d) {
		balance -= d;
	}
	// multiplies current balance
	public void mul(double d) {
		balance *= d;
	}
	// divides current balance
	public void div(double d) {
		balance /= d;
	}
	// adds 8% tax to current balance
	public void addTax() {
		balance *= 1.08;
	}
	// prints out balance
	public void print() {
		System.out.println(balance);
	}
	/**
	 * main method begins execution of Java application
	 */
	public static void main(String[] args) {
		CalcWallet c = new CalcWallet();
		c.set(2000);
		c.mul(5.0);
		c.add(300.0);
		c.div(2.0);
		System.out.print("Tax excluded: ");
		c.print();
		System.out.print("Tax included: ");
		c.addTax();
		c.print();
	}

}
