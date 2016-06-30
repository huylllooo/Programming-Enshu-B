package enshu2;

public class User {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p = new MobilePhone(
				"090-000-000", "so@tohoku.ac.jp");
		p.print();
		ScientificCalc sc = new ScientificCalc();
		// 3^2
		sc.set(3);
		sc.pow(2);
		sc.print();
		
		// result's square root
		sc.squareRoot();
		sc.print();
		
		// sin(PI/2)
		sc.setRadianMode();
		sc.set(Math.PI);
		sc.div(2);
		sc.sin();
		sc.print();
		
		// cos(180)
		sc.setDegreeMode();
		sc.set(180);
		sc.cos();
		sc.print();
	}

}
