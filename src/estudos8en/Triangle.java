package estudos8en;

public class Triangle {

	public double a, b, c;
	
	public double area() {
		double p = (a + b + c) / 2.0;
		double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return result;
	}
}
