package enshu2;
import java.lang.Math; // imports class Math

public class ScientificCalc extends SimpleCalc{
	// boolean var holds mode for trigonometric functions (radian by default)
	private boolean radianMode = true;
	
	// power d of val
	public void pow(double d) {
		val = Math.pow(val, d);
	}
	
	// square root of val
	public void squareRoot() {
		val = Math.sqrt(val);
	}
	
	// changes trig mode to radianMode
	public void setRadianMode() {
		radianMode = true;
	}
	
	// changes trig mode to degreMode
	public void setDegreeMode() {
		radianMode = false;
	}
	
	// sin(val)
	public void sin() {
		val = (radianMode == true) ?
		Math.sin(val) : Math.sin(val*Math.PI/180) ;
	}
	
	// cos(val)
	public void cos() {
		val = (radianMode == true) ?
				Math.cos(val) : Math.cos(val*Math.PI/180) ;
	}
}
