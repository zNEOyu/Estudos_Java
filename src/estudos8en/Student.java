package estudos8en;

public class Student {
	public double a, b ,c;
	
	public double media(){
		return (a + b + c);
	}
	public double miss() {
		if (media() < 60) {
			return 60.0 - media();
		}
		else {
			return 0.0;
		}
	}
}
