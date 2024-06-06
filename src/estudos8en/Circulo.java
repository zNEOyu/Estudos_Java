package estudos8en;

public class Circulo {
	public double r;
	public double circu(){
		return 2 * Math.PI * r;
	}
	public double volum() {
		return 4 * Math.PI * (r * r * r) / 3;
	}
}
